package proyecto.proyecto.dominio.entidades;

public class Consultorio {

    private int id;

    private Ubicacion ubicacion; //Ubicacion Gelocalizada 

    private String estado;

    private String chapaMatriula;

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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getChapaMatriula() {
        return chapaMatriula;
    }

    public void setChapaMatriula(String chapaMatriula) {
        this.chapaMatriula = chapaMatriula;
    }

    public Consultorio() {
        this(0, null, null, null);
    }

    public Consultorio(int id, Ubicacion ubicacion, String estado, String chapaMatriula) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.estado = estado;
        this.chapaMatriula = chapaMatriula;
    }


    

    
}
