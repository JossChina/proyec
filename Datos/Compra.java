
package Datos;
import java.util.Date;

public class Compra extends Productor {
    private int IdCompra;
    private String IdInsumo;
    private int Cantidad;
    private int SubTotal;
    private Date Fecha;
  
    
  
    public void setIdCompra(int IdCompra){
        this.IdCompra = IdCompra;
    }
    
    public int getIdCompra(){
        return IdCompra;
    }
    
    public void setIdInsumo(String IdInsumo){
        this.IdInsumo = IdInsumo;
    }
    
    public String getIdInsumo(){
        return IdInsumo;
    }
    
    public void setCantidad(int Cantidad){
        this.Cantidad = Cantidad;
    }

    public int getCantidad(){
        return Cantidad;
    }
    
    public void setSubTotal(int SubTotal){
        this.SubTotal = SubTotal;
    }

    public int getSubTotal(){
        return SubTotal;
    }
    
    public void setFecha(Date Fecha){
        this.Fecha = Fecha;
    }

    public Date getFecha(){
        return Fecha;
    }
}
