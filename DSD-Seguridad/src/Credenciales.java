import java.util.Scanner;

/**
 *
 * @author RCC
 */

public class Credenciales {

    public static void main(String[] args) {
        // Credenciales predefinidas
        String nombreUsuario = "usuario";
        String contrasena = "password";

        // Pedir al usuario que ingrese sus credenciales
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre de usuario: ");
        String inputUsuario = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String inputContrasena = scanner.nextLine();

        // Verificar las credenciales ingresadas
        if (nombreUsuario.equals(inputUsuario) && contrasena.equals(inputContrasena)) {
            System.out.println("Autenticación exitosa. Bienvenido, " + nombreUsuario + "!");
        } else {
            System.out.println("Autenticación fallida. Las credenciales son incorrectas.");
        }
    }
}
