public class Esqueleto extends MobHostil{

    public Esqueleto(){
        super("Esqueleto", 20);
    }

    @Override
    public void atacar(){
        System.out.println("El esqueleto te persiue y te dispara con su arco");
    }
}
