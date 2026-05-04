package proyecto.proyecto.dominio.entidades;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "notificaciones")
public class Notificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNotificacion;

    private String tipo;

    @Lob
    private String mensaje;

    private LocalDateTime fecha;

    private String estado; // "Enviada", "Leída"

    @ManyToOne
    @JoinColumn(name = "documento_paciente")
    private Paciente paciente;

}