//importar librerias
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//creacion de la clase que hereda elementos para diseñar la interfaz grafica
public class MenuPersonal extends javax.swing.JFrame {

    //declaracion de variables que uso en mas de 1 metodo (son de la conexion con la BD)
    private conectar bd = new conectar();
    private Connection conex = bd.conexion();
    
    //metodo constructor
    public MenuPersonal() {
        //convocar metodo para inicializar
        initComponents();
        //hacer que la ventana aparezca al centro de la pantalla
        this.setLocationRelativeTo(null);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        TPersonal = new javax.swing.JTable();
        EPersonal = new javax.swing.JLabel();
        ENumeroEmpleado = new javax.swing.JLabel();
        ESucursal = new javax.swing.JLabel();
        ENombre = new javax.swing.JLabel();
        EApellido = new javax.swing.JLabel();
        EEdad = new javax.swing.JLabel();
        ESueldo = new javax.swing.JLabel();
        TFNumeroEmpleado = new javax.swing.JTextField();
        TFSucursal = new javax.swing.JTextField();
        TFNombre = new javax.swing.JTextField();
        TFApellido = new javax.swing.JTextField();
        TFEdad = new javax.swing.JTextField();
        TFSueldo = new javax.swing.JTextField();
        TFNum = new javax.swing.JTextField();
        BLimpiar = new javax.swing.JButton();
        BEditar = new javax.swing.JButton();
        BSeleccionar = new javax.swing.JButton();
        BSalir = new javax.swing.JButton();
        BCapturar = new javax.swing.JButton();
        EFondo = new javax.swing.JLabel();
        MBPersonal = new javax.swing.JMenuBar();
        MOpciones = new javax.swing.JMenu();
        MICerrarTodo = new javax.swing.JMenuItem();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TPersonal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TPersonal);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 450, 390));

        EPersonal.setFont(new java.awt.Font("Rockwell Condensed", 0, 48)); // NOI18N
        EPersonal.setForeground(new java.awt.Color(255, 255, 255));
        EPersonal.setText("PERSONAL");
        getContentPane().add(EPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        ENumeroEmpleado.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ENumeroEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        ENumeroEmpleado.setText("Numero de empleado");
        getContentPane().add(ENumeroEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        ESucursal.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ESucursal.setForeground(new java.awt.Color(255, 255, 255));
        ESucursal.setText("Sucursal");
        getContentPane().add(ESucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        ENombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ENombre.setForeground(new java.awt.Color(255, 255, 255));
        ENombre.setText("Nombre");
        getContentPane().add(ENombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        EApellido.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        EApellido.setForeground(new java.awt.Color(255, 255, 255));
        EApellido.setText("Apellido");
        getContentPane().add(EApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        EEdad.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        EEdad.setForeground(new java.awt.Color(255, 255, 255));
        EEdad.setText("Edad");
        getContentPane().add(EEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        ESueldo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ESueldo.setForeground(new java.awt.Color(255, 255, 255));
        ESueldo.setText("Sueldo");
        getContentPane().add(ESueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        TFNumeroEmpleado.setEditable(false);
        TFNumeroEmpleado.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(TFNumeroEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 140, -1));
        getContentPane().add(TFSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 140, -1));
        getContentPane().add(TFNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 140, -1));
        getContentPane().add(TFApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 140, -1));
        getContentPane().add(TFEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 140, -1));
        getContentPane().add(TFSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 140, -1));

        TFNum.setForeground(new java.awt.Color(153, 153, 153));
        TFNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TFNum.setText("no. para modificar");
        TFNum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TFNumMouseClicked(evt);
            }
        });
        getContentPane().add(TFNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 120, 40));

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
        getContentPane().add(BLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

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
        getContentPane().add(BEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));

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
        getContentPane().add(BSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));

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
        getContentPane().add(BSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

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
        getContentPane().add(BCapturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        EFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/personal.jpg"))); // NOI18N
        getContentPane().add(EFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 390));

        MOpciones.setText("Opciones");

        MICerrarTodo.setText("Cerrar Todo");
        MICerrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MICerrarTodoActionPerformed(evt);
            }
        });
        MOpciones.add(MICerrarTodo);

        MBPersonal.add(MOpciones);

        setJMenuBar(MBPersonal);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //fin del metodo inicializador
    
    //accion al dar clic en cuadro de texto para numero
    private void TFNumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFNumMouseClicked
        //deja vacio el campo de texto del num al darle clic
        TFNum.setText("");
    }//GEN-LAST:event_TFNumMouseClicked

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
        TFNumeroEmpleado.setText("");
        TFSucursal.setText("");
        TFNombre.setText("");
        TFApellido.setText("");
        TFEdad.setText("");
        TFSueldo.setText("");
        //reescribe el contenido del campo de texto id
        TFNum.setText("no. para modificar");
    }//GEN-LAST:event_BLimpiarActionPerformed

    //accion del boton Capturar
    private void BCapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCapturarActionPerformed
        try {
            /*
            se comunica con la base de datos para darle la instruccion sql de ingresar los elementos contenidos en
            los campos de texto como registros, tras mandar la instruccion y que se ejecute correctamente se muestra 
            un mensaje informando esto, si ocurre algun error este es notificado al usuario
            */
            PreparedStatement pst = conex.prepareStatement("INSERT INTO Personal(Sucursal,Nombre,Apellido,Edad,Sueldo) VALUES (?,?,?,?,?)");
            pst.setString(1, TFSucursal.getText());
            pst.setString(2, TFNombre.getText());
            pst.setString(3, TFApellido.getText());
            pst.setInt(4, Integer.parseInt(TFEdad.getText()));
            pst.setFloat(5, Float.parseFloat(TFSueldo.getText()));
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
        TFNumeroEmpleado.setText(TFNum.getText());
    }//GEN-LAST:event_BSeleccionarActionPerformed

    //accion del boton Editar
    private void BEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEditarActionPerformed
        /*
        se recupera el id del registro que se desea modificar junto con el contenido de los campos,
        con esta informacion se modifica el registro almacenado que corresponde a dicho id, si
        la modificacion fue correcta o no, se le indica al usuario.
        */
        int reg = Integer.parseInt(TFNumeroEmpleado.getText());
        try {
            PreparedStatement pst = conex.prepareStatement("UPDATE Personal SET Sucursal=?,Nombre=?,Apellido=?,Edad=?,Sueldo=? WHERE No_Empleado=" + reg);
            pst.setString(1, TFSucursal.getText());
            pst.setString(2, TFNombre.getText());
            pst.setString(3, TFApellido.getText());
            pst.setInt(4, Integer.parseInt(TFEdad.getText()));
            pst.setFloat(5, Float.parseFloat(TFSueldo.getText()));
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
        String[] titulos = {"No_Empleado", "Sucursal", "Nombre", "Apellido","Edad","Sueldo"};
        String[] registros = new String[6];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        Statement st;
        try {
            st = conex.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM personal");
            while (rs.next()) {
                registros[0] = rs.getString("No_Empleado");
                registros[1] = rs.getString("Sucursal");
                registros[2] = rs.getString("Nombre");
                registros[3] = rs.getString("Apellido");
                registros[4] = rs.getString("Edad");
                registros[5] = rs.getString("Sueldo");
                model.addRow(registros);
            }
            TPersonal.setModel(model);
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
            java.util.logging.Logger.getLogger(MenuPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPersonal().setVisible(true);
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
    private javax.swing.JLabel EApellido;
    private javax.swing.JLabel EEdad;
    private javax.swing.JLabel EFondo;
    private javax.swing.JLabel ENombre;
    private javax.swing.JLabel ENumeroEmpleado;
    private javax.swing.JLabel EPersonal;
    private javax.swing.JLabel ESucursal;
    private javax.swing.JLabel ESueldo;
    private javax.swing.JMenuBar MBPersonal;
    private javax.swing.JMenuItem MICerrarTodo;
    private javax.swing.JMenu MOpciones;
    private javax.swing.JTextField TFApellido;
    private javax.swing.JTextField TFEdad;
    private javax.swing.JTextField TFNombre;
    private javax.swing.JTextField TFNum;
    private javax.swing.JTextField TFNumeroEmpleado;
    private javax.swing.JTextField TFSucursal;
    private javax.swing.JTextField TFSueldo;
    private javax.swing.JTable TPersonal;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
