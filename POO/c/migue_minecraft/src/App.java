public class App {
    public static void main(String[] args){

        Piston miPiston = new Piston(); 
        Puerta miPuerta = new Puerta();
        Lampara miLampara = new Lampara();
        BloqueMusical miBloqueMusical = new BloqueMusical();

        System.out.println("Se activa la palanca");
        miPiston.activar();
        miPuerta.activar();   
        miLampara.activar();
        miBloqueMusical.activar();

        System.out.println("\n");

        System.out.println("Se desactiva la palanca");
        miPiston.desactivar();
        miPuerta.desactivar();
        miLampara.desactivar();
        miBloqueMusical.desactivar();

        System.out.println("\n");

        Zombie miZombie = new Zombie();
        Esqueleto miEsqueleto = new Esqueleto();

        miZombie.atacar();
        miZombie.quemarEnLava();

        System.out.println("\n");

        miEsqueleto.atacar();
        miEsqueleto.quemarEnLava();

    }
}
