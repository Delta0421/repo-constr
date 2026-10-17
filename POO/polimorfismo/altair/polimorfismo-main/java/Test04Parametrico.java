// Test 4: polimorfismo parametrico — la misma clase generica MiVector<T> con
// tres tipos distintos (Integer, String, y una clase propia).
public class Test04Parametrico {
    static class Alumno {
        String nombre;
        double calificacion;
        Alumno(String nombre, double calificacion) { this.nombre = nombre; this.calificacion = calificacion; }
        @Override public String toString() { return nombre + " (" + calificacion + ")"; }
    }

    public static void main(String[] args) {
        TestUtils.separador("Test 4: polimorfismo parametrico");

        MiVector<Integer> numeros = new MiVector<>();
        for (int v : new int[]{1, 1, 2, 3, 5, 8}) numeros.agregar(v);

        MiVector<String> ciudades = new MiVector<>();
        ciudades.agregar("CDMX");
        ciudades.agregar("Monterrey");
        ciudades.agregar("Guadalajara");

        MiVector<Alumno> alumnos = new MiVector<>();
        alumnos.agregar(new Alumno("Ana", 9.5));
        alumnos.agregar(new Alumno("Luis", 8.1));

        if (numeros.tamano() != 6 || ciudades.tamano() != 3 || alumnos.tamano() != 2) {
            TestUtils.fallo("tamano incorrecto en alguna de las tres instanciaciones");
            return;
        }

        System.out.println("MiVector<Integer>:     " + numeros);
        System.out.println("MiVector<String>:      " + ciudades);
        System.out.println("MiVector<Alumno>:      " + alumnos);
        TestUtils.ok();
    }
}
