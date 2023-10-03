package Socket;

import java.net.*;
import java.io.*;
/**
 *
 * @author RCC
 */
public class ServidorSocket {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1234);
        Socket s = ss.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        String mensaje = in.readLine();
        System.out.println("Mensaje del cliente: " + mensaje);
        out.println("Hola, cliente!");
        s.close();
    }
}