Public class Producto extends ElemVenta{
  private String nombre;
  private String marca;
  private double precio;
  private double volumen;
  
  public Producto (String n,m, Double p,v){
    super(n);
    marca=m;
    precio=p;
    volumen=v;
  }

  public String getMarca(){
    return this.marca;
  }
  public double getPrecio(){
    return this.precio;
  }
  public double getVolumne(){
    return this.volumen;
  }
  
}
