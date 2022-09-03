package telefonia.mascota;

import java.util.Date;

public final class Perro extends Mascota {
	
	private String raza;
	private boolean tienePulgas;

	public Perro(	String nombre, 
					int edad, 
					boolean estado, 
					Date fechaNacimiento,
					String raza,
					boolean tienePulgas) {
		super(nombre, edad, estado, fechaNacimiento);
		// TODO Auto-generated constructor stub
		this.raza = raza;
		this.tienePulgas = tienePulgas;
	}
	
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public boolean isTienePulgas() {
		return tienePulgas;
	}

	public void setTienePulgas(boolean tienePulgas) {
		this.tienePulgas = tienePulgas;
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