//importar librerias
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.sql.Connection;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MenuReporte extends javax.swing.JFrame {

    //declaracion de variables que uso en mas de 1 metodo (son de la conexion con la BD)
    private conectar bd = new conectar();
    private Connection conex = bd.conexion();
    
    public MenuReporte() {
        initComponents();
        //llenado del combobox
        Llenar(CBSucursal);
        //hacer que la ventana aparezca al centro de la pantalla
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CBSucursal = new javax.swing.JComboBox<>();
        BImprimir = new javax.swing.JButton();
        BSalir = new javax.swing.JButton();
        EReporte = new javax.swing.JLabel();
        FReporte = new javax.swing.JLabel();
        MBReporte = new javax.swing.JMenuBar();
        MOpciones = new javax.swing.JMenu();
        MICerrarTodo = new javax.swing.JMenuItem();

        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(CBSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 240, 30));

        BImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imprimir.png"))); // NOI18N
        BImprimir.setBorder(null);
        BImprimir.setBorderPainted(false);
        BImprimir.setContentAreaFilled(false);
        BImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BImprimir.setDefaultCapable(false);
        BImprimir.setFocusPainted(false);
        BImprimir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imprimir pulsado.png"))); // NOI18N
        BImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(BImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

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
        getContentPane().add(BSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        EReporte.setFont(new java.awt.Font("Rockwell Condensed", 0, 48)); // NOI18N
        EReporte.setForeground(new java.awt.Color(255, 255, 255));
        EReporte.setText("REPORTE");
        getContentPane().add(EReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        FReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ventas.jpg"))); // NOI18N
        getContentPane().add(FReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 180));

        MOpciones.setText("Opciones");

        MICerrarTodo.setText("Cerrar Todo");
        MICerrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MICerrarTodoActionPerformed(evt);
            }
        });
        MOpciones.add(MICerrarTodo);

        MBReporte.add(MOpciones);

        setJMenuBar(MBReporte);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BImprimirActionPerformed
        // TODO add your handling code here:
        String suc =(String) CBSucursal.getSelectedItem();
        Document documento = new Document();
       
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Downloads/REPORT_DPO2_ACD_MAGA.pdf"));
            documento.open();
            
            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell("No_Empleado");
            tabla.addCell("Apellido");
            tabla.addCell("Nombre");
            tabla.addCell("Producto");
            tabla.addCell("Precio");
            
            try {                
                PreparedStatement pst = conex.prepareStatement("select personal.No_Empleado,personal.Apellido,personal.Nombre,ventas.Producto,ventas.Precio "
                        + "from personal INNER JOIN ventas ON personal.No_Empleado=ventas.No_Empleado where personal.Sucursal='"+suc+"'");
                
                ResultSet rs = pst.executeQuery();
                
                if(rs.next()){
                                       
                    do {                        
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                    } while (rs.next());
                    documento.add(tabla);                    
                }
                
            } catch (DocumentException | SQLException e) {
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado.");
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
        }
    }//GEN-LAST:event_BImprimirActionPerformed

    private void BSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalirActionPerformed
        //oculta la pantalla mostrando solo el menu principal
        this.setVisible(false);
    }//GEN-LAST:event_BSalirActionPerformed

    private void MICerrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MICerrarTodoActionPerformed
        //cierra el programa
        System.exit(0);
    }//GEN-LAST:event_MICerrarTodoActionPerformed

    //metodo para llenar el JComboBox
    public void Llenar(JComboBox CBSucursal){
        //sentencia SQL para obtener los datos deseados que conformaran el JComboBox
        String ssql="SELECT DISTINCT Sucursal FROM Personal ORDER BY Sucursal ASC";
        try{
            //prepara la consulta sql
            PreparedStatement pst=conex.prepareStatement(ssql);
            //ejecuta la consulta
            ResultSet result=pst.executeQuery();
            //llenado de CB
            CBSucursal.addItem("Sucursal");
            while(result.next()){
                CBSucursal.addItem(result.getString("Sucursal"));
            }            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error");
        }        
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuReporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BImprimir;
    private javax.swing.JButton BSalir;
    private javax.swing.JComboBox<String> CBSucursal;
    private javax.swing.JLabel EReporte;
    private javax.swing.JLabel FReporte;
    private javax.swing.JMenuBar MBReporte;
    private javax.swing.JMenuItem MICerrarTodo;
    private javax.swing.JMenu MOpciones;
    // End of variables declaration//GEN-END:variables
}
