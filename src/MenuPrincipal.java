//importar librerias
import javax.swing.JOptionPane;

//creacion de la clase que hereda elementos para diseñar la interfaz grafica
public class MenuPrincipal extends javax.swing.JFrame {
    
    //metodo constructor
    public MenuPrincipal() {
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

        LRestaurante = new javax.swing.JLabel();
        BVentas = new javax.swing.JButton();
        BPersonal = new javax.swing.JButton();
        BInventario = new javax.swing.JButton();
        BSalir = new javax.swing.JButton();
        EFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 440, 340));
        setPreferredSize(new java.awt.Dimension(436, 340));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LRestaurante.setFont(new java.awt.Font("Rockwell Condensed", 0, 48)); // NOI18N
        LRestaurante.setForeground(new java.awt.Color(255, 255, 255));
        LRestaurante.setText("RESTAURANTE MEXICANO");
        getContentPane().add(LRestaurante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        BVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ventas.png"))); // NOI18N
        BVentas.setBorder(null);
        BVentas.setBorderPainted(false);
        BVentas.setContentAreaFilled(false);
        BVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BVentas.setFocusPainted(false);
        BVentas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ventas pulsado.png"))); // NOI18N
        BVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVentasActionPerformed(evt);
            }
        });
        getContentPane().add(BVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        BPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/personal.png"))); // NOI18N
        BPersonal.setBorder(null);
        BPersonal.setBorderPainted(false);
        BPersonal.setContentAreaFilled(false);
        BPersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BPersonal.setFocusPainted(false);
        BPersonal.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/personal pulsado.png"))); // NOI18N
        BPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPersonalActionPerformed(evt);
            }
        });
        getContentPane().add(BPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        BInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inventarios.png"))); // NOI18N
        BInventario.setBorder(null);
        BInventario.setBorderPainted(false);
        BInventario.setContentAreaFilled(false);
        BInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BInventario.setFocusPainted(false);
        BInventario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inventarios pulsado.png"))); // NOI18N
        BInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInventarioActionPerformed(evt);
            }
        });
        getContentPane().add(BInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

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
        getContentPane().add(BSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        EFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/restaurante.jpg"))); // NOI18N
        getContentPane().add(EFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //fin del metodo inicializador
    
    //accion del boton Ventas
    private void BVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVentasActionPerformed
        //crea objeto de la clase MenuVentas y lo vuelve visible
        MenuVentas ventas = new MenuVentas();
        ventas.setVisible(true);
    }//GEN-LAST:event_BVentasActionPerformed

    //accion del boton Salir
    private void BSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalirActionPerformed
        //cierra el programa
        System.exit(0);
    }//GEN-LAST:event_BSalirActionPerformed

    //accion del boton Personal
    private void BPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPersonalActionPerformed
        //muestra mensaje de que no esta disponible
        JOptionPane.showMessageDialog(null, "opcion no disponible");
    }//GEN-LAST:event_BPersonalActionPerformed

    //accion del boton Inventario
    private void BInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInventarioActionPerformed
        //crea objeto de la clase MenuInventario y lo vuelve visible
        MenuInventario inventario = new MenuInventario();
        inventario.setVisible(true);
    }//GEN-LAST:event_BInventarioActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }
    //fin del metodo main
    
    //declaracion de variables
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BInventario;
    private javax.swing.JButton BPersonal;
    private javax.swing.JButton BSalir;
    private javax.swing.JButton BVentas;
    private javax.swing.JLabel EFondo;
    private javax.swing.JLabel LRestaurante;
    // End of variables declaration//GEN-END:variables
}
