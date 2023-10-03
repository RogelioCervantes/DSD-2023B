package RPC;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author RCC
 */

public interface InterfazRPC extends Remote {
    String saludo(String nombre) throws RemoteException;
}