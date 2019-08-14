
package forollamada;

public class Llamada {
   private int numeroOrigen;
   private int numeroDestino;
   private int duracion;
   private String tipo;
   
   public Llamada(){
       numeroOrigen=2600123;
       numeroDestino=2867162;
       duracion=3600;
       tipo="Local";
   }
   public Llamada(int numeroOrigen, int numeroDestino, int duracion, String tipo){
       this.numeroOrigen=numeroOrigen;
       this.numeroDestino=numeroDestino;
       this.duracion=duracion;
       this.tipo=tipo;
   }
   public void setNumeroOrigen(int numeroOrigen){
       this.numeroOrigen=numeroOrigen;
   }
   public int getNumeroOrigen(){
       return numeroOrigen;
   }
    public void setNumeroDestino(int numeroDestino){
       this.numeroDestino=numeroDestino;
   }
   public int getNumeroDestino(){
       return numeroDestino;
   }
    public void setDuracion(int duracion){
       this.duracion=duracion;
   }
   public int getDuracion(){
       return duracion;
   }
    public void setTipo(String tipo){
       this.tipo=tipo;
   }
   public String getTipo(){
       return tipo;
   }
}
