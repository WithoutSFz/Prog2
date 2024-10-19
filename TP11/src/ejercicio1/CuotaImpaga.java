package ejercicio1;
import java.util.ArrayList;
import java.util.Collections;

public class CuotaImpaga implements AccionEjecutable {
	
	private ArrayList<Socio> socios_filtrados = new ArrayList<Socio>();
	

	@Override
	public void ejecutarSocio(Socio s) {
		
		if (!s.isCuota_paga())
			socios_filtrados.add(s);

	}
	
	public ArrayList<Socio> listaDeDeudores(){
		Collections.sort(socios_filtrados);
		ArrayList<Socio> resultado= new ArrayList<Socio>();
		resultado.addAll(socios_filtrados);
		return resultado;
	}
}
