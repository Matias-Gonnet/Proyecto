package proyecto.proyecto.dominio.entidades;

/*import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")*/
public class Rol {

    private String nombreRol;

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

      public Rol() {
        this(null);
    }

    public Rol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    
    
}
