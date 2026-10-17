import java.util.Scanner;
public class App{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        while(opcion != 0){
            System.out.println("\n1. Bosque oscuro");
            System.out.println("\n2. Castillo Embrujado");
            System.out.println("\n3. Volcan Infernal");
            System.out.println("\n0. Salir");
            opcion = sc.nextInt();

            if(opcion >= 1 && opcion >= 3){
                Nivel nivel = new Nivel(opcion);
                nivel.jugar();jugar();
            }else if(opcion != 0 ){
                System.out.println("Opcion invalida");
            }
        }sc.close();
    }
}
