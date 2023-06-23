import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUITienda extends JFrame {

    private JPanel panel;
    private JButton informaciónButton;
    private JButton informaciónButton1;
    private JButton informaciónButton2;
    private JButton informaciónButton3;
    private JButton informaciónButton4;
    private JButton informaciónButton5;
    private JButton informaciónButton6;
    private JButton informaciónButton7;
    private JButton venderButton;
    private JButton venderButton1;
    private JButton venderButton2;
    private JButton venderButton3;
    private JButton venderButton4;
    private JButton venderButton5;
    private JButton venderButton6;
    private JButton venderButton7;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JButton abastecerButton;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField13;
    private JTextField textField14;
    private JTextField textField15;
    private JTextField textField16;
    private JButton abastecerButton1;
    private JButton abastecerButton2;
    private JButton abastecerButton3;
    private JButton abastecerButton4;
    private JButton abastercerButton5;
    private JButton abastecerButton6;
    private JButton abastecerButton7;
    private JTextField textField18;
    private JTextField textField20;
    private JTextField textField21;
    private JTextField textField22;
    private JButton cambiarProductoButton;
    private JButton productoMasVendidoButton;
    private JButton productoMenosVendidoButton;
    private JButton totalDeVentasButton;
    private JButton promedioDeVentasButton;
    private JComboBox selectorProducto;
    private JComboBox selectorTipo;
    private Tienda tienda=new Tienda();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new GUITienda();
                frame.setSize(1910,1080);
                frame.setVisible(true);
            }
        });
    }
    public GUITienda() {
        setContentPane(panel);
        informaciónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Producto producto = tienda.darProducto(tienda.darProducto6().darNombre());
                StringBuilder sb = new StringBuilder();
                if (producto == null) {
                    sb.append("NO EXISTE ");
                    JOptionPane.showMessageDialog(GUITienda.this,sb.toString(),"Error", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    sb.append("Nombre del producto: ").append(producto.darNombre()).append("\n");
                    sb.append("Precio del producto: ").append(producto.darValorUnitario()).append("\n");
                    sb.append("Tipo de producto: ").append(producto.darTipo()).append("\n");
                    sb.append("Cantidad en bodega: ").append(producto.darCantidadBodega()).append("\n");
                    sb.append("Cantidad mínima del producto: ").append(producto.darCantidadMinima()).append("\n");
                    sb.append("Cantidad unidades vendidas del producto: ").append(producto.darCantidadUnidadesVendidas()).append("\n");
                    JOptionPane.showMessageDialog(GUITienda.this,sb.toString(),"Informacion del producto", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        informaciónButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Producto producto = tienda.darProducto(tienda.darProducto5().darNombre());
                StringBuilder sb = new StringBuilder();
                if (producto == null) {
                    sb.append("NO EXISTE ");
                    JOptionPane.showMessageDialog(GUITienda.this,sb.toString(),"Error", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    sb.append("Nombre del producto: ").append(producto.darNombre()).append("\n");
                    sb.append("Precio del producto: ").append(producto.darValorUnitario()).append("\n");
                    sb.append("Tipo de producto: ").append(producto.darTipo()).append("\n");
                    sb.append("Cantidad en bodega: ").append(producto.darCantidadBodega()).append("\n");
                    sb.append("Cantidad mínima del producto: ").append(producto.darCantidadMinima()).append("\n");
                    sb.append("Cantidad unidades vendidas del producto: ").append(producto.darCantidadUnidadesVendidas()).append("\n");
                    JOptionPane.showMessageDialog(GUITienda.this,sb.toString(),"Informacion del producto", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        informaciónButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Producto producto = tienda.darProducto(tienda.darProducto4().darNombre());
                StringBuilder sb = new StringBuilder();
                if (producto == null) {
                    sb.append("NO EXISTE ");
                    JOptionPane.showMessageDialog(GUITienda.this,sb.toString(),"Error", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    sb.append("Nombre del producto: ").append(producto.darNombre()).append("\n");
                    sb.append("Precio del producto: ").append(producto.darValorUnitario()).append("\n");
                    sb.append("Tipo de producto: ").append(producto.darTipo()).append("\n");
                    sb.append("Cantidad en bodega: ").append(producto.darCantidadBodega()).append("\n");
                    sb.append("Cantidad mínima del producto: ").append(producto.darCantidadMinima()).append("\n");
                    sb.append("Cantidad unidades vendidas del producto: ").append(producto.darCantidadUnidadesVendidas()).append("\n");
                    JOptionPane.showMessageDialog(GUITienda.this,sb.toString(),"Informacion del producto", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        informaciónButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Producto producto = tienda.darProducto(tienda.darProducto8().darNombre());
                StringBuilder sb = new StringBuilder();
                if (producto == null) {
                    sb.append("NO EXISTE ");
                    JOptionPane.showMessageDialog(GUITienda.this,sb.toString(),"Error", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    sb.append("Nombre del producto: ").append(producto.darNombre()).append("\n");
                    sb.append("Precio del producto: ").append(producto.darValorUnitario()).append("\n");
                    sb.append("Tipo de producto: ").append(producto.darTipo()).append("\n");
                    sb.append("Cantidad en bodega: ").append(producto.darCantidadBodega()).append("\n");
                    sb.append("Cantidad mínima del producto: ").append(producto.darCantidadMinima()).append("\n");
                    sb.append("Cantidad unidades vendidas del producto: ").append(producto.darCantidadUnidadesVendidas()).append("\n");
                    JOptionPane.showMessageDialog(GUITienda.this,sb.toString(),"Informacion del producto", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        informaciónButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Producto producto = tienda.darProducto(tienda.darProducto1().darNombre());
                StringBuilder sb = new StringBuilder();
                if (producto == null) {
                    sb.append("NO EXISTE ");
                    JOptionPane.showMessageDialog(GUITienda.this,sb.toString(),"Error", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    sb.append("Nombre del producto: ").append(producto.darNombre()).append("\n");
                    sb.append("Precio del producto: ").append(producto.darValorUnitario()).append("\n");
                    sb.append("Tipo de producto: ").append(producto.darTipo()).append("\n");
                    sb.append("Cantidad en bodega: ").append(producto.darCantidadBodega()).append("\n");
                    sb.append("Cantidad mínima del producto: ").append(producto.darCantidadMinima()).append("\n");
                    sb.append("Cantidad unidades vendidas del producto: ").append(producto.darCantidadUnidadesVendidas()).append("\n");
                    JOptionPane.showMessageDialog(GUITienda.this,sb.toString(),"Informacion del producto", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        informaciónButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Producto producto = tienda.darProducto(tienda.darProducto2().darNombre());
                StringBuilder sb = new StringBuilder();
                if (producto == null) {
                    sb.append("NO EXISTE ");
                    JOptionPane.showMessageDialog(GUITienda.this,sb.toString(),"Error", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    sb.append("Nombre del producto: ").append(producto.darNombre()).append("\n");
                    sb.append("Precio del producto: ").append(producto.darValorUnitario()).append("\n");
                    sb.append("Tipo de producto: ").append(producto.darTipo()).append("\n");
                    sb.append("Cantidad en bodega: ").append(producto.darCantidadBodega()).append("\n");
                    sb.append("Cantidad mínima del producto: ").append(producto.darCantidadMinima()).append("\n");
                    sb.append("Cantidad unidades vendidas del producto: ").append(producto.darCantidadUnidadesVendidas()).append("\n");
                    JOptionPane.showMessageDialog(GUITienda.this,sb.toString(),"Informacion del producto", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        informaciónButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Producto producto = tienda.darProducto(tienda.darProducto3().darNombre());
                StringBuilder sb = new StringBuilder();
                if (producto == null) {
                    sb.append("NO EXISTE ");
                    JOptionPane.showMessageDialog(GUITienda.this,sb.toString(),"Error", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    sb.append("Nombre del producto: ").append(producto.darNombre()).append("\n");
                    sb.append("Precio del producto: ").append(producto.darValorUnitario()).append("\n");
                    sb.append("Tipo de producto: ").append(producto.darTipo()).append("\n");
                    sb.append("Cantidad en bodega: ").append(producto.darCantidadBodega()).append("\n");
                    sb.append("Cantidad mínima del producto: ").append(producto.darCantidadMinima()).append("\n");
                    sb.append("Cantidad unidades vendidas del producto: ").append(producto.darCantidadUnidadesVendidas()).append("\n");
                    JOptionPane.showMessageDialog(GUITienda.this,sb.toString(),"Informacion del producto", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        informaciónButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Producto producto = tienda.darProducto(tienda.darProducto7().darNombre());
                StringBuilder sb = new StringBuilder();
                if (producto == null) {
                    sb.append("NO EXISTE ");
                    JOptionPane.showMessageDialog(GUITienda.this,sb.toString(),"Error", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    sb.append("Nombre del producto: ").append(producto.darNombre()).append("\n");
                    sb.append("Precio del producto: ").append(producto.darValorUnitario()).append("\n");
                    sb.append("Tipo de producto: ").append(producto.darTipo()).append("\n");
                    sb.append("Cantidad en bodega: ").append(producto.darCantidadBodega()).append("\n");
                    sb.append("Cantidad mínima del producto: ").append(producto.darCantidadMinima()).append("\n");
                    sb.append("Cantidad unidades vendidas del producto: ").append(producto.darCantidadUnidadesVendidas()).append("\n");
                    JOptionPane.showMessageDialog(GUITienda.this,sb.toString(),"Informacion del producto", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        venderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cantidadProducto = Integer.parseInt(textField1.getText());
                if(cantidadProducto<=0){
                    JOptionPane.showMessageDialog(GUITienda.this, "VALOR INVALIDO", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    int cantidadVendida = tienda.venderProducto(tienda.darProducto6().darNombre(), cantidadProducto);
                    JOptionPane.showMessageDialog(GUITienda.this, "La cantidad vendida del producto es: " + cantidadVendida, "Venta Exitosa", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        venderButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cantidadProducto = Integer.parseInt(textField2.getText());
                if(cantidadProducto<=0){
                    JOptionPane.showMessageDialog(GUITienda.this, "VALOR INVALIDO", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    int cantidadVendida = tienda.venderProducto(tienda.darProducto5().darNombre(), cantidadProducto);
                    JOptionPane.showMessageDialog(GUITienda.this, "La cantidad vendida del producto es: " + cantidadVendida, "Venta Exitosa", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        venderButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cantidadProducto = Integer.parseInt(textField3.getText());
                if(cantidadProducto<=0){
                    JOptionPane.showMessageDialog(GUITienda.this, "VALOR INVALIDO", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    int cantidadVendida = tienda.venderProducto(tienda.darProducto4().darNombre(), cantidadProducto);
                    JOptionPane.showMessageDialog(GUITienda.this, "La cantidad vendida del producto es: " + cantidadVendida, "Venta Exitosa", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        venderButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cantidadProducto = Integer.parseInt(textField4.getText());
                if(cantidadProducto<=0){
                    JOptionPane.showMessageDialog(GUITienda.this, "VALOR INVALIDO", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    int cantidadVendida = tienda.venderProducto(tienda.darProducto8().darNombre(), cantidadProducto);
                    JOptionPane.showMessageDialog(GUITienda.this, "La cantidad vendida del producto es: " + cantidadVendida, "Venta Exitosa", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        venderButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cantidadProducto = Integer.parseInt(textField5.getText());
                if(cantidadProducto<=0){
                    JOptionPane.showMessageDialog(GUITienda.this, "VALOR INVALIDO", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    int cantidadVendida = tienda.venderProducto(tienda.darProducto1().darNombre(), cantidadProducto);
                    JOptionPane.showMessageDialog(GUITienda.this, "La cantidad vendida del producto es: " + cantidadVendida, "Venta Exitosa", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        venderButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cantidadProducto = Integer.parseInt(textField6.getText());
                if(cantidadProducto<=0){
                    JOptionPane.showMessageDialog(GUITienda.this, "VALOR INVALIDO", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    int cantidadVendida = tienda.venderProducto(tienda.darProducto2().darNombre(), cantidadProducto);
                    JOptionPane.showMessageDialog(GUITienda.this, "La cantidad vendida del producto es: " + cantidadVendida, "Venta Exitosa", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        venderButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cantidadProducto = Integer.parseInt(textField7.getText());
                if(cantidadProducto<=0){
                    JOptionPane.showMessageDialog(GUITienda.this, "VALOR INVALIDO", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    int cantidadVendida = tienda.venderProducto(tienda.darProducto3().darNombre(), cantidadProducto);
                    JOptionPane.showMessageDialog(GUITienda.this, "La cantidad vendida del producto es: " + cantidadVendida, "Venta Exitosa", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        venderButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cantidadProducto = Integer.parseInt(textField8.getText());
                if(cantidadProducto<=0){
                    JOptionPane.showMessageDialog(GUITienda.this, "VALOR INVALIDO", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    int cantidadVendida = tienda.venderProducto(tienda.darProducto7().darNombre(), cantidadProducto);
                    JOptionPane.showMessageDialog(GUITienda.this, "La cantidad vendida del producto es: " + cantidadVendida, "Venta Exitosa", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        abastecerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Producto p = tienda.darProducto(tienda.darProducto6().darNombre());
                int cantidadAbastecer = Integer.parseInt(textField9.getText());
                if (cantidadAbastecer >= 0 && p.darCantidadBodega() < p.darCantidadMinima()){
                    tienda.abastecerProducto(tienda.darProducto6().darNombre(), cantidadAbastecer);
                    JOptionPane.showMessageDialog(GUITienda.this, "PRODUCTO ABASTECIDO", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(GUITienda.this, "No es posible abastecer ", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        abastecerButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Producto p = tienda.darProducto(tienda.darProducto5().darNombre());
                int cantidadAbastecer = Integer.parseInt(textField10.getText());
                if (cantidadAbastecer >= 0 && p.darCantidadBodega() < p.darCantidadMinima()){
                    tienda.abastecerProducto(tienda.darProducto5().darNombre(), cantidadAbastecer);
                    JOptionPane.showMessageDialog(GUITienda.this, "PRODUCTO ABASTECIDO", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(GUITienda.this, "No es posible abastecer ", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        abastecerButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Producto p = tienda.darProducto(tienda.darProducto4().darNombre());
                int cantidadAbastecer = Integer.parseInt(textField11.getText());
                if (cantidadAbastecer >= 0 && p.darCantidadBodega() < p.darCantidadMinima()){
                    tienda.abastecerProducto(tienda.darProducto4().darNombre(), cantidadAbastecer);
                    JOptionPane.showMessageDialog(GUITienda.this, "PRODUCTO ABASTECIDO", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(GUITienda.this, "No es posible abastecer ", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        abastecerButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Producto p = tienda.darProducto(tienda.darProducto8().darNombre());
                int cantidadAbastecer = Integer.parseInt(textField12.getText());
                if (cantidadAbastecer >= 0 && p.darCantidadBodega() < p.darCantidadMinima()){
                    tienda.abastecerProducto(tienda.darProducto8().darNombre(), cantidadAbastecer);
                    JOptionPane.showMessageDialog(GUITienda.this, "PRODUCTO ABASTECIDO", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(GUITienda.this, "No es posible abastecer ", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        abastecerButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Producto p = tienda.darProducto(tienda.darProducto1().darNombre());
                int cantidadAbastecer = Integer.parseInt(textField13.getText());
                if (cantidadAbastecer >= 0 && p.darCantidadBodega() < p.darCantidadMinima()){
                    tienda.abastecerProducto(tienda.darProducto1().darNombre(), cantidadAbastecer);
                    JOptionPane.showMessageDialog(GUITienda.this, "PRODUCTO ABASTECIDO", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(GUITienda.this, "No es posible abastecer ", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        abastercerButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Producto p = tienda.darProducto(tienda.darProducto2().darNombre());
                int cantidadAbastecer = Integer.parseInt(textField14.getText());
                if (cantidadAbastecer >= 0 && p.darCantidadBodega() < p.darCantidadMinima()){
                    tienda.abastecerProducto(tienda.darProducto2().darNombre(), cantidadAbastecer);
                    JOptionPane.showMessageDialog(GUITienda.this, "PRODUCTO ABASTECIDO", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(GUITienda.this, "No es posible abastecer ", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        abastecerButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Producto p = tienda.darProducto(tienda.darProducto3().darNombre());
                int cantidadAbastecer = Integer.parseInt(textField15.getText());
                if (cantidadAbastecer >= 0 && p.darCantidadBodega() < p.darCantidadMinima()){
                    tienda.abastecerProducto(tienda.darProducto3().darNombre(), cantidadAbastecer);
                    JOptionPane.showMessageDialog(GUITienda.this, "PRODUCTO ABASTECIDO", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(GUITienda.this, "No es posible abastecer ", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        abastecerButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Producto p = tienda.darProducto(tienda.darProducto7().darNombre());
                int cantidadAbastecer = Integer.parseInt(textField16.getText());
                if (cantidadAbastecer >= 0 && p.darCantidadBodega() < p.darCantidadMinima()){
                    tienda.abastecerProducto(tienda.darProducto7().darNombre(), cantidadAbastecer);
                    JOptionPane.showMessageDialog(GUITienda.this, "PRODUCTO ABASTECIDO", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(GUITienda.this, "No es posible abastecer ", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }

            }
        });
        cambiarProductoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreProducto = (String) selectorProducto.getSelectedItem();
                String nuevoNombre = textField18.getText();
                if(nombreProducto==null && nuevoNombre==null){
                    JOptionPane.showMessageDialog(GUITienda.this, "Nombres Incorrectos ", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    int tipoP = Integer.parseInt((String) selectorTipo.getSelectedItem());
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
                            JOptionPane.showMessageDialog(GUITienda.this, "Tipo no existe", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                            break;
                    }
                    if(tipoProducto==null){
                        JOptionPane.showMessageDialog(GUITienda.this, "Invalido", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        int valor = Integer.parseInt(textField22.getText());
                        int cantidadB = Integer.parseInt(textField20.getText());
                        int cantidadM = Integer.parseInt(textField21.getText());
                        if(valor<=0&&cantidadM<=0&&cantidadB<=0){
                            JOptionPane.showMessageDialog(GUITienda.this, "Valores incorrectos", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            tienda.cambiarProducto(nombreProducto,nuevoNombre,tipoProducto,valor,cantidadB,cantidadM);
                            JOptionPane.showMessageDialog(GUITienda.this, "Cambio efectuado", "correcto", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            }
        });
        productoMasVendidoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Producto productoMasVendido=tienda.darProductoMasVendido();
                StringBuilder sb = new StringBuilder();
                JOptionPane.showMessageDialog(GUITienda.this, "Producto con mayor ventas: "+productoMasVendido.darNombre(), "correcto", JOptionPane.INFORMATION_MESSAGE);

            }
        });
        productoMenosVendidoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Producto productoMenosVendido=tienda.darProductoMenosVendido();
                StringBuilder sb = new StringBuilder();
                JOptionPane.showMessageDialog(GUITienda.this, "Producto menos vendido: "+productoMenosVendido.darNombre(), "correcto", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        totalDeVentasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(GUITienda.this, "Cantidad en caja: "+tienda.darDineroEnCaja(), "correcto", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        promedioDeVentasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(GUITienda.this, "Promedio de ventas: "+(double)tienda.darPromedioVentas(), "correcto", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}
