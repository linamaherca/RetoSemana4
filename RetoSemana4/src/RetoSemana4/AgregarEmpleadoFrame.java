package RetoSemana4;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linam
 */
public class AgregarEmpleadoFrame extends javax.swing.JFrame {

    /**
     * Creates new form AgregarEmpleadoFrame
     */
    public AgregarEmpleadoFrame() {
        initComponents();
        setNombresComponentes();
    }
    private void setNombresComponentes(){
        jTextFieldNombre.setName("nombre");
        jTextFieldApellido.setName("apellido");
        jTextFieldCorreo.setName("correo");
        jTextFieldCelular.setName("celular");
        jTextFieldSalario.setName("salario");
        jTextFieldCargo.setName("cargo");
        
        jCheckBoxProveedor.setName("proveedor");
        
        jButton1AgregarEmpleados.setName("agregar");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jTextFieldCelular = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCargo = new javax.swing.JTextField();
        jCheckBoxProveedor = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jButton1AgregarEmpleados = new javax.swing.JButton();
        jTextFieldSalario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Nombre*");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 50, 50, 20);

        jLabel2.setText("Apellido");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(260, 50, 50, 20);

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombre);
        jTextFieldNombre.setBounds(30, 75, 200, 20);
        getContentPane().add(jTextFieldApellido);
        jTextFieldApellido.setBounds(260, 75, 200, 20);

        jLabel3.setText("Correo*");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 110, 50, 20);

        jLabel4.setText("Celular*");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(260, 110, 50, 20);
        getContentPane().add(jTextFieldCorreo);
        jTextFieldCorreo.setBounds(30, 135, 200, 20);
        getContentPane().add(jTextFieldCelular);
        jTextFieldCelular.setBounds(260, 135, 200, 20);

        jLabel5.setText("Salario*");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(260, 170, 50, 20);
        getContentPane().add(jTextFieldCargo);
        jTextFieldCargo.setBounds(30, 255, 200, 20);

        jCheckBoxProveedor.setText("Proveedor");
        getContentPane().add(jCheckBoxProveedor);
        jCheckBoxProveedor.setBounds(30, 170, 200, 20);

        jLabel6.setText("Cargo");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 230, 50, 20);

        jButton1AgregarEmpleados.setText("Agregar Empleados");
        jButton1AgregarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1AgregarEmpleadosActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1AgregarEmpleados);
        jButton1AgregarEmpleados.setBounds(145, 300, 200, 20);
        getContentPane().add(jTextFieldSalario);
        jTextFieldSalario.setBounds(260, 200, 200, 20);

        setBounds(0, 0, 506, 389);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jButton1AgregarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1AgregarEmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1AgregarEmpleadosActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AgregarEmpleadoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarEmpleadoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarEmpleadoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarEmpleadoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AgregarEmpleadoFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1AgregarEmpleados;
    private javax.swing.JCheckBox jCheckBoxProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCargo;
    private javax.swing.JTextField jTextFieldCelular;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldSalario;
    // End of variables declaration//GEN-END:variables
}
