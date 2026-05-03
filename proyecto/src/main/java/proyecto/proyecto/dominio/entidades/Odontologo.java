package proyecto.proyecto.dominio.entidades;

public class Odontologo extends Usuario{

    private String nombre;

    private String apellido;

    private String especialidad;

    private String telefono;

    private String direccion;

    private boolean disponibilidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Odontologo() {
        this(null, null, null, null, false, null, null, null, null, null, false);
    }

    public Odontologo(String documento, String contrasena, String repetirContrasena, String correo, boolean activo,
            String nombre, String apellido, String especialidad, String telefono, String direccion,
            boolean disponibilidad) {
        super(documento, contrasena, repetirContrasena, correo, activo);
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.direccion = direccion;
        this.disponibilidad = disponibilidad;
    }

    
    

    
}
