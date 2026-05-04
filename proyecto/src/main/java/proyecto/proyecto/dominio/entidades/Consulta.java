package proyecto.proyecto.dominio.entidades;
import java.time.LocalDate;

public class Consulta {
    private int id;
    private LocalDate fechaHora;
    private String motivo;
    private boolean estado; // Vigente / Finalizada

    private Consultorio consultorio;
    private Odontologo odontologo;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDate getFechaHora() {
        return fechaHora;
    }
    public void setFechaHora(LocalDate fechaHora) {
        this.fechaHora = fechaHora;
    }
    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public Consultorio getConsultorio() {
        return consultorio;
    }
    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }
    public Odontologo getOdontologo() {
        return odontologo;
    }
    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }

    }