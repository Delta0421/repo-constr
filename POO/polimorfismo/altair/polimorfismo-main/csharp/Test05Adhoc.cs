// Test 5: polimorfismo ad-hoc — C# si soporta sobrecarga de operadores:
// indizador this[i], ToString() y operator + sobre el mismo tipo de dato.
namespace Polimorfismo;

public static class Test05Adhoc
{
    public static void Main(string[] args)
    {
        TestUtils.separador("Test 5: polimorfismo ad-hoc");

        var a = new MiVector<int>();
        a.agregar(1); a.agregar(2);
        var b = new MiVector<int>();
        b.agregar(3); b.agregar(4);

        var suma = a + b;

        if (suma[0] != 1 || suma[2] != 3) { TestUtils.fallo("operator + no concateno los vectores en el orden esperado"); return; }

        Console.WriteLine($"a[0]={a[0]}   (a+b).ToString()={suma}   a+b via operator+");
        Console.WriteLine("Misma idea, tres sintaxis: indizador a[0], concatenacion a+b, y $\"{suma}\".");
        TestUtils.ok();
    }
}
