package artifactExample.com.integral;

public class Persona {

	public static int cantidad = 0;
	private String nombre;
	private String apellido;

	public Persona(String n, String a) {
		cantidad = cantidad + 1;
		this.nombre = n;
		this.apellido = a;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
