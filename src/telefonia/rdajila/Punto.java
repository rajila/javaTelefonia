package telefonia.rdajila;

public final class Punto {
	private int coordenadaX;
	private int coordenadaY;
	
	public Punto() {}
	
	public Punto(int coordenadaX, int coordenadaY) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}
	
	public Punto(Punto pt) {
		this.coordenadaX = pt.coordenadaX;
		this.coordenadaY = pt.coordenadaY;
	}
	
	public void pintar() {
		System.out.println("Coordenas [x, y]: " + this.coordenadaX + ", " + this.coordenadaY);
	}

	public int getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public int getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}
}