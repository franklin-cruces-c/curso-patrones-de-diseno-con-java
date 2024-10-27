package strategy;

public class Retiro implements IEstrategia {

	@Override
	public float realizarOperacion(float balance, float monto) {
		return balance - monto;
	}

}
