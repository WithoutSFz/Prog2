Public class Kits{
  private String nombre;//get y set
  private ArrayList<ElemVenta> productos;

  public Kits(String n){
    nombre=n;
    productos=new ArrayList<ElemVenta>();
  }
  public void addP(Producto p){
    productos.add(p);
  }
  public String getMarca(){
    String resultado="No Elements";
    if(productos.size()>0)
      resultado=productos.get(0).getMarca();
    return resultado;
  }
  public double getPrecio(){
    double resultado=0;
    if (productos.size()>0)
        for(ElemVenta p:productos)
          resultado+=p.getPrecio();
    return resultado;
  }
  public double getVolumen(){
    double resultado=0;
    if (productos.size()>0)
        for(ElemVenta p:productos){
          comparar=p.getVolumen();
          if (comparar>resultado)
            resultado=comparar;
        }
    return resultado;
  }
  
}
