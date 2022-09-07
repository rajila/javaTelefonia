package telefonia.empresa;

public final class Empleado implements Comparable<Empleado> {
	
	// Constantes
	private final double IRPF_ONE = 0.20;
	private final double IRPF_TWO = 0.30;
	private final double IRPF_THREE = 0.40;
	private final int NRO_PAGAS = 12;
	
	private final String nombre;
	private final String dni;
	private double sueldoBruto;
	private int edad;
	private String telefono;
	private String direccion;

	public Empleado(String nombre,
					String dni,
					double sueldoBruto) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.dni = dni;
		this.sueldoBruto = sueldoBruto;
	}
	
	public Empleado(String nombre,
			String dni,
			double sueldoBruto,
			int edad,
			String telefono,
			String direccion) {
		// TODO Auto-generated constructor stub
		this(nombre, dni, sueldoBruto);
		this.edad = edad;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public double getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}
	
	public String imprimir() {
		return "Datos personales: " + this.dni + " - " + this.nombre + " - € " + this.sueldoBruto;
	}
	
	public double calcularSueldoNetoMensual() {
		return this.calcularSueldoNetoAnual() / this.NRO_PAGAS;
	}
	
	public double calcularSueldoNetoAnual() {
		return this.sueldoBruto - this.obtenerSueldoIRPF();
	}
	
	private double obtenerSueldoIRPF() {
		if ( this.sueldoBruto < 12000.0 ) {
			return this.sueldoBruto * this.IRPF_ONE;
		} else if ( this.sueldoBruto >= 12000.0 && this.sueldoBruto <= 25000.0 ) {
			return this.sueldoBruto * this.IRPF_TWO;
		} else {
			return this.sueldoBruto * this.IRPF_THREE;
		}
	}

	@Override
	public int compareTo(Empleado o) {
		// TODO Auto-generated method stub
		return this.dni.compareToIgnoreCase(o.dni);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.dni == null) ? 0 : this.dni.hashCode());
//		long temp = Double.doubleToLongBits(this.sueldoBruto);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Empleado other = (Empleado) obj;
		
		if (this.dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		
		return true;
	}
}