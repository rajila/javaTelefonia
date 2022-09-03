package telefonia.mascota;

import java.util.Date;

public final class Loro extends Ave {
	
	private String origen;
	private boolean habla;

	public Loro(String nombre, 
				int edad, 
				boolean estado, 
				Date fechaNacimiento, 
				String pico, 
				boolean vuela,
				String origen,
				boolean habla) {
		super(nombre, edad, estado, fechaNacimiento, pico, vuela);
		// TODO Auto-generated constructor stub
		this.origen = origen;
		this.habla = habla;
	}
	
	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public boolean isHabla() {
		return habla;
	}

	public void setHabla(boolean habla) {
		this.habla = habla;
	}

	public void saluda() {
		System.out.println("Hola soy un loro loco!!");
	}

	@Override
	public String muestra() {
		// TODO Auto-generated method stub
		return 	this.nombre + " - " +
				this.edad + " - " +
				this.fechaNacimiento.getTime();
	}

	@Override
	public boolean volar() {
		// TODO Auto-generated method stub
		return this.vuela;
	}
}