public class Venta
{
    private IAlmacen _almacen;

    public Venta(IAlmacen _almacen)
    {  
        _almacen = almacen;
    }

    public bool CobrarProducto(int codigo, int cantidad)
    {
        Producto Venta = _almacen.BuscarProducto(codigo)
        if( venta == null) return false;
        double total = venta.Precio * cantidad;

        System.Console.WriteLine($"[CAJA] Venta realizada con el producto: {venta.Nombre}");
        return True;
    }
}