"""Test 5: polimorfismo ad-hoc — metodos magicos: __getitem__ (v[i]),
__call__ (v(i)) y __str__ (str(v)), tres sintaxis sobre el mismo dato."""
from test_utils import separador, ok, fallo
from mivector import MiVector

if __name__ == "__main__":
    separador("Test 5: polimorfismo ad-hoc")
    v = MiVector()
    v.agregar(100)
    v.agregar(200)
    v.agregar(300)

    if v[0] != 100:
        fallo("__getitem__ no devolvio el valor esperado")
    elif v(1) != 200:
        fallo("__call__ no devolvio el valor esperado")
    else:
        print(f"v[0]={v[0]}   v(1)={v(1)}   str(v)={v}")
        print("Misma posicion, tres formas de acceder: corchetes, llamada y str().")
        ok()
