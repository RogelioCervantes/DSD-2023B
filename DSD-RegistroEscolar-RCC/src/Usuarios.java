import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Rogelio Cervantes Castellon
 */
public class Usuarios {
    String nombre;
    String usuario;
    String contrasena;

    public Usuarios(String nombre, String usuario, String contrasena) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    
    public int insertar(Conexion cnx) {
        try {
            String sql = "INSERT INTO usuarios VALUES(?,?,?,?)";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setString(1, null);
            ps.setString(2, nombre);
            ps.setString(3, usuario);
            ps.setString(4, contrasena);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e.getMessage());
            return 0;
        }
    }
}
