package proyecto.proyecto.dominio.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "odontologos")
public class Odontologo extends Usuario {
    
    private String especialidad;
    private boolean disponibilidad;

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
    public boolean isDisponibilidad() { return disponibilidad; }
    public void setDisponibilidad(boolean disponibilidad) { this.disponibilidad = disponibilidad; }

    public Odontologo() { super(); }
}