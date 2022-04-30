
package Pincipal;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MOOS extends ObjectOutputStream{
    public MOOS(OutputStream out) throws IOException{
        super(out);
    }

    //Constructor sin parametros
    protected MOOS() throws IOException, SecurityException{
        super();
    }

    //Redefinicion del metodo de escribir la cabecera para que no haga nada
    @Override
    protected void writeStreamHeader() throws IOException{}
}
