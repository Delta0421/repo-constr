// Utilidades compartidas por los 5 tests de Java.
// Java no permite que un archivo empiece con digitos en el nombre de clase,
// por eso los tests se llaman TestNNNombre.java en vez de NN_test_nombre.java.
public class TestUtils {
    static void separador(String titulo) {
        System.out.println("\n========== " + titulo + " ==========");
    }

    static String estadoTexto(boolean vacio) {
        return vacio ? "vacío" : "lleno";
    }

    static void ok() {
        System.out.println("##POLI:OK##");
    }

    static void fallo(String motivo) {
        System.out.println("##POLI:FALLO:" + motivo + "##");
    }
}
