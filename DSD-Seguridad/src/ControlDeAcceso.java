import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author RCC
 */

public class ControlDeAcceso {
    public static void main(String[] args) {
        // Crear una tabla de control de acceso (Usuario - Contraseña)
        Map<String, String> tablaDeAcceso = new HashMap<>();
        tablaDeAcceso.put("usuario1", "contrasena1");
        tablaDeAcceso.put("usuario2", "contrasena2");

        // Pedir al usuario que ingrese sus credenciales
        Scanner scanner = new Scanner(System.in);
        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contrasena = scanner.nextLine();

        // Verificar las credenciales
        if (verificarCredenciales(tablaDeAcceso, usuario, contrasena)) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }
    }

    private static boolean verificarCredenciales(Map<String, String> tablaDeAcceso, String usuario, String contrasena) {
        // Verificar si el usuario existe en la tabla de acceso
        if (tablaDeAcceso.containsKey(usuario)) {
            // Verificar si la contraseña coincide
            String contrasenaAlmacenada = tablaDeAcceso.get(usuario);
            return contrasenaAlmacenada.equals(contrasena);
        }
        return false;
    }
}

