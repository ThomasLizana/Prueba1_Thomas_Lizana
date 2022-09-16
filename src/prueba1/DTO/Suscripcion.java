
package prueba1.DTO;
public class Suscripcion {
    private String InicioSuscripcion;
    private int ValorSuscripcion;
    private String Equipo;
    private int Abono;
    private String Usuario;

    public Suscripcion() {
        this.InicioSuscripcion = "";
        this.ValorSuscripcion = 0;
        this.Equipo = "";
        this.Abono = 0;
        this.Usuario = "";
        
        
    }

    public String  getInicioSuscripcion() {
        return InicioSuscripcion;
    }

    public void setInicioSuscripcion(String InicioSuscripcion) {
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
