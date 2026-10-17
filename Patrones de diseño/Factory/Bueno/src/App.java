import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);
        int opcion = -1;

        while(opcion != 0){
            System.out.println("\n1. Bosque oscuro");
            System.out.println("\n2. Castillo Embrujado");
            System.out.println("\n3. Volcan Infernal");
            System.out.println("\n0. Salir");
            opcion = sc.nextInt();

            Nivel nivel = null;

            switch(opcion) {
                case 1:
                    nivel = new NivelBosque();
                    break;

                case 2:
                    nivel = new NivelCastillo();
                    break;

                case 3:
                    nivel = new NivelVolcan();
                    break;

                default:
                    System.out.println("eleccion invalida");
                    break;

            }

            if(nivel != null){
                nivel.jugar();
            }
        }
        sc.close();
    }
}
