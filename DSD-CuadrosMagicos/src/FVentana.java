
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author Rogelio Cervantes Castellón
 */
public class FVentana extends javax.swing.JFrame {

    int[] nums = new int[9];
    JLabel[] etiquetas = new JLabel[18];

    public FVentana() {
        initComponents();
        etiquetas[0] = C1;
        etiquetas[1] = C2;
        etiquetas[2] = C3;
        etiquetas[3] = D1;
        etiquetas[4] = D2;
        etiquetas[5] = LResultado;
        etiquetas[6] = N1;
        etiquetas[7] = N2;
        etiquetas[8] = N3;
        etiquetas[9] = N4;
        etiquetas[10] = N5;
        etiquetas[11] = N6;
        etiquetas[12] = N7;
        etiquetas[13] = N8;
        etiquetas[14] = N9;
        etiquetas[15] = R1;
        etiquetas[16] = R2;
        etiquetas[17] = R3;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        TFNum = new javax.swing.JTextField();
        LResultado = new javax.swing.JLabel();
        BAutomático = new javax.swing.JButton();
        BComprobar = new javax.swing.JButton();
        BReset = new javax.swing.JButton();
        N1 = new javax.swing.JLabel();
        N2 = new javax.swing.JLabel();
        N3 = new javax.swing.JLabel();
        N4 = new javax.swing.JLabel();
        N5 = new javax.swing.JLabel();
        N6 = new javax.swing.JLabel();
        N7 = new javax.swing.JLabel();
        N8 = new javax.swing.JLabel();
        N9 = new javax.swing.JLabel();
        D1 = new javax.swing.JLabel();
        D2 = new javax.swing.JLabel();
        C1 = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        C3 = new javax.swing.JLabel();
        R1 = new javax.swing.JLabel();
        R2 = new javax.swing.JLabel();
        R3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(29, 29, 29));
        Background.setForeground(new java.awt.Color(255, 255, 255));

        TFNum.setBackground(new java.awt.Color(0, 0, 0));
        TFNum.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TFNum.setForeground(new java.awt.Color(255, 255, 255));
        TFNum.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Indica el número inicial:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        LResultado.setBackground(new java.awt.Color(0, 0, 0));
        LResultado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LResultado.setForeground(new java.awt.Color(255, 255, 255));
        LResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LResultado.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Resultado:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        LResultado.setOpaque(true);

