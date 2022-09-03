package telefonia.mascota;

import java.util.ArrayList;
import java.util.Date;

public final class Inventario {
	
	private ArrayList<Mascota> lmascotas;

	public Inventario() {
		// TODO Auto-generated constructor stub
		this.lmascotas = new ArrayList<>();
		this.lmascotas.add( new Loro("Vegeta", 2, true, new Date(), "Largo", true, "Ecuador", true) );
		this.lmascotas.add( new Perro("Broly", 3, true, new Date(), "Lobo", false) );
	}
	
	public void mostrarAnimales() {
		if ( this.lmascotas.size() == 0 ) {
			System.err.println("No hay animales!!");
			return;
		}
		for (Mascota el: this.lmascotas) {
			System.out.println(el.getClass().getName().split("\\.")[el.getClass().getName().split("\\.").length-1] + " - " + el.nombre);
		}
	}
	
	public void mostrarAnimal(Mascota el) {
		System.out.println( el.muestra() );
	}
	
	public void mostrarInfoAnimales() {
		for (Mascota el: this.lmascotas) {
			this.mostrarAnimal(el);
		}
	}
	
	public Mascota getMascotaByIndex(int index) throws IndexOutOfBoundsException {
		if ( index < 0 || index > this.lmascotas.size() - 1 ) throw new IndexOutOfBoundsException("El index ("+ index +") no existe!!");
		return this.lmascotas.get(index);
	}
	
	public void insertarAnimal(Mascota el) {
		this.lmascotas.add(el);
	}
	
	public void eliminarAnimal(Mascota el) {
		int indexDelete = -1;
		for(int index = 0; index < this.lmascotas.size(); index++) {
			if ( this.lmascotas.get(index).compareTo(el) == 0 ) {
				indexDelete = index;
				break;
			}
		}
		this.lmascotas.remove(indexDelete);
	}
	
	public void vaciar() {
		this.lmascotas.clear();
	}
}