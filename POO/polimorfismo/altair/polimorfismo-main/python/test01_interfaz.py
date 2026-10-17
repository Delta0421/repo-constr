"""Test 1: la interfaz — Contenedor abstracta, MiVector concreta."""
from test_utils import separador, estado_texto, ok, fallo
from mivector import MiVector

if __name__ == "__main__":
    separador("Test 1: la interfaz")
    v = MiVector()
    if not v.vacio():
        fallo("un MiVector recien creado debe estar vacio")
    elif v.tamano() != 0:
        fallo("un MiVector recien creado debe tener tamano 0")
    else:
        print(f"Su contenedor esta {estado_texto(v.vacio())} y su tamano es {v.tamano()}.")
        print("Test pasado correctamente.")
        ok()
