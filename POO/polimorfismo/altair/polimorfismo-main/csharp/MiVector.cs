// MiVector.cs — vector generico que hereda de Contenedor<T>.
//   - Parametrico: la clase entera es generica sobre T.
//   - De subtipo:  hereda de Contenedor<T> y sobrescribe (override) sus metodos.
//   - Ad-hoc:      C# SI soporta sobrecarga de operadores (a diferencia de
//                  Java): indizador this[i], ToString() y operator +.
using System.Text;

namespace Polimorfismo;

public class MiVector<T> : Contenedor<T>
{
    private T[] datos;
    private int tam;

    public MiVector()
    {
        datos = new T[4];
        tam = 0;
    }

    public MiVector(int capacidadInicial)
    {
        datos = new T[Math.Max(capacidadInicial, 1)];
        tam = 0;
    }

    public override bool vacio() => tam == 0;

    public override int tamano() => tam;

    public override void agregar(T x)
    {
        if (tam == datos.Length) Array.Resize(ref datos, datos.Length * 2);
        datos[tam++] = x;
    }

    public override T obtener(int i)
    {
        if (i < 0 || i >= tam) throw new IndexOutOfRangeException("obtener: posicion fuera de rango");
        return datos[i];
    }

    public override void quitar(int i)
    {
        if (i < 0 || i >= tam) throw new IndexOutOfRangeException("quitar: posicion fuera de rango");
        for (int j = i; j + 1 < tam; j++) datos[j] = datos[j + 1];
        tam--;
    }

    // ---- Ad-hoc: misma operacion, tres sintaxis ----
    public T this[int i]
    {
        get => obtener(i);
        set { datos[i] = value; }
    }

    public static MiVector<T> operator +(MiVector<T> a, MiVector<T> b)
    {
        var resultado = new MiVector<T>(a.tam + b.tam);
        for (int i = 0; i < a.tam; i++) resultado.agregar(a.datos[i]);
        for (int i = 0; i < b.tam; i++) resultado.agregar(b.datos[i]);
        return resultado;
    }

    public override string ToString()
    {
        var sb = new StringBuilder("[");
        for (int i = 0; i < tam; i++)
        {
            sb.Append(datos[i]);
            if (i + 1 < tam) sb.Append(", ");
        }
        return sb.Append(']').ToString();
    }
}
