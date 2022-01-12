//importar librerias
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//creacion de la clase que hereda elementos para diseñar la interfaz grafica
public class MenuVentas extends javax.swing.JFrame {
    
    //declaracion de variables que uso en mas de 1 metodo (son de la conexion con la BD)
    private conectar bd = new conectar();
    private Connection conex = bd.conexion();

    //metodo constructor
    public MenuVentas() {
        //convocar metodo para inicializar
        initComponents();
        //hacer que la ventana aparezca al centro de la pantalla
        this.setLocationRelativeTo(null);
        //tabla de la BD
        Actualizar();
        //llenado del combobox
        Llenar(CBEmpleado);
    }

    /*
    comienzo de metodo inicializador componentes, dicho 
    metodo se creo automaticamente por medio de la vista diseño
    este contiene la personalizacion que se le dio a cada elemento
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EVentas = new javax.swing.JLabel();
        EArticulo = new javax.swing.JLabel();
        EPrecio = new javax.swing.JLabel();
        EMarca = new javax.swing.JLabel();
        TFArticulo = new javax.swing.JTextField();
        TFPrecio = new javax.swing.JTextField();
        TFMarca = new javax.swing.JTextField();
        BCapturar = new javax.swing.JButton();
        BLimpiar = new javax.swing.JButton();
        BSeleccionar = new javax.swing.JButton();
        BEditar = new javax.swing.JButton();
        BSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TVentas = new javax.swing.JTable();
        TFId = new javax.swing.JTextField();
        EClaveVenta = new javax.swing.JLabel();
        TFClaveVenta = new javax.swing.JTextField();
        CBEmpleado = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        EFondo = new javax.swing.JLabel();
        MBVentas = new javax.swing.JMenuBar();
        MOpciones = new javax.swing.JMenu();
        MICerrarTodo = new javax.swing.JMenuItem();

        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EVentas.setFont(new java.awt.Font("Rockwell Condensed", 0, 48)); // NOI18N
        EVentas.setForeground(new java.awt.Color(255, 255, 255));
        EVentas.setText("VENTAS");
        getContentPane().add(EVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 50));

        EArticulo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        EArticulo.setForeground(new java.awt.Color(255, 255, 255));
        EArticulo.setText("Articulo");
        getContentPane().add(EArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        EPrecio.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        EPrecio.setForeground(new java.awt.Color(255, 255, 255));
        EPrecio.setText("Precio");
        getContentPane().add(EPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        EMarca.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        EMarca.setForeground(new java.awt.Color(255, 255, 255));
        EMarca.setText("Marca");
        getContentPane().add(EMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));
        getContentPane().add(TFArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 172, -1));
        getContentPane().add(TFPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 172, -1));
        getContentPane().add(TFMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 172, -1));

        BCapturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/capturar.png"))); // NOI18N
        BCapturar.setBorder(null);
        BCapturar.setBorderPainted(false);
        BCapturar.setContentAreaFilled(false);
        BCapturar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BCapturar.setFocusPainted(false);
        BCapturar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/capturar pulsado.png"))); // NOI18N
        BCapturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCapturarActionPerformed(evt);
            }
        });
        getContentPane().add(BCapturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        BLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        BLimpiar.setBorder(null);
        BLimpiar.setBorderPainted(false);
        BLimpiar.setContentAreaFilled(false);
        BLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BLimpiar.setFocusPainted(false);
        BLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar pulsado.png"))); // NOI18N
        BLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(BLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        BSeleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seleccionar.png"))); // NOI18N
        BSeleccionar.setBorder(null);
        BSeleccionar.setBorderPainted(false);
        BSeleccionar.setContentAreaFilled(false);
        BSeleccionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BSeleccionar.setFocusPainted(false);
        BSeleccionar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seleccionar pulsado.png"))); // NOI18N
        BSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSeleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(BSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        BEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        BEditar.setBorder(null);
        BEditar.setBorderPainted(false);
        BEditar.setContentAreaFilled(false);
        BEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BEditar.setFocusPainted(false);
        BEditar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar pulsado.png"))); // NOI18N
        BEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEditarActionPerformed(evt);
            }
        });
        getContentPane().add(BEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        BSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        BSalir.setBorder(null);
        BSalir.setBorderPainted(false);
        BSalir.setContentAreaFilled(false);
        BSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BSalir.setFocusPainted(false);
        BSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir pulsado.png"))); // NOI18N
        BSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        TVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TVentas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 400, 300));

        TFId.setForeground(new java.awt.Color(153, 153, 153));
        TFId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TFId.setText("id para modificar");
        TFId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TFIdMouseClicked(evt);
            }
        });
        getContentPane().add(TFId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 120, 40));

        EClaveVenta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        EClaveVenta.setForeground(new java.awt.Color(255, 255, 255));
        EClaveVenta.setText("Clave de Venta");
        getContentPane().add(EClaveVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        TFClaveVenta.setEditable(false);
        TFClaveVenta.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(TFClaveVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 170, -1));
        getContentPane().add(CBEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 70, 20));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Empleado");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 80, 20));

        EFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ventas.jpg"))); // NOI18N
        getContentPane().add(EFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 300));

        MOpciones.setText("Opciones");

        MICerrarTodo.setText("Cerrar Todo");
        MICerrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MICerrarTodoActionPerformed(evt);
            }
        });
        MOpciones.add(MICerrarTodo);

        MBVentas.add(MOpciones);

        setJMenuBar(MBVentas);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //fin del metodo inicializador
    
    //accion del MenuItem Cerrar Todo
    private void MICerrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MICerrarTodoActionPerformed
        //cierra el programa
        System.exit(0);
    }//GEN-LAST:event_MICerrarTodoActionPerformed

    //accion del boton Salir
    private void BSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalirActionPerformed
        //oculta la pantalla mostrando solo el menu principal
        this.setVisible(false);
    }//GEN-LAST:event_BSalirActionPerformed

    //accion del boton Limpiar
    private void BLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimpiarActionPerformed
        //vacian los campos de texto
        TFClaveVenta.setText("");
        TFArticulo.setText("");
        TFPrecio.setText("");
        TFMarca.setText("");
        //reescribe el contenido del campo de texto id
        TFId.setText("id para modificar");
        //reiniciar ComboBox
        CBEmpleado.setSelectedIndex(0);
    }//GEN-LAST:event_BLimpiarActionPerformed

    //accion del boton Guardar
    private void BCapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCapturarActionPerformed
        //obtencion de combobox
        String dato =(String) CBEmpleado.getSelectedItem();
        int CBEmp=Integer.parseInt(dato);
        //ingreso de datos a guardar
        try {
            /*
            se comunica con la base de datos para darle la instruccion sql de ingresar los elementos contenidos en
            los campos de texto como registros, en el caso del campo de precio, este se convierte a float, tras
            mandar la instruccion y que se ejecute correctamente se muestra un mensaje informando esto, si ocurre
            algun error este es notificado al usuario
            */
            PreparedStatement pst = conex.prepareStatement("INSERT INTO Ventas(Producto,Precio,Marca,No_Empleado) VALUES (?,?,?,?)");
            pst.setString(1, TFArticulo.getText());
            pst.setFloat(2, Float.parseFloat(TFPrecio.getText()));
            pst.setString(3, TFMarca.getText());
            pst.setInt(4, CBEmp);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro guardado exitosamente");
            pst.close();
            Actualizar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al intentar almacenar la información:\n" + e + "Error en la operación" + JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BCapturarActionPerformed

