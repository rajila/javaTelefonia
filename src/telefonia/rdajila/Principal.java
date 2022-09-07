package telefonia.rdajila;

import java.util.Date;

import telefonia.empresa.Empleado;
import telefonia.empresa.Empresa;
import telefonia.figura.Circulo;
import telefonia.figura.Cuadrado;
import telefonia.figura.Rectangulo;
import telefonia.figura.Triangulo;
import telefonia.mascota.Canario;
import telefonia.mascota.Inventario;
//import telefonia.vehiculo.Coche;
//import telefonia.vehiculo.VehiculoTerrestre;
import telefonia.mascota.Mascota;

public class Principal {

	public static void main(String[] args) {
		if ( args.length != 0 ) System.out.println("Param al iniciar la app: \'" + args[0] + "\'");
		System.out.println();
		
//		Sintaxis sintaxisTestI = new Sintaxis();
//		sintaxisTestI.exec();
//		sintaxisTestI.execCasoPracticoI();
//		sintaxisTestI.execCasoPracticoII();
		
//		TipoDatoCompuesto tdatoTestI = new TipoDatoCompuesto();
//		tdatoTestI.exec();
//		tdatoTestI.exec(args[0]);
//		tdatoTestI.execCasoPracticoI();
		
//		ListaNumerosIterador notas = new ListaNumerosIterador(5);
//		notas.add(10);
//		notas.add(20);
//		notas.add(30);
//		notas.add(40);
//		notas.add(50);
//		
//		ListaNumerosIterador.Iterador iteratorNotas = notas.getIterador();
//		Integer numero = null;
//		while((numero = iteratorNotas.siguiente()) != null) {
//			System.out.print(numero + " ");
//		}
//		
//		System.out.println();
//		
//		iteratorNotas = notas.new Iterador();
//		while((numero = iteratorNotas.siguiente()) != null) {
//			System.out.print(numero + " ");
//		}
		
//		Punto pt = new Punto(5, 9);
//		pt.pintar();
//		
//		System.out.println();
//		
//		Punto pt2 = new Punto(pt);
//		pt2.pintar();
		
		// HERENCIA
//		Pieza objPieza = new Tubo(1234, "Madera A4", 30, "15cm"); // Solo puede acceder a los atributos de la SUPERCLASE Pieza
//		System.out.println(objPieza.getNumero());
//		System.out.println(objPieza.getNombre());
//		
//		System.out.println();
//		
//		Tubo objTubo = (Tubo)objPieza; // Accedes a todos los elementos de la SUBCLASE y SUPERCLASE Tubo y Pieza
//		System.out.println(objTubo.getNumero());
//		System.out.println(objTubo.getNombre());
//		System.out.println(objTubo.getCalibre());
//		System.out.println(objTubo.getMedida());
//		
//		// POLIMORFISMO
//		// Array de objetos de tipo Pieza
//		Pieza [] piezas = new Pieza[5];
//		piezas[0] = new Tubo(1234, "Madera A4", 30, "15cm");
//		piezas[1] = new Plancha(8976, "Madera A4", 30.5, 23.8, 78.45);
//		piezas[2] = new Plancha(4156, "Madera A4", 34.89, 87.5, 76.34);
//		piezas[3] = new Tubo(3254, "Madera B5", 22, "10cm");
//		piezas[4] = new Tubo(9876, "Madera C10", 49, "25cm");
//		
//		System.out.println();
//		for(Pieza p : piezas) {
//			p.vender();
//		}
//		
//		System.out.println();
//		
//		Numeros listaNum = new Numeros();
//		listaNum.rellenar(102);
//		listaNum.rellenar();
//		listaNum.visualizar();
//		listaNum.ordenar();
//		listaNum.visualizar();
		
		// Excepciones
//		ExceptionTest myException = new ExceptionTest();
////		//myException.divisionCero(); // Error, exception no tratada
//		myException.divisionCeroException();
//		myException.inputNumberConsole();
//		myException.inputNumberConsoleExceptionMultiCatch();
//		try {
//			myException.exceptionPropagacion();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.err.println("Error propagado de tipo COMPROBADO");
//		}
//		myException.readFile();
//		
//		Curso cur = new Curso();
//		for (int index = 0; index <= 10; index++ ) {
//			try {
//				cur.registrar();
//			} catch (SinCupoException e) {
//				// TODO Auto-generated catch block
//				System.err.println("Estimado estudiante no hay cupos disponibles en el curso XXX");
//			}
//		}
		
		// FILES
//		FileCustom fileC = new FileCustom("fileIn.data", "fileOut.data"); // Archivos en ubicacion raiz del proyecto
//		fileC.readAndWriteFileByte();
		
		// VEHICULO
//		Coche cocheOne = null;
//		VehiculoTerrestre vh = null;
//		try {
//			cocheOne = new Coche("2666DFR", "Nissan", 4, true);
//			vh = new VehiculoTerrestre("2666DFR", "Nissan", 4);
//			System.out.println(cocheOne.imprimir());
//			System.out.println(vh.imprimir());
//			
//			vh = (VehiculoTerrestre)cocheOne;
//			System.out.println(vh.imprimir());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.err.println(e.getMessage());
//		}
		
		// INVENTARIO
		Inventario _inv = new Inventario();
		_inv.mostrarAnimales();
		
		try {
			Mascota _m = _inv.getMascotaByIndex(1);
			System.out.println();
			_inv.mostrarAnimal(_m);
		} catch(IndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}
		Canario _c = new Canario("Piolin", 1, true, new Date(), "Corto", true, "Amarillo", true);
		
		_inv.insertarAnimal( _c );
		System.out.println();
		_inv.mostrarInfoAnimales();
		
		_inv.eliminarAnimal(_c);
		System.out.println();
		_inv.mostrarInfoAnimales();
		
		_inv.vaciar();
		System.out.println();
		_inv.mostrarInfoAnimales();
		
		System.out.println("\n\n");
		Empleado _e1 = new Empleado("Ronald", "Y5724967M", 9000);
		Empleado _e2 = new Empleado("Esperanza", "X6612556X", 15000);
		Empleado _e3 = new Empleado("Daniel", "Y5724967M", 55000);
		Empleado _e4 = new Empleado("David", "M4724267X", 12000);
		
		Empresa _emp = new Empresa("ESPOL", "0943439847", "682350457", "Guayaquil, Avenida Permitral");
		_emp.addEmpleado(_e1); // Add empleado
		_emp.addEmpleado(_e2); // Add empleado
		
		_emp.mostrarAllEmpleados();
		
		_emp.addEmpleado(_e3); // Add empleado con DNI Duplicado
		_emp.addEmpleado(_e4); // Add empleado
		
		_emp.mostrarAllEmpleados();
		
		Empleado _e5 = new Empleado("Esperanza", "X6612556X", 19000);
		_emp.deleteEmpleado(_e5); // Delete empleado
		
		_emp.mostrarAllEmpleados();
		
		_emp.addEmpleado(_e2); // Add empleado
		_emp.mostrarAllEmpleados();
		System.out.printf("\nSueldo bruto total: %f", _emp.getSueldoBrutoAll());
		System.out.printf("\nSueldo neto total: %f", _emp.getSueldoNetoAll());
		
		System.out.println("\n\n");
		Cuadrado _c1 = new Cuadrado(5);
		_c1.imprimir();
		Rectangulo _r1 = new Rectangulo(4, 7);
		_r1.imprimir();
		Triangulo _t1 = new Triangulo(4, 7);
		_t1.imprimir();
		Circulo _cr1 = new Circulo(3.5);
		_cr1.imprimir();
	}
}