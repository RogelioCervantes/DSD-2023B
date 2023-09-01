
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

// @author Rogelio Cervantes Castellon
public class FVentana extends javax.swing.JFrame {

    Registro[] registros = new Registro[4];
    Archivo archivo = new Archivo();
    
    JTextField[] registroTF = new JTextField[5];
    JButton[] botones = new JButton[4];
    Color rojizo = new Color(239, 0, 62);
    Color grisaceo = new Color(29, 29, 29);

    ImageIcon icon = new ImageIcon(getClass().getResource("/img/voidcat2.0_bigger.png"));

    enum E {
        LIBRE, OCUPADO, SELECCIONADO
    }

    public FVentana() {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("Registro de datos (Tarea 3 - Objetos)");
        setIconImage(icon.getImage());
        cargarElementos();
        onOff(false);
        TFRegistro.setEnabled(false);
    }

    void cargarElementos() {
        inicializarRegistro(0, LR1);
        inicializarRegistro(1, LR2);
        inicializarRegistro(2, LR3);
        inicializarRegistro(3, LR4);

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

    void inicializarRegistro(int index, JLabel etiqueta) {
        String[] nombresArchivosGuardados = archivo.nombreRegistros();
        
        try {
            registros[index] = new Registro(etiqueta, true, false, archivo.leerRegistro(nombresArchivosGuardados[index]));
            coloresFondo(E.OCUPADO, etiqueta);
        } catch (Exception e) {
            registros[index] = new Registro(etiqueta, false, false, new String[5]);
        }
        
    }
    
    void onOff(boolean actDesc) {
        for (int y = 1; y < registroTF.length; y++) {
            registroTF[y].setEnabled(actDesc);
        }

        for (int z = 0; z < botones.length; z++) {
            botones[z].setEnabled(actDesc);
        }
    }

    void coloresFondo(E estado, JLabel etiqueta) {
        switch (estado) {
            case LIBRE:
                etiqueta.setBackground(Color.WHITE);
                etiqueta.setForeground(grisaceo);
                break;
            case OCUPADO:
                etiqueta.setBackground(grisaceo);
                etiqueta.setForeground(Color.WHITE);
                break;
            case SELECCIONADO:
                etiqueta.setBackground(rojizo);
                etiqueta.setForeground(grisaceo);
                break;
            default:
                throw new AssertionError();
        }
    }

    void limpiar() {
        for (JTextField n : registroTF) n.setText("");
    }

    void etiquetaSeleccionada(Registro R) {
        for (Registro n : registros) {
            if (n.seleccionado) {
                int taseguro = JOptionPane.showConfirmDialog(null, "¿Cambiar de registro?", "Registro seleccionado", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

                if (taseguro == JOptionPane.YES_OPTION) {
                    if (!n.ocupado) coloresFondo(E.LIBRE, n.etiqueta);
                    n.seleccionado = false;
                    break;
                } else {
                    return;
                }
            }
        }
        if (R.ocupado) {
            for (int i = 0; i < registroTF.length; i++) {
                registroTF[i].setText(R.datos[i]);
            }
            BModificar.setEnabled(true);
            BEliminar.setEnabled(true);
        } else {
            limpiar();
            onOff(false);
            BNuevo.setEnabled(true);
            BNuevo.setText("Nuevo");
            BEliminar.setText("Eliminar");
            coloresFondo(E.SELECCIONADO, R.etiqueta);
        }
        R.seleccionado = true;
    }

    boolean checkInfo() {

        // Codigo espagueti para verificar que todos los campos esten correctos
        String[] tipoSangre = {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"};
        String telefono = TFTelefono.getText();
        String edad = TFEdad.getText();
        boolean[] boolArr = {true, true, true, true, true};

        for (int i = 0; i < tipoSangre.length; i++) {
            if (tipoSangre[i].equals(TFSangre.getText())) {
                boolArr[0] = true;
                break;
            } else {
                boolArr[0] = false;
            }
        }

        for (int i = 0; i < registroTF.length; i++) {
            if (registroTF[i].getText().equals("")) {
                boolArr[1] = false;
                break;
            }
        }

        for (int i = 0; i < telefono.length(); i++) {
            if (!Character.isDigit(telefono.charAt(i))) {
                boolArr[2] = false;
                break;
            }
        }

        for (int i = 0; i < edad.length(); i++) {
            if (!Character.isDigit(edad.charAt(i))) {
                boolArr[3] = false;
                break;
            }
        }

        if (telefono.length() != 10) {
            boolArr[4] = false;
        }

        return (boolArr[0] && boolArr[1] && boolArr[2] && boolArr[3] && boolArr[4]);
    }

    Registro registroSeleccionado() {
        // Busca cual etiqueta esta seleccionada para usarla
        for (Registro n : registros) {
            if (n.seleccionado) {
                return n;
            }
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LR1 = new javax.swing.JLabel();
        LR2 = new javax.swing.JLabel();
        LR3 = new javax.swing.JLabel();
        LR4 = new javax.swing.JLabel();
        TFRegistro = new javax.swing.JTextField();
        TFSangre = new javax.swing.JTextField();
        TFEdad = new javax.swing.JTextField();
        BNuevo = new javax.swing.JButton();
        BModificar = new javax.swing.JButton();
        BEliminar = new javax.swing.JButton();
        TFNombre = new javax.swing.JTextField();
        BLimpiar = new javax.swing.JButton();
        TFTelefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LR1.setBackground(new java.awt.Color(255, 255, 255));
        LR1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LR1.setForeground(new java.awt.Color(29, 29, 29));
        LR1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LR1.setText("R1");
        LR1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LR1.setOpaque(true);
        LR1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LR1MouseClicked(evt);
            }
        });

        LR2.setBackground(new java.awt.Color(255, 255, 255));
        LR2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LR2.setForeground(new java.awt.Color(29, 29, 29));
        LR2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LR2.setText("R2");
        LR2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LR2.setOpaque(true);
        LR2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LR2MouseClicked(evt);
            }
        });

        LR3.setBackground(new java.awt.Color(255, 255, 255));
        LR3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LR3.setForeground(new java.awt.Color(29, 29, 29));
        LR3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LR3.setText("R3");
        LR3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LR3.setOpaque(true);
        LR3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LR3MouseClicked(evt);
            }
        });

        LR4.setBackground(new java.awt.Color(255, 255, 255));
        LR4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LR4.setForeground(new java.awt.Color(29, 29, 29));
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

        TFSangre.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de sangre"));

        TFEdad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edad"));

        BNuevo.setText("Nuevo");
        BNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNuevoActionPerformed(evt);
            }
        });

        BModificar.setText("Modificar");
        BModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BModificarActionPerformed(evt);
            }
        });

        BEliminar.setText("Eliminar");
        BEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEliminarActionPerformed(evt);
            }
        });

        TFNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        BLimpiar.setText("Limpiar");
        BLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimpiarActionPerformed(evt);
            }
        });

        TFTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefono"));

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
                        .addComponent(BNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TFEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TFRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TFSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BNuevo)
                            .addComponent(BModificar)
                            .addComponent(BEliminar)
                            .addComponent(BLimpiar))))
                .addGap(224, 224, 224))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LR1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LR1MouseClicked
        etiquetaSeleccionada(registros[0]);
    }//GEN-LAST:event_LR1MouseClicked

    private void LR2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LR2MouseClicked
        etiquetaSeleccionada(registros[1]);
    }//GEN-LAST:event_LR2MouseClicked

    private void LR3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LR3MouseClicked
        etiquetaSeleccionada(registros[2]);
    }//GEN-LAST:event_LR3MouseClicked

    private void LR4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LR4MouseClicked
        etiquetaSeleccionada(registros[3]);
    }//GEN-LAST:event_LR4MouseClicked

    private void BNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNuevoActionPerformed
        Registro R = registroSeleccionado();

        if (BNuevo.getText().equals("Nuevo")) {
            onOff(true);
            BModificar.setEnabled(false);
            BNuevo.setText("Guardar");
            BEliminar.setText("Cancelar");
            TFRegistro.setText(R.etiqueta.getText());
            TFNombre.requestFocus();
        } else {
            if (!checkInfo()) {
                JOptionPane.showMessageDialog(null, "Uno de los campos es incorrecto.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                for (int i = 0; i < R.datos.length; i++) {
                    R.datos[i] = registroTF[i].getText();
                }
                archivo.guardarRegistro(R.datos, R.etiqueta.getText());
                limpiar();
                onOff(false);
                R.ocupado = true;
                R.seleccionado = false;
                BNuevo.setText("Nuevo");
                BEliminar.setText("Eliminar");
                coloresFondo(E.OCUPADO, R.etiqueta);
                JOptionPane.showMessageDialog(null, "Registro exitoso.", "Registro", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_BNuevoActionPerformed

    private void BEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEliminarActionPerformed
        Registro R = registroSeleccionado();

        if (BEliminar.getText().equals("Eliminar")) {
            int taseguro = JOptionPane.showConfirmDialog(null, "¿Seguro?", "Eliminar registro", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            if (taseguro == JOptionPane.YES_OPTION) {
                R.datos = null;
                R.ocupado = false;
                R.seleccionado = false;
                coloresFondo(E.LIBRE, R.etiqueta);
                onOff(false);
                limpiar();
            }
        } else {
            limpiar();
            onOff(false);
            R.seleccionado = false;
            BNuevo.setText("Nuevo");
            BEliminar.setText("Eliminar");
            if (!R.ocupado) coloresFondo(E.LIBRE, R.etiqueta);
            
        }
    }//GEN-LAST:event_BEliminarActionPerformed

    private void BModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BModificarActionPerformed
        onOff(true);
        BModificar.setEnabled(false);
        BNuevo.setText("Guardar");
        BEliminar.setText("Cancelar");
    }//GEN-LAST:event_BModificarActionPerformed

    private void BLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimpiarActionPerformed
        for (int i = 1; i < registroTF.length; i++) {
            registroTF[i].setText("");
        }
    }//GEN-LAST:event_BLimpiarActionPerformed

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
