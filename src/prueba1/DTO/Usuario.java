
package prueba1.DTO;

public class Usuario {
    private int ID;
    private String PrimerNombre;
    private String SegundoNombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private int Run;
    private String dv;
    private String FechaDeNacimiento;
    private int Telefono;
    private String Email;
    private String NombreDeUsuario;
    private String Contraseña;

    public Usuario() {
    
    this.ID = 1000;
    this.PrimerNombre = "";
    this.SegundoNombre = "";
    this.ApellidoPaterno = "";
    this.ApellidoMaterno = "";
    this.Run = 0;
    this.dv = "";
    this.FechaDeNacimiento = "";
    this.Telefono = 0;
    this.Email = "";
    this.NombreDeUsuario = "";
    this.Contraseña = "";
    
            
    
    
    
    
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPrimerNombre() {
        return PrimerNombre;
    }

    public void setPrimerNombre(String PrimerNombre) {
        this.PrimerNombre = PrimerNombre;
    }

    public String getSegundoNombre() {
        return SegundoNombre;
    }

    public void setSegundoNombre(String SegundoNombre) {
        this.SegundoNombre = SegundoNombre;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public int getRun() {
        return Run;
    }

    public void setRun(int Run) {
        this.Run = Run;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String FechaDeNacimiento) {
        this.FechaDeNacimiento = FechaDeNacimiento;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNombreDeUsuario() {
        return NombreDeUsuario;
    }

    public void setNombreDeUsuario(String NombreDeUsuario) {
        this.NombreDeUsuario = NombreDeUsuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
    
    
}
