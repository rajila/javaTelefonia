package telefonia.rdajila;

import java.util.Scanner;

public final class TipoDatoCompuesto {
	private Scanner consoleIn;
	enum EstadoCivil {
		SOLTERO,
		CASADO,
		VIUDO,
		DIVORCIADO,
		UNION_LIBRE
	};
	
	public void exec() {
		// Arreglos de una dimension
		char [] nombre = new char[6];
		nombre[0] = 'D';
		nombre[1] = 'a';
		nombre[2] = 'n';
		nombre[3] = 'i';
		nombre[4] = 'e';
		nombre[5] = 'l';
		
		System.out.println("Dim array(nombre): " + nombre.length);
		
		// loop array
		for (char data : nombre) {
			System.out.print(data);
		}
		
		System.out.println("\n");
		
		// Notas
		int [] notas = { 10, 8, 5, 9, 7, 3, 5, 8, 10, 9 };
		
		System.out.println("Dim array(notas): " + notas.length);
		for (int index = 0; index < notas.length; index++) {
			System.out.print(notas[index] + " ");
		}
		
		System.out.println("\n");
	}
	
	public void exec(String nombre) {
		char [] dataNombre = new char[nombre.length()]; // Asignar espacio en memoria en tiempo de ejecucion
		int index = 0;
		for (String data : nombre.split("")) { // split -> devuelve una arreglo de String de caracteres
			dataNombre[index++] = data.charAt(0); // charAt() -> Obtiene el primer caracter de la cadena de texto
		}
		
		System.out.println("Dim array(dataNombre): " + dataNombre.length);
		for (int i = 0; i < dataNombre.length; i++) {
			System.out.print(dataNombre[i] + " ");
		}
		
		System.out.println("\n");
		
		// Array multidimensional 2D
		int [][] notas = new int [2][3]; // Todas las filas tienen el mismo numero de columnas
		// Primera fila
		notas[0][0] = 34;
		notas[0][1] = 67;
		notas[0][2] = 29;
		
		// Segunda fila
		notas[1][0] = 50;
		notas[1][1] = 10;
		notas[1][2] = 40;
		
		// Loop array 2D
		for (int [] data : notas) {
			for (int numero : data) {
				System.out.print(numero + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// Las filas tienen diferente numero de columnas
		char [][] paises = { {'S', 'p', 'a', 'i', 'n'}, {'E', 'c', 'u', 'a', 'd', 'o', 'r'}, {'B', 'r', 'a', 's', 'i', 'l'} };
		
		// Loop array 2D
		for (int row = 0; row < paises.length; row++) {
			for (int col = 0; col < paises[row].length; col++) {
				System.out.print(paises[row][col] + " ");
			}
			System.out.println();
		}
		
		// Arreglo con filas fijas y columnas dinamicas
		char [][] surname = new char [2][];
		surname[0] = new char[5]; // fila #1 con 5 columnas
		surname[1] = new char[7]; // fila #2 con 7 columnas
		
		// Enumeraciones
		System.out.println();
		System.out.println(EstadoCivil.SOLTERO);
		System.out.println("Tamanio enum: " + EstadoCivil.values().length);
		System.out.println("Index DIVORCIADO: " + EstadoCivil.DIVORCIADO.ordinal());
		
		System.out.println();
	}
	
//	Escribir un programa que averigüe
//	la letra que forma el NIF de un DNI
//	
//	Se trata de pedir por teclado un número válido de DNI y formar una
//	cadena que sea el NIF equivalente al DNI; es decir el número del DNI
//	más la letra correspondiente.
//	
//	La letra del NIF es la que esta almacenada en el índice de un array
//	que se corresponde con el resto de dividir el DNI por 23, que es el
//	número de letras que se utilizan para la formación del NIF.
	public void execCasoPracticoI() {
		char letras[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P',
				 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
				 'Q', 'V', 'H', 'L', 'C', 'K', 'E' }; 
		consoleIn = new Scanner(System.in);
		System.out.print("Ingresar numero: ");
		int numero = consoleIn.nextInt();
		System.out.println("DNI: " + letras[numero%23] + String.valueOf(numero));
	}
}