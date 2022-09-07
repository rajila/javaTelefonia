package telefonia.figura;

public final class Circulo implements IFigura2D {
	
	private double ratio;

	public Circulo(double ratio) {
		// TODO Auto-generated constructor stub
		this.ratio = ratio;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * this.ratio;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * this.ratio * this.ratio;
	}

	@Override
	public void escalar(double escalar) {
		// TODO Auto-generated method stub
		this.ratio *= escalar;
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.printf("Circulo -> Radio: %.2f - Perimetro: %.2f - Area: %.2f\n", this.ratio, this.perimetro(), this.area());
	}
}