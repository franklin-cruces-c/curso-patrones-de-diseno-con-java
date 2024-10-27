package strategy;

public class Transaccion {
	private IEstrategia estrategia;// algoritmo

	public Transaccion(IEstrategia estrategia) {
		this.estrategia = estrategia;
	}

	public float ejecutarTransaccion(float balance, float monto) {
		return this.estrategia.realizarOperacion(balance, monto);
	}

}
