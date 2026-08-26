Guerrero guerrero1 = new Guerrero("Justin");
Mago mago1 = new Mago("Christopher");

System.Console.WriteLine($"{mago1.nombre} vs {guerrero1.nombre}");

while (mago1.estadoVida && guerrero1.estadoVida)
{
    System.Console.WriteLine("1. Guerrero Ataca a mago");
    System.Console.WriteLine("2. Mago ataca a guerrero");
    System.Console.WriteLine("3.Mago usa habilidad");

    string? opcion = Console.ReadLine();

    switch (opcion)
    {
        case "1":
            guerrero1.Ataque(mago1);
            break;
        case "2":
            mago1.Ataque(guerrero1);
        case "3":
            mago1.UsarHabilidad();
            break;
        default:
            System.Console.WriteLine("Opcion no valida");
            break;
    }

    if (mago1.puntosVida)
    {
        System.Console.WriteLine("Gana mago");
    }

    if(guerrero1.puntosVida)
    {
        System.Console.WriteLine("Gana guerrero");
    }
}