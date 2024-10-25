package memento;

public class Usuario {
	private String nombre;
	private int edad;

	public Usuario(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public Usuario getMemento() {
		return new Usuario(this.getNombre(), this.getEdad());
	}

	public void restartMememento(Usuario usuario) {
		this.setNombre(usuario.getNombre());
		this.setEdad(usuario.getEdad());
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

}
