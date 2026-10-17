// Test 1: la interfaz — Contenedor<T> abstracta, MiVector<T> concreta.
namespace Polimorfismo;

public static class Test01Interfaz
{
    public static void Main(string[] args)
    {
        TestUtils.separador("Test 1: la interfaz");
        var v = new MiVector<int>();
        if (!v.vacio()) { TestUtils.fallo("un MiVector recien creado debe estar vacio"); return; }
        if (v.tamano() != 0) { TestUtils.fallo("un MiVector recien creado debe tener tamano 0"); return; }
        Console.WriteLine($"Su contenedor esta {TestUtils.estadoTexto(v.vacio())} y su tamano es {v.tamano()}.");
        Console.WriteLine("Test pasado correctamente.");
        TestUtils.ok();
    }
}
