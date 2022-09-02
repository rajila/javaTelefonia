package telefonia.rdajila;

import java.util.Arrays;

public final class Numeros {
	private static int DIM_ARRAY = 6;
	private int indexArray;
	private int [] listaEnteros;
	
	public Numeros() {
		this.listaEnteros = new int [DIM_ARRAY];
		this.indexArray = 0;
	}
	
	private void addElement(int entero) {
		if (!(Arrays.binarySearch(this.listaEnteros, entero) > 0)) {
			this.listaEnteros[this.indexArray++] = entero;
		}
	}
	
	public void rellenar(int entero) {
		if (this.indexArray < DIM_ARRAY) {
			this.addElement(entero);
		}
	}
	
	public void rellenar() {
		while (this.indexArray < DIM_ARRAY) {
			int entero = (int)Math.floor(Math.random() * 49 + 1);
			this.addElement(entero);
		}
	}
	
	public void ordenar() {
		Arrays.sort(this.listaEnteros);
	}
	
	public void visualizar() {
		for (int index = 0; index < this.indexArray; index++) {
			System.out.print(this.listaEnteros[index] + " ");
		}
		System.out.println();
	}
}