        BAutomático.setBackground(new java.awt.Color(239, 0, 62));
        BAutomático.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BAutomático.setForeground(new java.awt.Color(255, 255, 255));
        BAutomático.setText("Automático");
        BAutomático.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAutomáticoActionPerformed(evt);
            }
        });

        BComprobar.setBackground(new java.awt.Color(239, 0, 62));
        BComprobar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BComprobar.setForeground(new java.awt.Color(255, 255, 255));
        BComprobar.setText("Comprobar");
        BComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BComprobarActionPerformed(evt);
            }
        });

        BReset.setBackground(new java.awt.Color(239, 0, 62));
        BReset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BReset.setForeground(new java.awt.Color(255, 255, 255));
        BReset.setText("Reiniciar");
        BReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BResetActionPerformed(evt);
            }
        });

        N1.setBackground(new java.awt.Color(0, 0, 0));
        N1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        N1.setForeground(new java.awt.Color(255, 255, 255));
        N1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        N1.setOpaque(true);

        N2.setBackground(new java.awt.Color(0, 0, 0));
        N2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        N2.setForeground(new java.awt.Color(255, 255, 255));
        N2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        N2.setOpaque(true);

        N3.setBackground(new java.awt.Color(0, 0, 0));
        N3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        N3.setForeground(new java.awt.Color(255, 255, 255));
        N3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        N3.setOpaque(true);

        N4.setBackground(new java.awt.Color(0, 0, 0));
        N4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        N4.setForeground(new java.awt.Color(255, 255, 255));
        N4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        N4.setOpaque(true);

        N5.setBackground(new java.awt.Color(0, 0, 0));
        N5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        N5.setForeground(new java.awt.Color(255, 255, 255));
        N5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        N5.setOpaque(true);

        N6.setBackground(new java.awt.Color(0, 0, 0));
        N6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        N6.setForeground(new java.awt.Color(255, 255, 255));
        N6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        N6.setOpaque(true);

        N7.setBackground(new java.awt.Color(0, 0, 0));
        N7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        N7.setForeground(new java.awt.Color(255, 255, 255));
        N7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        N7.setOpaque(true);

        N8.setBackground(new java.awt.Color(0, 0, 0));
        N8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        N8.setForeground(new java.awt.Color(255, 255, 255));
        N8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        N8.setOpaque(true);

        N9.setBackground(new java.awt.Color(0, 0, 0));
        N9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        N9.setForeground(new java.awt.Color(255, 255, 255));
        N9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        N9.setOpaque(true);

        D1.setBackground(new java.awt.Color(16, 16, 16));
        D1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        D1.setForeground(new java.awt.Color(255, 255, 255));
        D1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D1.setOpaque(true);

        D2.setBackground(new java.awt.Color(16, 16, 16));
        D2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        D2.setForeground(new java.awt.Color(255, 255, 255));
        D2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D2.setOpaque(true);

        C1.setBackground(new java.awt.Color(16, 16, 16));
        C1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        C1.setForeground(new java.awt.Color(255, 255, 255));
        C1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C1.setOpaque(true);

        C2.setBackground(new java.awt.Color(16, 16, 16));
        C2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        C2.setForeground(new java.awt.Color(255, 255, 255));
        C2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C2.setOpaque(true);

        C3.setBackground(new java.awt.Color(16, 16, 16));
        C3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        C3.setForeground(new java.awt.Color(255, 255, 255));
        C3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C3.setOpaque(true);

        R1.setBackground(new java.awt.Color(16, 16, 16));
        R1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        R1.setForeground(new java.awt.Color(255, 255, 255));
        R1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        R1.setOpaque(true);

        R2.setBackground(new java.awt.Color(16, 16, 16));
        R2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        R2.setForeground(new java.awt.Color(255, 255, 255));
        R2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        R2.setOpaque(true);

        R3.setBackground(new java.awt.Color(16, 16, 16));
        R3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        R3.setForeground(new java.awt.Color(255, 255, 255));
        R3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        R3.setOpaque(true);

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(TFNum, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(BAutomático)
                        .addGap(18, 18, 18)
                        .addComponent(BComprobar)
                        .addGap(18, 18, 18)
                        .addComponent(BReset))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(N1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(N2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(N3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(R1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(N4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(N5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(N6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(R2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(N7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(N8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(N9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(R3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TFNum, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BAutomático)
                    .addComponent(BComprobar)
                    .addComponent(BReset))
                .addGap(19, 19, 19)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(N1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(N4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(N7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BAutomáticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAutomáticoActionPerformed
        try {
            int num = Integer.parseInt(TFNum.getText());
            int total = 0;
            for (int i = 0; i < nums.length; i++) {
                nums[i] = num;
                num++;
            }
            for (int i = 0; i < nums.length; i++) {
                total += nums[i];
            }

            int total2 = total / 3;
            LResultado.setText("" + total2);

            N5.setText("" + nums[4]);
            N1.setText("" + nums[1]);
            N3.setText("" + nums[3]);
            N7.setText("" + nums[5]);
            N9.setText("" + nums[7]);

            int n2 = ((nums[1] + nums[3]) - total2) * -1;
            N2.setText("" + n2);
            int n4 = ((nums[1] + nums[5]) - total2) * -1;
            N4.setText("" + n4);
            int n8 = ((nums[5] + nums[7]) - total2) * -1;
            N8.setText("" + n8);
            int n6 = ((nums[3] + nums[7]) - total2) * -1;
            N6.setText("" + n6);
            
            int d1 = (Integer.parseInt(N7.getText())) + (Integer.parseInt(N5.getText())) + (Integer.parseInt(N3.getText()));
            D1.setText(""+d1);
            int c1 = (Integer.parseInt(N1.getText())) + (Integer.parseInt(N4.getText())) + (Integer.parseInt(N7.getText()));
            C1.setText(""+c1);
            int c2 = (Integer.parseInt(N2.getText())) + (Integer.parseInt(N5.getText())) + (Integer.parseInt(N8.getText()));
            C2.setText(""+c2);
            int c3 = (Integer.parseInt(N3.getText())) + (Integer.parseInt(N6.getText())) + (Integer.parseInt(N9.getText()));
            C3.setText(""+c3);
            int d2 = (Integer.parseInt(N1.getText())) + (Integer.parseInt(N5.getText())) + (Integer.parseInt(N9.getText()));
            D2.setText(""+d2);
            int r1 = (Integer.parseInt(N1.getText())) + (Integer.parseInt(N2.getText())) + (Integer.parseInt(N3.getText()));
            R1.setText(""+r1);
            int r2 = (Integer.parseInt(N4.getText())) + (Integer.parseInt(N5.getText())) + (Integer.parseInt(N6.getText()));
            R2.setText(""+r2);
            int r3 = (Integer.parseInt(N7.getText())) + (Integer.parseInt(N8.getText())) + (Integer.parseInt(N9.getText()));
            R3.setText(""+r3);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Se te olvido el numero.\n"+e, "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BAutomáticoActionPerformed

    private void BComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BComprobarActionPerformed
        JOptionPane.showMessageDialog(null, "Si 👍", "👍", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BComprobarActionPerformed

    private void BResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BResetActionPerformed
        TFNum.setText("");
        for (JLabel etiqueta : etiquetas) {
            etiqueta.setText("");
        }
    }//GEN-LAST:event_BResetActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("FlatLaf Cupertino Dark".equals(info.getName())) {
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
    private javax.swing.JButton BAutomático;
    private javax.swing.JButton BComprobar;
    private javax.swing.JButton BReset;
    private javax.swing.JPanel Background;
    private javax.swing.JLabel C1;
    private javax.swing.JLabel C2;
    private javax.swing.JLabel C3;
    private javax.swing.JLabel D1;
    private javax.swing.JLabel D2;
    private javax.swing.JLabel LResultado;
    private javax.swing.JLabel N1;
    private javax.swing.JLabel N2;
    private javax.swing.JLabel N3;
    private javax.swing.JLabel N4;
    private javax.swing.JLabel N5;
    private javax.swing.JLabel N6;
    private javax.swing.JLabel N7;
    private javax.swing.JLabel N8;
    private javax.swing.JLabel N9;
    private javax.swing.JLabel R1;
    private javax.swing.JLabel R2;
    private javax.swing.JLabel R3;
    private javax.swing.JTextField TFNum;
    // End of variables declaration//GEN-END:variables
}
