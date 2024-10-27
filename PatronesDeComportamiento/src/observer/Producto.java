package observer;

import java.util.LinkedHashSet;
import java.util.Set;

public class Producto implements IObservable {

	private Set<IObserver> observadores;
	private int stock;

	public Producto(int stock) {
		this.stock = stock;
		this.observadores = new LinkedHashSet<IObserver>();
	}

	public void venta() {
		this.setStock(this.stock - 1);
		System.out.println("Producto vendido!");
		this.notificarObservadores();
	}

	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public void addObserver(IObserver o) {
		this.observadores.add(o);
	}

	@Override
	public void notificarObservadores() {
		for (IObserver observador : this.observadores) {
			observador.notificacion("El producto se vendió!");
		}
	}

}
