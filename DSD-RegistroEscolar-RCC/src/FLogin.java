
import javax.swing.JOptionPane;

/**
 *
 * @author Rogelio Cervantes Castellon
 */
public class FLogin extends javax.swing.JFrame {

    Conexion cnx = new Conexion();
    
    public FLogin() {
        initComponents();
        setLocationRelativeTo(this);
        
        if (cnx.conectar("localhost", "escuela", "root", "") == 0) {
            JOptionPane.showMessageDialog(null, "Error de conexion", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
        TFUsuario.setText("rogrcc");
        PFContrasena.setText("contraseñaxd");
    }

    void Entrar() {
        String user = TFUsuario.getText();
        String pass = PFContrasena.getText();
        
        if (user.equals("") || pass.equals("")) {
            JOptionPane.showMessageDialog(null, "Llena todos los campos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            String id = cnx.obtenerDato("SELECT ID FROM usuarios WHERE usuario = '"+user+"' AND contrasena = '"+pass+"'");
            if (id == null || id.equals("")) {
                JOptionPane.showMessageDialog(null, "Datos incorrectos.\nIntente nuevamente.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                TFUsuario.setText("");
                PFContrasena.setText("");
            } else {
                FPrincipal FP = new FPrincipal();
                FP.setVisible(true);
                this.dispose();
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PBackground = new javax.swing.JPanel();
        LEncabezado = new javax.swing.JLabel();
        TFUsuario = new javax.swing.JTextField();
        PFContrasena = new javax.swing.JPasswordField();
        BEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PBackground.setBackground(new java.awt.Color(29, 29, 29));

        LEncabezado.setBackground(new java.awt.Color(239, 0, 62));
        LEncabezado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LEncabezado.setForeground(new java.awt.Color(255, 255, 255));
        LEncabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LEncabezado.setText("Inicio de sesión");
        LEncabezado.setOpaque(true);

        TFUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TFUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuario:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        PFContrasena.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PFContrasena.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contraseña:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        PFContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PFContrasenaKeyPressed(evt);
            }
        });

        BEntrar.setBackground(new java.awt.Color(239, 0, 62));
        BEntrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BEntrar.setForeground(new java.awt.Color(255, 255, 255));
        BEntrar.setText("Entrar");
        BEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PBackgroundLayout = new javax.swing.GroupLayout(PBackground);
        PBackground.setLayout(PBackgroundLayout);
        PBackgroundLayout.setHorizontalGroup(
            PBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
            .addGroup(PBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PFContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addGroup(PBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                        .addComponent(TFUsuario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PBackgroundLayout.setVerticalGroup(
            PBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBackgroundLayout.createSequentialGroup()
                .addComponent(LEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PFContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEntrarActionPerformed
        Entrar();
    }//GEN-LAST:event_BEntrarActionPerformed

    private void PFContrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PFContrasenaKeyPressed
        if (evt.getKeyCode() == 10) {
            Entrar();
        }
    }//GEN-LAST:event_PFContrasenaKeyPressed

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
            java.util.logging.Logger.getLogger(FLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BEntrar;
    private javax.swing.JLabel LEncabezado;
    private javax.swing.JPanel PBackground;
    private javax.swing.JPasswordField PFContrasena;
    private javax.swing.JTextField TFUsuario;
    // End of variables declaration//GEN-END:variables
}
