// Test 3: polimorfismo de subtipo — una referencia a Contenedor<T> ejecuta
// el metodo que en realidad implemento MiVector<T> (despacho dinamico).
namespace Polimorfismo;

public static class Test03Subtipo
{
    public static void Main(string[] args)
    {
        TestUtils.separador("Test 3: polimorfismo de subtipo");
        var v = new MiVector<int>();
        v.agregar(10); v.agregar(20); v.agregar(30);

        Contenedor<int> baseRef = v;
        baseRef.quitar(0);

        if (baseRef.tamano() != 2) { TestUtils.fallo("quitar() via Contenedor<int> no redujo el tamano"); return; }
        if (baseRef.obtener(0) != 20) { TestUtils.fallo("quitar() via Contenedor<int> no elimino el elemento correcto"); return; }

        Console.WriteLine("baseRef.quitar(0) elimino el primer elemento a traves de la referencia base.");
        Console.WriteLine($"baseRef.tamano()={baseRef.tamano()}  baseRef.obtener(0)={baseRef.obtener(0)}");
        TestUtils.ok();
    }
}
