public class Ñoño implements AccionesPersonaje{
    private final String nombre = "Ñoño";

    @Override
    public void darGolpe(){
        throw new UnsupportedOperationException(nombre + "No pega");
    }

    @Override
    public void pagarRenta(){
        throw new UnsupportedOperationException(nombre + " Nunca paga renta");
    }

    @Override
    public void cobrarRenta(){
        throw new UnsupportedOperationException(nombre + " No es dueño de la vecindad");
    }

    @Override
    public void jugar(){
        System.out.println(nombre + "juega con su pelota de playa");
    }

    @Override
    public void llorar(){
        System.out.println("aja i aja i");
    }
}