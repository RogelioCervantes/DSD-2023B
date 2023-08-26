
import javax.swing.JLabel;


// @author Rogelio Cervantes Castellon

public class Registro {
    
    private JLabel etiqueta;
    private boolean ocupado;
    private String[] datos;
    
    public Registro(JLabel etiqueta, boolean ocupado, String[] datos) {
        this.etiqueta = etiqueta;
        this.ocupado = ocupado;
        this.datos = datos;
    }

    public JLabel getEtiqueta() {
        return etiqueta;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public String[] getDatos() {
        return datos;
    }

    public void setEtiqueta(JLabel etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public void setDatos(String[] datos) {
        this.datos = datos;
    }
}
