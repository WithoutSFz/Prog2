public  abstract class ElemVenta{
  private String nombre;//get y set
   public ElemVenta(String n){
     nombre=n;
   }
  public abstract double getPrecio();
  public abstract dpuble getVolumen();
  public abstract String getMarca();
  
  
}
