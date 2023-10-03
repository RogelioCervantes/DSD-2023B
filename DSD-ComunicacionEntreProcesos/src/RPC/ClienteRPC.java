package RPC;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author thero
 */

public class ClienteRPC {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.getRegistry("localhost", 1234);
        InterfazRPC stub = (InterfazRPC) registry.lookup("ObjetoSaludo");
        String respuesta = stub.saludo("cliente");
        System.out.println("Respuesta del servidor: " + respuesta);
    }
}

