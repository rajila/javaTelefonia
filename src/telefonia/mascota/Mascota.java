package telefonia.mascota;

import java.util.Date;

public abstract class Mascota implements Comparable<Mascota> {
	
	protected String nombre;
	protected int edad;
	protected boolean estado;
	protected Date fechaNacimiento;

	public Mascota(String nombre, int edad, boolean estado, Date fechaNacimiento) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public abstract String muestra();
	
	public String habla() {
		return "La mascota no habla!!";
	}
	
	public String morir() {
		return "La mascota ha muerto!!";
	}
	
	public String cumpleanios() {
		return "La mascota cumple anios el " + this.fechaNacimiento.toString();
	}

	@Override
	public int compareTo(Mascota o) {
		// TODO Auto-generated method stub
		return this.nombre.compareToIgnoreCase(o.nombre);
	}
}