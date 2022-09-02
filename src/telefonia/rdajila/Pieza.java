package telefonia.rdajila;

public abstract class Pieza {
	protected int numero;
	protected String nombre;
	
	public Pieza(int numero, String nombre) {
		this.numero = numero;
		this.nombre = nombre;
	}
	
	public abstract void vender();

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}