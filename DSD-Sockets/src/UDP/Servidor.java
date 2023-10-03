package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author RCC
 */
public class Servidor {

    public static void main(String[] args) {
        final int PUERTO = 5060;
        byte[] buffer = new byte[1024];

        try {
            DatagramSocket sUDP = new DatagramSocket(PUERTO);
            System.out.println("Servidor UDP iniciado");

            while (true) {
                // Se recibe la peticion siempre y cuando no sobre pase el limite del buffer
                DatagramPacket peticion = new DatagramPacket(buffer, buffer.length);

                // Aqui el cliente se conecta con el servidor
                sUDP.receive(peticion);
                System.out.println("Informacion del cliente recibida");

                // Se imprime el mensaje del cliente
                String mensaje = new String(peticion.getData()); // Se hace un string a partir del buffer
                System.out.println(mensaje);

                int puertoCliente = peticion.getPort(); // Toma el puerto del cliente
                InetAddress direccion = peticion.getAddress(); // Toma la IP (?)

                mensaje = "Este es el servidor";
                buffer = mensaje.getBytes();

                // Manda una respuesta de vuelta usando la informacion del mismo cliente
                DatagramPacket respuesta = new DatagramPacket(buffer, buffer.length, direccion, puertoCliente);
                sUDP.send(respuesta);
                System.out.println("Respuesta enviada");
            }

        } catch (Exception e) {
            System.out.println("Algo salio mal: " + e);
        }
    }
}
