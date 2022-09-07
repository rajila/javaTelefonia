package telefonia.empresa;

import java.util.HashSet;
import java.util.Set;

public final class Empresa {
	
	private final String nombre;
	private final String CIF;
	private String telefono;
	private String direccion;
	private Set<Empleado> empleados;
	
	public Empresa(	String nombre,
					String CIF,
					String telefono,
					String direccion) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.CIF = CIF;
		this.telefono = telefono;
		this.direccion = direccion;
		this.empleados = new HashSet<>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getCIF() {
		return CIF;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	private void imprimirEmpleados() {
		System.out.println("\n\tListado de empleados\n");
		for(Empleado el : this.empleados) {
			System.out.println(el.imprimir());
		}
	}
	
	public void mostrarAllEmpleados() {
		this.imprimirEmpleados();
	}
	
	public void addEmpleado(Empleado el) {
		if (el == null) return;
		this.deleteEmpleado(el);
		this.empleados.add(el);
	}
	
	public void deleteEmpleado(Empleado el) {
		if( this.empleados.contains(el) ) this.empleados.remove(el);
	}
	
	public double getSueldoBrutoAll() {
		double sueldoTotal = 0.0;
		for(Empleado el : this.empleados) {
			sueldoTotal += el.getSueldoBruto();
		}
		return sueldoTotal;
	}
	
	public double getSueldoNetoAll() {
		double sueldoTotal = 0.0;
		for(Empleado el : this.empleados) {
			sueldoTotal += el.calcularSueldoNetoAnual();
		}
		return sueldoTotal;
	}
}