import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.KeyGenerator;
import java.security.SecureRandom;
import java.util.Base64;

/**
 *
 * @author RCC
 */

public class Criptografia {

    public static void main(String[] args) throws Exception {
        // Mensaje a cifrar
        String mensajeOriginal = "Hola, este es un mensaje secreto.";

        // Generar una clave secreta AES
        SecretKey claveSecreta = generarClaveAES();

        // Cifrar el mensaje
        String mensajeCifrado = cifrarAES(mensajeOriginal, claveSecreta);

        // Descifrar el mensaje
        String mensajeDescifrado = descifrarAES(mensajeCifrado, claveSecreta);

        System.out.println("Mensaje Original: " + mensajeOriginal);
        System.out.println("Mensaje Cifrado: " + mensajeCifrado);
        System.out.println("Mensaje Descifrado: " + mensajeDescifrado);
    }

    // Genera una clave secreta AES
    public static SecretKey generarClaveAES() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        SecureRandom random = new SecureRandom();
        keyGenerator.init(random);
        return keyGenerator.generateKey();
    }

    // Cifra un mensaje utilizando AES
    public static String cifrarAES(String mensaje, SecretKey clave) throws Exception {
        Cipher cifrador = Cipher.getInstance("AES");
        cifrador.init(Cipher.ENCRYPT_MODE, clave);
        byte[] mensajeCifrado = cifrador.doFinal(mensaje.getBytes());
        return Base64.getEncoder().encodeToString(mensajeCifrado);
    }

    // Descifra un mensaje cifrado con AES
    public static String descifrarAES(String mensajeCifrado, SecretKey clave) throws Exception {
        Cipher descifrador = Cipher.getInstance("AES");
        descifrador.init(Cipher.DECRYPT_MODE, clave);
        byte[] mensajeDescifrado = descifrador.doFinal(Base64.getDecoder().decode(mensajeCifrado));
        return new String(mensajeDescifrado);
    }
}

