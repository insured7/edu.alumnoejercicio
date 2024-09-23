package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.Alumno;
import servicios.AlumnoImpl;
import servicios.AlumnoInterfaz;
import servicios.MenuImpl;
import servicios.MenuInterfaz;
/**
 * Clase de acceso a la aplicación
 * 190924
 * author iis 
 */
public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MenuInterfaz mi = new MenuImpl();
		boolean esCerrado = false;
		byte opcion = 0;
		byte confirmacionCerrarMenu = 0;
		
		AlumnoInterfaz alumnoInt = new AlumnoImpl();
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		Alumno al = new Alumno();
		
		do{
			try {
					opcion = mi.menu();
					switch(opcion) {
					case 0:
						System.out.println("La aplicación se cerrará");
						esCerrado = true;
						break;
					case 1:
						System.out.println("Ha seleccionado el alta de usuario");
						al = alumnoInt.altaAlumno();
						listaAlumnos.add(al);
						System.out.println("Se ha dado de alta al alumno con DNI: " + al.getDni());					
						break;
					case 2:
						System.out.println("Ha seleccionado la modificacion de usuario");
						alumnoInt.modificaAlumno(listaAlumnos);
						break;
					case 3: 
						System.out.println("Ha seleccionado la baja de alumnos");
						break;
					case 4: 
						System.out.println("Mostrando alumnos: ");
						alumnoInt.muestraAlumno(listaAlumnos);
						break;
					default:
						System.out.println("La opcion no es valida");
						break;
					}
					
			}catch(Exception e) {
				System.out.println("Ha habido un error: " + e);
			}
			
		}while(!esCerrado);
	}
}