public class Contado implements MetodoPago{
    public Boolean estado_billetes;

    public Contado(Boolean estado_billetes){
        this.estado_billetes = estado_billetes;
    }

    @Override
    public boolean validar(){
        return estado_billetes;
    }

    @Override
    public void pagar(double monto){
        System.out.println("Pago de $" + monto + " realizado con efectivo");
    }
}
