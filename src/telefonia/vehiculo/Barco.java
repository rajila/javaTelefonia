package telefonia.vehiculo;

public final class Barco extends VehiculoAcuatico {
	
	private boolean tieneMotor;

	public Barco(String matricula, String modelo, double eslora, boolean tieneMotor) throws Exception {
		super(matricula, modelo, eslora);
		// TODO Auto-generated constructor stub
		this.tieneMotor = tieneMotor;
	}

	public boolean isTieneMotor() {
		return tieneMotor;
	}

	public void setTieneMotor(boolean tieneMotor) {
		this.tieneMotor = tieneMotor;
	}

	@Override
	public String imprimir() {
		// TODO Auto-generated method stub
		return super.imprimir() + " - " + this.tieneMotor;
	}
}
