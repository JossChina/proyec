
package Datos;
import java.io.Serializable;

public class Productor implements Serializable{
    private int IdProductor;
    private String Nombre;
    private String Estado;
    private String Finca;
  
    
  
    public void setIdProductor(int IdProductor){
        this.IdProductor = IdProductor;
    }
    
    public int getIdProductor(){
        return IdProductor;
    }
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setEstado(String Estado){
        this.Estado = Estado;
    }

    public String getEstado(){
        return Estado;
    }
    
    public void setFinca(String Finca){
        this.Finca = Finca;
    }

    public String getFinca(){
        return Finca;
    }
}
