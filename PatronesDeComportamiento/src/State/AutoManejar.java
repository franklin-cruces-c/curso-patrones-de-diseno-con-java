package State;

public class AutoManejar implements IEstadoAuto {

	private final Auto auto;

	public AutoManejar(Auto auto) {
		this.auto = auto;
	}

	@Override
	public void encender() {
		System.out.println("El auto ya está encendido!");
	}

	@Override
	public void manejar() {
		System.out.println("El auto ya está en movimiento!");
	}

	@Override
	public void apagar() {
		System.out.println("El auto está apagado!");
		auto.setEstadoActual(auto.getAutoApagado());
	}

}
