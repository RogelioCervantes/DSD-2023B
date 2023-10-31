import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author RCC
 */
public class Cliente implements Runnable {

    private int puerto;
    private String[] registro;

    public Cliente(int puerto, String[] registro) {
        this.puerto = puerto;
        this.registro = registro;
    }

    @Override
    public void run() {
        // Host del servidor
        final String HOST = "127.0.0.1"; // local host
        DataOutputStream out;

        try {
            Socket sc = new Socket(HOST, puerto);
            out = new DataOutputStream(sc.getOutputStream());

            // Se manda el mensaje al servidor
            for (int i = 0; i < registro.length; i++) {
                out.writeUTF(registro[i]);
            }
            
            sc.close();

        } catch (IOException e) {
            System.out.println("Algo salio mal: " + e);
        }

    }
}
