package ejercicio3;

public class Nodo {
	private int elemento;
	private Nodo izq;
	private Nodo der;
	
	
	
	
	public Nodo(int elemento) {
		super();
		this.elemento = elemento;
		this.izq = null;
		this.der = null;
	}

	public int getElemento() {
		return elemento;
	}

	public void addNodo(int n) {
		
		if(n==this.elemento) {
			//no se agregan repetidos
		}
		else {
				if(n>this.elemento) {
					if(this.der==null) 
						this.der= new Nodo(n);
					else
						this.der.addNodo(n);
				}
				else {
					if(this.izq==null) 
						this.izq= new Nodo(n);
					else
						this.izq.addNodo(n);
					
				}
			}
	}
	
	public void inOrder(AccionEjecutable action) {
		
		if(this.izq!=null)
			izq.inOrder(action);
		
		action.ejecutarNodo(this);
		
		if(this.der!=null)
			der.inOrder(action);
		
	}

	public void posOrder(AccionEjecutable action) {
		if(this.der!=null)
			der.posOrder(action);
		
		action.ejecutarNodo(this);
		
		if(this.izq!=null)
			izq.posOrder(action);
		
	}

	public String toString() {
		return "Elemento del nodo: "+elemento+".";
	}
}
