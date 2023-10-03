import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;

/**
 *
 * @author RCC
 */
public class Servidor extends Observable implements Runnable {

    private int puerto;

    public Servidor(int puerto) {
        this.puerto = puerto;
    }
    
    @Override
    public void run() {
        ServerSocket servidor = null;
        Socket sc = null;
        DataInputStream in;

        try {
            servidor = new ServerSocket(puerto);
            System.out.println("Servidor iniciado");
            
            while (true) {
                sc = servidor.accept();

                System.out.println("Cliente conectado");

                in = new DataInputStream(sc.getInputStream());
                
                String mensaje = in.readUTF();

                System.out.println(mensaje);
                
                this.setChanged();
                this.notifyObservers(mensaje);
                this.clearChanged();                
                
                sc.close(); // Se cierra el cliente
                System.out.println("Cliente desconectado");
            }

        } catch (Exception e) {
            System.out.println("Algo salio mal: " + e);
        }
    }

}
