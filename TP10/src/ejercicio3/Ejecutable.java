package ejercicio3;

public class Ejecutable {

	public static void main(String[] args) {
		Nodo raiz = new Nodo(7);
		raiz.addNodo(1);
		raiz.addNodo(9);
		raiz.addNodo(5);
		raiz.addNodo(8);
		ImprimirEnPantalla output= new ImprimirEnPantalla();
		System.out.println("Arbol con recorrido inorder");
		raiz.inOrder(output);
		System.out.println("Arbol con recorrido posorder");
		raiz.posOrder(output);
		ToList lista_del_arbol= new ToList();
		raiz.inOrder(lista_del_arbol);
		System.out.println("Lista ascendente");
		lista_del_arbol.imprimir();
		lista_del_arbol.vacir();
		raiz.posOrder(lista_del_arbol);
		System.out.println("Lista  descendenter");
		lista_del_arbol.imprimir();
		

	}

}
