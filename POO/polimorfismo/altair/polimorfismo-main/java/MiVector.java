import java.util.Arrays;

// MiVector.java — vector generico que extiende Contenedor<T>.
//   - Parametrico: la clase entera es generica sobre T.
//   - De subtipo:  extiende Contenedor<T> y sobrescribe (@Override) sus metodos.
//   - Ad-hoc:      Java no tiene sobrecarga de operadores; el ad-hoc aqui es
//                  sobrecarga de METODOS y CONSTRUCTORES (ver agregar() abajo).
public class MiVector<T> extends Contenedor<T> {
    private Object[] datos;
    private int tam;

    public MiVector() {
        this.datos = new Object[4];
        this.tam = 0;
    }

    // Sobrecarga de constructor: capacidad inicial explicita.
    public MiVector(int capacidadInicial) {
        this.datos = new Object[Math.max(capacidadInicial, 1)];
        this.tam = 0;
    }

    @Override
    public boolean vacio() { return tam == 0; }

    @Override
    public int tamano() { return tam; }

    @Override
    public void agregar(T x) {
        if (tam == datos.length) datos = Arrays.copyOf(datos, datos.length * 2);
        datos[tam++] = x;
    }

    // Sobrecarga de metodo: agregar en una posicion especifica en vez de al final.
    public void agregar(T x, int posicion) {
        if (posicion < 0 || posicion > tam) throw new IndexOutOfBoundsException("agregar: posicion fuera de rango");
        if (tam == datos.length) datos = Arrays.copyOf(datos, datos.length * 2);
        for (int i = tam; i > posicion; i--) datos[i] = datos[i - 1];
        datos[posicion] = x;
        tam++;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T obtener(int i) {
        if (i < 0 || i >= tam) throw new IndexOutOfBoundsException("obtener: posicion fuera de rango");
        return (T) datos[i];
    }

    @Override
    public void quitar(int i) {
        if (i < 0 || i >= tam) throw new IndexOutOfBoundsException("quitar: posicion fuera de rango");
        for (int j = i; j + 1 < tam; j++) datos[j] = datos[j + 1];
        tam--;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < tam; i++) {
            sb.append(datos[i]);
            if (i + 1 < tam) sb.append(", ");
        }
        return sb.append("]").toString();
    }
}
