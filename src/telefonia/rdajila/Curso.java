package telefonia.rdajila;

public final class Curso {
	private int cupos;
	
	public Curso() {
		this.cupos = 10;
	}
	
	// Error COMPROBADO
	public void registrar() throws SinCupoException {
		if ( this.cupos <= 0 ) {
			throw new SinCupoException("No hay cupos");
		}
		this.cupos--;
		System.out.println("Se ha registrado correctamente");
	}
}