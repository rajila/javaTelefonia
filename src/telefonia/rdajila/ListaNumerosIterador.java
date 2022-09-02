package telefonia.rdajila;

public final class ListaNumerosIterador {
	private Integer [] lista;
	private int numElementos;
	public ListaNumerosIterador(int maxElementos) {
		lista = new Integer[maxElementos];
	}
	
	public int get(int i) {
		return lista[i];
	}
		
	public void add(int i) {
		lista[numElementos++]=i;
	}
	
	public Iterador getIterador() {
		return new Iterador();
	}
	
	public class Iterador {
		int indice;
		Integer siguiente() {
			if(this.indice < numElementos)
				return lista[indice++];
			else
				return (Integer) null;
		}

	}  //fin de la clase interna
} //fin de la clase contenedora