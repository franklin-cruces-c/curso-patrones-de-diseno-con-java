package chain.of.responsability;

public class Deposito implements IManejadorTransaccion {

	private IManejadorTransaccion next;

	@Override
	public void setNextManejador(IManejadorTransaccion next) {
		this.next = next;
	}

	@Override
	public void ejecutarTransaccion(Transaccion transaccion) {
		if (transaccion.getTipoTransaccion() == TipoTransaccion.Deposito) {
			float nuevoBalance = transaccion.getCantidad() + transaccion.getBalance();
			System.out.println("El nuevo balance después del depósito es: " + nuevoBalance);
		} else {
			this.next.ejecutarTransaccion(transaccion);
		}
	}

}
