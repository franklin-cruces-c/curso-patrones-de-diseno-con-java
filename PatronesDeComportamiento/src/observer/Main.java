package observer;

public class Main {

	public static void main(String[] args) {
		Producto aguacate = new Producto(10);

		Usuario usuario1 = new Usuario();
		Usuario usuario2 = new Usuario();
		Usuario usuario3 = new Usuario();// No le interesa si se vendió o no el producto

		aguacate.addObserver(usuario1);
		aguacate.addObserver(usuario2);
		aguacate.venta();

	}

}
