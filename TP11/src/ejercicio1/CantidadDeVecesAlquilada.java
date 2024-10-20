package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class CantidadDeVecesAlquilada implements AccionEjecutable {
	private ArrayList<Socio> socios_filtrados ;
	private ComparatorCantidadAlquileres comp; 

	
	public CantidadDeVecesAlquilada(int id) {
		this.comp= new ComparatorCantidadAlquileres(id);
		this.socios_filtrados= new ArrayList<Socio>();
	}
	@Override
	public void ejecutarSocio(Socio s) {
		if(s.alquilo(comp.getId()))
			this.socios_filtrados.add(s);
		
	}
	public ArrayList<Socio> lista(){
		Collections.sort(socios_filtrados,comp);
		ArrayList<Socio> resultado= new ArrayList<Socio>();
		resultado.addAll(socios_filtrados);
		return resultado;
	}

}
