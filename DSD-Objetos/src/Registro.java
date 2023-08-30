
import javax.swing.JLabel;


// @author Rogelio Cervantes Castellon

public class Registro {
    
    JLabel etiqueta;
    boolean ocupado;
    boolean seleccionado;
    String[] datos;

    public Registro(JLabel etiqueta, boolean ocupado, boolean seleccionado, String[] datos) {
        this.etiqueta = etiqueta;
        this.ocupado = ocupado;
        this.seleccionado = seleccionado;
        this.datos = datos;
    }    
}
