import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op, op1, cantidad, cantidadB, cantidadM;
        String nombreProducto, nuevoNombre;
        Tienda t1 = new Tienda();
        do {
            menu();
            op = Integer.parseInt(sc.next());
            switch (op){
                case 1:{
                    do {
                        System.out.println("Ingrese el producto que desea ver: ");
                        nombreProducto = sc.next();
                    } while (nombreProducto == null);
                    Producto p = t1.darProducto(nombreProducto);
                    if (nombreProducto != null){
                        System.out.println("Nombre: "+p.darNombre());
                        System.out.println("Tipo: "+p.darTipo());
                        System.out.println("Valor unitario: "+p.darValorUnitario());
                        System.out.println("Cantidad en bodega: "+p.darCantidadBodega());
                        System.out.println("Cantidad mínima: "+p.darCantidadMinima());
                        System.out.println("Cantidad de unidades vendidas: "+p.darCantidadUnidadesVendidas());
                    } else {
                        System.out.println("Ingrese un producto válido");
                    }
                } break;

                case 2:{
                    System.out.println("Ingrese el producto que quiera vender: ");
                    nombreProducto = sc.next();
                    System.out.println("Ingrese la cantidad que quiere vender: ");
                    cantidad = Integer.parseInt(sc.next());
                    if (cantidad > 0){
                        System.out.println("Se ha vendido el producto: "+t1.venderProducto(nombreProducto, cantidad));
                    } else {
                        System.out.println("Ingrese una cantidad válida.");
                    }
                } break;

                case 3:{
                    System.out.println("Ingrese el producto que desea abastecer: ");
                    nombreProducto = sc.next();
                    if (nombreProducto != null){
                        Producto p = t1.darProducto(nombreProducto);
                        if (p != null){
                            System.out.println("Ingrese la cantidad que desea abastecer: ");
                            int cantidadAbastecer = Integer.parseInt(sc.next());
                            if (cantidadAbastecer >= 0 && p.darCantidadBodega() < p.darCantidadMinima()){
                                t1.abastecerProducto(nombreProducto, cantidadAbastecer);
                                System.out.println("El producto se ha abastecido correctamente ");
                            } else {
                                System.out.println("El producto no pudo ser abastecido");
                            }
                        } else {
                            System.out.println("El producto ingresado no existe");
                        }
                    } else {
                        System.out.println("El nombre ingresado no existe");
                    }
                } break;

                case 4:{
                    System.out.println("Ingrese el producto que desea cambiar: ");
                    nombreProducto = sc.next();
                    System.out.println("Ingrese el nombre al cual lo desea cambiar: ");
                    nuevoNombre = sc.next();
                    System.out.println("Ingrese el tipo de producto: ");
                    System.out.println("1. Tipo Droguería");
                    System.out.println("2. Tipo Supermercado");
                    System.out.println("3. Tipo Papeleía");
                    int tipoP = Integer.parseInt(sc.next());
                    Producto.Tipo tipoProducto = null;
                    switch (tipoP){
                        case 1:{
                            tipoProducto = Producto.Tipo.DROGUERIA;
                        }break;
                        case 2:{
                            tipoProducto = Producto.Tipo.SUPERMERCADO;
                        }break;
                        case 3:{
                             tipoProducto = Producto.Tipo.PAPELERIA;
                        }break;
                        case 4:{
                             tipoProducto = Producto.Tipo.TEXTIL;
                        }break;
                        default:
                            System.out.println("Ingrese una opción válida");
                            break;
                    }
                    System.out.println("Ingrese el valor unitario del producto: ");
                    int valorUni = Integer.parseInt(sc.next());
                    System.out.println("Ingrese la cantidad de la bodega: ");
                    cantidadB = Integer.parseInt(sc.next());
                    System.out.println("Ingrese la cantidad mínima: ");
                    cantidadM = Integer.parseInt(sc.next());

                    System.out.println("El producto ha sido cambiado con éxito: "+t1.cambiarProducto(nombreProducto, nuevoNombre, tipoProducto, valorUni, cantidadB, cantidadM));

                } break;
                case 5:{
                    System.out.println("Estadísticas de ventas");
                    System.out.println("1. El producto más vendido");
                    System.out.println("2. El producto menos vendido");
                    System.out.println("3. Dinero total por ventas");
                    System.out.println("4. Dinero promedio por ventas");
                    System.out.println("5. Salir");
                    System.out.println("Ingrese una opción");
                    op1 = Integer.parseInt(sc.next());
                    switch (op1){
                        case 1:{
                            System.out.println("El producto más vendido es: "+t1.darProductoMasVendido());
                        } break;
                        case 2:{
                            System.out.println("El producto menos vendido es: "+t1.darProductoMenosVendido());
                        } break;
                        case 3:{
                            System.out.println("El dinero total por ventas es de: "+t1.darDineroEnCaja());
                        } break;
                        case 4:{
                            System.out.println("El dinero de promedio de ventas es de: "+t1.darPromedioVentas());
                        } break;
                    }
                } break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }
        } while (op != 6);
    }
    public static void menu (){
        System.out.println("1. Información de los productos");
        System.out.println("2. Vender un producto");
        System.out.println("3. Abastecer la tienda con un producto.");
        System.out.println("4. Cambiar un producto");
        System.out.println("5. Calcular estaísticas de ventas");
        System.out.println("6. Salir");
        System.out.println("Ingrese un número: ");
    }
}