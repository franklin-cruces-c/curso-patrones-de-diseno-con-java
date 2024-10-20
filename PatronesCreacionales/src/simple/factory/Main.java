package simple.factory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pizza pizzaPeperoni = new Pizza(8);
		// System.out.println(pizzaPeperoni);

		Pizzeria pizzeriaCF = new Pizzeria();
		Pizza pizzaPeperoni = pizzeriaCF.crearPizzaChica();
		Pizza pizzaHawiana = pizzeriaCF.crearPizzaMediana();
		Pizza pizzaCamarones = pizzeriaCF.crearPizzaGrande();

		System.out.println(pizzaPeperoni);
		System.out.println(pizzaHawiana);
		System.out.println(pizzaCamarones);
	}

}
