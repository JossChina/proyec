
package Datos;

public class Producto extends Produccion {
    private String NombreP;
    private float Precio;
    private int Existencia;
    
    public void setNombreP(String NombreP){
        this.NombreP = NombreP;
    }

    public String getNombreP(){
        return NombreP;
    }
    
    public void setPrecio(float Precio){
        this.Precio = Precio;
    }

    public float getPrecio(){
        return Precio;
    }
    
    public void setExistencia(int Existencia){
        this.Existencia = Existencia;
    }

    public int getExistencia(){
        return Existencia;
    }
}
