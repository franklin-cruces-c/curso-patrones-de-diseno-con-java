package strategy;

public class Deposito implements IEstrategia {

	@Override
	public float realizarOperacion(float balance, float monto) {
		return balance + monto;
	}

}
