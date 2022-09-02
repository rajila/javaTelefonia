package telefonia.vehiculo;

public abstract class Vehiculo {
	private final String matricula;
	private final String modelo;
	
	public Vehiculo(String matricula, String modelo) {
		this.matricula = matricula;
		this.modelo = modelo;
	}
	
	public abstract String imprimir();

	public String getMatricula() {
		return matricula;
	}

	public String getModelo() {
		return modelo;
	}
}