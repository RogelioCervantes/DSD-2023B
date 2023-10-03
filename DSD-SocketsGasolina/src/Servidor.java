import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author RCC
 */
public class Servidor implements Runnable {
    
    private ArrayList<Socket> clientes;
    private int puerto;

    public Servidor(int puerto) {
        this.puerto = puerto;
        this.clientes = new ArrayList();
    }
    
    @Override
    public void run() {
        ServerSocket servidor = null;
        Socket sc = null;

        try {
            servidor = new ServerSocket(puerto);
            System.out.println("Servidor iniciado");
            
            while (true) {
                sc = servidor.accept();
                
                System.out.println("Cliente conectado");
                
                clientes.add(sc);
            }

        } catch (IOException e) {
            System.out.println("Algo salio mal: " + e);
        }
    }

    public void enviarInfo(String[] nombres, double[] valores) {
        for (Socket sc: clientes) {
            try {
                DataOutputStream dos = new DataOutputStream(sc.getOutputStream());
                for (int i = 0; i < valores.length; i++) {
                    dos.writeUTF(nombres[i]);
                    dos.writeDouble(valores[i]);
                }
            } catch (IOException e) {
                System.out.println("Algo salio mal" + e);
            }
        }
    }
}
