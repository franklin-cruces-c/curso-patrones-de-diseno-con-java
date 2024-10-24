package decorator;

public class Main {

	public static void main(String[] args) {
		IPizza pizzaPeperoni = new PizzaPeperoni();

		System.out.println(pizzaPeperoni.descripcion());
		System.out.println(pizzaPeperoni.precio());

		IPizza pizzaHawaiana = new PizzaHawaiana();

		System.out.println(pizzaHawaiana.descripcion());
		System.out.println(pizzaHawaiana.precio());

		// Queso extra 2 dolares
		// Borde de queso 4 dolares

		// IPizza pizzaPeperoniQuesoExtra = new QuesoExtra(pizzaPeperoni);
		IPizza pizzaPeperoniQuesoExtra = new QuesoExtra(new PizzaPeperoni());

		System.out.println(pizzaPeperoniQuesoExtra.descripcion());
		System.out.println(pizzaPeperoniQuesoExtra.precio());

		IPizza pizzaHawaianaBordeQuesoyQuesoExtra = new BordeQueso(new QuesoExtra(new PizzaHawaiana()));

		System.out.println(pizzaHawaianaBordeQuesoyQuesoExtra.descripcion());
		System.out.println(pizzaHawaianaBordeQuesoyQuesoExtra.precio());

	}

}
