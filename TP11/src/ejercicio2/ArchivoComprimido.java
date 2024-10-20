package ejercicio2;

public class ArchivoComprimido extends Directorio {

	private double taza_comversion;
	
	public ArchivoComprimido(String nombre,double taza_comversion) {
		super(nombre);
		this.taza_comversion=taza_comversion;
	}

	@Override
	public double getTamanio() {
		// TODO Auto-generated method stub
		return super.getTamanio()/this.taza_comversion;
	}

}
