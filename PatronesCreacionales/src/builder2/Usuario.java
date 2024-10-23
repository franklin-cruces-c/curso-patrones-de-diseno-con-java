package builder2;

public class Usuario {
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private String direccion;

	private boolean medioContacto; // Opcional

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
	 * @return the medioContacto
	 */
	public boolean isMedioContacto() {
		return medioContacto;
	}

	/**
	 * @param medioContacto the medioContacto to set
	 */
	public BuilderUsuario setMedioContacto(boolean medioContacto) {
		if(!medioContacto) {
			throw new IllegalArgumentException("No es posible asignar un valor falso a un medio de contacto");
		}
		this.medioContacto = medioContacto;
		return new BuilderUsuario(this);
	}

	private Usuario(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;

		this.medioContacto = false;

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

	public static class BuilderUsuario {
		private Usuario usuario;

		public BuilderUsuario(Usuario usuario) {
			this.usuario = usuario;
		}

		/**
		 * @param email the email to set
		 */
		public BuilderUsuario setEmail(String email) {
			usuario.email = email;
			return this;
		}

		/**
		 * @param direccion the direccion to set
		 */
		public BuilderUsuario setDireccion(String direccion) {
			usuario.direccion = direccion;
			return this;
		}

		/**
		 * @param telefono the telefono to set
		 */
		public BuilderUsuario setTelefono(String telefono) {
			usuario.telefono = telefono;
			return this;
		}

		public Usuario Build() {
			return usuario;
		}
	}

}
