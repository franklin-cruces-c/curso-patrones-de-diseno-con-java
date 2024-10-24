package decorator;

public class QuesoExtra implements IPizza {
	private IPizza pizza;

	public QuesoExtra(IPizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String descripcion() {
		return this.pizza.descripcion() + " queso extra";
	}

	@Override
	public float precio() {
		return this.pizza.precio() + 2;
	}

}
