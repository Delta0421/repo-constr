// Test 3: polimorfismo de subtipo — una referencia a Contenedor<T> ejecuta
// el metodo que en realidad implemento MiVector<T> (despacho dinamico).
public class Test03Subtipo {
    public static void main(String[] args) {
        TestUtils.separador("Test 3: polimorfismo de subtipo");
        MiVector<Integer> v = new MiVector<>();
        v.agregar(10); v.agregar(20); v.agregar(30);

        Contenedor<Integer> base = v;
        base.quitar(0);

        if (base.tamano() != 2) { TestUtils.fallo("quitar() via Contenedor<Integer> no redujo el tamano"); return; }
        if (!base.obtener(0).equals(20)) { TestUtils.fallo("quitar() via Contenedor<Integer> no elimino el elemento correcto"); return; }

        System.out.println("base.quitar(0) elimino el primer elemento a traves de la referencia base.");
        System.out.println("base.tamano()=" + base.tamano() + "  base.obtener(0)=" + base.obtener(0));
        TestUtils.ok();
    }
}
