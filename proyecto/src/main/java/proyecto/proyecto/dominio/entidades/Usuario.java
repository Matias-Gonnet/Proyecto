package proyecto.proyecto.dominio.entidades;
import java.util.HashSet;
import java.util.Set;
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

    private String repetirContrasena;

    private String correo;


    private boolean activo;


    private Set<Rol> roles;


    public String getDocumento() {
        return documento;
    }


    public void setDocumento(String documento) {
        this.documento = documento;
    }


    public String getContrasena() {
        return contrasena;
    }


    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }


    public String getRepetirContrasena() {
        return repetirContrasena;
    }


    public void setRepetirContrasena(String repetirContrasena) {
        this.repetirContrasena = repetirContrasena;
    }


    public String getCorreo() {
        return correo;
    }


    public void setCorreo(String correo) {
        this.correo = correo;
    }


    public boolean isActivo() {
        return activo;
    }


    public void setActivo(boolean activo) {
        this.activo = activo;
    }


    public Set<Rol> getRoles() {
        return roles;
    }


    


    public Usuario() {
    }


    public Usuario(String documento, String contrasena, String repetirContrasena, String correo, boolean activo
            ) {
        this.documento = documento;
        this.contrasena = contrasena;
        this.repetirContrasena = repetirContrasena;
        this.correo = correo;
        this.activo = activo;
      

        roles = new HashSet<>();
    }

   


    
    
}
