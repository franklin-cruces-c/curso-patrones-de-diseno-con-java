package flyweight;

public class Nube {
	private TipoNube tipo;
	private String imagen;
	private int posX;
	private int posY;
	public Nube(TipoNube tipo, String imagen, int posX, int posY) {
		this.tipo = tipo;
		this.imagen = imagen;
		this.posX = posX;
		this.posY = posY;
	}
	/**
	 * @return the tipo
	 */
	public TipoNube getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoNube tipo) {
		this.tipo = tipo;
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
	


}
