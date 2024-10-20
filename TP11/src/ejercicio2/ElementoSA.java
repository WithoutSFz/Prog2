package ejercicio2;

import java.time.LocalDate;

public abstract class ElementoSA {
	private String nombre;
	protected double tamanio;
	private LocalDate fecha_c;
	public ElementoSA(String nombren, double tamanio) {
		this.nombre=nombre;
		this.tamanio=tamanio;
		this.fecha_c=LocalDate.now();
	}
	public abstract  double getTamanio();
	public void setTamanio(int t) {
		this.tamanio=t;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFecha_c() {
		return fecha_c;
	}

}
