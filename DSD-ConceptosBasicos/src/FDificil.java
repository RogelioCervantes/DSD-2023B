
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
public class FDificil extends javax.swing.JFrame {

    int totalPares = 32;
    ImageIcon icon = new ImageIcon(getClass().getResource("/img/icons/voidcat_logo.png"));
    ArrayList<JLabel> etiquetas = new ArrayList();
    SecureRandom numeroAleatorio = new SecureRandom();
    String[] imgArr = new String[totalPares];
    String[] comparacion = new String[2];
    String[][] rutaArr = new String[8][8];
    int[] nums = new int[totalPares];
    int[] numeroCarta = new int[2];
    int clicks = 0;
    int aciertos = 0;
    int fallos = 0;

    public FDificil() {
        initComponents();
        setLocationRelativeTo(this);
        setIconImage(icon.getImage());
        setTitle("Memorama - Dificil");
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
        etiquetas.add(LF17);
        etiquetas.add(LF18);
        etiquetas.add(LF19);
        etiquetas.add(LF20);
        etiquetas.add(LF21);
        etiquetas.add(LF22);
        etiquetas.add(LF23);
        etiquetas.add(LF24);
        etiquetas.add(LF25);
        etiquetas.add(LF26);
        etiquetas.add(LF27);
        etiquetas.add(LF28);
        etiquetas.add(LF29);
        etiquetas.add(LF30);
        etiquetas.add(LF31);
        etiquetas.add(LF32);
        etiquetas.add(LF33);
        etiquetas.add(LF34);
        etiquetas.add(LF35);
        etiquetas.add(LF36);
        etiquetas.add(LF37);
        etiquetas.add(LF38);
        etiquetas.add(LF39);
        etiquetas.add(LF40);
        etiquetas.add(LF41);
        etiquetas.add(LF42);
        etiquetas.add(LF43);
        etiquetas.add(LF44);
        etiquetas.add(LF45);
        etiquetas.add(LF46);
        etiquetas.add(LF47);
        etiquetas.add(LF48);
        etiquetas.add(LF49);
        etiquetas.add(LF50);
        etiquetas.add(LF51);
        etiquetas.add(LF52);
        etiquetas.add(LF53);
        etiquetas.add(LF54);
        etiquetas.add(LF55);
        etiquetas.add(LF56);
        etiquetas.add(LF57);
        etiquetas.add(LF58);
        etiquetas.add(LF59);
        etiquetas.add(LF60);
        etiquetas.add(LF61);
        etiquetas.add(LF62);
        etiquetas.add(LF63);
        etiquetas.add(LF64);
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
                if (numCarta >= 0 && numCarta <= 7) {
                    comparacion[clicks] = rutaArr[0][numCarta];
                    etiquetas.get(numCarta).setIcon(new ImageIcon(getClass().getResource(rutaArr[0][numCarta])));
                } else if (numCarta >= 8 && numCarta <= 15) {
                    comparacion[clicks] = rutaArr[1][numCarta - 8];
                    etiquetas.get(numCarta).setIcon(new ImageIcon(getClass().getResource(rutaArr[1][numCarta - 8])));
                } else if (numCarta >= 16 && numCarta <= 23) {
                    comparacion[clicks] = rutaArr[2][numCarta - 16];
                    etiquetas.get(numCarta).setIcon(new ImageIcon(getClass().getResource(rutaArr[2][numCarta - 16])));
                } else if (numCarta >= 24 && numCarta <= 27) {
                    comparacion[clicks] = rutaArr[3][numCarta - 24];
                    etiquetas.get(numCarta).setIcon(new ImageIcon(getClass().getResource(rutaArr[3][numCarta - 24])));
                } else if (numCarta >= 32 && numCarta <= 39) {
                    comparacion[clicks] = rutaArr[4][numCarta - 32];
                    etiquetas.get(numCarta).setIcon(new ImageIcon(getClass().getResource(rutaArr[4][numCarta - 32])));
                } else if (numCarta >= 40 && numCarta <= 47) {
                    comparacion[clicks] = rutaArr[5][numCarta - 40];
                    etiquetas.get(numCarta).setIcon(new ImageIcon(getClass().getResource(rutaArr[5][numCarta - 40])));
                } else if (numCarta >= 48 && numCarta <= 55) {
                    comparacion[clicks] = rutaArr[6][numCarta - 48];
                    etiquetas.get(numCarta).setIcon(new ImageIcon(getClass().getResource(rutaArr[6][numCarta - 48])));
                } else if (numCarta >= 56 && numCarta <= 63) {
                    comparacion[clicks] = rutaArr[7][numCarta - 56];
                    etiquetas.get(numCarta).setIcon(new ImageIcon(getClass().getResource(rutaArr[7][numCarta - 56])));
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
        
        if (fallos == 0) mensaje = "¡Perfecto!";
        else if (fallos < aciertos) mensaje = "¡Muy bien!";
        else if (fallos == aciertos) mensaje = "Regular";
        else mensaje = "GIT GUD";
        
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
        LF17 = new javax.swing.JLabel();
        LF18 = new javax.swing.JLabel();
        LF19 = new javax.swing.JLabel();
        LF20 = new javax.swing.JLabel();
        LF21 = new javax.swing.JLabel();
        LF22 = new javax.swing.JLabel();
        LF23 = new javax.swing.JLabel();
        LF24 = new javax.swing.JLabel();
        LF25 = new javax.swing.JLabel();
        LF26 = new javax.swing.JLabel();
        LF27 = new javax.swing.JLabel();
        LF28 = new javax.swing.JLabel();
        LF29 = new javax.swing.JLabel();
        LF30 = new javax.swing.JLabel();
        LF31 = new javax.swing.JLabel();
        LF32 = new javax.swing.JLabel();
        LF33 = new javax.swing.JLabel();
        LF34 = new javax.swing.JLabel();
        LF35 = new javax.swing.JLabel();
        LF36 = new javax.swing.JLabel();
        LF37 = new javax.swing.JLabel();
        LF38 = new javax.swing.JLabel();
        LF39 = new javax.swing.JLabel();
        LF40 = new javax.swing.JLabel();
        LF41 = new javax.swing.JLabel();
        LF42 = new javax.swing.JLabel();
        LF43 = new javax.swing.JLabel();
        LF44 = new javax.swing.JLabel();
        LF45 = new javax.swing.JLabel();
        LF46 = new javax.swing.JLabel();
        LF47 = new javax.swing.JLabel();
        LF48 = new javax.swing.JLabel();
        LF49 = new javax.swing.JLabel();
        LF50 = new javax.swing.JLabel();
        LF51 = new javax.swing.JLabel();
        LF52 = new javax.swing.JLabel();
        LF53 = new javax.swing.JLabel();
        LF54 = new javax.swing.JLabel();
        LF55 = new javax.swing.JLabel();
        LF56 = new javax.swing.JLabel();
        LF57 = new javax.swing.JLabel();
        LF58 = new javax.swing.JLabel();
        LF59 = new javax.swing.JLabel();
        LF60 = new javax.swing.JLabel();
        LF61 = new javax.swing.JLabel();
        LF62 = new javax.swing.JLabel();
        LF63 = new javax.swing.JLabel();
        LF64 = new javax.swing.JLabel();
        BJugar = new javax.swing.JButton();
        BComparar = new javax.swing.JButton();
        LAciertos = new javax.swing.JLabel();
        LFallos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(29, 29, 29));
        setResizable(false);

        PBackground.setBackground(new java.awt.Color(29, 29, 29));

        PFacil.setBackground(new java.awt.Color(29, 29, 29));
        PFacil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PFacil.setLayout(null);

        LF1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF1MouseClicked(evt);
            }
        });
        PFacil.add(LF1);
        LF1.setBounds(10, 10, 80, 80);

        LF2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF2MouseClicked(evt);
            }
        });
        PFacil.add(LF2);
        LF2.setBounds(100, 10, 80, 80);

        LF3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF3MouseClicked(evt);
            }
        });
        PFacil.add(LF3);
        LF3.setBounds(190, 10, 80, 80);

        LF4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF4MouseClicked(evt);
            }
        });
        PFacil.add(LF4);
        LF4.setBounds(280, 10, 80, 80);

        LF5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF5MouseClicked(evt);
            }
        });
        PFacil.add(LF5);
        LF5.setBounds(370, 10, 80, 80);

        LF6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF6MouseClicked(evt);
            }
        });
        PFacil.add(LF6);
        LF6.setBounds(460, 10, 80, 80);

        LF7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF7MouseClicked(evt);
            }
        });
        PFacil.add(LF7);
        LF7.setBounds(550, 10, 80, 80);

        LF8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF8MouseClicked(evt);
            }
        });
        PFacil.add(LF8);
        LF8.setBounds(640, 10, 80, 80);

        LF9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF9MouseClicked(evt);
            }
        });
        PFacil.add(LF9);
        LF9.setBounds(10, 100, 80, 80);

        LF10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF10MouseClicked(evt);
            }
        });
        PFacil.add(LF10);
        LF10.setBounds(100, 100, 80, 80);

        LF11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF11MouseClicked(evt);
            }
        });
        PFacil.add(LF11);
        LF11.setBounds(190, 100, 80, 80);

        LF12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF12MouseClicked(evt);
            }
        });
        PFacil.add(LF12);
        LF12.setBounds(280, 100, 80, 80);

        LF13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF13MouseClicked(evt);
            }
        });
        PFacil.add(LF13);
        LF13.setBounds(370, 100, 80, 80);

        LF14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF14MouseClicked(evt);
            }
        });
        PFacil.add(LF14);
        LF14.setBounds(460, 100, 80, 80);

        LF15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF15MouseClicked(evt);
            }
        });
        PFacil.add(LF15);
        LF15.setBounds(550, 100, 80, 80);

        LF16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF16MouseClicked(evt);
            }
        });
        PFacil.add(LF16);
        LF16.setBounds(640, 100, 80, 80);

        LF17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF17MouseClicked(evt);
            }
        });
        PFacil.add(LF17);
        LF17.setBounds(10, 190, 80, 80);

        LF18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF18MouseClicked(evt);
            }
        });
        PFacil.add(LF18);
        LF18.setBounds(100, 190, 80, 80);

        LF19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF19MouseClicked(evt);
            }
        });
        PFacil.add(LF19);
        LF19.setBounds(190, 190, 80, 80);

        LF20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF20MouseClicked(evt);
            }
        });
        PFacil.add(LF20);
        LF20.setBounds(280, 190, 80, 80);

        LF21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF21MouseClicked(evt);
            }
        });
        PFacil.add(LF21);
        LF21.setBounds(370, 190, 80, 80);

        LF22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF22MouseClicked(evt);
            }
        });
        PFacil.add(LF22);
        LF22.setBounds(460, 190, 80, 80);

        LF23.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF23MouseClicked(evt);
            }
        });
        PFacil.add(LF23);
        LF23.setBounds(550, 190, 80, 80);

        LF24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF24MouseClicked(evt);
            }
        });
        PFacil.add(LF24);
        LF24.setBounds(640, 190, 80, 80);

        LF25.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF25MouseClicked(evt);
            }
        });
        PFacil.add(LF25);
        LF25.setBounds(10, 280, 80, 80);

        LF26.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF26MouseClicked(evt);
            }
        });
        PFacil.add(LF26);
        LF26.setBounds(100, 280, 80, 80);

        LF27.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF27MouseClicked(evt);
            }
        });
        PFacil.add(LF27);
        LF27.setBounds(190, 280, 80, 80);

        LF28.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF28MouseClicked(evt);
            }
        });
        PFacil.add(LF28);
        LF28.setBounds(280, 280, 80, 80);

        LF29.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF29MouseClicked(evt);
            }
        });
        PFacil.add(LF29);
        LF29.setBounds(370, 280, 80, 80);

        LF30.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF30MouseClicked(evt);
            }
        });
        PFacil.add(LF30);
        LF30.setBounds(460, 280, 80, 80);

        LF31.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF31MouseClicked(evt);
            }
        });
        PFacil.add(LF31);
        LF31.setBounds(550, 280, 80, 80);

        LF32.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF32MouseClicked(evt);
            }
        });
        PFacil.add(LF32);
        LF32.setBounds(640, 280, 80, 80);

        LF33.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF33MouseClicked(evt);
            }
        });
        PFacil.add(LF33);
        LF33.setBounds(10, 370, 80, 80);

        LF34.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF34MouseClicked(evt);
            }
        });
        PFacil.add(LF34);
        LF34.setBounds(100, 370, 80, 80);

        LF35.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF35MouseClicked(evt);
            }
        });
        PFacil.add(LF35);
        LF35.setBounds(190, 370, 80, 80);

        LF36.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF36MouseClicked(evt);
            }
        });
        PFacil.add(LF36);
        LF36.setBounds(280, 370, 80, 80);

        LF37.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF37MouseClicked(evt);
            }
        });
        PFacil.add(LF37);
        LF37.setBounds(370, 370, 80, 80);

        LF38.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF38MouseClicked(evt);
            }
        });
        PFacil.add(LF38);
        LF38.setBounds(460, 370, 80, 80);

        LF39.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF39MouseClicked(evt);
            }
        });
        PFacil.add(LF39);
        LF39.setBounds(550, 370, 80, 80);

        LF40.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF40MouseClicked(evt);
            }
        });
        PFacil.add(LF40);
        LF40.setBounds(640, 370, 80, 80);

        LF41.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF41MouseClicked(evt);
            }
        });
        PFacil.add(LF41);
        LF41.setBounds(10, 460, 80, 80);

        LF42.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF42MouseClicked(evt);
            }
        });
        PFacil.add(LF42);
        LF42.setBounds(100, 460, 80, 80);

        LF43.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF43MouseClicked(evt);
            }
        });
        PFacil.add(LF43);
        LF43.setBounds(190, 460, 80, 80);

        LF44.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF44MouseClicked(evt);
            }
        });
        PFacil.add(LF44);
        LF44.setBounds(280, 460, 80, 80);

        LF45.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF45MouseClicked(evt);
            }
        });
        PFacil.add(LF45);
        LF45.setBounds(370, 460, 80, 80);

        LF46.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF46MouseClicked(evt);
            }
        });
        PFacil.add(LF46);
        LF46.setBounds(460, 460, 80, 80);

        LF47.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF47MouseClicked(evt);
            }
        });
        PFacil.add(LF47);
        LF47.setBounds(550, 460, 80, 80);

        LF48.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF48MouseClicked(evt);
            }
        });
        PFacil.add(LF48);
        LF48.setBounds(640, 460, 80, 80);

        LF49.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF49MouseClicked(evt);
            }
        });
        PFacil.add(LF49);
        LF49.setBounds(10, 550, 80, 80);

        LF50.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF50MouseClicked(evt);
            }
        });
        PFacil.add(LF50);
        LF50.setBounds(100, 550, 80, 80);

        LF51.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF51MouseClicked(evt);
            }
        });
        PFacil.add(LF51);
        LF51.setBounds(190, 550, 80, 80);

        LF52.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF52MouseClicked(evt);
            }
        });
        PFacil.add(LF52);
        LF52.setBounds(280, 550, 80, 80);

        LF53.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF53MouseClicked(evt);
            }
        });
        PFacil.add(LF53);
        LF53.setBounds(370, 550, 80, 80);

        LF54.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF54MouseClicked(evt);
            }
        });
        PFacil.add(LF54);
        LF54.setBounds(460, 550, 80, 80);

        LF55.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF55MouseClicked(evt);
            }
        });
        PFacil.add(LF55);
        LF55.setBounds(550, 550, 80, 80);

        LF56.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF56MouseClicked(evt);
            }
        });
        PFacil.add(LF56);
        LF56.setBounds(640, 550, 80, 80);

        LF57.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF57MouseClicked(evt);
            }
        });
        PFacil.add(LF57);
        LF57.setBounds(10, 640, 80, 80);

        LF58.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF58MouseClicked(evt);
            }
        });
        PFacil.add(LF58);
        LF58.setBounds(100, 640, 80, 80);

        LF59.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF59MouseClicked(evt);
            }
        });
        PFacil.add(LF59);
        LF59.setBounds(190, 640, 80, 80);

        LF60.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF60MouseClicked(evt);
            }
        });
        PFacil.add(LF60);
        LF60.setBounds(280, 640, 80, 80);

        LF61.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF61MouseClicked(evt);
            }
        });
        PFacil.add(LF61);
        LF61.setBounds(370, 640, 80, 80);

        LF62.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF62MouseClicked(evt);
            }
        });
        PFacil.add(LF62);
        LF62.setBounds(460, 640, 80, 80);

        LF63.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF63MouseClicked(evt);
            }
        });
        PFacil.add(LF63);
        LF63.setBounds(550, 640, 80, 80);

        LF64.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LF64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LF64MouseClicked(evt);
            }
        });
        PFacil.add(LF64);
        LF64.setBounds(640, 640, 80, 80);

        BJugar.setBackground(new java.awt.Color(239, 0, 62));
        BJugar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BJugar.setForeground(new java.awt.Color(255, 255, 255));
        BJugar.setText("Mostrar / Jugar");
        BJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BJugarActionPerformed(evt);
            }
        });

        BComparar.setBackground(new java.awt.Color(239, 0, 62));
        BComparar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BComparar.setForeground(new java.awt.Color(255, 255, 255));
        BComparar.setText("Comparar");
        BComparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCompararActionPerformed(evt);
            }
        });

        LAciertos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LAciertos.setForeground(new java.awt.Color(255, 255, 255));
        LAciertos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LAciertos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 0, 62)), "Aciertos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        LFallos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LFallos.setForeground(new java.awt.Color(255, 255, 255));
        LFallos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LFallos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 0, 62)), "Fallos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        javax.swing.GroupLayout PBackgroundLayout = new javax.swing.GroupLayout(PBackground);
        PBackground.setLayout(PBackgroundLayout);
        PBackgroundLayout.setHorizontalGroup(
            PBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PFacil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PBackgroundLayout.createSequentialGroup()
                        .addGroup(PBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BComparar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 378, Short.MAX_VALUE)
                        .addComponent(LAciertos, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LFallos, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PBackgroundLayout.setVerticalGroup(
            PBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PBackgroundLayout.createSequentialGroup()
                        .addComponent(BJugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BComparar))
                    .addComponent(LAciertos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LFallos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PFacil, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
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
            //BJugar.setEnabled(false);
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

    private void LF17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF17MouseClicked
        mostrarImagen(Integer.parseInt(LF17.getText()) - 1);
    }//GEN-LAST:event_LF17MouseClicked

    private void LF18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF18MouseClicked
        mostrarImagen(Integer.parseInt(LF18.getText()) - 1);
    }//GEN-LAST:event_LF18MouseClicked

    private void LF19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF19MouseClicked
        mostrarImagen(Integer.parseInt(LF19.getText()) - 1);
    }//GEN-LAST:event_LF19MouseClicked

    private void LF20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF20MouseClicked
        mostrarImagen(Integer.parseInt(LF20.getText()) - 1);
    }//GEN-LAST:event_LF20MouseClicked

    private void LF21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF21MouseClicked
        mostrarImagen(Integer.parseInt(LF21.getText()) - 1);
    }//GEN-LAST:event_LF21MouseClicked

    private void LF22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF22MouseClicked
        mostrarImagen(Integer.parseInt(LF22.getText()) - 1);
    }//GEN-LAST:event_LF22MouseClicked

    private void LF23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF23MouseClicked
        mostrarImagen(Integer.parseInt(LF23.getText()) - 1);
    }//GEN-LAST:event_LF23MouseClicked

    private void LF24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF24MouseClicked
        mostrarImagen(Integer.parseInt(LF24.getText()) - 1);
    }//GEN-LAST:event_LF24MouseClicked

    private void LF25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF25MouseClicked
        mostrarImagen(Integer.parseInt(LF25.getText()) - 1);
    }//GEN-LAST:event_LF25MouseClicked

    private void LF26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF26MouseClicked
        mostrarImagen(Integer.parseInt(LF26.getText()) - 1);
    }//GEN-LAST:event_LF26MouseClicked

    private void LF27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF27MouseClicked
        mostrarImagen(Integer.parseInt(LF27.getText()) - 1);
    }//GEN-LAST:event_LF27MouseClicked

    private void LF28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF28MouseClicked
        mostrarImagen(Integer.parseInt(LF28.getText()) - 1);
    }//GEN-LAST:event_LF28MouseClicked

    private void LF29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF29MouseClicked
        mostrarImagen(Integer.parseInt(LF29.getText()) - 1);
    }//GEN-LAST:event_LF29MouseClicked

    private void LF30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF30MouseClicked
        mostrarImagen(Integer.parseInt(LF30.getText()) - 1);
    }//GEN-LAST:event_LF30MouseClicked

    private void LF31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF31MouseClicked
        mostrarImagen(Integer.parseInt(LF31.getText()) - 1);
    }//GEN-LAST:event_LF31MouseClicked

    private void LF32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF32MouseClicked
        mostrarImagen(Integer.parseInt(LF32.getText()) - 1);
    }//GEN-LAST:event_LF32MouseClicked

    private void LF33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF33MouseClicked
        mostrarImagen(Integer.parseInt(LF33.getText()) - 1);
    }//GEN-LAST:event_LF33MouseClicked

    private void LF34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF34MouseClicked
        mostrarImagen(Integer.parseInt(LF34.getText()) - 1);
    }//GEN-LAST:event_LF34MouseClicked

    private void LF35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF35MouseClicked
        mostrarImagen(Integer.parseInt(LF35.getText()) - 1);
    }//GEN-LAST:event_LF35MouseClicked

    private void LF36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF36MouseClicked
        mostrarImagen(Integer.parseInt(LF36.getText()) - 1);
    }//GEN-LAST:event_LF36MouseClicked

    private void LF37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF37MouseClicked
        mostrarImagen(Integer.parseInt(LF37.getText()) - 1);
    }//GEN-LAST:event_LF37MouseClicked

    private void LF38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF38MouseClicked
        mostrarImagen(Integer.parseInt(LF38.getText()) - 1);
    }//GEN-LAST:event_LF38MouseClicked

    private void LF39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF39MouseClicked
        mostrarImagen(Integer.parseInt(LF39.getText()) - 1);
    }//GEN-LAST:event_LF39MouseClicked

    private void LF40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF40MouseClicked
        mostrarImagen(Integer.parseInt(LF40.getText()) - 1);
    }//GEN-LAST:event_LF40MouseClicked

    private void LF41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF41MouseClicked
        mostrarImagen(Integer.parseInt(LF41.getText()) - 1);
    }//GEN-LAST:event_LF41MouseClicked

    private void LF42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF42MouseClicked
        mostrarImagen(Integer.parseInt(LF42.getText()) - 1);
    }//GEN-LAST:event_LF42MouseClicked

    private void LF43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF43MouseClicked
        mostrarImagen(Integer.parseInt(LF43.getText()) - 1);
    }//GEN-LAST:event_LF43MouseClicked

    private void LF44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF44MouseClicked
        mostrarImagen(Integer.parseInt(LF44.getText()) - 1);
    }//GEN-LAST:event_LF44MouseClicked

    private void LF45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF45MouseClicked
        mostrarImagen(Integer.parseInt(LF45.getText()) - 1);
    }//GEN-LAST:event_LF45MouseClicked

    private void LF46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF46MouseClicked
        mostrarImagen(Integer.parseInt(LF46.getText()) - 1);
    }//GEN-LAST:event_LF46MouseClicked

    private void LF47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF47MouseClicked
        mostrarImagen(Integer.parseInt(LF47.getText()) - 1);
    }//GEN-LAST:event_LF47MouseClicked

    private void LF48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF48MouseClicked
        mostrarImagen(Integer.parseInt(LF48.getText()) - 1);
    }//GEN-LAST:event_LF48MouseClicked

    private void LF49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF49MouseClicked
        mostrarImagen(Integer.parseInt(LF49.getText()) - 1);
    }//GEN-LAST:event_LF49MouseClicked

    private void LF50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF50MouseClicked
        mostrarImagen(Integer.parseInt(LF50.getText()) - 1);
    }//GEN-LAST:event_LF50MouseClicked

    private void LF51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF51MouseClicked
        mostrarImagen(Integer.parseInt(LF51.getText()) - 1);
    }//GEN-LAST:event_LF51MouseClicked

    private void LF52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF52MouseClicked
        mostrarImagen(Integer.parseInt(LF52.getText()) - 1);
    }//GEN-LAST:event_LF52MouseClicked

    private void LF53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF53MouseClicked
        mostrarImagen(Integer.parseInt(LF53.getText()) - 1);
    }//GEN-LAST:event_LF53MouseClicked

    private void LF54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF54MouseClicked
        mostrarImagen(Integer.parseInt(LF54.getText()) - 1);
    }//GEN-LAST:event_LF54MouseClicked

    private void LF55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF55MouseClicked
        mostrarImagen(Integer.parseInt(LF55.getText()) - 1);
    }//GEN-LAST:event_LF55MouseClicked

    private void LF56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF56MouseClicked
        mostrarImagen(Integer.parseInt(LF56.getText()) - 1);
    }//GEN-LAST:event_LF56MouseClicked

    private void LF57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF57MouseClicked
        mostrarImagen(Integer.parseInt(LF57.getText()) - 1);
    }//GEN-LAST:event_LF57MouseClicked

    private void LF58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF58MouseClicked
        mostrarImagen(Integer.parseInt(LF58.getText()) - 1);
    }//GEN-LAST:event_LF58MouseClicked

    private void LF59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF59MouseClicked
        mostrarImagen(Integer.parseInt(LF59.getText()) - 1);
    }//GEN-LAST:event_LF59MouseClicked

    private void LF60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF60MouseClicked
        mostrarImagen(Integer.parseInt(LF60.getText()) - 1);
    }//GEN-LAST:event_LF60MouseClicked

    private void LF61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF61MouseClicked
        mostrarImagen(Integer.parseInt(LF61.getText()) - 1);
    }//GEN-LAST:event_LF61MouseClicked

    private void LF62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF62MouseClicked
        mostrarImagen(Integer.parseInt(LF62.getText()) - 1);
    }//GEN-LAST:event_LF62MouseClicked

    private void LF63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF63MouseClicked
        mostrarImagen(Integer.parseInt(LF63.getText()) - 1);
    }//GEN-LAST:event_LF63MouseClicked

    private void LF64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LF64MouseClicked
        mostrarImagen(Integer.parseInt(LF64.getText()) - 1);
    }//GEN-LAST:event_LF64MouseClicked

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
    private javax.swing.JLabel LF17;
    private javax.swing.JLabel LF18;
    private javax.swing.JLabel LF19;
    private javax.swing.JLabel LF2;
    private javax.swing.JLabel LF20;
    private javax.swing.JLabel LF21;
    private javax.swing.JLabel LF22;
    private javax.swing.JLabel LF23;
    private javax.swing.JLabel LF24;
    private javax.swing.JLabel LF25;
    private javax.swing.JLabel LF26;
    private javax.swing.JLabel LF27;
    private javax.swing.JLabel LF28;
    private javax.swing.JLabel LF29;
    private javax.swing.JLabel LF3;
    private javax.swing.JLabel LF30;
    private javax.swing.JLabel LF31;
    private javax.swing.JLabel LF32;
    private javax.swing.JLabel LF33;
    private javax.swing.JLabel LF34;
    private javax.swing.JLabel LF35;
    private javax.swing.JLabel LF36;
    private javax.swing.JLabel LF37;
    private javax.swing.JLabel LF38;
    private javax.swing.JLabel LF39;
    private javax.swing.JLabel LF4;
    private javax.swing.JLabel LF40;
    private javax.swing.JLabel LF41;
    private javax.swing.JLabel LF42;
    private javax.swing.JLabel LF43;
    private javax.swing.JLabel LF44;
    private javax.swing.JLabel LF45;
    private javax.swing.JLabel LF46;
    private javax.swing.JLabel LF47;
    private javax.swing.JLabel LF48;
    private javax.swing.JLabel LF49;
    private javax.swing.JLabel LF5;
    private javax.swing.JLabel LF50;
    private javax.swing.JLabel LF51;
    private javax.swing.JLabel LF52;
    private javax.swing.JLabel LF53;
    private javax.swing.JLabel LF54;
    private javax.swing.JLabel LF55;
    private javax.swing.JLabel LF56;
    private javax.swing.JLabel LF57;
    private javax.swing.JLabel LF58;
    private javax.swing.JLabel LF59;
    private javax.swing.JLabel LF6;
    private javax.swing.JLabel LF60;
    private javax.swing.JLabel LF61;
    private javax.swing.JLabel LF62;
    private javax.swing.JLabel LF63;
    private javax.swing.JLabel LF64;
    private javax.swing.JLabel LF7;
    private javax.swing.JLabel LF8;
    private javax.swing.JLabel LF9;
    private javax.swing.JLabel LFallos;
    private javax.swing.JPanel PBackground;
    private javax.swing.JPanel PFacil;
    // End of variables declaration//GEN-END:variables
}
