package factory.method;

// Clase que será la fábrica simple
public class Pizzeria implements IPizzeria {

	public Pizza crearPizza(String tipo) {
		if (tipo.equals("Peperoni")) {
			return new Pizza(8, "Peperoni");
		}
		if (tipo.equals("Hawaiana")) {
			return new Pizza(8, "Hawaiana");
		}
		if (tipo.equals("Camarones")) {
			return new Pizza(12, "Camarones");
		}
		if (tipo.equals("Camarones con borde de queso")) {
			return new PizzaBordeDeQueso(15, "Camarones");
		}

		return null;
	}

}
