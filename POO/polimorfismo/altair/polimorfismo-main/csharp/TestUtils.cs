// Utilidades compartidas por los 5 tests de C#.
namespace Polimorfismo;

public static class TestUtils
{
    public static void separador(string titulo) => Console.WriteLine($"\n========== {titulo} ==========");

    public static string estadoTexto(bool vacio) => vacio ? "vacío" : "lleno";

    public static void ok() => Console.WriteLine("##POLI:OK##");

    public static void fallo(string motivo) => Console.WriteLine($"##POLI:FALLO:{motivo}##");
}
