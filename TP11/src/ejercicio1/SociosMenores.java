package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class SociosMenores implements AccionEjecutable {
	
	private ArrayList<Socio> socios_filtrados = new ArrayList<Socio>();
	private int edad_limite;
	public SociosMenores(int edad_limite) {
		this.edad_limite=edad_limite;
	}

	public int getEdad_limite() {
		return edad_limite;
	}

	public void setEdad_limite(int edad_limite) {
		this.edad_limite = edad_limite;
	}

	@Override
	public void ejecutarSocio(Socio s) {
		// TODO Auto-generated method stub
		if(s.getEdad()<this.edad_limite)
			this.socios_filtrados.add(s);
		
	}
	public ArrayList<Socio> lista(){
		ComparadorEdad comparador= new ComparadorEdad();
		Collections.sort(socios_filtrados,comparador);
		ArrayList<Socio> resultado= new ArrayList<Socio>();
		resultado.addAll(socios_filtrados);
		return resultado;
	}

}
