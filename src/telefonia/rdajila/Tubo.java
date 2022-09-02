package telefonia.rdajila;

public final class Tubo extends Pieza {
	private float calibre;
	private String medida;
	
	public Tubo(int numero, String nombre, float calibre, String medida) {
		super(numero, nombre);
		this.calibre = calibre;
		this.medida = medida;
	}

	public float getCalibre() {
		return calibre;
	}

	public void setCalibre(float calibre) {
		this.calibre = calibre;
	}

	public String getMedida() {
		return medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}

	@Override
	public void vender() {
		// TODO Auto-generated method stub
		System.out.println("Vender Tubo #" + this.numero);
	}
}