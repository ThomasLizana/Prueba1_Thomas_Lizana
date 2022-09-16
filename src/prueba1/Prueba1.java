
package prueba1;
import prueba1.DTO.Club;
import prueba1.DTO.Suscripcion;
import prueba1.DTO.Usuario;
        

public class Prueba1 {

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        int ID = 1000;
        usuario.setID(ID);
        usuario.setPrimerNombre("");
        usuario.setSegundoNombre("");
        usuario.setApellidoPaterno("");
        usuario.setApellidoMaterno("");
        usuario.setRun(0);
        usuario.setDv("");
        usuario.setFechaDeNacimiento("");
        usuario.setTelefono(0);
        usuario.setEmail("");
        usuario.setNombreDeUsuario("");
        usuario.setContraseña("");  
        
        
       String TipodeDeporte = ("Handball");
       Club club = new Club();
       int Codigos = 10;
       club.setNombreDelClub("Manquehue City");
       club.setCodigo(club.getNombreDelClub().substring(0,2).toUpperCase()+TipodeDeporte.substring(0,1)+Codigos);
       club.setFundador("");
       club.setAñoFundacion(0);
       club.setPais("");
       club.setLema("");
       club.setColores("");
       club.setValorSuscripcion(0); 
       
       
       Suscripcion sus = new Suscripcion();
       sus.setInicioSuscripcion("");
       sus.setValorSuscripcion(0);
       sus.setEquipo("");
       sus.setAbono(0);
       sus.setUsuario("");
       
       
       
       
       
       
        
        
        
        
        
     
    }
    
}
