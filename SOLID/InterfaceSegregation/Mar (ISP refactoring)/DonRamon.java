public class DonRamon implements Inquilino, Habitante{
    private String nombre = "Don Ramon";
    
    @Override
    public void pagarRenta(){
        System.out.println(nombre + "Le jura al señor barriga que le paga la proxima semana");
    }

    @Override
    public void interactuarConElChavo(){
        System.out.println(nombre + "le mete una sumidera de morrela al chavo");
    }
}