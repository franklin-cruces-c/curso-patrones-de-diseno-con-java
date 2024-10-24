package virtualproxy;

public class Usuario {
	private int nivelPermiso;// 1 -- 5 == Admin

	public Usuario(int nivelPermiso) {
		super();
		this.nivelPermiso = nivelPermiso;
	}

	/**
	 * @return the nivelPermiso
	 */
	public int getNivelPermiso() {
		return nivelPermiso;
	}

	/**
	 * @param nivelPermiso the nivelPermiso to set
	 */
	public void setNivelPermiso(int nivelPermiso) {
		this.nivelPermiso = nivelPermiso;
	}

}
