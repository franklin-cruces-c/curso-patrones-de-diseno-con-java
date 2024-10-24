package chain.of.responsability;

public interface IManejadorTransaccion {
	void setNextManejador(IManejadorTransaccion next);

	/**
	 * cambiar Transaccion por ITransaccion para cumplir con principios SOLID
	 * 
	 * @param transaccion
	 */
	void ejecutarTransaccion(Transaccion transaccion);
}
