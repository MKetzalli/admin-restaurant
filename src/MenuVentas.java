//importar librerias
import java.sql.*;
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
        BGuardar = new javax.swing.JButton();
        BLimpiar = new javax.swing.JButton();
        BSeleccionar = new javax.swing.JButton();
        BVisualizar = new javax.swing.JButton();
        BSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TVentas = new javax.swing.JTable();
        TFId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MOpciones = new javax.swing.JMenu();
        MICerrarTodo = new javax.swing.JMenuItem();

        setBounds(new java.awt.Rectangle(0, 0, 406, 363));
        setMinimumSize(new java.awt.Dimension(406, 363));
        setPreferredSize(new java.awt.Dimension(406, 363));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EVentas.setFont(new java.awt.Font("Rockwell Condensed", 0, 48)); // NOI18N
        EVentas.setForeground(new java.awt.Color(255, 255, 255));
        EVentas.setText("VENTAS");
        getContentPane().add(EVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        EArticulo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        EArticulo.setText("Articulo");
        getContentPane().add(EArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 75, -1, -1));

        EPrecio.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        EPrecio.setText("Precio");
        getContentPane().add(EPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 114, -1, -1));

        EMarca.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        EMarca.setText("Marca");
        getContentPane().add(EMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 153, -1, -1));
        getContentPane().add(TFArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 76, 172, -1));
        getContentPane().add(TFPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 115, 172, -1));
        getContentPane().add(TFMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 154, 172, -1));

        BGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        BGuardar.setBorder(null);
        BGuardar.setBorderPainted(false);
        BGuardar.setContentAreaFilled(false);
        BGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BGuardar.setFocusPainted(false);
        BGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar pulsado.png"))); // NOI18N
        BGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(BGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 208, -1, -1));

        BLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        BLimpiar.setBorder(null);
        BLimpiar.setBorderPainted(false);
        BLimpiar.setContentAreaFilled(false);
        BLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BLimpiar.setFocusPainted(false);
        BLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar pulsado.png"))); // NOI18N
        BLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(BLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 208, -1, -1));

        BSeleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seleccionar.png"))); // NOI18N
        BSeleccionar.setBorder(null);
        BSeleccionar.setBorderPainted(false);
        BSeleccionar.setContentAreaFilled(false);
        BSeleccionar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BSeleccionar.setFocusPainted(false);
        BSeleccionar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seleccionar pulsado.png"))); // NOI18N
        BSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSeleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(BSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        BVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/visualizar.png"))); // NOI18N
        BVisualizar.setBorder(null);
        BVisualizar.setBorderPainted(false);
        BVisualizar.setContentAreaFilled(false);
        BVisualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BVisualizar.setFocusPainted(false);
        BVisualizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/visualizar pulsado.png"))); // NOI18N
        BVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVisualizarActionPerformed(evt);
            }
        });
        getContentPane().add(BVisualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        BSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        BSalir.setBorder(null);
        BSalir.setBorderPainted(false);
        BSalir.setContentAreaFilled(false);
        BSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BSalir.setFocusPainted(false);
        BSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir pulsado.png"))); // NOI18N
        BSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 400, 240));

        TFId.setForeground(new java.awt.Color(153, 153, 153));
        TFId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TFId.setText("id para modificar");
        TFId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TFIdMouseClicked(evt);
            }
        });
        getContentPane().add(TFId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ventas.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 310));

        MOpciones.setText("Opciones");

        MICerrarTodo.setText("Cerrar Todo");
        MICerrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MICerrarTodoActionPerformed(evt);
            }
        });
        MOpciones.add(MICerrarTodo);

        jMenuBar1.add(MOpciones);

        setJMenuBar(jMenuBar1);

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
        TFArticulo.setText("");
        TFPrecio.setText("");
        TFMarca.setText("");
        //reescribe el contenido del campo de texto id
        TFId.setText("id para modificar");
    }//GEN-LAST:event_BLimpiarActionPerformed

    //accion del boton Guardar
    private void BGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGuardarActionPerformed
        try {
            /*
            se comunica con la base de datos para darle la instruccion sql de ingresar los elementos contenidos en
            los campos de texto como registros, en el caso del campo de precio, este se convierte a float, tras
            mandar la instruccion y que se ejecute correctamente se muestra un mensaje informando esto, si ocurre
            algun error este es notificado al usuario
            */
            PreparedStatement pst = conex.prepareStatement("INSERT INTO Ventas(Producto,Precio,Marca) VALUES (?,?,?)");
            pst.setString(1, TFArticulo.getText());
            pst.setFloat(2, Float.parseFloat(TFPrecio.getText()));
            pst.setString(3, TFMarca.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro guardado exitosamente");
            pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al intentar almacenar la información:\n" + e + "Error en la operación" + JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BGuardarActionPerformed

    //accion del boton Visualizar
    private void BVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVisualizarActionPerformed
        //se amplia la ventana para que se puedan mostrar los registros de la tabla
        this.setSize(406, 600);
        /*
        se le ingresan los titulos y registros a la tabla para que muestre los que se
        encuentran registrados dentro de la BD, en cada ciclo del while se agrega un registro de la BD
        */
        String[] titulos = {"Clave", "Articulo", "Precio", "Marca"};
        String[] registros = new String[4];
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
                model.addRow(registros);
            }
            TVentas.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error");
        }
    }//GEN-LAST:event_BVisualizarActionPerformed

    //accion del boton Seleccionar
    private void BSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSeleccionarActionPerformed
        /*
        se recupera el id del registro que se desea modificar junto con el contenido de los campos,
        con esta informacion se modifica el registro almacenado que corresponde a dicho id, si
        la modificacion fue correcta o no, se le indica al usuario.
        */
        int reg = Integer.parseInt(TFId.getText());
        try {
            PreparedStatement pst = conex.prepareStatement("UPDATE Ventas SET Producto=?,Precio=?,Marca=? WHERE Cve_Venta=" + reg);
            pst.setString(1, TFArticulo.getText());
            pst.setFloat(2, Float.parseFloat(TFPrecio.getText()));
            pst.setString(3, TFMarca.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Modificacion Exitosa");
            pst.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Modificacion Fallida");
        }
    }//GEN-LAST:event_BSeleccionarActionPerformed

    //accion al dar clic en cuadro de texto para id
    private void TFIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFIdMouseClicked
        //deja vacio el campo de texto del id al darle clic
        TFId.setText("");
    }//GEN-LAST:event_TFIdMouseClicked

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
    private javax.swing.JButton BGuardar;
    private javax.swing.JButton BLimpiar;
    private javax.swing.JButton BSalir;
    private javax.swing.JButton BSeleccionar;
    private javax.swing.JButton BVisualizar;
    private javax.swing.JLabel EArticulo;
    private javax.swing.JLabel EMarca;
    private javax.swing.JLabel EPrecio;
    private javax.swing.JLabel EVentas;
    private javax.swing.JMenuItem MICerrarTodo;
    private javax.swing.JMenu MOpciones;
    private javax.swing.JTextField TFArticulo;
    private javax.swing.JTextField TFId;
    private javax.swing.JTextField TFMarca;
    private javax.swing.JTextField TFPrecio;
    private javax.swing.JTable TVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
