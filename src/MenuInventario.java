//importar librerias
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//creacion de la clase que hereda elementos para diseñar la interfaz grafica
public class MenuInventario extends javax.swing.JFrame {

    //declaracion de variables que uso en mas de 1 metodo (son de la conexion con la BD)
    private conectar bd = new conectar();
    private Connection conex = bd.conexion();
    
    //metodo constructor
    public MenuInventario() {
        //convocar metodo para inicializar
        initComponents();
        //hacer que la ventana aparezca al centro de la pantalla
        this.setLocationRelativeTo(null);
        //tabla de la BD
        Actualizar();
    }

    /*
    comienzo de metodo inicializador componentes, dicho 
    metodo se creo automaticamente por medio de la vista diseño
    este contiene la personalizacion que se le dio a cada elemento
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EInventario = new javax.swing.JLabel();
        EClaveProducto = new javax.swing.JLabel();
        ESucursal = new javax.swing.JLabel();
        EProducto = new javax.swing.JLabel();
        ECantidad = new javax.swing.JLabel();
        EMarca = new javax.swing.JLabel();
        EProveedor = new javax.swing.JLabel();
        TFClaveProducto = new javax.swing.JTextField();
        TFSucursal = new javax.swing.JTextField();
        TFProducto = new javax.swing.JTextField();
        TFCantidad = new javax.swing.JTextField();
        TFMarca = new javax.swing.JTextField();
        TFProveedor = new javax.swing.JTextField();
        BCapturar = new javax.swing.JButton();
        BLimpiar = new javax.swing.JButton();
        BEditar = new javax.swing.JButton();
        BSeleccionar = new javax.swing.JButton();
        BSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TInventario = new javax.swing.JTable();
        TFId = new javax.swing.JTextField();
        EFondo = new javax.swing.JLabel();
        MBInventario = new javax.swing.JMenuBar();
        MOpciones = new javax.swing.JMenu();
        MICerrarTodo = new javax.swing.JMenuItem();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EInventario.setFont(new java.awt.Font("Rockwell Condensed", 0, 48)); // NOI18N
        EInventario.setForeground(new java.awt.Color(255, 255, 255));
        EInventario.setText("INVENTARIO");
        getContentPane().add(EInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        EClaveProducto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        EClaveProducto.setForeground(new java.awt.Color(255, 255, 255));
        EClaveProducto.setText("Clave del producto");
        getContentPane().add(EClaveProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        ESucursal.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ESucursal.setForeground(new java.awt.Color(255, 255, 255));
        ESucursal.setText("Sucursal");
        getContentPane().add(ESucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        EProducto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        EProducto.setForeground(new java.awt.Color(255, 255, 255));
        EProducto.setText("Producto");
        getContentPane().add(EProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        ECantidad.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ECantidad.setForeground(new java.awt.Color(255, 255, 255));
        ECantidad.setText("Cantidad");
        getContentPane().add(ECantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        EMarca.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        EMarca.setForeground(new java.awt.Color(255, 255, 255));
        EMarca.setText("Marca");
        getContentPane().add(EMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        EProveedor.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        EProveedor.setForeground(new java.awt.Color(255, 255, 255));
        EProveedor.setText("Proveedor");
        getContentPane().add(EProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        TFClaveProducto.setEditable(false);
        TFClaveProducto.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(TFClaveProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 150, -1));
        getContentPane().add(TFSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 150, -1));
        getContentPane().add(TFProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 150, -1));
        getContentPane().add(TFCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 150, -1));
        getContentPane().add(TFMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 150, -1));
        getContentPane().add(TFProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 150, -1));

        BCapturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/capturar.png"))); // NOI18N
        BCapturar.setBorder(null);
        BCapturar.setBorderPainted(false);
        BCapturar.setContentAreaFilled(false);
        BCapturar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BCapturar.setDefaultCapable(false);
        BCapturar.setFocusPainted(false);
        BCapturar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/capturar pulsado.png"))); // NOI18N
        BCapturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCapturarActionPerformed(evt);
            }
        });
        getContentPane().add(BCapturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        BLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        BLimpiar.setBorder(null);
        BLimpiar.setBorderPainted(false);
        BLimpiar.setContentAreaFilled(false);
        BLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BLimpiar.setDefaultCapable(false);
        BLimpiar.setFocusPainted(false);
        BLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar pulsado.png"))); // NOI18N
        BLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(BLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        BEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        BEditar.setBorder(null);
        BEditar.setBorderPainted(false);
        BEditar.setContentAreaFilled(false);
        BEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BEditar.setDefaultCapable(false);
        BEditar.setFocusPainted(false);
        BEditar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar pulsado.png"))); // NOI18N
        BEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEditarActionPerformed(evt);
            }
        });
        getContentPane().add(BEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        BSeleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seleccionar.png"))); // NOI18N
        BSeleccionar.setBorder(null);
        BSeleccionar.setBorderPainted(false);
        BSeleccionar.setContentAreaFilled(false);
        BSeleccionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BSeleccionar.setDefaultCapable(false);
        BSeleccionar.setFocusPainted(false);
        BSeleccionar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seleccionar pulsado.png"))); // NOI18N
        BSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSeleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(BSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

        BSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        BSalir.setBorder(null);
        BSalir.setBorderPainted(false);
        BSalir.setContentAreaFilled(false);
        BSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BSalir.setDefaultCapable(false);
        BSalir.setFocusPainted(false);
        BSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir pulsado.png"))); // NOI18N
        BSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        TInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TInventario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, 380));

        TFId.setForeground(new java.awt.Color(153, 153, 153));
        TFId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TFId.setText("id para modificar");
        TFId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TFIdMouseClicked(evt);
            }
        });
        getContentPane().add(TFId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 120, 40));

        EFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inventario.jpg"))); // NOI18N
        getContentPane().add(EFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 380));

        MOpciones.setText("Opciones");

        MICerrarTodo.setText("Cerrar Todo");
        MICerrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MICerrarTodoActionPerformed(evt);
            }
        });
        MOpciones.add(MICerrarTodo);

        MBInventario.add(MOpciones);

        setJMenuBar(MBInventario);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //fin del metodo inicializador
    
    //accion al dar clic en cuadro de texto para id
    private void TFIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFIdMouseClicked
        //deja vacio el campo de texto del id al darle clic
        TFId.setText("");
    }//GEN-LAST:event_TFIdMouseClicked

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
        TFClaveProducto.setText("");
        TFSucursal.setText("");
        TFProducto.setText("");
        TFCantidad.setText("");
        TFMarca.setText("");
        TFProveedor.setText("");
        //reescribe el contenido del campo de texto id
        TFId.setText("id para modificar");
    }//GEN-LAST:event_BLimpiarActionPerformed

    //accion del boton Capturar
    private void BCapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCapturarActionPerformed
        try {
            /*
            se comunica con la base de datos para darle la instruccion sql de ingresar los elementos contenidos en
            los campos de texto como registros, tras mandar la instruccion y que se ejecute correctamente se muestra 
            un mensaje informando esto, si ocurre algun error este es notificado al usuario
            */
            PreparedStatement pst = conex.prepareStatement("INSERT INTO Inventarios(Sucursal,Producto,Cantidad,Marca,Proveedor) VALUES (?,?,?,?,?)");
            pst.setString(1, TFSucursal.getText());
            pst.setString(2, TFProducto.getText());
            pst.setInt(3, Integer.parseInt(TFCantidad.getText()));
            pst.setString(4, TFMarca.getText());
            pst.setString(5, TFProveedor.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro guardado exitosamente");
            pst.close();
            Actualizar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al intentar almacenar la información:\n" + e + "Error en la operación" + JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BCapturarActionPerformed

    //accion del boton Seleccionar
    private void BSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSeleccionarActionPerformed
        TFClaveProducto.setText(TFId.getText());
    }//GEN-LAST:event_BSeleccionarActionPerformed

