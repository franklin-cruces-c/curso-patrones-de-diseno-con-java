package decorator;

public class Main {

	public static void main(String[] args) {
		IPizza pizzaPeperoni = new PizzaPeperoni();

		System.out.println(pizzaPeperoni.descripcion());
		System.out.println(pizzaPeperoni.precio());

		IPizza pizzaHawaiana = new PizzaHawaiana();

		System.out.println(pizzaHawaiana.descripcion());
		System.out.println(pizzaHawaiana.precio());
		
		
		//Queso extra 2 dolares
		//Borde de queso 4 dolares

	}

}
