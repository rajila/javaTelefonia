package telefonia.rdajila;

public final class Plancha extends Pieza {
	private double largo;
	private double ancho;
	private double espesor;
	
	public Plancha(int numero, String nombre, double largo, double ancho, double espesor) {
		super(numero, nombre);
		this.largo = largo;
		this.ancho = ancho;
		this.espesor = espesor;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getEspesor() {
		return espesor;
	}

	public void setEspesor(double espesor) {
		this.espesor = espesor;
	}

	@Override
	public void vender() {
		// TODO Auto-generated method stub
		System.out.println("Vender Plancha #" + this.numero);
	}
}