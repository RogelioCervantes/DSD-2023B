import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author RCC
 */
public interface MyRemoteInterface extends Remote {
    public String sayHello() throws RemoteException;
}
