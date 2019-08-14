
package forollamada;

public class ForoLLamada {

    
    public static void main(String[] args) {
       Llamada uno=new Llamada();
       Llamada dos=new Llamada(2567890,2345678,300,"Internacional");
       System.out.println("Los valores de la llamada uno son:\nNumero de Origen: "+uno.getNumeroOrigen()+"\nNumero de Destino: "+
               +uno.getNumeroDestino()+"\nDuracion de llamada: "+uno.getDuracion()+"\nTipo de llamada: "+uno.getTipo());
       System.out.println("Los valores de la llamada dos son:\nNumero de Origen: "+dos.getNumeroOrigen()+"\nNumero de Destino: "+
               +dos.getNumeroDestino()+"\nDuracion de llamada: "+dos.getDuracion()+"\nTipo de llamada: "+dos.getTipo());
    }
    
}
