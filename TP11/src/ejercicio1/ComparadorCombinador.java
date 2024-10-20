package ejercicio1;

import java.util.Comparator;

public class ComparadorCombinador implements Comparator<Socio> {
	
	private Comparator comp1;
	private Comparator comp2;
	public ComparadorCombinador(Comparator c1, Comparator c2) {
		this.comp1=c1;
		this.comp2=c2;
	}
	@Override
	public int compare(Socio o1, Socio o2) {
		// TODO Auto-generated method stub
		return comp1.compare(o1, o2)-comp2.compare(o1, o2);
	}

}
