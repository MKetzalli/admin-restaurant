//importar libreria
import javax.swing.JOptionPane;

//@author MKetzalli
//creacion de clase
public class MenuPrincipal extends javax.swing.JFrame {

    //metodo constructor
    public MenuPrincipal() {
        //inicializar componentes
        initComponents();
        //centrar ventana
        this.setLocationRelativeTo(null);
    }

    //comienzo de seccion generada por Design (inicializacion y personalizacion de componentes y contenedores)
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EtiquetaTitulo = new javax.swing.JLabel();
        BotonVentas = new javax.swing.JButton();
        BotonPersonal = new javax.swing.JButton();
        BotonInventarios = new javax.swing.JButton();
        BotonSalirPrinc = new javax.swing.JButton();
        EtiquetaFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Restaurante");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EtiquetaTitulo.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 48)); // NOI18N
        EtiquetaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaTitulo.setText("RESTAURANTE");
        getContentPane().add(EtiquetaTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        BotonVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ventas.png"))); // NOI18N
        BotonVentas.setToolTipText("");
        BotonVentas.setBorder(null);
        BotonVentas.setBorderPainted(false);
        BotonVentas.setContentAreaFilled(false);
        BotonVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonVentas.setFocusPainted(false);
        BotonVentas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ventas pulsado.png"))); // NOI18N
        BotonVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVentasActionPerformed(evt);
            }
        });
        getContentPane().add(BotonVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        BotonPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/personal.png"))); // NOI18N
        BotonPersonal.setBorder(null);
        BotonPersonal.setBorderPainted(false);
        BotonPersonal.setContentAreaFilled(false);
        BotonPersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonPersonal.setFocusPainted(false);
        BotonPersonal.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/personal pulsado.png"))); // NOI18N
        BotonPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPersonalActionPerformed(evt);
            }
        });
        getContentPane().add(BotonPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        BotonInventarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inventarios.png"))); // NOI18N
        BotonInventarios.setBorder(null);
        BotonInventarios.setBorderPainted(false);
        BotonInventarios.setContentAreaFilled(false);
        BotonInventarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonInventarios.setFocusPainted(false);
        BotonInventarios.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inventarios pulsado.png"))); // NOI18N
        BotonInventarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInventariosActionPerformed(evt);
            }
        });
        getContentPane().add(BotonInventarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        BotonSalirPrinc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        BotonSalirPrinc.setBorder(null);
        BotonSalirPrinc.setBorderPainted(false);
        BotonSalirPrinc.setContentAreaFilled(false);
        BotonSalirPrinc.setFocusPainted(false);
        BotonSalirPrinc.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir pulsado.png"))); // NOI18N
        BotonSalirPrinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirPrincActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSalirPrinc, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        EtiquetaFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/comida.jpg"))); // NOI18N
        getContentPane().add(EtiquetaFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //fin de seccion generada por Design

    //cerrar al presionar salir
    private void BotonSalirPrincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirPrincActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotonSalirPrincActionPerformed
    //mostrar mensaje en el boton de inventario (ya que aun no se programan sus funciones)
    private void BotonInventariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInventariosActionPerformed
        JOptionPane.showMessageDialog(null, "OPCION NO HABILITADA TEMPORALMENTE");
    }//GEN-LAST:event_BotonInventariosActionPerformed
    //mostrar mensaje en el boton de personal (ya que aun no se programan sus funciones)
    private void BotonPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPersonalActionPerformed
        JOptionPane.showMessageDialog(null, "OPCION NO HABILITADA TEMPORALMENTE");
    }//GEN-LAST:event_BotonPersonalActionPerformed
    //al presionar boton de ventas se habilita la ventana de Ventas
    private void BotonVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVentasActionPerformed
        Ventas MenuVentas = new Ventas();
        MenuVentas.setVisible(true);
    }//GEN-LAST:event_BotonVentasActionPerformed
    //metodo main
    public static void main(String args[]) {
        //comienzo de codigo generado por Design
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
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
        //fin de codigo generado por Design
    }
    //declaracion de variables
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonInventarios;
    private javax.swing.JButton BotonPersonal;
    private javax.swing.JButton BotonSalirPrinc;
    private javax.swing.JButton BotonVentas;
    private javax.swing.JLabel EtiquetaFondo;
    private javax.swing.JLabel EtiquetaTitulo;
    // End of variables declaration//GEN-END:variables
}
