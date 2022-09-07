package telefonia.figura;

public final class Cuadrado implements IFigura2D {
	
	private final int NRO_LADOS = 4;
	private double lado;

	public Cuadrado(double lado) {
		// TODO Auto-generated constructor stub
		this.lado = lado;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return this.NRO_LADOS * this.lado;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.lado * this.lado;
	}

	@Override
	public void escalar(double escalar) {
		// TODO Auto-generated method stub
		this.lado *= escalar;
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.printf("Cuadrado -> Lado: %.2f - Perimetro: %.2f - Area: %.2f\n", this.lado, this.perimetro(), this.area());
	}
}