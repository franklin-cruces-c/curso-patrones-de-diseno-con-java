package State;

public class Auto implements IEstadoAuto {

	private IEstadoAuto autoEncendido;
	private IEstadoAuto autoMovimiento;
	private IEstadoAuto autoApagado;

	private IEstadoAuto estadoActual;

	public Auto() {
		this.autoEncendido = new AutoEncender(this);
		this.autoApagado = new AutoApagar(this);
		this.autoMovimiento = new AutoManejar(this);

		this.estadoActual = this.autoEncendido;
	}

	@Override
	public void encender() {
		this.estadoActual.encender();
	}

	@Override
	public void manejar() {
		this.estadoActual.manejar();
	}

	@Override
	public void apagar() {
		this.estadoActual.apagar();
	}

	/**
	 * @return the autoEncendido
	 */
	public IEstadoAuto getAutoEncendido() {
		return autoEncendido;
	}

	/**
	 * @param autoEncendido the autoEncendido to set
	 */
	public void setAutoEncendido(IEstadoAuto autoEncendido) {
		this.autoEncendido = autoEncendido;
	}

	/**
	 * @return the autoMovimiento
	 */
	public IEstadoAuto getAutoMovimiento() {
		return autoMovimiento;
	}

	/**
	 * @param autoMovimiento the autoMovimiento to set
	 */
	public void setAutoMovimiento(IEstadoAuto autoMovimiento) {
		this.autoMovimiento = autoMovimiento;
	}

	/**
	 * @return the autoApagado
	 */
	public IEstadoAuto getAutoApagado() {
		return autoApagado;
	}

	/**
	 * @param autoApagado the autoApagado to set
	 */
	public void setAutoApagado(IEstadoAuto autoApagado) {
		this.autoApagado = autoApagado;
	}

	/**
	 * @return the estadoActual
	 */
	public IEstadoAuto getEstadoActual() {
		return estadoActual;
	}

	/**
	 * @param estadoActual the estadoActual to set
	 */
	public void setEstadoActual(IEstadoAuto estadoActual) {
		this.estadoActual = estadoActual;
	}

}
