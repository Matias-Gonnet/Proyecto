package proyecto.proyecto.dominio.entidades;

import java.time.LocalDate;



public class Solicitud {
    

    private int id;
    private int cantidad;
    private LocalDate fechaSolicitud;
    private boolean estado;

    private Consulta consulta;
    private Paciente paciente;
    private Administrativo administrativo;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public LocalDate getFechaSolicitud() {
        return fechaSolicitud;
    }
    public void setFechaSolicitud(LocalDate fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }
    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public Consulta getConsulta() {
        return consulta;
    }
    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Administrativo getAdministrativo() {
        return administrativo;
    }
    public void setAdministrativo(Administrativo administrativo) {
        this.administrativo = administrativo;
    }


    public Solicitud() {
        this(0, 0, null, false, null, null, null);
    }

    
    public Solicitud(int id, int cantidad, LocalDate fechaSolicitud, boolean estado, Consulta consulta,
            Paciente paciente, Administrativo administrativo) {
        this.id = id;
        this.cantidad = cantidad;
        this.fechaSolicitud = fechaSolicitud;
        this.estado = estado;
        this.consulta = consulta;
        this.paciente = paciente;
        this.administrativo = administrativo;
    }


    

    
}
