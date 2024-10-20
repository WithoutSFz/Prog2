package ejercicio2;

public class AccesoDirecto extends ElementoSA {
	
	public final static double PESO=1.0;
	private ElementoSA destino;
	public AccesoDirecto(ElementoSA copia) {
		super(copia.getNombre()+"-Acceso Directo",AccesoDirecto.PESO);
		this.destino=copia;
	}

	@Override
	public double getTamanio() {
		// TODO Auto-generated method stub
		return AccesoDirecto.PESO;
	}
	public ElementoSA getContenido() {
		return this.destino;
	}


}
