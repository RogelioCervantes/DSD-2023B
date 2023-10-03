package RPC;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author RCC
 */

public class ImplementacionRPC extends UnicastRemoteObject implements InterfazRPC {
    protected ImplementacionRPC() throws RemoteException {
    }

    public String saludo(String nombre) throws RemoteException {
        return "Hola, " + nombre + "!";
    }
}

