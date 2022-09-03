package telefonia.mascota;

import java.util.Date;

public abstract class Ave extends Mascota {
	
	protected String pico;
	protected boolean vuela;

	public Ave(	String nombre, 
				int edad, 
				boolean estado, 
				Date fechaNacimiento,
				String pico,
				boolean vuela) {
		super(nombre, edad, estado, fechaNacimiento);
		// TODO Auto-generated constructor stub
		this.pico = pico;
		this.vuela = vuela;
	}
	
	public abstract String muestra();
	public abstract boolean volar();
}