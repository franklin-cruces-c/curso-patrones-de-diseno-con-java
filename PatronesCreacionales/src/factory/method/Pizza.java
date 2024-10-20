package factory.method;

public class Pizza {
	private int cantidadRebanadas;
	private String especialidad;

	public Pizza(int cantidadRebanadas, String especialidad) {
		this.cantidadRebanadas = cantidadRebanadas;
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Pizza [cantidadRebanadas=" + cantidadRebanadas + ", especialidad=" + especialidad + "]";
	}

	

}
