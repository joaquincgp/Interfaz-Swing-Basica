

/**
 * Tienda que maneja 4 productos.
 */
public class Tienda
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Producto 1 de la tienda.
     */
    private Producto producto1;

    /**
     * Producto 2 de la tienda.
     */
    private Producto producto2;

    /**
     * Producto 3 de la tienda.
     */
    private Producto producto3;

    /**
     * Producto 4 de la tienda.
     */
    private Producto producto4;

    private Producto producto5;
    private Producto producto6;
    private Producto producto7;
    private Producto producto8;

    /**
     * Dinero total recibido por las ventas.
     */
    private double dineroEnCaja;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea la tienda con sus 4 productos. <br>
     * <b> post: </b> El dinero en caja fue inicializado en 0.<br>
     * Los 4 productos fueron inicializados con los siguientes valores: <br>
     * Producto 1 - Tipo: PAPELERIA, Nombre: L�piz, Valor unitario: 550.0, Cantidad en bodega: 18, Cantidad m�nima: 5 <br>
     * Producto 2 - Tipo: DROGUERIA, Nombre: Aspirina, Valor unitario: 109.5, Cantidad en bodega: 25, Cantidad m�nima: 8 <br>
     * Producto 3 - Tipo: PAPELERIA, Nombre: Borrador, Valor unitario: 207.3, Cantidad en bodega: 30, Cantidad m�nima: 10 <br>
     * Producto 4 - Tipo: SUPERMERCADO, Nombre: Pan, Valor unitario: 150.0, Cantidad en bodega: 15, Cantidad m�nima: 20 <br>
     *
     */
    public Tienda( ) {
        producto1 = new Producto( Producto.Tipo.PAPELERIA, "Lapiz", 1.55, 18, 5);
        producto2 = new Producto( Producto.Tipo.DROGUERIA, "Aspirina", 2.5, 25, 8);
        producto3 = new Producto( Producto.Tipo.PAPELERIA, "Borrador", 1.3, 30, 10);
        producto4 = new Producto( Producto.Tipo.SUPERMERCADO, "Pan", 1.5, 15, 20);
        producto5 = new Producto( Producto.Tipo.PAPELERIA, "Libreta", 5.5, 44, 15);
        producto6 = new Producto( Producto.Tipo.SUPERMERCADO, "Leche", 1.9, 25, 10);
        producto7 = new Producto( Producto.Tipo.SUPERMERCADO, "Jabón", 4.2, 36, 8);
        producto8 = new Producto( Producto.Tipo.TEXTIL, "Bufanda", 20, 13, 5);
        dineroEnCaja = 0;
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Retorna el producto 1.
     * @return Producto 1 de la tienda.
     */
    public Producto darProducto1( )
    {
        return producto1;
    }

    /**
     * Retorna el producto 2.
     * @return Producto 2 de la tienda.
     */
    public Producto darProducto2( )
    {
        return producto2;
    }

    /**
     * Retorna el producto 3.
     * @return Producto 3 de la tienda.
     */
    public Producto darProducto3( )
    {
        return producto3;
    }

    /**
     * Retorna el producto 4.
     * @return Producto 4 de la tienda.
     */
    public Producto darProducto4( )
    {
        return producto4;
    }
    public Producto darProducto5( )
    {
        return producto5;
    }
    public Producto darProducto6( )
    {
        return producto6;
    }
    public Producto darProducto7( )
    {
        return producto7;
    }
    public Producto darProducto8( )
    {
        return producto8;
    }

    /**
     * Retorna el dinero en caja.
     * @return Dinero en caja.
     */
    public double darDineroEnCaja( )
    {
        return dineroEnCaja;
    }

    /**
     * Retorna el producto con el nombre dado por par�metro.
     * @param pNombre Nombre del producto buscado. pNombre != null && pNombre != "".
     * @return Producto con el nombre dado por par�metro, null si no lo encuentra.
     */
    public Producto darProducto( String pNombre )
    {
        Producto buscado = null;

        if( producto1.darNombre( ).equals( pNombre ) ) {
            buscado = producto1;
        } else if( producto2.darNombre( ).equals( pNombre ) ) {
            buscado = producto2;
        } else if( producto3.darNombre( ).equals( pNombre ) ) {
            buscado = producto3;
        } else if( producto4.darNombre( ).equals( pNombre ) ) {
            buscado = producto4;
        } else if ( producto5.darNombre().equals(pNombre)){
            buscado = producto5;
        } else if ( producto6.darNombre().equals(pNombre)){
            buscado = producto6;
        } else if ( producto7.darNombre().equals(pNombre)){
            buscado = producto7;
        } else if ( producto8.darNombre().equals(pNombre)){
            buscado = producto8;
        }
        return buscado;

    }

    /**
     * Retorna el promedio de las ventas.
     * @return Dinero promedio obtenido por unidad de producto vendida.
     */
    public double darPromedioVentas( )
    {
        double respuesta = 0.0;
        double totalUnidadesVendidas=producto1.darCantidadUnidadesVendidas()+producto2.darCantidadUnidadesVendidas()+producto3.darCantidadUnidadesVendidas()+producto4.darCantidadUnidadesVendidas()+producto5.darCantidadUnidadesVendidas()+producto6.darCantidadUnidadesVendidas()+producto7.darCantidadUnidadesVendidas()+producto8.darCantidadUnidadesVendidas();
        if( totalUnidadesVendidas > 0 )
        {
            respuesta = dineroEnCaja / totalUnidadesVendidas;
        }
        return respuesta;
    }

    /**
     * Retorna el producto con m�s unidades vendidas.
     * @return Producto con m�s unidades vendidas. Null si ning�n producto tiene unidades vendidas.
     */
    public Producto darProductoMasVendido( )
    {
        int venta1 = producto1.darCantidadUnidadesVendidas( );
        int venta2 = producto2.darCantidadUnidadesVendidas( );
        int venta3 = producto3.darCantidadUnidadesVendidas( );
        int venta4 = producto4.darCantidadUnidadesVendidas( );
        int venta5 = producto5.darCantidadUnidadesVendidas( );
        int venta6 = producto6.darCantidadUnidadesVendidas( );
        int venta7 = producto7.darCantidadUnidadesVendidas( );
        int venta8 = producto8.darCantidadUnidadesVendidas( );

        Producto masVendido = null;
        int mayorCantidad = 0;

        if( venta1 > mayorCantidad ){
            masVendido = producto1;
            mayorCantidad = venta1;
        }
        if( venta2 > mayorCantidad ) {
            masVendido = producto2;
            mayorCantidad = venta2;
        }
        if( venta3 > mayorCantidad ) {
            masVendido = producto3;
            mayorCantidad = venta3;
        }
        if( venta4 > mayorCantidad ) {
            masVendido = producto4;
        }
        if( venta5 > mayorCantidad ) {
            masVendido = producto5;
        }
        if( venta6 > mayorCantidad ) {
            masVendido = producto6;
        }
        if( venta7 > mayorCantidad ) {
            masVendido = producto7;
        }
        if( venta8 > mayorCantidad ) {
            masVendido = producto8;
        }
        return masVendido;
    }

    /**
     * Retorna el producto con menos unidades vendidas.
     * @return Producto con menos unidades vendidas. Null si ning�n producto tiene unidades vendidas.
     */
    public Producto darProductoMenosVendido( )
    {
        int venta1 = producto1.darCantidadUnidadesVendidas( );
        int venta2 = producto2.darCantidadUnidadesVendidas( );
        int venta3 = producto3.darCantidadUnidadesVendidas( );
        int venta4 = producto4.darCantidadUnidadesVendidas( );
        int venta5 = producto5.darCantidadUnidadesVendidas( );
        int venta6 = producto6.darCantidadUnidadesVendidas( );
        int venta7 = producto7.darCantidadUnidadesVendidas( );
        int venta8 = producto8.darCantidadUnidadesVendidas( );

        Producto menosVendido = null;

        if( venta1 > 0 || venta2 > 0 || venta3 > 0 || venta4 > 0 || venta5 > 0 || venta6 > 0 || venta7 > 0 || venta8 > 0)
        {
            if( venta1 <= venta2 && venta1 <= venta3 && venta1 <= venta4 && venta1 <= venta5 && venta1 <= venta6 && venta1 <= venta7 && venta1 <= venta8){
                menosVendido = producto1;
            } else if( venta2 <= venta1 && venta2 <= venta3 && venta2 <= venta4 && venta2 <= venta5 && venta2 <= venta6 && venta2 <= venta7 && venta2 <= venta8 ) {
                menosVendido = producto2;
            } else if( venta3 <= venta2 && venta3 <= venta1 && venta3 <= venta4 && venta3 <= venta5 && venta3 <= venta6 && venta3 <= venta7 && venta3 <= venta8 ) {
                menosVendido = producto3;
            } else if( venta4 <= venta2 && venta4 <= venta1 && venta4 <= venta3 && venta4 <= venta5 && venta4 <= venta6 && venta4 <= venta7 && venta4 <= venta8 ) {
                menosVendido = producto4;
            } else if( venta5 <= venta2 && venta5 <= venta1 && venta5 <= venta4 && venta5 <= venta3 && venta5 <= venta6 && venta5 <= venta7 && venta5 <= venta8 ) {
                menosVendido = producto5;
            } else if( venta6 <= venta2 && venta6 <= venta1 && venta6 <= venta4 && venta6 <= venta5 && venta6 <= venta3 && venta6 <= venta7 && venta6 <= venta8 ) {
                menosVendido = producto6;
            } else if( venta7 <= venta2 && venta7 <= venta1 && venta7 <= venta4 && venta7 <= venta5 && venta7 <= venta6 && venta7 <= venta3 && venta7 <= venta8 ) {
                menosVendido = producto7;
            } else {
                menosVendido = producto8;
            }
        }

        return menosVendido;
    }

    /**
     * Vende una cantidad de unidades de producto de la tienda, dado su nombre por par�metro. <br>
     * <b>post: </b> Disminuy� la cantidad de unidades del producto dado y se actualiz� el dinero de la caja.
     * @param pNombreProducto Nombre del producto a vender. npNombreProducto != null && pNombreProducto != "".
     * @param pCantidad Cantidad de unidades del producto a vender. pCantidad > 0.
     * @return Cantidad que fue efectivamente vendida.
     */
    public int venderProducto( String pNombreProducto, int pCantidad )
    {
        int cantidadVendida = 0;
        Producto producto = darProducto( pNombreProducto );
        cantidadVendida = producto.vender( pCantidad );
        dineroEnCaja += cantidadVendida * producto.calcularPrecioFinal( );

        return cantidadVendida;
    }

    /**
     * Abastece un producto dado su nombre, con la cantidad de unidades dadas. <br>
     * <b>post: </b> Aument� la cantidad de unidades en bodega del producto dado.
     * @param pNombreProducto Nombre del producto a abastecer. pNombreProducto != null && pNombreProducto != "".
     * @param pCantidad La cantidad de unidades a abastecer. cantidad >= 0.
     * @return Retorna true si se pudo efectuar el abastecimiento, false en caso contrario.
     */
    public boolean abastecerProducto( String pNombreProducto, int pCantidad )
    {
        boolean abastece = false;
        Producto producto = darProducto( pNombreProducto );

        if( producto.puedeAbastecer( ) ){
            producto.abastecer( pCantidad );
            abastece = true;
        }

        return abastece;
    }

    /**
     * Cambia el producto que tiene el nombre actual con los nuevos valores dados por par�metro. <br>
     * <b>post: </b> El nombre, tipo, valor unitario, cantidad en bodega y cantidad m�nima fueron cambiados con los valores dados por par�metro.
     * @param pNombreActual Nombre actual del producto. pNombreActual != null && pNombreActual != "".
     * @param pNombreNuevo Nuevo nombre del producto. pNombreNuevo != null && pNombreNuevo != "".
     * @param pTipo Tipo del producto. pTipo != null.
     * @param pValorUnitario Valor unitario del producto
     * @param pCantidadBodega Cantidad en bodega del producto. pCantidadBodega >= 0.
     * @param pCantidadMinima Cantidad m�nima en bodega para hacer un pedido del producto. pCantidadMinima > 0.

     * @return Retorna true si cambi� la informaci�n del producto, false si ya exist�a un producto diferente con el nuevo nombre.
     */
    public boolean cambiarProducto(String pNombreActual, String pNombreNuevo, Producto.Tipo pTipo, double pValorUnitario, int pCantidadBodega, int pCantidadMinima )
    {
        boolean cambio = false;
        if( pNombreActual.equals( pNombreNuevo ) || darProducto( pNombreNuevo ) == null )
        {
            if( producto1.darNombre( ).equals( pNombreActual ) ){
                producto1 = new Producto( pTipo, pNombreNuevo, pValorUnitario, pCantidadBodega, pCantidadMinima );
            } else if( producto2.darNombre( ).equals( pNombreActual ) ){
                producto2 = new Producto( pTipo, pNombreNuevo, pValorUnitario, pCantidadBodega, pCantidadMinima);
            } else if( producto3.darNombre( ).equals( pNombreActual ) ) {
                producto3 = new Producto( pTipo, pNombreNuevo, pValorUnitario, pCantidadBodega, pCantidadMinima );
            } else if( producto4.darNombre( ).equals( pNombreActual ) ) {
                producto4 = new Producto( pTipo, pNombreNuevo, pValorUnitario, pCantidadBodega, pCantidadMinima);
            } else if( producto5.darNombre( ).equals( pNombreActual ) ) {
                producto5 = new Producto( pTipo, pNombreNuevo, pValorUnitario, pCantidadBodega, pCantidadMinima);
            } else if( producto6.darNombre( ).equals( pNombreActual ) ) {
                producto6 = new Producto( pTipo, pNombreNuevo, pValorUnitario, pCantidadBodega, pCantidadMinima);
            } else if( producto7.darNombre( ).equals( pNombreActual ) ) {
                producto7 = new Producto( pTipo, pNombreNuevo, pValorUnitario, pCantidadBodega, pCantidadMinima);
            } else if( producto8.darNombre( ).equals( pNombreActual ) ) {
                producto8 = new Producto( pTipo, pNombreNuevo, pValorUnitario, pCantidadBodega, pCantidadMinima);
            }
            cambio = true;
        }
        return cambio;
    }

    // -----------------------------------------------------------------
    // Puntos de Extensi�n
    // -----------------------------------------------------------------

    /**
     * M�todo para la extensi�n 1.
     * @return Respuesta 1.
     */
    /*public String metodo1(){
        double nuevoPrecioProducto1 = producto1.darValorUnitario();
        double nuevoPrecioProducto2 = producto2.darValorUnitario();
        double nuevoPrecioProducto3 = producto3.darValorUnitario();
        double nuevoPrecioProducto4 = producto4.darValorUnitario();
        if (nuevoPrecioProducto1 == 0 || nuevoPrecioProducto2 == 0 || nuevoPrecioProducto3 == 0 || nuevoPrecioProducto4 == 0){
            return "Precios incorrectos";
        } else {
            return "Nuevos precios modificados con éxito" +
                    "\nlapiz: $"+nuevoPrecioProducto1 +
                    "aspirina: $"+nuevoPrecioProducto2 +
                    "borrador: $"+nuevoPrecioProducto3 +
                    "pan: $"+nuevoPrecioProducto4;
        }
    }*/



    /**
     * M�todo para la extensi�n 2.
     * @return Respuesta 2.
     */
    public String metodo2( )
    {
        return "Respuesta 2";
    }

}