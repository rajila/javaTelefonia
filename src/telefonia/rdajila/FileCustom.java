package telefonia.rdajila;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public final class FileCustom {
	private String nameFileIn;
	private String nameFileOut;
	// Variables para lectura/escritura: Flujo de bytes
	private FileInputStream fileIn;
	private FileOutputStream fileOut;
	
	// Variables para lectura/lectura: Flujo de caracteres
	private FileReader fileInChar;
	private FileWriter fileOutChar;
	
	public FileCustom(String nameFileIn, String nameFileOut) {
		this.nameFileIn = nameFileIn;
		this.nameFileOut = nameFileOut;
	}
	
	// Error CONTROLADO
	// Lectura de archivo (Flujo de bytes) de 1 byte (8 bits)
	public void readAndWriteFileByte() {
		try {
			this.fileIn = new FileInputStream(nameFileIn);
			this.fileOut = new FileOutputStream(nameFileOut); // Si el archivo no existe lo crea
			int caracter;
			while ((caracter = fileIn.read()) != -1) {
				System.out.print((char)caracter);
				this.fileOut.write(caracter);
			}
			if (this.fileIn != null) this.fileIn.close();
			if (this.fileOut != null) this.fileOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Error al procesar los archivos");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Error al leer el archivo");
		}
	}
	
	public void readAndWriteFileCharacter() {
		try {
			this.fileInChar = new FileReader(this.nameFileIn);
			this.fileOutChar = new FileWriter(this.nameFileOut);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}