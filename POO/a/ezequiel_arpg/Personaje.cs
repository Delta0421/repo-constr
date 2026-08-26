abstract class Personaje
{
    public string nombre {get; private set;}
    public int puntosVida {get; private set;}
    public bool estadoVida{get{return puntosVida > 0;}}

    public personaje( string nombre)
    {
        this.nombre = nonmbre;
        puntosVida = 100;
    }

    public void RecibirDaño(int Cantidad)
    {
        puntosVida -= Cantidad;
        if (puntosVida < 0)
        {
            puntosVida = 0;
            System.Console.Write($"{nombre} recibio daño de {Cantidad}, sus puntos de vida son {puntosVida}");
        }
    }

    public abstract void Ataque(Personaje objetivo);
}