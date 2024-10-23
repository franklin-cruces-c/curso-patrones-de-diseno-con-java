package builder.ejercicio;

public class Usuario {
	private String nombre;
	private String apellido;

	private String email;
	private String telefono;
	private String direccion;

	private String metodoPago;
	private String token;

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
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @return the metodoPago
	 */
	public String getMetodoPago() {
		return metodoPago;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
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
		return "Usuario [" + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (apellido != null ? "apellido=" + apellido + ", " : "")
				+ (email != null ? "email=" + email + ", " : "")
				+ (telefono != null ? "telefono=" + telefono + ", " : "")
				+ (direccion != null ? "direccion=" + direccion + ", " : "")
				+ (metodoPago != null ? "metodoPago=" + metodoPago + ", " : "")
				+ (token != null ? "token=" + token : "") + "]";
	}

	/**
	 * @param email the email to set
	 */
	public Usuario setEmail(String email) {
		this.email = email;
		return this;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public Usuario setDireccion(String direccion) {
		this.direccion = direccion;
		return this;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public Usuario setTelefono(String telefono) {
		this.telefono = telefono;
		return this;
	}
	/**
	 * @param metodoPago the metodoPago to set
	 */
	public BuilderUsuario setMetodoPago(String metodoPago) {
		if (direccion == null || direccion.isBlank()) {
			throw new IllegalArgumentException("No es posible asignar un metodo de pago sin una dirección");
		}
		if (telefono == null || telefono.isBlank()) {
			throw new IllegalArgumentException("No es posible asignar un metodo de pago sin un telefono");
		}
		if (email==null || email.isBlank()) {
			throw new IllegalArgumentException("No es posible asignar un metodo de pago sin un email");
		}
		this.metodoPago = metodoPago;
		return new BuilderUsuario(this);
	}	

	public class BuilderUsuario {
		private Usuario usuario;

		public BuilderUsuario(Usuario usuario) {
			this.usuario = usuario;
		}

		/**
		 * @param token the token to set
		 */
		public BuilderUsuario setToken(String token) {
			usuario.token = token;
			return this;
		}

		public Usuario Build() {
			return usuario;
		}
	}
}
