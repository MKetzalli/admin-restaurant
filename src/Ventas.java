//importar libreria

import javax.swing.JOptionPane;

//@author MKetzalli
//creacion de clase
public class Ventas extends javax.swing.JFrame {

    //metodo constructor
    public Ventas() {
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
        EtiquetaArticulo = new javax.swing.JLabel();
        EtiquetaPrecio = new javax.swing.JLabel();
        EtiquetaMarca = new javax.swing.JLabel();
        TFArticulo = new javax.swing.JTextField();
        TFPrecio = new javax.swing.JTextField();
        TFMarca = new javax.swing.JTextField();
        BotonAviso = new javax.swing.JButton();

        EtiquetaTitulo.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        EtiquetaTitulo.setText("VENTAS");

        EtiquetaArticulo.setText("Articulo");

        EtiquetaPrecio.setText("Precio");

        EtiquetaMarca.setText("Marca");

        BotonAviso.setText("Presioname");
        BotonAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAvisoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EtiquetaTitulo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EtiquetaArticulo)
                                    .addComponent(EtiquetaPrecio)
                                    .addComponent(EtiquetaMarca))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TFArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                    .addComponent(TFPrecio)
                                    .addComponent(TFMarca)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(BotonAviso)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(EtiquetaTitulo)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EtiquetaArticulo)
                            .addComponent(TFArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(EtiquetaPrecio))
                    .addComponent(TFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EtiquetaMarca)
                    .addComponent(TFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(BotonAviso)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //fin de seccion generada por Design

    //boton de prueba para verificar que se haya conectado correctamente mysql
    private void BotonAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAvisoActionPerformed
        // TODO add your handling code here:
        conectar bdrest = new conectar();
        bdrest.conexion();
    }//GEN-LAST:event_BotonAvisoActionPerformed

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
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
        //fin de codigo generado por Design
    }
    //declaracion de variables
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAviso;
    private javax.swing.JLabel EtiquetaArticulo;
    private javax.swing.JLabel EtiquetaMarca;
    private javax.swing.JLabel EtiquetaPrecio;
    private javax.swing.JLabel EtiquetaTitulo;
    private javax.swing.JTextField TFArticulo;
    private javax.swing.JTextField TFMarca;
    private javax.swing.JTextField TFPrecio;
    // End of variables declaration//GEN-END:variables
}
