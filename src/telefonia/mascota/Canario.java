package telefonia.mascota;

import java.util.Date;

public final class Canario extends Ave {
	
	private String color;
	private boolean canta;

	public Canario(	String nombre, 
					int edad, 
					boolean estado, 
					Date fechaNacimiento, 
					String pico, 
					boolean vuela,
					String color,
					boolean canta) {
		super(nombre, edad, estado, fechaNacimiento, pico, vuela);
		// TODO Auto-generated constructor stub
		this.color = color;
		this.canta = canta;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isCanta() {
		return canta;
	}

	public void setCanta(boolean canta) {
		this.canta = canta;
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

	@Override
	public String habla() {
		// TODO Auto-generated method stub
		return super.habla();
	}
}