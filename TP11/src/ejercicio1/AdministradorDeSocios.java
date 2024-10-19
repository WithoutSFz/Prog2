package ejercicio1;

import java.util.ArrayList;

public class AdministradorDeSocios {
	private ArrayList<Socio> socios;
	
	public AdministradorDeSocios() {
		this.socios= new ArrayList<Socio>();
	}
	
	public void addSocio(Socio s) {
		this.socios.add(s);
	}
	public ArrayList<Socio> getSocios(){
		ArrayList<Socio> aux = new ArrayList<Socio>();
		aux.addAll(this.socios);
		return aux;
	}
	public void leerListado(AccionEjecutable a) {
		for(Socio s :this.socios)
			a.ejecutarSocio(s);
		
	}

}
