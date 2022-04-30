
package Datos;


public class Produccion extends Insumos{
    private int IdProducto;
    private int IdProduccion;
    private int CantidadP;
    
    public void setIdProducto(int IdProducto){
        this.IdProducto = IdProducto;
    }

    public int getIdProducto(){
        return IdProducto;
    }
    
    public void setIdProduccion(int IdProduccion){
        this.IdProduccion = IdProduccion;
    }

    public int getIdProduccion(){
        return IdProduccion;
    }
    
    public void setCantidadP(int CantidadP){
        this.CantidadP = CantidadP;
    }

    public int getCantidadP(){
        return CantidadP;
    }
}
