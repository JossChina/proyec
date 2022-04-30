
package Datos;
import java.util.Date;

public class Lote extends Produccion {
    private Date FechaP;
    
    public void setFechaP(Date FechaP){
        this.FechaP = FechaP;
    }

    public Date getFechaP(){
        return FechaP;
    }
}
