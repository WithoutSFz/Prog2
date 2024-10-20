package ejercicio1;

import java.util.ArrayList;

public class Socio implements Comparable{
	private String nombre;
	private String apellido;
	private int edad;
	private boolean cuota_paga;
	private ArrayList<Alquiler> alquileres;
	public Socio(String nombre,String apellido, int edad) {
		this.nombre = nombre;
		this.apellido=apellido;
		this.edad = edad;
		this.alquileres = new ArrayList<Alquiler>();
		this.cuota_paga=true;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String n) {
		this.nombre=n;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad() {
		this.edad++;
	}
	public boolean isCuota_paga() {
		return cuota_paga;
	}
	public void setCuota_paga(boolean cuota_paga) {
		this.cuota_paga = cuota_paga;
	}
	public void addAlquiler(Alquiler a) {
		this.alquileres.add(a);
	}
	
	public boolean alquilo(int id) {
		for(Alquiler a : this.alquileres)
			if(a.getId()==id)
				return true;
		return false;
	}
	public int cantAlquilo(int id) {
		int resultado=0;
		for(Alquiler a: this.alquileres)
			if(a.getId()==id)
				resultado++;
		return resultado;
	}
	
	public boolean gastoAlquiler(double monto) {	
		for(Alquiler a :this.alquileres)
			if(a.getMonto()==monto)
				return true;
		return false;
			
	}
	@Override
	public int compareTo(Object o) {
		if(this.apellido.compareTo(((Socio) o).getApellido())==0)
			return this.nombre.compareTo(((Socio) o).getNombre());
		else
			return this.apellido.compareTo(((Socio) o).getApellido());
	}
	
	
	
}
