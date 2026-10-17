// Test 2: construccion — agregar() y obtener() recorriendo el vector.
public class Test02Construccion {
    public static void main(String[] args) {
        TestUtils.separador("Test 2: construccion");
        MiVector<Integer> v = new MiVector<>();
        int[] esperado = {1, 1, 2, 3, 5, 8};
        for (int x : esperado) v.agregar(x);

        if (v.tamano() != 6) { TestUtils.fallo("tamano incorrecto tras 6 agregar()"); return; }
        for (int i = 0; i < 6; i++) {
            if (!v.obtener(i).equals(esperado[i])) { TestUtils.fallo("obtener() no coincide con lo agregado"); return; }
            System.out.println("  nodo " + i + ": " + v.obtener(i));
        }
        System.out.println("Vector construido con " + v.tamano() + " elementos.");
        TestUtils.ok();
    }
}
