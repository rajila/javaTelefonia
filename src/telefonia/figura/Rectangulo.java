package telefonia.figura;

public final class Rectangulo implements IFigura2D {
	
	private double ancho;
	private double alto;

	public Rectangulo(double ancho, double alto) {
		// TODO Auto-generated constructor stub
		this.ancho = ancho;
		this.alto = alto;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return this.ancho * 2 + this.alto * 2;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.ancho * this.alto;
	}

	@Override
	public void escalar(double escalar) {
		// TODO Auto-generated method stub
		this.ancho *= escalar;
		this.alto *= escalar;
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.printf("Rectangulo -> Ancho: %.2f - Alto: %.2f - Perimetro: %.2f - Area: %.2f\n", this.ancho, this.alto, this.perimetro(), this.area());
	}

}