    //accion del boton Editar
    private void BEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEditarActionPerformed
        /*
        se recupera el id del registro que se desea modificar junto con el contenido de los campos,
        con esta informacion se modifica el registro almacenado que corresponde a dicho id, si
        la modificacion fue correcta o no, se le indica al usuario.
        */
        int reg = Integer.parseInt(TFClaveProducto.getText());
        try {
            PreparedStatement pst = conex.prepareStatement("UPDATE inventarios SET Sucursal=?,Producto=?,Cantidad=?,Marca=?,Proveedor=? WHERE Cve_Producto=" + reg);
            pst.setString(1, TFSucursal.getText());
            pst.setString(2, TFProducto.getText());
            pst.setInt(3, Integer.parseInt(TFCantidad.getText()));
            pst.setString(4, TFMarca.getText());
            pst.setString(5, TFProveedor.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Modificacion Exitosa");
            pst.close();
            Actualizar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Modificacion Fallida");
        }
    }//GEN-LAST:event_BEditarActionPerformed

    //metodo para actualizar la BD
    private void Actualizar(){
        /*
        se le ingresan los titulos y registros a la tabla para que muestre los que se
        encuentran registrados dentro de la BD, en cada ciclo del while se agrega un registro de la BD
        */
        String[] titulos = {"Cve_Producto", "Sucursal", "Producto", "Cantidad","Marca","Proveedor"};
        String[] registros = new String[6];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        Statement st;
        try {
            st = conex.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM inventarios");
            while (rs.next()) {
                registros[0] = rs.getString("Cve_Producto");
                registros[1] = rs.getString("Sucursal");
                registros[2] = rs.getString("Producto");
                registros[3] = rs.getString("Cantidad");
                registros[4] = rs.getString("Marca");
                registros[5] = rs.getString("Proveedor");
                model.addRow(registros);
            }
            TInventario.setModel(model);
        } catch (SQLException ex) {
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
            java.util.logging.Logger.getLogger(MenuInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInventario().setVisible(true);
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
    private javax.swing.JLabel ECantidad;
    private javax.swing.JLabel EClaveProducto;
    private javax.swing.JLabel EFondo;
    private javax.swing.JLabel EInventario;
    private javax.swing.JLabel EMarca;
    private javax.swing.JLabel EProducto;
    private javax.swing.JLabel EProveedor;
    private javax.swing.JLabel ESucursal;
    private javax.swing.JMenuBar MBInventario;
    private javax.swing.JMenuItem MICerrarTodo;
    private javax.swing.JMenu MOpciones;
    private javax.swing.JTextField TFCantidad;
    private javax.swing.JTextField TFClaveProducto;
    private javax.swing.JTextField TFId;
    private javax.swing.JTextField TFMarca;
    private javax.swing.JTextField TFProducto;
    private javax.swing.JTextField TFProveedor;
    private javax.swing.JTextField TFSucursal;
    private javax.swing.JTable TInventario;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
