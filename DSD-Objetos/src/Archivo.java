
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Properties;
import javax.swing.JOptionPane;

// @author Rogelio Cervantes Castellon

public class Archivo {

    String[] datosArr = {"Etiqueta", "Nombre", "Telefono", "Tipo-de-sangre", "Edad"};
    String diagonalInvertida = File.separator;
    String ubicacionArchivo = System.getProperty("user.dir") + diagonalInvertida + "Registros" + diagonalInvertida;
    File contenedor = new File(ubicacionArchivo);
    
    public String[] nombreRegistros() {
        File[] archivosEnCarpeta = contenedor.listFiles();
        int cantidadArchivos = archivosEnCarpeta.length;
        String[] nombreArchivos = new String[cantidadArchivos];
        
        for (int i = 0; i < archivosEnCarpeta.length; i++) {
            nombreArchivos[i] = archivosEnCarpeta[i].getName();
        }
        
        return nombreArchivos;
    }

    public void guardarRegistro(String[] registro, String etiqueta) {
        try {
            FileWriter crearArchivoTexto = new FileWriter(ubicacionArchivo + etiqueta + ".txt");
            PrintWriter escribirDatos = new PrintWriter(crearArchivoTexto);

            for (int i = 0; i < datosArr.length; i++) escribirDatos.println(datosArr[i] + " : " + registro[i]);
            
            escribirDatos.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en guardarRegistro(): " + e, "!!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String[] leerRegistro(String codigoRegistro) {
        String[] datosUsuarios = new String[5];
        try {
            File url = new File(ubicacionArchivo + codigoRegistro);
            FileInputStream leerArchivo = new FileInputStream(url);
            Properties leerDatos = new Properties();
            leerDatos.load(leerArchivo);
            
            for (int i = 0; i < 5; i++) datosUsuarios[i] = leerDatos.getProperty(datosArr[i]);
            
                        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en leerRegistro(): " + e, "!!!", JOptionPane.ERROR_MESSAGE);
        }
        
        return datosUsuarios;
    }
}
