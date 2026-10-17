"""Utilidades compartidas por los 5 tests de Python."""


def separador(titulo: str) -> None:
    print(f"\n========== {titulo} ==========")


def estado_texto(vacio: bool) -> str:
    return "vacío" if vacio else "lleno"


def ok() -> None:
    print("##POLI:OK##")


def fallo(motivo: str) -> None:
    print(f"##POLI:FALLO:{motivo}##")
