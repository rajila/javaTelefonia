package telefonia.vehiculo;

public class VehiculoAereo extends Vehiculo {
	
	private final int nroAsientos;

	public VehiculoAereo(String matricula, String modelo, int nroAsientos) throws Exception {
		super(matricula, modelo);
		// TODO Auto-generated constructor stub
		if ( !this.getMatricula().matches("[a-zA-Z]{4}[0-9]{6}") ) {
			throw new Exception("Error, la instancia no se puede crear");
		}
		this.nroAsientos = nroAsientos;
	}

	public int getNroAsientos() {
		return nroAsientos;
	}

	@Override
	public String imprimir() {
		// TODO Auto-generated method stub
		return this.getMatricula() + " - " + this.getModelo() + " - " + this.nroAsientos;
	}

}
