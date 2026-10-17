public class ProfeJirafales implements Educador, Habitante{
    private String nombre = "Profesor Jirafales";

    @Override
    public void pasarLista(){
        System.out.println(nombre + "pasa la lista de la clase");
    }

    @Override
    public void impartirClase(){
        System.out.println(nombre + "da una clase magistral");
    }

    @Override
    public void hacerCoraje(){
        System.out.println("TA TA TA TA TA");
    }

    @Override 
    public void interactuarConElChavo(){
        System.out.println(nombre + "le quiebra la columna");
    }
}