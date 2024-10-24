package chain.of.responsability;

public class Main {

	public static void main(String[] args) {
		// Transaccion transaccion = new Transaccion(100, 200,
		// TipoTransaccion.Deposito);
		// Transaccion transaccion = new Transaccion(100, 200,
		// TipoTransaccion.Reembolso);
		Transaccion transaccion = new Transaccion(100, 200, TipoTransaccion.Retiro);
		// Transaccion transaccion = new Transaccion(100, 200, TipoTransaccion.Cheque);

		IManejadorTransaccion deposito = new Deposito();
		IManejadorTransaccion retiro = new Retiro();
		IManejadorTransaccion reembolso = new Reembolso();

		deposito.setNextManejador(retiro);
		retiro.setNextManejador(reembolso);

		deposito.ejecutarTransaccion(transaccion);

	}

}
