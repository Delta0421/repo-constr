public class NivelVolcan extends Nivel{
    public NivelVolcan(){
        super("Volcan Infernal");
    }

    @Override
    public Enemigo crearEnemigo(){
        return new Dragon();
    }
}