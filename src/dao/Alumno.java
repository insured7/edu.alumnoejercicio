package dao;

public class Alumno {

	private static int idContador = 0; //Contador estatico para autoincrementar ID
	private int id;
	private String nombre;
	private String apellidos;
	private String dni;
	private String fechaNac;
	private String email;
	private int numTlf;
	
	public Alumno(String nombre, String apellidos, String dni, String fechaNac, String email, int numTlf) {
		this.id = ++idContador;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNac = fechaNac;
		this.email = email;
		this.numTlf = numTlf;
	}
	
	public Alumno() {
		this.id = ++idContador; //Ya que al pasar el objeto uso este constructor vacio, añado 
	}							//el incremento tambien aquí.
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNumTlf() {
		return numTlf;
	}
	public void setNumTlf(int numTlf) {
		this.numTlf = numTlf;
	}
	
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", fechaNac=" + fechaNac
				+ ", email=" + email + ", numTlf=" + numTlf + "]";
	}
	
	
	
}
