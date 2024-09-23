package servicios;

import java.util.Scanner;

public class MenuImpl implements MenuInterfaz {

	@Override
	public byte menu() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Menú de la aplicacion:");
		System.out.println("1. Alta de alumno");
		System.out.println("2. Modificación de alumno");
		System.out.println("3. Baja de alumno");
		System.out.println("4. Mostrar alumnos");
		System.out.println("0. Salir");
		
		System.out.println("¿Que opción desea?  ");
		byte opcion = sc.nextByte();
		
		
		return opcion;
	}

}
