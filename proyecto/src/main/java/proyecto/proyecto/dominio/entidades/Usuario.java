package proyecto.proyecto.dominio.entidades;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.Table;
import jakarta.persistence.InheritanceType;

@Entity
@Table(name = "usuarios")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {

    private String documento;
    private String contrasena;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private boolean activo;

    private Rol rol;

}

