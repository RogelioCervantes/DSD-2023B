import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
/**
 *
 * @author RCC
 */
public class MyServer {
    public static void main(String[] args) {
        try {
            MyRemoteInterface remoteObject = new MyRemoteObject();
            LocateRegistry.createRegistry(1099); // Puerto por defecto para RMI
            Naming.rebind("MyRemoteObject", remoteObject);
            System.out.println("Servidor listo.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
