package RPC;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author RCC
 */

public class ServidorRPC {
    public static void main(String[] args) throws Exception {
        ImplementacionRPC obj = new ImplementacionRPC();
        Registry registry = LocateRegistry.createRegistry(1234);
        registry.bind("ObjetoSaludo", obj);
    }
}

