using System.Collections;

public class Director 
{
    private readonly ICasaBuilder _builder;

    public Director(ICasauilder _builder){
        this._builder = _builder;        
    }

    public Casa ConstruirCasaBasica()
    {
        return _builder
        .ConPisos(1)
        .ConColor("Verde Menta")
        .ConTecho()
        .Build;
    }

    public Casa ConstruirCasaDeLujo()
    {
        return _builder
        .ConPisos(4)
        .ConColor("Blanco Ostion")
        .ConTecho()
        .ConGarage()
        .ConJardin()
        .ConAlberca()
        .Build();
    }
}