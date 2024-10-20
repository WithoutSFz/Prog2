package ejercicio2;

import java.util.ArrayList;

public class Directorio extends ElementoSA {
	private ArrayList<ElementoSA> dir;
	
	public Directorio(String nombre) {
		super(nombre,0.0);
		dir=new ArrayList<ElementoSA>();
	}
	
	public void add(ElementoSA elem) {
		this.dir.add(elem);
		}
	@Override
	public double getTamanio() {
		// TODO Auto-generated method stub
		if(this.dir.size()!=0) {
			int resultado=0;
			for(ElementoSA elem:this.dir)
				resultado+=elem.getTamanio();
			return resultado;
		}
		return 0;
	}

}
