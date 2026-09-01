public class App {
    public static void main(String[] args){

        Caja caja = new Caja();

        MetodoPago tarjeta = new Tarjeta("123456781234567");
        MetodoPago paypal = new Paypal("usuario@gmail.com");
        MetodoPago contado = new Contado(true);

        caja.cobrar(tarjeta, 123);
        caja.cobrar(paypal, 500);
        caja.cobrar(contado, 100);
    }
}