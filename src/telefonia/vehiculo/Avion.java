package telefonia.vehiculo;

public final class Avion extends VehiculoAereo {
	
	private double tiempoMaximoVuelo;

	public Avion(String matricula, String modelo, int nroAsientos, double tiempoMaximoVuelo) throws Exception {
		super(matricula, modelo, nroAsientos);
		// TODO Auto-generated constructor stub
		this.tiempoMaximoVuelo = tiempoMaximoVuelo;
	}

	public double getTiempoMaximoVuelo() {
		return tiempoMaximoVuelo;
	}

	public void setTiempoMaximoVuelo(double tiempoMaximoVuelo) {
		this.tiempoMaximoVuelo = tiempoMaximoVuelo;
	}

	@Override
	public String imprimir() {
		// TODO Auto-generated method stub
		return super.imprimir() + " - " + this.tiempoMaximoVuelo;
	}
	
}
