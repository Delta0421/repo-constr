using System;

public class Program
{
    public static void Main()
    {
        Casa personalizada = new CasaBuilder()
        .ConAlberca()
        .ConColor("Azul")
        .ConTecho()
        .Build;

        Casa personalizada1 = new CasaBuilder()
        .ConPisos(2)
        .ConColor("Amarillo")
        .ConTecho
        .ConMaterial()
        .Build();

        Directory director = new Director(new CasaBuilder());
        Directory director = new Director(new CasaBuilderModerna());

        Casa basica = director.ConstruirCasaBasica();
        Casa deLujo  = director1.ConstruirCasaLujo();
        Casa menosBasica = director1.ConstruirCasaLujo();

        personalizada.Mostrar();
        personalizada1.Mostrar();
        basica.Mostrar();
        deLujo.Mostrar();
        menosBasica.Mostrar();
    }
}