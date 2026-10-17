public class NivelBosque extends Nivel{
    public NivelBosque(){
        super("Bosque oscuro");
    }

    @Override
    public Enemigo crearEnemigo(){
        return new Lobo();
    }
}