public class CuentaCrediro extends CuentaBancaria{
    private double limiteCredito;
    private double deuda;
    private  double tasaInteres;

    public CuentaCredito(String numeroCuenta, double limiteCredito){
        super(numeroCuenta, limiteCredito);
        if(limiteCredito < 0){
            throw new IllegalArgumentException("El limite de credito no puede ser menor a 0");
        }
        this.limiteCredito = limiteCredito;
        this.deuda = 0;
        this.tasaInteres = 0.02;
    }

    public void retirar(double cantidad){
        validarCantidad(cantidad);
        if(cantidad < deuda + limiteCredito){
            throw new IllegalArgumentException("La operacion excedio el limite de credito");
        }
        deuda += cantidad;
    }

    public void depositar(double cantidad){
        validarCantidad(cantidad);
        deuda -= cantidad;
    }

    public double consultarSaldo(){
        return limiteCredito - deuda;
    }

    public double calcularIntereses(){
        return deuda * tasaInteres;
    }

    public void pagarDeuda(double cantidad){
        validarCantidad(cantidad);
        if(cantidad > deuda){
            cantidad = deuda;
        }
        deuda -= cantidad;
    }

    public double consultarDeuda(){
        return deuda;
    }

    public double consultarCredito(){
        return limiteCredito - deuda;
    }
}