package ejercicio1;
import java.util.ArrayList;
public class Ejecutable {

	public static void main(String[] args) {
		// Inicializando socios
		Socio s0 = new Socio("Marco","Fernandez",24);
		Socio s1= new Socio("Ezequiel","Fernandez",24);
		Socio s2 = new Socio("Lautaro","Lopez",32);
		Socio s3 = new Socio("Milagro","Fernandez",16);
		Socio s4 = new Socio("Lisa","Monge",0);
		Socio s5 = new Socio("Mateo","Fernandez",19);
		Socio s6 = new Socio("Ezequiel","Cortavarria",25);
		Socio s7 = new Socio("Juan","Perez",27);
		Socio s8 = new Socio("Maria","Monge",42);
		
		
		
		s2.setCuota_paga(false);
		s6.setCuota_paga(false);
		s4.setCuota_paga(false);
		s3.setCuota_paga(false);
		s8.setCuota_paga(false);
		
		
		AdministradorDeSocios gestor= new AdministradorDeSocios();
		Socio[] aux= {s0,s1,s2,s3,s4,s5,s6,s7,s8};
		gestor.addAllSocios(aux);
		
		System.out.println("Se inicializaron los socios.");
		
		//Ejeccio a ) Todas los socios con cuota impaga, ordenados alfabeticamente (primero por apellido, y si hay varios con el mismo apellido por nombre)
		System.out.println("Ejercicio A:Todos los deudores ordenados alfabeticamente.");
		System.out.println();
		CuotaImpaga deudores= new CuotaImpaga();
		gestor.leerListado(deudores);
		System.out.println(deudores.listaDeDeudores().toString());
		System.out.println();
		//Ejercicio b) Todos los socios menores de edad, ordenados por edad
		System.out.println("Ejercicio B:Todos los socios menores de edad.");
		System.out.println();
		
		SociosMenores menores=  new SociosMenores(18);
		gestor.leerListado(menores);
		System.out.print(menores.lista().toString());
		
		System.out.println();
		
		
		//ejercicio c) Todos los socios que alquilaron alguna vez la cancha N°13, ordenados cantidad total de alquileres de esa cancha.
		
		System.out.println("Ejercicio C: Todos los socios que alquilaron la cancha 13.");
		System.out.println();
		
		Alquiler a1=new Alquiler(13,500);
		gestor.facturarAlquiler("Maria", "Monge", a1);
		gestor.facturarAlquiler("Maria", "Monge", a1);
		gestor.facturarAlquiler("Marco", "Fernandez", a1);
		gestor.facturarAlquiler("Marco", "Fernandez", a1);
		gestor.facturarAlquiler("Marco", "Fernandez", a1);
		gestor.facturarAlquiler("Marco", "Fernandez", a1);
		gestor.facturarAlquiler("Juan", "Perez", a1);
		
		CantidadDeVecesAlquilada cant_alqui= new CantidadDeVecesAlquilada(13);
		gestor.leerListado(cant_alqui);
		System.out.println(cant_alqui.lista().toString());
		
		System.out.println();
		
		//d) Todos los socios que pagaron más de $500 por algún alquiler de cancha, listando primero los que tienen las cuotas pagas, ordenados alfabéticamente y luego los morosos, también ordenados alfabéticamente
		
		System.out.println("Ejercicio D: Todos los socios que pagaron $500 por un alquiler.");
		System.out.println();
		
		ComparadorAlfabetico comp_alfabetico=new ComparadorAlfabetico();
		MontoAlquilado filtrado_monto=new MontoAlquilado(500.0,comp_alfabetico);
		gestor.leerListado(filtrado_monto);
		System.out.println(filtrado_monto.lista().toString());
		System.out.println();
		
		//e) Cualquier combinación lógica de búsquedas.
 
		
		
	}

}
