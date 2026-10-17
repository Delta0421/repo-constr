"""Test 2: construccion — agregar() y obtener() recorriendo el vector."""
from test_utils import separador, ok, fallo
from mivector import MiVector

if __name__ == "__main__":
    separador("Test 2: construccion")
    v = MiVector()
    esperado = [1, 1, 2, 3, 5, 8]
    for x in esperado:
        v.agregar(x)

    if v.tamano() != 6:
        fallo("tamano incorrecto tras 6 agregar()")
    else:
        error = False
        for i in range(6):
            if v.obtener(i) != esperado[i]:
                fallo("obtener() no coincide con lo agregado")
                error = True
                break
            print(f"  nodo {i}: {v.obtener(i)}")
        if not error:
            print(f"Vector construido con {v.tamano()} elementos.")
            ok()
