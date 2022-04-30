
package Datos;


public class Clientes extends Producto {
    private int IdCliente;
    private String NombreC;
    private String EstadoC;
    private String CiudadC;
    private String ColoniaC;
    private String CalleC;
    
    public void setNombreC(String NombreC){
        this.NombreC = NombreC;
    }

    public String getNombreC(){
        return NombreC;
    }
    
    public void setEstadoC(String EstadoC){
        this.EstadoC = EstadoC;
    }

    public String getEstadoC(){
        return EstadoC;
    }
    
    public void setCiudadC(String CiudadC){
        this.CiudadC = CiudadC;
    }

    public String getCiudadC(){
        return CiudadC;
    }
    
    public void setColoniaC(String ColoniaC){
        this.ColoniaC = ColoniaC;
    }

    public String getColoniaC(){
        return ColoniaC;
    }
    
    public void setCalleC(String CalleC){
        this.CalleC = CalleC;
    }

    public String getCalleC(){
        return CalleC;
    }
    
    public void setIdCliente(int IdCliente){
        this.IdCliente = IdCliente;
    }

    public int getIdCliente(){
        return IdCliente;
    }
}
