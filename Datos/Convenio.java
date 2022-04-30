
package Datos;


public class Convenio extends Clientes{
    private int IdConvenio;
    private float PrecioC;
    
    public void setPrecioC(float PrecioC){
        this.PrecioC = PrecioC;
    }

    public float getPrecioC(){
        return PrecioC;
    }
    
    public void setIdConvenio(int IdConvenio){
        this.IdConvenio = IdConvenio;
    }

    public int getIdConvenio(){
        return IdConvenio;
    }
}
