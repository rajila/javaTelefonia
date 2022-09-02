package telefonia.rdajila;

public final class SinCupoException extends Exception {
	private static final long serialVersionUID = 1L;
	private String msn;
	
	public SinCupoException(String msn) {
		super(msn);
		this.msn = msn;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Error SinCupoException: " + this.msn;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Error SinCupoException: " + this.msn;
	}
}