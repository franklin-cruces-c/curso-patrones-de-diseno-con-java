package virtualproxy;

/**
 * El patron proxy restringe el acceso a algunas funcionalidades según sea
 * necesario
 */
public class ProxyServicio implements IServicio {

	private IServicio servicio; // Este va a ser el objeto costoso.
	private Usuario usuario;

	public ProxyServicio(Usuario usuario) {
		super();
		this.usuario = usuario;
	}

	@Override
	public void escribir() {
		if (this.usuario.getNivelPermiso() >= 5) {
			this.obtenerServicio().escribir();
		} else {
			throw new UnsupportedOperationException("Error de seguridad!");
		}
	}

	@Override
	public void leer() {
		this.obtenerServicio().leer();
	}

	@Override
	public void actualizar() {
		if (this.usuario.getNivelPermiso() >= 5) {
			this.obtenerServicio().actualizar();
		} else {
			throw new UnsupportedOperationException("Error de seguridad!");
		}
	}

	@Override
	public void eliminar() {
		if (this.usuario.getNivelPermiso() >= 5) {
			this.obtenerServicio().eliminar();
		} else {
			throw new UnsupportedOperationException("Error de seguridad!");
		}
	}

	private IServicio obtenerServicio() {
		if (this.servicio == null) {
			this.servicio = new Servicio();
		}
		return this.servicio;
	}

}
