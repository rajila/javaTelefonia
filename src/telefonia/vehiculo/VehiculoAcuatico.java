package telefonia.vehiculo;

public class VehiculoAcuatico extends Vehiculo {
	
	private final double eslora;

	public VehiculoAcuatico(String matricula, String modelo, double eslora) throws Exception {
		super(matricula, modelo);
		// TODO Auto-generated constructor stub
		if ( !this.getMatricula().matches("[a-zA-Z]{3, 10}") ) {
			throw new Exception("Error, la instancia no se puede crear");
		}
		this.eslora = eslora;
	}

	public double getEslora() {
		return eslora;
	}

	@Override
	public String imprimir() {
		// TODO Auto-generated method stub
		return this.getMatricula() + " - " + this.getModelo() + " - " + this.eslora;
	}

}
