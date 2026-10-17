// Test 4: polimorfismo parametrico — la misma clase generica MiVector<T> con
// tres tipos distintos (int, string, y una clase propia).
namespace Polimorfismo;

public static class Test04Parametrico
{
    public class Alumno
    {
        public string Nombre;
        public double Calificacion;
        public Alumno(string nombre, double calificacion) { Nombre = nombre; Calificacion = calificacion; }
        public override string ToString() => $"{Nombre} ({Calificacion})";
    }

    public static void Main(string[] args)
    {
        TestUtils.separador("Test 4: polimorfismo parametrico");

        var numeros = new MiVector<int>();
        foreach (var v in new[] { 1, 1, 2, 3, 5, 8 }) numeros.agregar(v);

        var ciudades = new MiVector<string>();
        ciudades.agregar("CDMX");
        ciudades.agregar("Monterrey");
        ciudades.agregar("Guadalajara");

        var alumnos = new MiVector<Alumno>();
        alumnos.agregar(new Alumno("Ana", 9.5));
        alumnos.agregar(new Alumno("Luis", 8.1));

        if (numeros.tamano() != 6 || ciudades.tamano() != 3 || alumnos.tamano() != 2)
        {
            TestUtils.fallo("tamano incorrecto en alguna de las tres instanciaciones");
            return;
        }

        Console.WriteLine($"MiVector<int>:         {numeros}");
        Console.WriteLine($"MiVector<string>:      {ciudades}");
        Console.WriteLine($"MiVector<Alumno>:      {alumnos}");
        TestUtils.ok();
    }
}
