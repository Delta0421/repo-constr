public class App{
    public static void main(String[] args) {
        donRamon Ramon = new donRamon();
        DoñaFlorinda Florinda = new DoñaFlorinda();
        Ñoño ñoño = new Ñoño();

        System.out.println("==La vesinda del shavo==");

        Ramon.darGolpe();
        try {
            Ramon.cobrarRenta();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Ramon.pagarRenta();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Ramon.jugar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Ramon.llorar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Florinda.darGolpe();
        Florinda.pagarRenta();

        try {
            Florinda.cobrarRenta();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Florinda.jugar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Florinda.llorar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        ñoño.jugar();
        ñoño.llorar();

        try {
            ñoño.darGolpe();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            ñoño.cobrarRenta();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            ñoño.pagarRenta();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}