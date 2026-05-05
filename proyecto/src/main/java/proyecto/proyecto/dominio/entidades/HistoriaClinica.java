package proyecto.proyecto.dominio.entidades;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "historias_clinicas")
public class HistoriaClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHistoria;

    @Column(name = "fecha_registero", insertable = false, updatable = false)
    private LocalDateTime fechaRegistro;

    private String diagnostico;

    private String tratamiento;

    private String observaciones;

    @UpdateTimestamp
    private LocalDateTime modificacion;

    @ManyToOne
    @JoinColumn(name = "documento_paciente", nullable = false)
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "documento_administrativo", nullable = false)
    private Administrativo administrativo;

}
