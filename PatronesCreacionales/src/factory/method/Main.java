package factory.method;

public class Main {

	public static void main(String[] args) {
		Pizzeria pizzeriaCF = new Pizzeria();
		Pizza pizzaPeperoni = pizzeriaCF.crearPizza("Peperoni");
		Pizza pizzaHawiana = pizzeriaCF.crearPizza("Hawaiana");
		Pizza pizzaCamarones = pizzeriaCF.crearPizza("Camarones");
		Pizza pizzaCamaronesBQ = pizzeriaCF.crearPizza("Camarones con borde de queso");

		System.out.println(pizzaPeperoni);
		System.out.println(pizzaHawiana);
		System.out.println(pizzaCamarones);
		System.out.println(pizzaCamaronesBQ);
	}

}