    //accion del boton Editar
    private void BEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEditarActionPerformed
        //obtencion de combobox
        String dato =(String) CBEmpleado.getSelectedItem();
        int CBEmp=Integer.parseInt(dato);
        /*
        se recupera el id del registro que se desea modificar junto con el contenido de los campos,
        con esta informacion se modifica el registro almacenado que corresponde a dicho id, si
        la modificacion fue correcta o no, se le indica al usuario.
        */
        int reg = Integer.parseInt(TFClaveVenta.getText());
        try {
            PreparedStatement pst = conex.prepareStatement("UPDATE Ventas SET Producto=?,Precio=?,Marca=?,No_Empleado=? WHERE Cve_Venta=" + reg);
            pst.setString(1, TFArticulo.getText());
            pst.setFloat(2, Float.parseFloat(TFPrecio.getText()));
            pst.setString(3, TFMarca.getText());
            pst.setInt(4, CBEmp);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Modificacion Exitosa");
            pst.close();
            Actualizar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Modificacion Fallida");
        }
    }//GEN-LAST:event_BEditarActionPerformed

    //accion del boton Seleccionar
    private void BSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSeleccionarActionPerformed
        TFClaveVenta.setText(TFId.getText());
    }//GEN-LAST:event_BSeleccionarActionPerformed

    //accion al dar clic en cuadro de texto para id
    private void TFIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFIdMouseClicked
        //deja vacio el campo de texto del id al darle clic
        TFId.setText("");
    }//GEN-LAST:event_TFIdMouseClicked

    //metodo para actualizar la BD
    private void Actualizar(){
        /*
        se le ingresan los titulos y registros a la tabla para que muestre los que se
        encuentran registrados dentro de la BD, en cada ciclo del while se agrega un registro de la BD
        */
        String[] titulos = {"Cve_Venta", "Producto", "Precio", "Marca","No_Empleado"};
        String[] registros = new String[5];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        Statement st;
        try {
            st = conex.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Ventas");
            while (rs.next()) {
                registros[0] = rs.getString("Cve_Venta");
                registros[1] = rs.getString("Producto");
                registros[2] = rs.getString("Precio");
                registros[3] = rs.getString("Marca");
                registros[4]=rs.getString("No_Empleado");
                model.addRow(registros);
            }
            TVentas.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error");
        }
    }
    
    //metodo para llenar el JComboBox
    public void Llenar(JComboBox CBEmpleado){
        //sentencia SQL para obtener los datos deseados que conformaran el JComboBox
        String ssql="SELECT No_Empleado FROM Personal ORDER BY No_Empleado ASC";
        try{
            //prepara la consulta sql
            PreparedStatement pst=conex.prepareStatement(ssql);
            //ejecuta la consulta
            ResultSet result=pst.executeQuery();
            //llenado de CB
            CBEmpleado.addItem("No.");
            while(result.next()){
                CBEmpleado.addItem(result.getString("No_Empleado"));
            }            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error");
        }        
    }
    
    //comienzo de metodo main generado por la vista diseño
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuVentas().setVisible(true);
            }
        });
    }
    //fin del metodo main
    
    //declaracion de variables
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCapturar;
    private javax.swing.JButton BEditar;
    private javax.swing.JButton BLimpiar;
    private javax.swing.JButton BSalir;
    private javax.swing.JButton BSeleccionar;
    private javax.swing.JComboBox<String> CBEmpleado;
    private javax.swing.JLabel EArticulo;
    private javax.swing.JLabel EClaveVenta;
    private javax.swing.JLabel EFondo;
    private javax.swing.JLabel EMarca;
    private javax.swing.JLabel EPrecio;
    private javax.swing.JLabel EVentas;
    private javax.swing.JMenuBar MBVentas;
    private javax.swing.JMenuItem MICerrarTodo;
    private javax.swing.JMenu MOpciones;
    private javax.swing.JTextField TFArticulo;
    private javax.swing.JTextField TFClaveVenta;
    private javax.swing.JTextField TFId;
    private javax.swing.JTextField TFMarca;
    private javax.swing.JTextField TFPrecio;
    private javax.swing.JTable TVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
