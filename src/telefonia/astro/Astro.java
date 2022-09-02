package telefonia.astro;

public abstract class Astro {
	
	protected double ratioEcuatorial;
	protected int periodoRotacion;
	protected double masa;
	protected double temperatura;
	protected double gravedad;

	public Astro(double ratioEcuatorial, int periodoRotacion, double masa, double temperatura, double gravedad) {
		// TODO Auto-generated constructor stub
		this.ratioEcuatorial = ratioEcuatorial;
		this.periodoRotacion = periodoRotacion;
		this.masa = masa;
		this.temperatura = temperatura;
		this.gravedad = gravedad;
	}
	
	public abstract String muestra();

}