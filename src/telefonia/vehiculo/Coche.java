package telefonia.vehiculo;

public final class Coche extends VehiculoTerrestre {
	
	private boolean tieneAireAcondicionado;

	public Coche(String matricula, String modelo, int nroRuedas, boolean tieneAireAcondicionado) throws Exception {
		super(matricula, modelo, nroRuedas);
		// TODO Auto-generated constructor stub
		this.tieneAireAcondicionado = tieneAireAcondicionado;
	}

	public boolean isTieneAireAcondicionado() {
		return tieneAireAcondicionado;
	}

	public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
		this.tieneAireAcondicionado = tieneAireAcondicionado;
	}

	@Override
	public String imprimir() {
		// TODO Auto-generated method stub
		return super.imprimir() + " - " + this.tieneAireAcondicionado;
	}
}