using System;
using System.Diagnostics;

public class Casa
{
    public int Pisos { get; set; }
    public string Color { get; set; }
    public bool TieneTecho { get; set; }
    public bool TieneGarage { get; set; }
    public bool TieneAlberca { get; set; }
    public bool TieneJardin { get; set; }

    public Casa(int pisos): this(pisos, color, techo, garage, alberca, false){}
    public Casa(int pisos, string color): this(pisos, false){}
    public Casa(int pisos, string color, bool techo): this(pisos, color, false){}
    public Casa(int pisos, string color, bool techo, bool garage, bool alberca): this(pisos, color, techo, garage, false){}
    public Casa(int pisos, string color, bool techo, bool garage, bool alberca, bool jardin): this(pisos, color, techo, garage, alberca, false){}
    

    public Casa(int pisos, string color, bool techo, bool garage, bool alberca, bool jardin)
    {
      Pisos = pisos;
      Color = color;
      TieneTecho = techo;
      TieneGarage = garage;
      TieneAlberca = alberca;
      TieneJardin = jardin;
    
    }

    public decimal CalcularCosto()
    {
        decimal costo = 50000m * Pisos;
        if(TieneTecho) costo += 100000m;
        if(TieneGarage) costo += 400000m;
        if(TieneAlberca) costo += 110000m;
        if(TieneJardin) costo += 130000m;
        return costo;
    }

    public void Mostrar()
    {
        System.Comsole.WriteLine($"Casa con {Pisos} piso | Color {color}");
        System.Comsole.WriteLine($"Techo {TieneTecho} | Garage {TieneGarage} | Alberca {TieneAlberca} | Jardin {TieneJardin}");
        System.Comsole.WriteLine($"Costo {CalcularCosto()}:C");
    }
}


public class CasaConAlberca : Casa
{
    public CasaConAlberca(int piso, string color)
        : base(pisos, color, true, true, false, false);    
    
}
public class CasaConGarage : Casa
{
    public CasaCon(int piso, string color)
        : base(pisos, color, true, true, false, false);    
    
}

public class CasaConGarageYAlberca : Casa
{
    public CasaConGarage(int piso, string color)
        : base(pisos, color, true, true, true, false);    
    
}

class Program
{
    static Casa ConstruirCasaFamiliar()
    {
        Casa c = new Casa(2);
        c.Color = "Beige";
        c.TieneTecho = true;
        c.TieneGarage = true;
        c.TieneJardin = true;
        if(c.Pisos <= 0 || !c.TieneTecho)
            throw new Exception("Casa invalida");
        return c;
    }

    static Casa ConstruirCasaVacasional()
    {
        Casa c = new Casa(2);
        c.Color = "Beige";
        c.TieneTecho = true;
        c.TieneGarage = true;
        c.TieneJardin = true;
        if(c.Pisos <= 0 || !c.TieneTecho)
            throw new Exception("Casa invalida");
        return c;
    }

    static void Main()
    {
        System.Console.WriteLine("-Constructor telescopico");
        Casa lujo = new Casa(2);
        lujo.Mostrar();

        System.Console.WriteLine("-Subclases");
        Casa conGarage = new CasaConGarage(1, "Azul");
        Casa conAlberca = new CasaConAlberca(1, "Rojo");
        conGarage.Mostrar();
        conAlberca.Mostrar();

        System.Console.WriteLine("-Inconsistencia");
        Casa i = new Casa(3);
        i.TieneTecho = false;
        i.TieneAlberca = false;
        i.Mostrar();

        System.Console.WriteLine("-Duplicacion");
        ConstruirCasaFamiliar.Mostrar();
        ConstruirCasaVacasional.Mostrar();

    }
}
