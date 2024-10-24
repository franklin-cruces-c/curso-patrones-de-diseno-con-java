package facade;

public class Computadora {
	private ITeclado teclado;
	private IMouse mouse;



	public Computadora(Teclado teclado, Mouse mouse) {
		super();
		this.teclado = teclado;
		this.mouse = mouse;
	}



	public void encender() {
		this.teclado.conectar();
		this.mouse.conectar();
	}

}
