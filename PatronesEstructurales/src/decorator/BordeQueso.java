package decorator;

public class BordeQueso implements IPizza {

	private IPizza pizza;

	public BordeQueso(IPizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String descripcion() {
		return this.pizza.descripcion() + " borde de queso";
	}

	@Override
	public float precio() {
		return this.pizza.precio() + 4;
	}

}
