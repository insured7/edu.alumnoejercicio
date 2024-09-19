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
	
	


}
