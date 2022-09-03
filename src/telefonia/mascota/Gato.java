package telefonia.mascota;

import java.util.Date;

public final class Gato extends Mascota {
	
	private String color;
	private boolean tienePeloLargo;

	public Gato(String nombre, 
				int edad, 
				boolean estado, 
				Date fechaNacimiento,
				String color,
				boolean tienePeloLargo) {
		super(nombre, edad, estado, fechaNacimiento);
		// TODO Auto-generated constructor stub
		this.color = color;
		this.tienePeloLargo = tienePeloLargo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isTienePeloLargo() {
		return tienePeloLargo;
	}

	public void setTienePeloLargo(boolean tienePeloLargo) {
		this.tienePeloLargo = tienePeloLargo;
	}

	@Override
	public String muestra() {
		// TODO Auto-generated method stub
		return 	this.nombre + " - " +
				this.edad + " - " +
				this.fechaNacimiento.getTime();
	}

	@Override
	public String habla() {
		// TODO Auto-generated method stub
		return null;
	}
}