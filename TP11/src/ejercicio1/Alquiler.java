package ejercicio1;

import java.time.LocalDate;

public class Alquiler {
	private LocalDate fecha;
	private int id;
	private  double monto;
	public Alquiler( int id, double monto) {
		super();
		this.fecha = LocalDate.now();
		this.id = id;
		this.monto = monto;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public int getId() {
		return id;
	}
	public double getMonto() {
		return monto;
	}
	
}
