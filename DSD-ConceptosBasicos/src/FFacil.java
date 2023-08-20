
import java.awt.Color;
import java.security.SecureRandom;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author thero
 */
public class FFacil extends javax.swing.JFrame {

    int totalPares = 8;
    ImageIcon icon = new ImageIcon(getClass().getResource("/img/icons/voidcat_logo.png"));
    ArrayList<JLabel> etiquetas = new ArrayList();
    SecureRandom numeroAleatorio = new SecureRandom();
    String[] imgArr = new String[totalPares];
    String[] comparacion = new String[2];
    String[][] rutaArr = new String[4][4];
    int[] nums = new int[totalPares];
    int[] numeroCarta = new int[2];
    int clicks = 0;
    int aciertos = 0;
    int fallos = 0;

    public FFacil() {
        initComponents();
        setLocationRelativeTo(this);
        setIconImage(icon.getImage());
        setTitle("Memorama - Fácil");
        BComparar.setEnabled(false);
        cargarEtiqueta();
        agregarImagenes();
    }

    void cargarEtiqueta() {
        etiquetas.add(LF1);
        etiquetas.add(LF2);
        etiquetas.add(LF3);
        etiquetas.add(LF4);
        etiquetas.add(LF5);
        etiquetas.add(LF6);
        etiquetas.add(LF7);
        etiquetas.add(LF8);
        etiquetas.add(LF9);
        etiquetas.add(LF10);
        etiquetas.add(LF11);
        etiquetas.add(LF12);
        etiquetas.add(LF13);
        etiquetas.add(LF14);
        etiquetas.add(LF15);
        etiquetas.add(LF16);
    }

    int numerosImagen() {
        int numeroGenerado = numeroAleatorio.nextInt(totalPares);

        return numeroGenerado;
    }

    void agregarImagenes() {
        for (int i = 0; i < imgArr.length; i++) {
            imgArr[i] = "/img/cartas/" + (i + 1) + ".png";
        }
    }

    void cargarImagenEtiqueta() {
        int cont = 0;

        for (int row = 0; row < rutaArr.length; row++) {
            for (int column = 0; column < rutaArr[0].length; column++) {
                int temp = numerosImagen();
                if (nums[temp] == 2) {
                    column--;
                } else {
                    rutaArr[row][column] = imgArr[temp];
                    nums[temp]++;
                }
            }
        }

        for (int row = 0; row < rutaArr.length; row++) {
            for (int column = 0; column < rutaArr[0].length; column++) {
                etiquetas.get(cont).setOpaque(true);
                etiquetas.get(cont).setBackground(new Color(72, 72, 72));
                etiquetas.get(cont).setForeground(new Color(72, 72, 72));
                etiquetas.get(cont).setIcon(new ImageIcon(getClass().getResource(rutaArr[row][column])));
                etiquetas.get(cont).setText("" + (cont + 1));
                cont++;
            }
        }
    }

    void voltearCartas() {
        for (int i = 0; i < etiquetas.size(); i++) {
            etiquetas.get(i).setIcon(null);
            etiquetas.get(i).setBackground(new Color(72, 72, 72));
            etiquetas.get(i).setForeground(new Color(72, 72, 72));
        }
    }

    void mostrarImagen(int numCarta) {
        if (BJugar.getText().equals("Jugando")) {
            if (clicks != 2) {
                if (numCarta >= 0 && numCarta <= 3) {
                    comparacion[clicks] = rutaArr[0][numCarta];
                    etiquetas.get(numCarta).setIcon(new ImageIcon(getClass().getResource(rutaArr[0][numCarta])));
                } else if (numCarta >= 4 && numCarta <= 7) {
                    comparacion[clicks] = rutaArr[1][numCarta - 4];
                    etiquetas.get(numCarta).setIcon(new ImageIcon(getClass().getResource(rutaArr[1][numCarta - 4])));
                } else if (numCarta >= 8 && numCarta <= 11) {
                    comparacion[clicks] = rutaArr[2][numCarta - 8];
                    etiquetas.get(numCarta).setIcon(new ImageIcon(getClass().getResource(rutaArr[2][numCarta - 8])));
                } else if (numCarta >= 12 && numCarta <= 15) {
                    comparacion[clicks] = rutaArr[3][numCarta - 12];
                    etiquetas.get(numCarta).setIcon(new ImageIcon(getClass().getResource(rutaArr[3][numCarta - 12])));
                } else {
                    JOptionPane.showMessageDialog(null, "Qué chuchas hicistes", "???", 2);
                }

                numeroCarta[clicks] = numCarta;
                clicks++;
            }

            if (clicks == 2) {
                BComparar.setEnabled(true);
            }
        }
    }

