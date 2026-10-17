// Contenedor.java — interfaz abstracta. Solo firmas: cada contenedor concreto
// decide COMO cumplirlas. Esto es polimorfismo de subtipo (inclusion).
public abstract class Contenedor<T> {
    public abstract boolean vacio();
    public abstract int tamano();
    public abstract void agregar(T x);
    public abstract T obtener(int i);
    public abstract void quitar(int i);
}
