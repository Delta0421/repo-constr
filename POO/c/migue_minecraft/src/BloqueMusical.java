public class BloqueMusical implements ActivablePorRedstone{

    @Override
    public void activar(){
        System.out.println("Bloque musical se activa y reproduce musica");
    }

    @Override
    public void desactivar(){
        System.out.println("Bloque musical se desactiva y deja de reproducir");
    }

}
