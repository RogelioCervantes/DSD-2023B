package TCP;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author RCC
 */
public class Servidor {
    
    public static void main(String[] args) {
        ServerSocket servidor = null;
        Socket sc = null;
        DataInputStream in;
        DataOutputStream out;
        
        final int PUERTO = 5000;
        
        try {
            servidor = new ServerSocket(PUERTO);
            System.out.println("Servidor iniciado");
            
            // La idea es que el servidor siempre este atento a las peticiones de los clientes
            while (true) {
                // El accept() espera por la peticion
                sc = servidor.accept();
                
                System.out.println("Cliente conectado");
                
                // 'in' es para leer los mensajes del cliente y 'out' es la salida del servidor (?)
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());
                
                // Espera por el mensaje
                String mensaje = in.readUTF();
                
                System.out.println(mensaje);
                
                out.writeUTF("Este es el servidor");
                
                sc.close(); // Se cierra el cliente
                System.out.println("Cliente desconectado");
            }
            
        } catch (Exception e) {
            System.out.println("Algo salio mal: " + e);
        }
    }
}
