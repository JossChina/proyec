
package Pincipal;

import java.util.ArrayList;
import java.util.Iterator;
import Datos.Productor;
import Datos.Compra;
import Datos.Insumos;
import Datos.Produccion;
import Datos.Lote;
import Datos.Producto;
import Datos.Clientes;
import Datos.Convenio;
import java.util.Date;

public class Admon {
    static ArrayList Arrpublica = new ArrayList();
    private Productor objProductor;
    private Compra objCompra;
    private Insumos objInsumos;
    private Produccion objProduccion;
    private Lote objLote;
    private Producto objProducto;
    private Clientes objClientes;
    private Convenio objConvenio;
    
    public void alta (int IdProductor, String Nombre, String Estado, String Finca){
        objProductor.setIdProductor(IdProductor);
        objProductor.setNombre(Nombre);
        objProductor.setEstado(Estado);
        objProductor.setFinca(Finca);
        Arrpublica.add(objProductor);
    }
    
    public void alta (int IdCompra, String IdInsumo, int Cantidad, int SubTotal, Date Fecha){
        objCompra.setIdCompra(IdCompra);
        objCompra.setIdInsumo(IdInsumo);
        objCompra.setCantidad(Cantidad);
        objCompra.setSubTotal(SubTotal);
        objCompra.setFecha(Fecha);
        Arrpublica.add(objCompra);
    }
    
    public void alta (int CantitadI, int SubTotalI, int TotalI){
        objInsumos.setCantitadI(CantitadI);
        objInsumos.setSubTotalI(SubTotalI);
        objInsumos.setTotalI(TotalI);
        Arrpublica.add(objInsumos);
    }
    
    public void alta2 (int IdProducto, int IdProduccion, int CantidadP){
        objProduccion.setIdProducto(IdProducto);
        objProduccion.setIdProduccion(IdProduccion);
        objProduccion.setCantidadP(CantidadP);
        Arrpublica.add(objProduccion);
    }
    
    public void alta (Date Fecha){
        objLote.setFecha(Fecha);
        Arrpublica.add(objLote);
    }
    
    public void alta (String NombreP, float Precio, int Existencia){
        objProducto.setNombreP(NombreP);
        objProducto.setPrecio(Precio);
        objProducto.setExistencia(Existencia);
        Arrpublica.add(objProducto);
    }
    
    public void alta (int IdCliente, String NombreC, String EstadoC, String CiudadC, String ColoniaC, String CalleC){
        objClientes.setIdCliente(IdCliente);
        objClientes.setNombreC(NombreC);
        objClientes.setEstadoC(EstadoC);
        objClientes.setCiudadC(CiudadC);
        objClientes.setColoniaC(ColoniaC);
        objClientes.setCalleC(CalleC);
        Arrpublica.add(objClientes);
    }
    
    public void alta (int IdConvenio, float PrecioC){
        objConvenio.setIdConvenio(IdConvenio);
        objConvenio.setPrecioC(PrecioC);
        Arrpublica.add(objConvenio);
    }
    
    public void desplegar(){
        System.out.println("...OBJETOS EN LA PUBLICACION...");
        Iterator<Productor> itrPublica = Arrpublica.iterator();
        while(itrPublica.hasNext()){
            Productor publica = itrPublica.next();
            if (publica instanceof Productor ){
                Productor pro1 = new Productor();
                pro1 = (Productor)publica;
                System.out.println("Titulo: " + pro1.getTitulo());
                System.out.println("ISBN: " + pro1.getISBN());
                System.out.println("Autor: " + pro1.getAutor());
            }else if (publica instanceof Insumos ){
                Insumos ins = new Insumos();
                ins = (Insumos)publica;
                System.out.println("Titulo: " + ins.getTitulo());
                System.out.println("ISSN: " + ins.getISSN());
                System.out.println("Número : " + ins.getNumero());
            }else if (publica instanceof Produccion ){
                Produccion pro2 = new Produccion();
                pro2 = (Produccion)publica;
                System.out.println("Titulo: " + pro2.getTitulo());
                System.out.println("ISSN: " + pro2.getISSN());
                System.out.println("Número : " + pro2.getNumero());
            }else if (publica instanceof Lote ){
                Lote lot = new Lote();
                lot = (Lote)publica;
                System.out.println("Titulo: " + lot.getTitulo());
                System.out.println("ISSN: " + lot.getISSN());
                System.out.println("Número : " + lot.getNumero());
            }else if (publica instanceof Producto ){
                Producto pro3 = new Producto();
                pro3 = (Producto)publica;
                System.out.println("Titulo: " + pro3.getTitulo());
                System.out.println("ISSN: " + pro3.getISSN());
                System.out.println("Número : " + pro3.getNumero());
            }else if (publica instanceof Clientes ){
                Clientes clt = new Clientes();
                clt = (Clientes)publica;
                System.out.println("Titulo: " + clt.getTitulo());
                System.out.println("ISSN: " + clt.getISSN());
                System.out.println("Número : " + clt.getNumero());
            }else if (publica instanceof Convenio ){
                Convenio cond = new Convenio();
                cond = (Convenio)publica;
                System.out.println("Titulo: " + cond.getTitulo());
                System.out.println("ISSN: " + cond.getISSN());
                System.out.println("Número : " + cond.getNumero());
            }
        }
    }
}
