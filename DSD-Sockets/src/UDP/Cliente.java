package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author RCC
 */
public class Cliente {
    public static void main(String[] args) {
        final int PUERTO_S = 5060;
        byte[] buffer = new byte[1024];
        
        try {
            InetAddress direccion_S = InetAddress.getByName("localhost"); // Es la direccion del servidor
            DatagramSocket sUDP = new DatagramSocket();
            
            String mensaje = "Este es el cliente";
            
            buffer = mensaje.getBytes();
            
            // Esto se manda al servidor
            DatagramPacket peticion = new DatagramPacket(buffer, buffer.length, direccion_S, PUERTO_S);
            sUDP.send(peticion);
            System.out.println("Datagrama enviado");
            
            // Esto se recibe del servidor 
            DatagramPacket respuesta = new DatagramPacket(buffer, buffer.length);
            sUDP.receive(respuesta);
            System.out.println("Respuesta recivida");
            
            mensaje = new String(peticion.getData());
            System.out.println(mensaje);
            
            sUDP.close();
            
        } catch (Exception e) {
            System.out.println("Algo salio mal: " + e);
        }
    }
}