    void gameOver() {
        String mensaje;

        if (fallos == 0) {
            mensaje = "¡Perfecto!";
        } else if (fallos < aciertos) {
            mensaje = "¡Muy bien!";
        } else if (fallos == aciertos) {
            mensaje = "Regular";
        } else {
            mensaje = "GIT GUD";
        }

        JOptionPane.showMessageDialog(null,
                "Puntuación final.\n\nAciertos: " + aciertos + ".\nFallos: " + fallos + ".\n\n" + mensaje,
                "Juego terminado.", 1);

        FInicio inicio = new FInicio();
        inicio.setVisible(true);
        this.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PBackground = new javax.swing.JPanel();
        PBoard = new javax.swing.JPanel();
        BJugar = new javax.swing.JButton();
        BComparar = new javax.swing.JButton();
        LFallos = new javax.swing.JLabel();
        LAciertos = new javax.swing.JLabel();
        PFacil = new javax.swing.JPanel();
        LF1 = new javax.swing.JLabel();
        LF2 = new javax.swing.JLabel();
        LF3 = new javax.swing.JLabel();
        LF4 = new javax.swing.JLabel();
        LF5 = new javax.swing.JLabel();
        LF6 = new javax.swing.JLabel();
        LF7 = new javax.swing.JLabel();
        LF8 = new javax.swing.JLabel();
        LF9 = new javax.swing.JLabel();
        LF10 = new javax.swing.JLabel();
        LF11 = new javax.swing.JLabel();
        LF12 = new javax.swing.JLabel();
        LF13 = new javax.swing.JLabel();
        LF14 = new javax.swing.JLabel();
        LF15 = new javax.swing.JLabel();
        LF16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(29, 29, 29));
        setResizable(false);

        PBackground.setBackground(new java.awt.Color(29, 29, 29));

        PBoard.setBackground(new java.awt.Color(29, 29, 29));
        PBoard.setLayout(null);

