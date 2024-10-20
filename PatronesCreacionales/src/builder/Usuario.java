package builder;

public class Usuario {
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private String direccion;

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
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public Usuario setEmail(String email) {
		this.email = email;
		return this;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public Usuario setTelefono(String telefono) {
		this.telefono = telefono;
		return this;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public Usuario setDireccion(String direccion) {
		this.direccion = direccion;
		return this;
	}

	private Usuario(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;

		this.email = "";
		this.telefono = "";
		this.direccion = "";
	}

	/**
	 * Por convencion a este metodo se le llama Make
	 */
	public static Usuario Make(String nombre, String apellido) {
		return new Usuario(nombre, apellido);
	}

	/**
	 * Por convencion a este metodo se le llama Build
	 */
	public Usuario Build() {
		return this;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono
				+ ", direccion=" + direccion + "]";
	}

}
