package ejercicio1;

import java.util.Comparator;

public class ComparatorCantidadAlquileres implements Comparator<Socio> {
	private int id_cancha;
	
	public ComparatorCantidadAlquileres(int id) {
		this.id_cancha=id;
	}

	@Override
	public int compare(Socio o1, Socio o2) {
		
		return o1.cantAlquilo(this.id_cancha)-o2.cantAlquilo(this.id_cancha);
	}
	

}
