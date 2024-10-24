package decorator;

public class PizzaHawaiana implements IPizza {
	@Override
	public String descripcion() {
		return "Pizza de hawaiana";
	}

	@Override
	public float precio() {
		return 8;
	}
}
