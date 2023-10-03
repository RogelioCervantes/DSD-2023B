
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Rogelio Cervantes Castellon
 */
public class Alumnos {
    String nombre;
    int grado;
    int edad;
    int promedio;
    String nombrePapa;
    String telefonoPapa;
    String nombreMama;
    String telefonoMama;

    public Alumnos(String nombre, int grado, int edad, int promedio, String nombrePapa, String telefonoPapa, String nombreMama, String telefonoMama) {
        this.nombre = nombre;
        this.grado = grado;
        this.edad = edad;
        this.promedio = promedio;
        this.nombrePapa = nombrePapa;
        this.telefonoPapa = telefonoPapa;
        this.nombreMama = nombreMama;
        this.telefonoMama = telefonoMama;
    }
    
    public int insertar(Conexion cnx) {
        try {
            String sql = "INSERT INTO alumnos VALUES(?,?,?,?,?,?,?,?,?)"; // Cada interrogación es una columna de la tabla.
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            // Los datos van en el orden como están en la tabla
            ps.setString(1, null); // Es null porque la clave primaria es auto incrementable.
            ps.setString(2, nombre);
            ps.setInt(3, grado);
            ps.setInt(4, edad);
            ps.setInt(5, promedio);
            ps.setString(6, nombrePapa);
            ps.setString(7, telefonoPapa);
            ps.setString(8, nombreMama);
            ps.setString(9, telefonoMama);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e.getMessage());
            return 0;
        }
    }
}
