package Socket;

import java.net.*;
import java.io.*;
/**
 *
 * @author RCC
 */
public class ClienteSocket {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 1234);
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        out.println("Hola, servidor!");
        String respuesta = in.readLine();
        System.out.println("Respuesta del servidor: " + respuesta);
        s.close();
    }
}

