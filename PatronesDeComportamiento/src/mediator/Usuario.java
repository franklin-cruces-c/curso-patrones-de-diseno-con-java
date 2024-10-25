package mediator;

public class Usuario {
	private String nombre;

	public Usuario(String nombre) {
		this.nombre = nombre;
	}

	public void recibirMensaje(String mensaje) {
		System.out.println(mensaje);
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

}
