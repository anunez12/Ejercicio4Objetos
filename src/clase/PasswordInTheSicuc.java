/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author SP
 */
public class PasswordInTheSicuc { 
    private int longitud;private String contraseña; 
    public PasswordInTheSicuc(int longitud,String contraseña){ 
      longitud=this.longitud; 
      contraseña=this.contraseña;
    } 

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public PasswordInTheSicuc SeguridadContraseña(){ 
       String f;PasswordInTheSicuc p; 
       p=new PasswordInTheSicuc(longitud, contraseña); 
       return p;
    } 
    public PasswordInTheSicuc Contraseña(){ 
      String contraseña;int longitud;PasswordInTheSicuc p; 
       contraseña=this.contraseña; 
       longitud=this.longitud; 
       p=new PasswordInTheSicuc(longitud, contraseña);
       return p;       
    } 
    public PasswordInTheSicuc SolicitudCambioDeContraseña(){ 
      PasswordInTheSicuc p=null; 
      return p;
    }
    
}
