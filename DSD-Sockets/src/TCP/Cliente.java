package TCP;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

/**
 *
 * @author RCC
 */
public class Cliente {
    
    public static void main(String[] args) {
        
        final String HOST = "127.0.0.1";
        final int PUERTO = 5000;
        DataInputStream in;
        DataOutputStream out;
        
        try {
            Socket sc = new Socket(HOST, PUERTO);
            
            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());
            
            // Se manda el mensaje al servidor
            out.writeUTF("Este es el cliente");
            
            // Se lee el mensaje del servidor
            String mensaje = in.readUTF();
            
            System.out.println(mensaje);
            
            sc.close();
            
        } catch (Exception e) {
            System.out.println("Algo salio mal: " + e);
        }
        
    }
    
}
