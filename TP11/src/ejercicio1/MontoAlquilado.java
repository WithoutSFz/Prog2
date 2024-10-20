package ejercicio1;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class MontoAlquilado implements AccionEjecutable {
	private ArrayList<Socio> socios_cuota_paga;
	private ArrayList<Socio> socios_cuota_nopaga;
	private double monto;
	private Comparator<Socio> comp;
	
	
	
	
	public MontoAlquilado(double monto, Comparator<Socio> comp) {
		super();
		this.monto = monto;
		this.comp = comp;
		this.socios_cuota_paga= new ArrayList<Socio>();
		this.socios_cuota_nopaga= new ArrayList<Socio>();
	}
	


	@Override
	public void ejecutarSocio(Socio s) {
		// TODO Auto-generated method stub
		if (s.gastoAlquiler(monto))
			if(s.isCuota_paga())
				this.socios_cuota_paga.add(s);
			else
				this.socios_cuota_nopaga.add(s);
				

	}

	public ArrayList<Socio> lista(){
		Collections.sort(socios_cuota_paga,comp);
		Collections.sort(socios_cuota_nopaga,comp);
		ArrayList<Socio> resultado= new ArrayList<Socio>();
		resultado.addAll(socios_cuota_paga);
		resultado.addAll(socios_cuota_nopaga);	
		return resultado;
	}
}