        BJugar.setBackground(new java.awt.Color(239, 0, 62));
        BJugar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BJugar.setForeground(new java.awt.Color(255, 255, 255));
        BJugar.setText("Mostrar / Jugar");
        BJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BJugarActionPerformed(evt);
            }
        });
        PBoard.add(BJugar);
        BJugar.setBounds(10, 20, 120, 27);

        BComparar.setBackground(new java.awt.Color(239, 0, 62));
        BComparar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BComparar.setForeground(new java.awt.Color(255, 255, 255));
        BComparar.setText("Comparar");
        BComparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCompararActionPerformed(evt);
            }
        });
        PBoard.add(BComparar);
        BComparar.setBounds(10, 50, 120, 27);

        LFallos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LFallos.setForeground(new java.awt.Color(255, 255, 255));
        LFallos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LFallos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 0, 62)), "Fallos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        PBoard.add(LFallos);
        LFallos.setBounds(250, 10, 106, 70);

        LAciertos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LAciertos.setForeground(new java.awt.Color(255, 255, 255));
        LAciertos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LAciertos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 0, 62)), "Aciertos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        PBoard.add(LAciertos);
        LAciertos.setBounds(140, 10, 106, 70);

        PFacil.setBackground(new java.awt.Color(29, 29, 29));
        PFacil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PFacil.setLayout(null);

        LF1.setForeground(new java.awt.Color(30, 30, 30));
        LF1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LF1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF1MouseClicked(evt);
            }
        });
        PFacil.add(LF1);
        LF1.setBounds(10, 10, 80, 80);

        LF2.setForeground(new java.awt.Color(30, 30, 30));
        LF2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LF2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF2MouseClicked(evt);
            }
        });
        PFacil.add(LF2);
        LF2.setBounds(100, 10, 80, 80);

        LF3.setForeground(new java.awt.Color(30, 30, 30));
        LF3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LF3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF3MouseClicked(evt);
            }
        });
        PFacil.add(LF3);
        LF3.setBounds(190, 10, 80, 80);

        LF4.setForeground(new java.awt.Color(30, 30, 30));
        LF4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LF4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF4MouseClicked(evt);
            }
        });
        PFacil.add(LF4);
        LF4.setBounds(280, 10, 80, 80);

        LF5.setForeground(new java.awt.Color(30, 30, 30));
        LF5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LF5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF5MouseClicked(evt);
            }
        });
        PFacil.add(LF5);
        LF5.setBounds(10, 100, 80, 80);

        LF6.setForeground(new java.awt.Color(30, 30, 30));
        LF6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LF6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF6MouseClicked(evt);
            }
        });
        PFacil.add(LF6);
        LF6.setBounds(100, 100, 80, 80);

        LF7.setForeground(new java.awt.Color(30, 30, 30));
        LF7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LF7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF7MouseClicked(evt);
            }
        });
        PFacil.add(LF7);
        LF7.setBounds(190, 100, 80, 80);

        LF8.setForeground(new java.awt.Color(30, 30, 30));
        LF8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LF8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF8MouseClicked(evt);
            }
        });
        PFacil.add(LF8);
        LF8.setBounds(280, 100, 80, 80);

        LF9.setForeground(new java.awt.Color(30, 30, 30));
        LF9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LF9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF9MouseClicked(evt);
            }
        });
        PFacil.add(LF9);
        LF9.setBounds(10, 190, 80, 80);

        LF10.setForeground(new java.awt.Color(30, 30, 30));
        LF10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LF10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF10MouseClicked(evt);
            }
        });
        PFacil.add(LF10);
        LF10.setBounds(100, 190, 80, 80);

        LF11.setForeground(new java.awt.Color(30, 30, 30));
        LF11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LF11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF11MouseClicked(evt);
            }
        });
        PFacil.add(LF11);
        LF11.setBounds(190, 190, 80, 80);

        LF12.setForeground(new java.awt.Color(30, 30, 30));
        LF12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LF12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF12MouseClicked(evt);
            }
        });
        PFacil.add(LF12);
        LF12.setBounds(280, 190, 80, 80);

        LF13.setForeground(new java.awt.Color(30, 30, 30));
        LF13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LF13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF13MouseClicked(evt);
            }
        });
        PFacil.add(LF13);
        LF13.setBounds(10, 280, 80, 80);

        LF14.setForeground(new java.awt.Color(30, 30, 30));
        LF14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LF14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF14MouseClicked(evt);
            }
        });
        PFacil.add(LF14);
        LF14.setBounds(100, 280, 80, 80);

        LF15.setForeground(new java.awt.Color(30, 30, 30));
        LF15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LF15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF15MouseClicked(evt);
            }
        });
        PFacil.add(LF15);
        LF15.setBounds(190, 280, 80, 80);

        LF16.setForeground(new java.awt.Color(30, 30, 30));
        LF16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LF16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF16MouseClicked(evt);
            }
        });
        PFacil.add(LF16);
        LF16.setBounds(280, 280, 80, 80);

        javax.swing.GroupLayout PBackgroundLayout = new javax.swing.GroupLayout(PBackground);
        PBackground.setLayout(PBackgroundLayout);
        PBackgroundLayout.setHorizontalGroup(
            PBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PFacil, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                    .addComponent(PBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PBackgroundLayout.setVerticalGroup(
            PBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PFacil, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BJugarActionPerformed
        if (rutaArr[0][0] == null) {
            cargarImagenEtiqueta();
            BJugar.setText("Jugar");
        } else {
            voltearCartas();
            BJugar.setText("Jugando");
            BJugar.setEnabled(false);
        }
    }//GEN-LAST:event_BJugarActionPerformed

    private void LF1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF1MouseClicked
        mostrarImagen(Integer.parseInt(LF1.getText()) - 1);
    }//GEN-LAST:event_LF1MouseClicked

    private void LF2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF2MouseClicked
        mostrarImagen(Integer.parseInt(LF2.getText()) - 1);
    }//GEN-LAST:event_LF2MouseClicked

    private void LF3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF3MouseClicked
        mostrarImagen(Integer.parseInt(LF3.getText()) - 1);
    }//GEN-LAST:event_LF3MouseClicked

    private void LF4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF4MouseClicked
        mostrarImagen(Integer.parseInt(LF4.getText()) - 1);
    }//GEN-LAST:event_LF4MouseClicked

    private void LF5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF5MouseClicked
        mostrarImagen(Integer.parseInt(LF5.getText()) - 1);
    }//GEN-LAST:event_LF5MouseClicked

    private void LF6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF6MouseClicked
        mostrarImagen(Integer.parseInt(LF6.getText()) - 1);
    }//GEN-LAST:event_LF6MouseClicked

    private void LF7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF7MouseClicked
        mostrarImagen(Integer.parseInt(LF7.getText()) - 1);
    }//GEN-LAST:event_LF7MouseClicked

    private void LF8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF8MouseClicked
        mostrarImagen(Integer.parseInt(LF8.getText()) - 1);
    }//GEN-LAST:event_LF8MouseClicked

    private void LF9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF9MouseClicked
        mostrarImagen(Integer.parseInt(LF9.getText()) - 1);
    }//GEN-LAST:event_LF9MouseClicked

    private void LF10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF10MouseClicked
        mostrarImagen(Integer.parseInt(LF10.getText()) - 1);
    }//GEN-LAST:event_LF10MouseClicked

    private void LF11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF11MouseClicked
        mostrarImagen(Integer.parseInt(LF11.getText()) - 1);
    }//GEN-LAST:event_LF11MouseClicked

    private void LF12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF12MouseClicked
        mostrarImagen(Integer.parseInt(LF12.getText()) - 1);
    }//GEN-LAST:event_LF12MouseClicked

    private void LF13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF13MouseClicked
        mostrarImagen(Integer.parseInt(LF13.getText()) - 1);
    }//GEN-LAST:event_LF13MouseClicked

    private void LF14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF14MouseClicked
        mostrarImagen(Integer.parseInt(LF14.getText()) - 1);
    }//GEN-LAST:event_LF14MouseClicked

    private void LF15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF15MouseClicked
        mostrarImagen(Integer.parseInt(LF15.getText()) - 1);
    }//GEN-LAST:event_LF15MouseClicked

    private void LF16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF16MouseClicked
        mostrarImagen(Integer.parseInt(LF16.getText()) - 1);
    }//GEN-LAST:event_LF16MouseClicked

    private void BCompararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCompararActionPerformed
        if (clicks == 2) {
            if (numeroCarta[0] != numeroCarta[1]) {
                if (comparacion[0].equals(comparacion[1])) {
                    etiquetas.get(numeroCarta[0]).setVisible(false);
                    etiquetas.get(numeroCarta[1]).setVisible(false);
                    aciertos++;
                    LAciertos.setText("" + aciertos);
                    if (aciertos == totalPares) {
                        gameOver();
                    }
                } else {
                    voltearCartas();
                    fallos++;
                    LFallos.setText("" + fallos);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No puedes escojer la misma carta.", "Advertencia", 2);
                voltearCartas();
            }
            BComparar.setEnabled(false);
            clicks = 0;
        }
    }//GEN-LAST:event_BCompararActionPerformed

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
            java.util.logging.Logger.getLogger(FFacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FFacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FFacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FFacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FFacil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BComparar;
    private javax.swing.JButton BJugar;
    private javax.swing.JLabel LAciertos;
    private javax.swing.JLabel LF1;
    private javax.swing.JLabel LF10;
    private javax.swing.JLabel LF11;
    private javax.swing.JLabel LF12;
    private javax.swing.JLabel LF13;
    private javax.swing.JLabel LF14;
    private javax.swing.JLabel LF15;
    private javax.swing.JLabel LF16;
    private javax.swing.JLabel LF2;
    private javax.swing.JLabel LF3;
    private javax.swing.JLabel LF4;
    private javax.swing.JLabel LF5;
    private javax.swing.JLabel LF6;
    private javax.swing.JLabel LF7;
    private javax.swing.JLabel LF8;
    private javax.swing.JLabel LF9;
    private javax.swing.JLabel LFallos;
    private javax.swing.JPanel PBackground;
    private javax.swing.JPanel PBoard;
    private javax.swing.JPanel PFacil;
    // End of variables declaration//GEN-END:variables
}
