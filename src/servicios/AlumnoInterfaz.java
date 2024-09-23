package servicios;

import java.util.List;

import dao.Alumno;

public interface AlumnoInterfaz {

	/**
	 * Metodo que dará de alta a un alumno en la lista.
	 * @return devuelvo el objeto alumno y lo añado a la lista en la aplicacion
	 */
	public Alumno altaAlumno();
	
	/**
	 * Metodo que muestra una lista de todos los alumnos
	 */
	public void muestraAlumno(List<Alumno> listaAlumno);
	
	/**
	 * Método que pide el dni del alumno, encuentra al alumno mediante un foreach y le pregunta 
	 * el dato a modificar.
	 */
	
	public void modificaAlumno(List<Alumno> listaAlumno);
}
