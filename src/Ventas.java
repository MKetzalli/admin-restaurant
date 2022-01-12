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
        guardar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        seleccionar = new javax.swing.JButton();
        visualizar = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        EtiquetaTitulo.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        EtiquetaTitulo.setText("VENTAS");

        EtiquetaArticulo.setText("Articulo");

        EtiquetaPrecio.setText("Precio");

        EtiquetaMarca.setText("Marca");

        BotonAviso.setText("Prueba de conexión");
        BotonAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAvisoActionPerformed(evt);
            }
        });

        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_guardar.png"))); // NOI18N
        guardar.setBorder(null);
        guardar.setBorderPainted(false);
        guardar.setContentAreaFilled(false);
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.setFocusPainted(false);
        guardar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_guardar (1).png"))); // NOI18N

        limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_limpiar.png"))); // NOI18N
        limpiar.setBorder(null);
        limpiar.setBorderPainted(false);
        limpiar.setContentAreaFilled(false);
        limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiar.setFocusPainted(false);
        limpiar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_limpiar (1).png"))); // NOI18N

        seleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_seleccionar.png"))); // NOI18N
        seleccionar.setBorder(null);
        seleccionar.setBorderPainted(false);
        seleccionar.setContentAreaFilled(false);
        seleccionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seleccionar.setFocusPainted(false);
        seleccionar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_seleccionar (1).png"))); // NOI18N

        visualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_visualizar.png"))); // NOI18N
        visualizar.setBorder(null);
        visualizar.setBorderPainted(false);
        visualizar.setContentAreaFilled(false);
        visualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        visualizar.setFocusPainted(false);
        visualizar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_visualizar (1).png"))); // NOI18N

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        salir.setBorder(null);
        salir.setBorderPainted(false);
        salir.setContentAreaFilled(false);
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.setFocusPainted(false);
        salir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir pulsado.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(EtiquetaTitulo)
                        .addGap(100, 100, 100)
                        .addComponent(guardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(EtiquetaArticulo)
                        .addGap(14, 14, 14)
                        .addComponent(TFArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(limpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(EtiquetaPrecio)
                        .addGap(21, 21, 21)
                        .addComponent(TFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(seleccionar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(EtiquetaMarca)
                        .addGap(21, 21, 21)
                        .addComponent(TFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(visualizar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(BotonAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(salir)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(EtiquetaTitulo)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(guardar)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EtiquetaArticulo)
                            .addComponent(TFArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EtiquetaPrecio)
                            .addComponent(TFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(limpiar)
                        .addGap(18, 18, 18)
                        .addComponent(seleccionar)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EtiquetaMarca)
                    .addComponent(TFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(visualizar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(BotonAviso))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(salir)))
                .addContainerGap(33, Short.MAX_VALUE))
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
    private javax.swing.JButton guardar;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton salir;
    private javax.swing.JButton seleccionar;
    private javax.swing.JButton visualizar;
    // End of variables declaration//GEN-END:variables
}
