package Datagrama;

import java.net.*;

/**
 *
 * @author RCC
 */
public class ServidorDatagrama {
    public static void main(String[] args) throws Exception {
        byte[] buffer = new byte[1024];
        DatagramSocket ds = new DatagramSocket(1234);
        DatagramPacket dp = new DatagramPacket(buffer, 1024);
        ds.receive(dp);
        String mensaje = new String(dp.getData(), 0, dp.getLength());
        System.out.println("Mensaje del cliente: " + mensaje);
        ds.close();
    }
}

