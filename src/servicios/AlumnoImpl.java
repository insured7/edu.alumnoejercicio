package servicios;

import java.util.List;
import java.util.Scanner;

import dao.Alumno;

public class AlumnoImpl implements AlumnoInterfaz {

	@Override
	public Alumno altaAlumno() {
		
		Alumno alumno = new Alumno();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("¿Nombre del alumno? ");
		alumno.setNombre(scan.next());
		
		System.out.println("¿Apellidos ?");
		alumno.setApellidos(scan.next());
		
		System.out.println("¿DNI?");
		alumno.setDni(scan.next());
		
		System.out.println("¿Fecha de nacimiento?");
		alumno.setFechaNac(scan.next());
		
		System.out.println("¿Email?");
		alumno.setEmail(scan.next());
		
		System.out.println("¿Número de teléfono?");
		alumno.setNumTlf(scan.nextInt());
		
		return alumno;
	}

	@Override
	public void muestraAlumno(List<Alumno> listaAlumno) {
		
		for (Alumno alumno : listaAlumno) {
			
			System.out.println(alumno);
		}
		
	}

	public void modificaAlumno(List<Alumno> listaAlumno) {
	    Scanner scan = new Scanner(System.in);
	    String dniDeseado;
	    System.out.println("Dígame el DNI del alumno a modificar:");
	    dniDeseado = scan.next();

	    try {
	        for (Alumno alumno : listaAlumno) {
	            if (alumno.getDni().equals(dniDeseado)) { // [mejor equals que "=="]
	                System.out.println("¿Qué desea modificar del alumno?");
	                String opcion = scan.next(); // Lee la opción del usuario

	                switch (opcion) {
	                    case "nombre":
	                        System.out.println("Dígame el nombre deseado:");
	                        alumno.setNombre(scan.next());
	                        break;
	                    case "apellidos":
	                        System.out.println("Dígame los apellidos deseados:");
	                        alumno.setApellidos(scan.next());
	                        break;
	                    case "dni":
	                        System.out.println("Dígame el DNI deseado:");
	                        alumno.setDni(scan.next());
	                        break;
	                    case "fechaNac":
	                        System.out.println("Dígame la fecha de nacimiento deseada:");
	                        alumno.setFechaNac(scan.next());
	                        break;
	                    case "email":
	                        System.out.println("Dígame el email deseado:");
	                        alumno.setEmail(scan.next());
	                        break;
	                    case "numTlf":
	                        System.out.println("Dígame el número de teléfono deseado:");
	                        alumno.setNumTlf(scan.nextInt());
	                        break;
	                    default:
	                        System.out.println("Opción no válida.");
	                        break;
	                }
	                return; // Salir del método una vez que se haya modificado el alumno
	            }
	        }
	        System.out.println("Alumno no encontrado.");
	    } catch (Exception e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	}
	
}
