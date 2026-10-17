// Test 5: polimorfismo ad-hoc — en Java no hay sobrecarga de operadores; el
// ad-hoc real es sobrecarga de METODOS y CONSTRUCTORES.
public class Test05Adhoc {
    public static void main(String[] args) {
        TestUtils.separador("Test 5: polimorfismo ad-hoc");

        // Sobrecarga de constructor: sin argumentos vs. con capacidad inicial.
        MiVector<Integer> v = new MiVector<>(8);
        v.agregar(100); v.agregar(300);

        // Sobrecarga de metodo: agregar(x) al final vs. agregar(x, posicion) intercalado.
        v.agregar(200, 1);

        if (!v.obtener(0).equals(100) || !v.obtener(1).equals(200) || !v.obtener(2).equals(300)) {
            TestUtils.fallo("las sobrecargas de agregar() no dejaron el vector en el orden esperado");
            return;
        }

        System.out.println("v.obtener(1)=" + v.obtener(1) + "   toString()=" + v);
        System.out.println("Mismo nombre de metodo, dos firmas distintas: agregar(x) y agregar(x, pos).");
        TestUtils.ok();
    }
}
