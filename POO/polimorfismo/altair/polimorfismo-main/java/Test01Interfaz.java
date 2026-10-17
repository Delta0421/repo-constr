// Test 1: la interfaz — Contenedor<T> abstracta, MiVector<T> concreta.
public class Test01Interfaz {
    public static void main(String[] args) {
        TestUtils.separador("Test 1: la interfaz");
        MiVector<Integer> v = new MiVector<>();
        if (!v.vacio()) { TestUtils.fallo("un MiVector recien creado debe estar vacio"); return; }
        if (v.tamano() != 0) { TestUtils.fallo("un MiVector recien creado debe tener tamano 0"); return; }
        System.out.println("Su contenedor esta " + TestUtils.estadoTexto(v.vacio())
                + " y su tamano es " + v.tamano() + ".");
        System.out.println("Test pasado correctamente.");
        TestUtils.ok();
    }
}
