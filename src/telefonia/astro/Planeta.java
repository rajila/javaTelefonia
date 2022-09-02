package telefonia.astro;

public final class Planeta extends Astro {
	
	private double distanciaSol;
	private double orbitaSol;
	private boolean tieneSatelites;

	public Planeta(	double ratioEcuatorial, 
					int periodoRotacion, 
					double masa, 
					double temperatura, 
					double gravedad,
					double distanciaSol,
					double orbitaSol,
					boolean tieneSatelites) {
		super(ratioEcuatorial, periodoRotacion, masa, temperatura, gravedad);
		// TODO Auto-generated constructor stub
		this.distanciaSol = distanciaSol;
		this.orbitaSol = orbitaSol;
		this.tieneSatelites = tieneSatelites;
	}

	@Override
	public String muestra() {
		// TODO Auto-generated method stub
		return 	this.ratioEcuatorial + " - " +
				this.periodoRotacion + " - " +
				this.masa + " - " +
				this.temperatura + " - " +
				this.gravedad + " - " +
				this.distanciaSol + " - " +
				this.orbitaSol + " - " +
				this.tieneSatelites;
	}
}