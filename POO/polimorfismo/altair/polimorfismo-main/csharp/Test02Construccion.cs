// Test 2: construccion — agregar() y obtener() recorriendo el vector.
namespace Polimorfismo;

public static class Test02Construccion
{
    public static void Main(string[] args)
    {
        TestUtils.separador("Test 2: construccion");
        var v = new MiVector<int>();
        int[] esperado = { 1, 1, 2, 3, 5, 8 };
        foreach (var x in esperado) v.agregar(x);

        if (v.tamano() != 6) { TestUtils.fallo("tamano incorrecto tras 6 agregar()"); return; }
        for (int i = 0; i < 6; i++)
        {
            if (v.obtener(i) != esperado[i]) { TestUtils.fallo("obtener() no coincide con lo agregado"); return; }
            Console.WriteLine($"  nodo {i}: {v.obtener(i)}");
        }
        Console.WriteLine($"Vector construido con {v.tamano()} elementos.");
        TestUtils.ok();
    }
}
