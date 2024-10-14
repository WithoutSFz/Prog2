package ejercicio3;

public class CantidadDeNodos implements AccionEjecutable {
	
	private int cant=0;

	@Override
	public void ejecutarNodo(Nodo nodo) {
		this.cant++;
	}
	public int get() {
		return this.cant;
	}
	public void reStart() {
		this.cant=0;
	}

}
