
package Datos;

public class Insumos extends Compra{
    private int CantitadI;
    private int SubTotalI;
    private int TotalI;
  
    public void setCantitadP(int CantitadI){
        this.CantitadI = CantitadI;
    }

    public int getCantitadI(){
        return CantitadI;
    }
    
    public void setSubTotalI(int SubTotalI){
        this.SubTotalI = SubTotalI;
    }

    public int getSubTotalI(){
        return SubTotalI;
    }
    
    public void setTotalI(int TotalI){
        this.TotalI = TotalI;
    }

    public int getTotalI(){
        return TotalI;
    }

    public void setCantitadI(int CantitadI) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
