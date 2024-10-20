package ejercicio1;

import java.util.Comparator;

public class ComparadorAlfabetico implements Comparator<Socio> {

	@Override
	public int compare(Socio o1, Socio o2) {
		return o1.compareTo(o2);
	}

}
