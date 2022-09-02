package telefonia.vehiculo;

public class VehiculoTerrestre extends Vehiculo {
	
	private final int nroRuedas;

	public VehiculoTerrestre(String matricula, String modelo, int nroRuedas) throws Exception {
		super(matricula, modelo);
		// TODO Auto-generated constructor stub
		if ( !this.getMatricula().matches("[0-9]{4}[a-zA-Z]{3}") ) {
			throw new Exception("Error, la instancia no se puede crear");
		}
		this.nroRuedas = nroRuedas;
	}

	public int getNroRuedas() {
		return nroRuedas;
	}

	@Override
	public String imprimir() {
		// TODO Auto-generated method stub
		return this.getMatricula() + " - " + this.getModelo() + " - " + this.nroRuedas;
	}
}