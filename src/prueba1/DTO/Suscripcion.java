
package prueba1.DTO;
import java.util.Date;
public class Suscripcion {
    private Date InicioSuscripcion;
    private int ValorSuscripcion;
    private String Equipo;
    private int Abono;
    private String Usuario;

    public Suscripcion() {
        this.InicioSuscripcion = new Date ();
        this.ValorSuscripcion = 0;
        this.Equipo = "";
        this.Abono = 0;
        this.Usuario = "";
        
        
    }

    public Date getInicioSuscripcion() {
        return InicioSuscripcion;
    }

    public void setInicioSuscripcion(Date InicioSuscripcion) {
        this.InicioSuscripcion = InicioSuscripcion;
    }

    public int getValorSuscripcion() {
        return ValorSuscripcion;
    }

    public void setValorSuscripcion(int ValorSuscripcion) {
        this.ValorSuscripcion = ValorSuscripcion;
    }

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String Equipo) {
        this.Equipo = Equipo;
    }

    public int getAbono() {
        return Abono;
    }

    public void setAbono(int Abono) {
        this.Abono = Abono;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }
    
    
    
    
    
    
}
