

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

/**
 *
 * @author RCC
 */
public class Cliente implements Runnable {

    private int puerto;
    private String mensaje;
    private String host;

    public Cliente(int puerto, String mensaje) {
        this.puerto = puerto;
        this.mensaje = mensaje;
    }
    
    public Cliente(int puerto, String mensaje, String host) {
        this.puerto = puerto;
        this.mensaje = mensaje;
        this.host = host;
    }

    @Override
    public void run() {
        // Host del servidor
        host = "127.0.0.1"; // local host
        DataOutputStream out;

        try {
            Socket sc = new Socket(host, puerto);
            out = new DataOutputStream(sc.getOutputStream());

            // Se manda el mensaje al servidor
            out.writeUTF(mensaje);

            sc.close();

        } catch (Exception e) {
            System.out.println("Algo salio mal: " + e);
        }

    }
}
