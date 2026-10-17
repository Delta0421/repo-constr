"""Test 4: polimorfismo parametrico — el mismo MiVector con tres tipos
distintos (int, str, y una clase propia)."""
from dataclasses import dataclass
from test_utils import separador, ok, fallo
from mivector import MiVector


@dataclass
class Alumno:
    nombre: str
    calificacion: float

    def __str__(self) -> str:
        return f"{self.nombre} ({self.calificacion})"


if __name__ == "__main__":
    separador("Test 4: polimorfismo parametrico")

    numeros = MiVector()
    for v in [1, 1, 2, 3, 5, 8]:
        numeros.agregar(v)

    ciudades = MiVector()
    for c in ["CDMX", "Monterrey", "Guadalajara"]:
        ciudades.agregar(c)

    alumnos = MiVector()
    alumnos.agregar(Alumno("Ana", 9.5))
    alumnos.agregar(Alumno("Luis", 8.1))

    if numeros.tamano() != 6 or ciudades.tamano() != 3 or alumnos.tamano() != 2:
        fallo("tamano incorrecto en alguna de las tres instanciaciones")
    else:
        print(f"MiVector<int>:         {numeros}")
        print(f"MiVector<str>:         {ciudades}")
        print(f"MiVector<Alumno>:      {alumnos}")
        ok()
