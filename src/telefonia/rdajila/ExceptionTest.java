package telefonia.rdajila;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public final class ExceptionTest {
	private Scanner dataIn;
	
	public ExceptionTest() {
		this.dataIn = new Scanner(System.in);
	}
	// Error NO comprobado
	public void divisionCero() {
		double resultado = 459/0;
		System.out.println("Division: " + Double.toString(resultado));
	}
	
	// Error NO comprobado
	public void divisionCeroException() {
		try {
			double resultado = 459/0;
			System.out.println("Division: " + Double.toString(resultado));
		} catch(ArithmeticException e) {
			System.err.println("Error, division para CERO");
		}
	}
	
	// Error NO comprobado
	public void inputNumberConsole() {
		System.out.print("Ingresar digito: ");
		try {
			int digito = this.dataIn.nextInt();
			double resultado = 450 / digito;
			System.out.println("Division: " + Double.toString(resultado));
		} catch(InputMismatchException ime) {
			System.err.println("Error, debe ingresar un digito");
		} catch(ArithmeticException ae) {
			System.err.println("Error, division para CERO");
		} catch(Exception e) {
			System.err.println("Error desconocido");
		}
	}
	
	// Error NO comprobado
	public void inputNumberConsoleExceptionMultiCatch() {
		System.out.print("Ingresar digito: ");
		try {
			int digito = this.dataIn.nextInt();
			double resultado = 450 / digito;
			System.out.println("Division: " + Double.toString(resultado));
		} catch(InputMismatchException | ArithmeticException ae) { // multicatch
			System.err.println("Error, debe ingresar un digito o division para CERO");
		} finally {
			System.out.println("Finally OK");
		}
	}
	
	// Error COMPROBADO
	public void readFile() {
		try {
			File fichero = new File("fichero.txt");
			FileReader fileR = new FileReader(fichero);
			fileR.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Archivo no encontrado");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Error");
		}
	}
	
	// Error COMPROBADO
	public void exceptionPropagacion() throws Exception{
		throw new Exception("Error manual");
	}
}