package chain.of.responsability;

public class Retiro implements IManejadorTransaccion {

	private IManejadorTransaccion next;

	@Override
	public void setNextManejador(IManejadorTransaccion next) {
		this.next = next;
	}

	@Override
	public void ejecutarTransaccion(Transaccion transaccion) {
		if (transaccion.getTipoTransaccion() == TipoTransaccion.Retiro) {
			float nuevoBalance = transaccion.getBalance() - transaccion.getCantidad();
			System.out.println("El nuevo balance después del retiro es: " + nuevoBalance);
		} else {
			this.next.ejecutarTransaccion(transaccion);
		}
	}

}
