from dispositivos import DispositivoElectronico
from mixins import conexion_wifi, BateriaRecargable, SensorMovimiento

class CamaraSeguridadInalambrica(DispositivoElectronico, conexion_wifi, BateriaRecargable, SensorMovimiento):

    def __init__(self, marca, modelo):
        DispositivoElectronico.__init__(self, marca, modelo)
        conexion_wifi.__init__(self)
        BateriaRecargable.__init__(self, nivel_bateria = 100)

    def reporte_completo(self):
        texto = f"--- {self.marca} {self.modelo} ---\n"
        texto += f"Estado actual: {'ENCENDIDA' if self.estado else 'APAGADA'}\n"

        if self.red_conectada:
            texto += f"🟢Red: Conectado a '{self.red_conectada}'\n IP: {self.ip}\n"
        else:
            texto += f"🔴Red: Desconectado\n"

        texto += f"Bateria: {self.nivel_bateria}%"
        if self.nivel_bateria == 0:
            texto += "[NECESITA CARGA!]"
            
        return texto
