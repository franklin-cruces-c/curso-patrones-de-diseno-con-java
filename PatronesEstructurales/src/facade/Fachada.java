package facade;

public class Fachada {
	private Computadora computadora;

	public Fachada() {
		Teclado teclado = new Teclado();
		Mouse mouse = new Mouse();
		this.computadora = new Computadora(teclado, mouse);
	}

	public void encender() {
		System.out.println("Encendiendo computadora");
		this.computadora.encender();
	}
}
