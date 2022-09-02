package telefonia.vehiculo;

public final class Submarino extends VehiculoAcuatico {
	
	private double profundidadMaxima;

	public Submarino(String matricula, String modelo, double eslora, double profundidadMaxima) throws Exception {
		super(matricula, modelo, eslora);
		// TODO Auto-generated constructor stub
		this.profundidadMaxima = profundidadMaxima;
	}

	public double getProfundidadMaxima() {
		return profundidadMaxima;
	}

	public void setProfundidadMaxima(double profundidadMaxima) {
		this.profundidadMaxima = profundidadMaxima;
	}

	@Override
	public String imprimir() {
		// TODO Auto-generated method stub
		return super.imprimir() + " - " + this.profundidadMaxima;
	}
}
