public class Program
{
    public static void Main()
    {
        IAlmacen almacenGlobal = AlmacenCentral.Instancia;

        Inventario empleadoInventario = new Inventario(almacenGlobal);
        Venta empleadoVenta = new Venta(almacenGlobal);

        empleadoInventario.RegistrarProducto("Coca", 1, 20.00,10);
        empleadoInventario.RegistrarProducto("Azucar", 2, 10.00,10);
        empleadoInventario.RegistrarProducto("Bubulubu", 3, 5.00,10);
        empleadoInventario.RegistrarProducto("Pepsi", 4, 12.00,10);

        empleadoVenta.CobrarProducto(1 , 4);
        empleadoVenta.CobrarProducto(2 , 4);
        empleadoVenta.CobrarProducto(3 , 4);
        empleadoVenta.CobrarProducto(4 , 4);

        var instancia1 = AlmacenCentral.Instancia;
        var instancia2 = AlmacenCentral.Instancia;

        if (ReferenceEquals(instancia1 , instancia2))
        {
            System.Console.WriteLine("Ambos apuntan a la misma instancia");
        } ;
    }
}