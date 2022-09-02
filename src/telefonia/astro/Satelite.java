package telefonia.astro;

public final class Satelite extends Astro {
	
	private double distanciaPlaneta;
	private double orbitaPlanetaria;
	private Planeta planetaPertenece;

	public Satelite(double ratioEcuatorial, 
					int periodoRotacion, 
					double masa, 
					double temperatura, 
					double gravedad,
					double distanciaPlaneta,
					double orbitaPlanetaria,
					Planeta planetaPertenece) {
		super(ratioEcuatorial, periodoRotacion, masa, temperatura, gravedad);
		// TODO Auto-generated constructor stub
		this.distanciaPlaneta = distanciaPlaneta;
		this.orbitaPlanetaria = orbitaPlanetaria;
		this.planetaPertenece = planetaPertenece;
	}

	@Override
	public String muestra() {
		// TODO Auto-generated method stub
		return 	this.ratioEcuatorial + " - " +
				this.periodoRotacion + " - " +
				this.masa + " - " +
				this.temperatura + " - " +
				this.gravedad + " - " +
				this.distanciaPlaneta + " - " +
				this.orbitaPlanetaria + " - " +
				this.planetaPertenece.muestra();
	}
}
