"""Test 3: polimorfismo de subtipo — una referencia de tipo Contenedor
ejecuta el metodo que en realidad implemento MiVector (despacho dinamico)."""
from test_utils import separador, ok, fallo
from mivector import Contenedor, MiVector

if __name__ == "__main__":
    separador("Test 3: polimorfismo de subtipo")
    v = MiVector()
    v.agregar(10)
    v.agregar(20)
    v.agregar(30)

    base: Contenedor = v
    base.quitar(0)

    if base.tamano() != 2:
        fallo("quitar() via Contenedor no redujo el tamano")
    elif base.obtener(0) != 20:
        fallo("quitar() via Contenedor no elimino el elemento correcto")
    else:
        print("base.quitar(0) elimino el primer elemento a traves de la referencia base.")
        print(f"base.tamano()={base.tamano()}  base.obtener(0)={base.obtener(0)}")
        ok()
