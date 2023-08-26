
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FVentana extends javax.swing.JFrame {

    JLabel[] registroEtiqueta = new JLabel[4];
    JTextField[] registroTF = new JTextField[5];
    JButton[] botones = new JButton[4];

    String[][] datosGuardados = new String[4][5];
    boolean[] ocupado = new boolean[4];

    Color rojizo = new Color(239, 0, 62);
    Color grisaceo = new Color(29, 29, 29);

    public FVentana() {
        initComponents();
        setLocationRelativeTo(this);
        cargarElementos();
        coloresFondo();
        onOff(false);
        for (int i = 0; i < ocupado.length; i++) {
            ocupado[i] = false;
        }
    }

    void cargarElementos() {
        registroEtiqueta[0] = LR1;
        registroEtiqueta[1] = LR2;
        registroEtiqueta[2] = LR3;
        registroEtiqueta[3] = LR4;

        registroTF[0] = TFRegistro;
        registroTF[1] = TFNombre;
        registroTF[2] = TFTelefono;
        registroTF[3] = TFSangre;
        registroTF[4] = TFEdad;

        botones[0] = BNuevo;
        botones[1] = BModificar;
        botones[2] = BEliminar;
        botones[3] = BLimpiar;
    }

    void onOff(boolean actDesc) {
        for (int y = 0; y < registroTF.length; y++) {
            registroTF[y].setEnabled(actDesc);
        }

        for (int z = 0; z < botones.length; z++) {
            botones[z].setEnabled(actDesc);
        }
    }

    void coloresFondo() {
        for (int x = 0; x < registroEtiqueta.length; x++) {
            registroEtiqueta[x].setBackground(Color.WHITE);
            registroEtiqueta[x].setForeground(grisaceo);
        }
    }

    void limpiar() {
        for (int i = 0; i < registroTF.length; i++) {
            registroTF[i].setText("");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LR1 = new javax.swing.JLabel();
        LR2 = new javax.swing.JLabel();
        LR3 = new javax.swing.JLabel();
        LR4 = new javax.swing.JLabel();
        TFRegistro = new javax.swing.JTextField();
        TFTelefono = new javax.swing.JTextField();
        TFSangre = new javax.swing.JTextField();
        TFEdad = new javax.swing.JTextField();
        BNuevo = new javax.swing.JButton();
        BModificar = new javax.swing.JButton();
        BEliminar = new javax.swing.JButton();
        TFNombre = new javax.swing.JTextField();
        BLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LR1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LR1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LR1.setText("R1");
        LR1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LR1.setOpaque(true);
        LR1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LR1MouseClicked(evt);
            }
        });

        LR2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LR2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LR2.setText("R2");
        LR2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LR2.setOpaque(true);
        LR2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LR2MouseClicked(evt);
            }
        });

        LR3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LR3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LR3.setText("R3");
        LR3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LR3.setOpaque(true);
        LR3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LR3MouseClicked(evt);
            }
        });

        LR4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LR4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LR4.setText("R4");
        LR4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LR4.setOpaque(true);
        LR4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LR4MouseClicked(evt);
            }
        });

        TFRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro"));

        TFTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefono"));

        TFSangre.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de sangre"));

        TFEdad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edad"));

        BNuevo.setText("Nuevo");
        BNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNuevoActionPerformed(evt);
            }
        });

        BModificar.setText("Modificar");

        BEliminar.setText("Elimninar");

        TFNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        BLimpiar.setText("Limpiar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LR1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LR2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LR3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LR4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFSangre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TFRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BLimpiar)))
                        .addContainerGap(35, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LR1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LR2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LR3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LR4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TFRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(TFTelefono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TFSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TFEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TFNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BNuevo)
                            .addComponent(BModificar)
                            .addComponent(BEliminar)
                            .addComponent(BLimpiar))))
                .addContainerGap(225, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LR1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LR1MouseClicked
        if (LR1.getBackground() != rojizo) {
            if (ocupado[0]) {
                for (int i = 0; i < 5; i++) {
                    registroTF[i].setText(datosGuardados[0][i]);
                }
                BModificar.setEnabled(true);
            } else {
                BNuevo.setEnabled(true);
                registroEtiqueta[0].setBackground(rojizo);
                registroEtiqueta[0].setForeground(grisaceo);
            }
        }
    }//GEN-LAST:event_LR1MouseClicked

    private void LR2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LR2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LR2MouseClicked

    private void LR3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LR3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LR3MouseClicked

    private void LR4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LR4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LR4MouseClicked

    private void BNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNuevoActionPerformed
        if (BNuevo.getText().equals("Nuevo")) {
            onOff(true);
            BNuevo.setText("Guardar");
            TFRegistro.setText(registroEtiqueta[0].getText());
            TFNombre.requestFocus();
        } else {

            for (int x = 0; x < datosGuardados[0].length; x++) {
                datosGuardados[0][x] = registroTF[x].getText();
            }

            ocupado[0] = true;
            limpiar();
            onOff(false);
            registroEtiqueta[0].setBackground(new Color(29, 29, 29));
            registroEtiqueta[0].setForeground(Color.WHITE);
            BNuevo.setText("Nuevo");
        }
    }//GEN-LAST:event_BNuevoActionPerformed

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
            java.util.logging.Logger.getLogger(FVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BEliminar;
    private javax.swing.JButton BLimpiar;
    private javax.swing.JButton BModificar;
    private javax.swing.JButton BNuevo;
    private javax.swing.JLabel LR1;
    private javax.swing.JLabel LR2;
    private javax.swing.JLabel LR3;
    private javax.swing.JLabel LR4;
    private javax.swing.JTextField TFEdad;
    private javax.swing.JTextField TFNombre;
    private javax.swing.JTextField TFRegistro;
    private javax.swing.JTextField TFSangre;
    private javax.swing.JTextField TFTelefono;
    // End of variables declaration//GEN-END:variables
}