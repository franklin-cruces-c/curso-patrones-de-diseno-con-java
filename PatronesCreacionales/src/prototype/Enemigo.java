package prototype;

public class Enemigo {
	private String imagen;
	private int posX;
	private int posY;
	private int cantidadVida;

	public Enemigo(String imagen, int posX, int posY, int cantidadVida) {
		super();
		this.imagen = imagen;
		this.posX = posX;
		this.posY = posY;
		this.cantidadVida = cantidadVida;
	}

	public Enemigo(Enemigo enemigo) {
		this.imagen = enemigo.getImagen();
		this.posX = enemigo.getPosX();
		this.posY = enemigo.getPosY();
		this.cantidadVida = enemigo.getCantidadVida();
	}

	@Override
	public String toString() {
		return "Enemigo [" + (imagen != null ? "imagen=" + imagen + ", " : "") + "posX=" + posX + ", posY=" + posY
				+ ", cantidadVida=" + cantidadVida + "]";
	}

	/**
	 * @return the imagen
	 */
	public String getImagen() {
		return imagen;
	}

	/**
	 * @param imagen the imagen to set
	 */
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	/**
	 * @return the posX
	 */
	public int getPosX() {
		return posX;
	}

	/**
	 * @param posX the posX to set
	 */
	public void setPosX(int posX) {
		this.posX = posX;
	}

	/**
	 * @return the posY
	 */
	public int getPosY() {
		return posY;
	}

	/**
	 * @param posY the posY to set
	 */
	public void setPosY(int posY) {
		this.posY = posY;
	}

	/**
	 * @return the cantidadVida
	 */
	public int getCantidadVida() {
		return cantidadVida;
	}

	/**
	 * @param cantidadVida the cantidadVida to set
	 */
	public void setCantidadVida(int cantidadVida) {
		this.cantidadVida = cantidadVida;
	}

}
