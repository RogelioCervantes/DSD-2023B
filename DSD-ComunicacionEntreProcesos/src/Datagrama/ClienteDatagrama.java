package Datagrama;

import java.net.*;

/**
 *
 * @author RCC
 */
public class ClienteDatagrama {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        String mensaje = "Hola, servidor!";
        InetAddress ia = InetAddress.getByName("localhost");
        DatagramPacket dp = new DatagramPacket(mensaje.getBytes(), mensaje.length(), ia, 1234);
        ds.send(dp);
        ds.close();
    }
}

