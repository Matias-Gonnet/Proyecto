package proyecto.proyecto.dominio.entidades;

import java.time.LocalDate;

public class Consulta {
    
    private int id;
    private LocalDate fechaHora;
    private String motivo;
    /*private int cantidad;  esto va dentro de Solicitud*/
    private boolean estado;

    private Solicitud solicitud;
    private Consultorio consultorio;
    private Paciente paciente;
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
    public Solicitud getSolicitud() {
        return solicitud;
    }
    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }
    public Consultorio getConsultorio() {
        return consultorio;
    }
    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Odontologo getOdontologo() {
        return odontologo;
    }
    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }


    public Consulta() {
        this(0, null, null, false, null, null, null, null);
    }
    
    public Consulta(int id, LocalDate fechaHora, String motivo, boolean estado, Solicitud solicitud,
            Consultorio consultorio, Paciente paciente, Odontologo odontologo) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.motivo = motivo;
        this.estado = estado;
        this.solicitud = solicitud;
        this.consultorio = consultorio;
        this.paciente = paciente;
        this.odontologo = odontologo;
    }



    
}
