package telefonia.banco;

public final class CuentaAhorro extends CuentaBancaria {
	
	private final double saldoMinimo = 100.0;

	public CuentaAhorro(String iban, double saldo) {
		super(iban, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularInteres() {
		// TODO Auto-generated method stub
		if ( this.getSaldo() < this.saldoMinimo ) {
			return (this.getSaldo() * (this.interesAnualBasico / 2.0)) / 100.0;
		} else {
			return (this.getSaldo() * this.interesAnualBasico * 2.0) / 100.0;
		}
	}
}