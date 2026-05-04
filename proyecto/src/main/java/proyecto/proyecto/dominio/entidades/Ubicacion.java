package proyecto.proyecto.dominio.entidades;
import java.math.BigDecimal;

public class Ubicacion {
    
    private String direccion;
    private BigDecimal latitud;
    private BigDecimal longitud;
    
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public BigDecimal getLatitud() {
        return latitud;
    }
    public void setLatitud(BigDecimal latitud) {
        this.latitud = latitud;
    }
    public BigDecimal getLongitud() {
        return longitud;
    }
    public void setLongitud(BigDecimal longitud) {
        this.longitud = longitud;
    }


}
