package proyecto.proyecto.dominio.entidades;

public class Consultorio {
    private int id;
    private Ubicacion ubicacion;
    private boolean estado;    // Activo - No activo
    private String matricula;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Ubicacion getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    } 

}