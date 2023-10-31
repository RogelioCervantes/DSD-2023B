import java.rmi.Naming;
/**
 *
 * @author RCC
 */
public class MyClient {
    public static void main(String[] args) {
        try {
            MyRemoteInterface remoteObject = (MyRemoteInterface) Naming.lookup("rmi://localhost/MyRemoteObject");
            String response = remoteObject.sayHello();
            System.out.println("Respuesta del servidor: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
