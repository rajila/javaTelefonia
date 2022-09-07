package telefonia.banco;

public final class CuentaCorriente extends CuentaBancaria {

	public CuentaCorriente(String iban, double saldo) {
		super(iban, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularInteres() {
		// TODO Auto-generated method stub
		return (this.getSaldo() * this.interesAnualBasico) / 100.0;
	}
}