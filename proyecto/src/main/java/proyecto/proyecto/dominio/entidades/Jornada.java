package proyecto.proyecto.dominio.entidades;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "jornadas")
public class Jornada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idJornada;

    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private String ubicacion;

    @ManyToOne
    @JoinColumn(name = "documento_administrativo")
    private Administrativo administrativo;
    
}