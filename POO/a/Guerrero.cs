class Guerrero : Personaje
{
    public Guerrero(string nombre) : base(nombre)
    {
        
    }

    public override void Ataque(Personaje objetivo)
    {
        System.Console.WriteLine($"{nombre} ataca a {objetivo}");
    }
}