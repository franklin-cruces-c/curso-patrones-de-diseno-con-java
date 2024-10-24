package chain.of.responsability;

public class Reembolso implements IManejadorTransaccion {

	private IManejadorTransaccion next;

	@Override
	public void setNextManejador(IManejadorTransaccion next) {
		this.next = next;
	}

	@Override
	public void ejecutarTransaccion(Transaccion transaccion) {
		if (transaccion.getTipoTransaccion() == TipoTransaccion.Reembolso) {
			float nuevoBalance = transaccion.getCantidad() + transaccion.getBalance();
			System.out.println("El nuevo balance después del reembolso es: " + nuevoBalance);
		} else {
			System.out.println("Operación no valida!");
		}
	}

}
