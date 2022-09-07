package telefonia.banco;

public abstract class CuentaBancaria {
	
	private String iban;
	private double saldo;
	
	protected final double interesAnualBasico = 12.45;

	public CuentaBancaria(String iban, double saldo) {
		// TODO Auto-generated constructor stub
		this.iban = iban;
		this.saldo = saldo;
	}
	
	public abstract double calcularInteres();

	public String getIban() {
		return iban;
	}

	public double getSaldo() {
		return saldo;
	}
	
	private boolean actualizarSaldo(double value) {
		if ( (this.saldo + value) >= 0 ) {
			this.saldo += value;
			return true;
		}
		return false;
	}
	
	public boolean ingresarDinero(double value) {
		return this.actualizarSaldo(value);
	}
	
	public boolean retirarDinero(double value) {
		return this.actualizarSaldo(value * -1.0);
	}
	
	public boolean transferirDinero(CuentaBancaria otherCuentaB, double valueToTranferir) {
		if (this.saldo - valueToTranferir >= 0 ) {
			this.actualizarSaldo(valueToTranferir * -1.0); // Actualiza el saldo actual. Descuenta el valor a transferir
			otherCuentaB.ingresarDinero(valueToTranferir); // Ingresa dinero a la otra cuenta
			return true;
		}
		return false;
	}
	
	public String mostrar() {
		return "Cuenta: " + this.iban + " -- Saldo: " + this.saldo;
	}
}