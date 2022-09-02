package telefonia.rdajila;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class Sintaxis {
	private Scanner consoleIn;
	public void exec() {
		System.out.println("Hola mundo!");
		
		// bloque de código
		{
			System.out.println("Bloque de código { .... }");
		}
		// Fin de bloque de código
		
		// Solicitar teclado por teclado
		this.consoleIn = new Scanner(System.in);
		System.out.println();
		System.out.print("Ingresar texto (nextLine): ");
		String txtIn = consoleIn.nextLine();
		System.out.println("Texto Input: " + txtIn );
		
		System.out.println();
		System.out.print("Ingresar 3 palabras (next): ");
//		this.consoleIn = new Scanner(System.in);
		txtIn = consoleIn.next();
		System.out.println("Palabra: " + txtIn );
		txtIn = consoleIn.next();
		System.out.println("Palabra: " + txtIn );
		txtIn = consoleIn.next();
		System.out.println("Palabra: " + txtIn );
		
		consoleIn.nextLine();
		
		// Ingresar numero
		try {
			System.out.println();
			System.out.print("Ingresar anio: ");
			int numero = consoleIn.nextInt();
			consoleIn.nextLine();
			System.out.println("Anio: " + Integer.toString(numero));
		} catch(InputMismatchException iex) {
			System.err.println("Error el valor ingresado no es un número");
		}
	}
	
	public void execCasoPracticoI() {
		consoleIn = new Scanner(System.in);
		try {
			System.out.print("Ingresar numero 1: ");
			int numeroI = consoleIn.nextInt();
			System.out.print("Ingresar numero 2: ");
			int numeroII = consoleIn.nextInt();
			System.out.print("Ingresar numero decimal: ");
			float numeroIII = consoleIn.nextFloat();
			
			consoleIn.nextLine(); // Capturamos el salto de linea del next() anterior
			
			System.out.print("Ingresar texto 1: ");
			String txtI = consoleIn.nextLine();
			System.out.print("Ingresar texto 2: ");
			String txtII = consoleIn.nextLine();
			
			// Print data
			System.out.println("Suma: " + (numeroI + numeroII + numeroIII));
			System.out.println("Entero mayor es: " + (numeroI > numeroII ? numeroI : numeroII));
			System.out.println("Divion 1: " + (numeroI / numeroIII));
			System.out.println("Divion 2: " + (numeroII / numeroIII));
			System.out.println("Concatenacion: " + (txtI + ' ' + txtII));
		} catch(InputMismatchException iex) {
			System.err.println("Error el valor ingresado no es correcto");
		}
	}
	
//	Escribir un programa que repita un número
//	determinado de veces la obtención de N números
//	aleatorios comprendidos en un rango elegido
//	entre cuatro opciones
	
//	Se trata de utilizando Random, se generen números aleatorios
//	tantas veces como otro número aleatorio indique. Este número
//	aleatorio hará de variable contadora de un bucle for.
//	Se aconseja limitar el número aleatorio de la variable contador a un
//	valor que sea mayor que cero y menor que 20 (aproximadamente).
//	Los números aleatorios en cada iteración deben estar
//	comprendidos en el rango de 18 a 65.
	public void execCasoPracticoII() {
		int numeroRepeticion = (int)Math.floor(Math.random() * 19 + 1); // Rango [1, 19]
		for (int i = 0; i < numeroRepeticion; i++) {
			 System.out.println((int)Math.floor(Math.random() * (65 - 18 + 1) + 18)); // Rango [18, 65]
		}
	}
}