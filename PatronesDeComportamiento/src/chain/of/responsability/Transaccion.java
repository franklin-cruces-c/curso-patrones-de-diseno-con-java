package chain.of.responsability;

public class Transaccion {
	private float cantidad;
	private float balance;
	private TipoTransaccion tipoTransaccion;

	public Transaccion(float cantidad, float balance, TipoTransaccion tipoTransaccion) {
		this.cantidad = cantidad;
		this.balance = balance;
		this.tipoTransaccion = tipoTransaccion;
	}

	/**
	 * @return the cantidad
	 */
	public float getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return the balance
	 */
	public float getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(float balance) {
		this.balance = balance;
	}

	/**
	 * @return the tipoTransaccion
	 */
	public TipoTransaccion getTipoTransaccion() {
		return tipoTransaccion;
	}

	/**
	 * @param tipoTransaccion the tipoTransaccion to set
	 */
	public void setTipoTransaccion(TipoTransaccion tipoTransaccion) {
		this.tipoTransaccion = tipoTransaccion;
	}

}
