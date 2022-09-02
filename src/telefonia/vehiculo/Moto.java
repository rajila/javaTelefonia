package telefonia.vehiculo;

public final class Moto extends VehiculoTerrestre {
	
	private String color;

	public Moto(String matricula, String modelo, int nroRuedas, String color) throws Exception {
		super(matricula, modelo, nroRuedas);
		// TODO Auto-generated constructor stub		
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String imprimir() {
		// TODO Auto-generated method stub
		return super.imprimir() + " - " + this.color;
	}
}
