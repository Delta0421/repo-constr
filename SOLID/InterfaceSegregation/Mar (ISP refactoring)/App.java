import java.util.List;

public class App{
    public static void main(String[] args) {
        Ñoño ñoño = new Ñoño();
        DonRamon donRamon = new DonRamon();
        ProfeJirafales jirafales = new ProfeJirafales();

        //Interfaz para el profesor jirafales    
        List<Educador> educadores = List.of(jirafales);
        for(Educador e: educadores){
            e.impartirClase();
            e.pasarLista();
            e.hacerCoraje();
        }

        //Interfaz para Don Ramon
        List<Inquilino> inquilinos = List.of(donRamon);
        for(Inquilino i : inquilinos){
            i.pagarRenta();
        }

        //Interfaz para Habitantes
        List<Habitante> habitantes = List.of(donRamon, jirafales);
        for(Habitante h : habitantes){
            h.interactuarConElChavo();
        }

        //interfaz para niño
        List<Niño> Niños = List.of(ñoño);
        for(Niño n : Niños){
            n.llorar();
            n.cantar();
        }
    }
}