public class Lampara implements ActivablePorRedstone{

    @Override
    public void activar(){
        System.out.println("Lampara se activa y se enciende");
    }

    @Override
    public void desactivar(){
        System.out.println("Lampara se desactiva y se apaga");
    }

}
