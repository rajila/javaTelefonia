package telefonia.vehiculo;

public final class Helicoptero extends VehiculoAereo {
	
	private int nroHelices;

	public Helicoptero(String matricula, String modelo, int nroAsientos, int nroHelices) throws Exception {
		super(matricula, modelo, nroAsientos);
		// TODO Auto-generated constructor stub
		this.nroHelices = nroHelices;
	}

	public int getNroHelices() {
		return nroHelices;
	}

	public void setNroHelices(int nroHelices) {
		this.nroHelices = nroHelices;
	}

	@Override
	public String imprimir() {
		// TODO Auto-generated method stub
		return super.imprimir() + " - " + this.nroHelices;
	}
	
}
