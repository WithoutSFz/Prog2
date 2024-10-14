package ejercicio3;

import java.util.ArrayList;

public class ToList implements AccionEjecutable {
	
	 private ArrayList<Integer> lista= new ArrayList<Integer>(); 

	@Override
	public void ejecutarNodo(Nodo nodo) {
		lista.add(nodo.getElemento());

	}
	
	public void vacir() {
		lista.clear();
	}
	public void imprimir() {
		for(int i :lista)
			System.out.println(i);
	}
}
