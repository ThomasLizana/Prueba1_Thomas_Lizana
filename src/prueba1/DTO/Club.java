
package prueba1.DTO;

public class Club {
    
    private String Codigo;
    private String NombreDelClub;
    private String Fundador;
    private int AñoFundacion;
    private String Pais;
    private String Lema;
    private String Colores;
    private int ValorSuscripcion;

    public Club() {
        
        this.Codigo = "";
        this.NombreDelClub = "";
        this.Fundador = "";
        this.AñoFundacion = 0;
        this.Pais = "";
        this.Lema = "";
        this.Colores = "";
        this.ValorSuscripcion = 0;
        
        
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombreDelClub() {
        return NombreDelClub;
    }

    public void setNombreDelClub(String NombreDelClub) {
        this.NombreDelClub = NombreDelClub;
    }

    public String getFundador() {
        return Fundador;
    }

    public void setFundador(String Fundador) {
        this.Fundador = Fundador;
    }

    public int getAñoFundacion() {
        return AñoFundacion;
    }

    public void setAñoFundacion(int AñoFundacion) {
        this.AñoFundacion = AñoFundacion;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getLema() {
        return Lema;
    }

    public void setLema(String Lema) {
        this.Lema = Lema;
    }

    public String getColores() {
        return Colores;
    }

    public void setColores(String Colores) {
        this.Colores = Colores;
    }

    public int getValorSuscripcion() {
        return ValorSuscripcion;
    }

    public void setValorSuscripcion(int ValorSuscripcion) {
        this.ValorSuscripcion = ValorSuscripcion;
    }
    
    
    
    
}
