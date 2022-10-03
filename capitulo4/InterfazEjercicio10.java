
package capitulo4;

import javax.swing.JOptionPane;


public class InterfazEjercicio10 extends javax.swing.JFrame {


    public InterfazEjercicio10() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNumeroInscripcion = new javax.swing.JLabel();
        labelNombres = new javax.swing.JLabel();
        labelPatrimonio = new javax.swing.JLabel();
        labelEstratoSocial = new javax.swing.JLabel();
        labelPagoPorMatricula = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnReestablecer = new javax.swing.JButton();
        txtNumeroInscripcion = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtPatrimonio = new javax.swing.JTextField();
        txtEstratoSocial = new javax.swing.JTextField();
        txtPagoPorMatricula = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNumeroInscripcion.setText("Numero Inscripcion");

        labelNombres.setText("Nombres");

        labelPatrimonio.setText("Patrimonio");

        labelEstratoSocial.setText("Estrato social");

        labelPagoPorMatricula.setText("Pago por matricula");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnReestablecer.setText("Reestablecer");
        btnReestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReestablecerActionPerformed(evt);
            }
        });

        txtNumeroInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroInscripcionActionPerformed(evt);
            }
        });

        txtPatrimonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatrimonioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelNumeroInscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelPatrimonio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelEstratoSocial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelPagoPorMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumeroInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEstratoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPagoPorMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btnCalcular)
                        .addGap(73, 73, 73)
                        .addComponent(btnReestablecer)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumeroInscripcion)
                    .addComponent(txtNumeroInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombres)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPatrimonio)
                    .addComponent(txtPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEstratoSocial)
                    .addComponent(txtEstratoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPagoPorMatricula)
                    .addComponent(txtPagoPorMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnReestablecer))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroInscripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroInscripcionActionPerformed

    private void txtPatrimonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatrimonioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatrimonioActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // programa boton calcular
        double patrimonio;
        int numeroInscripcion, estratoSocial;
        String nombres;
        
        try{
        numeroInscripcion = Integer.parseInt(txtNumeroInscripcion.getText());
        nombres = txtNombres.getText();
        patrimonio = Double.parseDouble(txtPatrimonio.getText());
        estratoSocial = Integer.parseInt(txtEstratoSocial.getText());
        
        txtNumeroInscripcion.setText(String.valueOf(numeroInscripcion));
        txtNombres.setText(String.valueOf(nombres));
        txtPagoPorMatricula.setText(String.valueOf(InscripcionEjercicio10.calcularPagoMatricula(patrimonio, estratoSocial)));
        JOptionPane.showMessageDialog(null, "El estudiante con numero de inscripcion " + numeroInscripcion + " y nombre " + nombres + " debe pagar $" + InscripcionEjercicio10.calcularPagoMatricula(patrimonio, estratoSocial));
        
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Has introducido caracteres no númericos");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnReestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReestablecerActionPerformed
        // programa boton reestablecer
        txtNumeroInscripcion.setText("");
        txtNombres.setText("");
        txtPatrimonio.setText("");
        txtEstratoSocial.setText("");
        txtPagoPorMatricula.setText("");
    }//GEN-LAST:event_btnReestablecerActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazEjercicio10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazEjercicio10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazEjercicio10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazEjercicio10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazEjercicio10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnReestablecer;
    private javax.swing.JLabel labelEstratoSocial;
    private javax.swing.JLabel labelNombres;
    private javax.swing.JLabel labelNumeroInscripcion;
    private javax.swing.JLabel labelPagoPorMatricula;
    private javax.swing.JLabel labelPatrimonio;
    private javax.swing.JTextField txtEstratoSocial;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumeroInscripcion;
    private javax.swing.JTextField txtPagoPorMatricula;
    private javax.swing.JTextField txtPatrimonio;
    // End of variables declaration//GEN-END:variables
}
