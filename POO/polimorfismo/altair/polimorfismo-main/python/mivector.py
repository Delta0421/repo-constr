"""mivector.py — Contenedor (clase abstracta) y MiVector (implementacion
generica), en un solo archivo: Python no separa header/implementacion.

  - Parametrico: MiVector usa Generic[T]; funciona igual con cualquier tipo
    (ademas, duck typing hace que Python sea parametrico "por naturaleza").
  - De subtipo:  MiVector hereda de Contenedor (ABC) y sobrescribe sus
    metodos abstractos.
  - Ad-hoc:      metodos magicos (dunder) — el equivalente Python a la
    sobrecarga de operadores de C++: __getitem__ (v[i]), __call__ (v(i)),
    __str__ (str(v) / print(v)).
"""
from abc import ABC, abstractmethod
from typing import Generic, TypeVar

T = TypeVar("T")


class Contenedor(ABC, Generic[T]):
    @abstractmethod
    def vacio(self) -> bool: ...

    @abstractmethod
    def tamano(self) -> int: ...

    @abstractmethod
    def agregar(self, x: T) -> None: ...

    @abstractmethod
    def obtener(self, i: int) -> T: ...

    @abstractmethod
    def quitar(self, i: int) -> None: ...


class MiVector(Contenedor[T]):
    def __init__(self, capacidad_inicial: int = 0) -> None:
        self._datos: list[T] = []

    def vacio(self) -> bool:
        return len(self._datos) == 0

    def tamano(self) -> int:
        return len(self._datos)

    def agregar(self, x: T) -> None:
        self._datos.append(x)

    def obtener(self, i: int) -> T:
        if i < 0 or i >= len(self._datos):
            raise IndexError("obtener: posicion fuera de rango")
        return self._datos[i]

    def quitar(self, i: int) -> None:
        if i < 0 or i >= len(self._datos):
            raise IndexError("quitar: posicion fuera de rango")
        del self._datos[i]

    # ---- Ad-hoc: misma operacion, tres sintaxis (via metodos magicos) ----
    def __getitem__(self, i: int) -> T:
        return self.obtener(i)

    def __call__(self, i: int) -> T:
        return self.obtener(i)

    def __str__(self) -> str:
        return "[" + ", ".join(str(x) for x in self._datos) + "]"
