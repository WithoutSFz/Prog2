public class PrecioMayor extends Filtro{
   private double criterio;//get y set
   public boolean cumple(ElemVenta e){
     return e.getPrecio"mayor"criterio;
   }
}
