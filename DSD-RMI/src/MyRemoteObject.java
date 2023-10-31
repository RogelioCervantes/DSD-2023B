import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author RCC
 */
public class MyRemoteObject extends UnicastRemoteObject implements MyRemoteInterface {
    public MyRemoteObject() throws RemoteException {
    }

    public String sayHello() throws RemoteException {
        return "Hola desde el objeto remoto!";
    }
}
