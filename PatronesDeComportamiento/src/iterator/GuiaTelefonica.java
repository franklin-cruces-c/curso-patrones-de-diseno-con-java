package iterator;

import java.util.ArrayList;

public class GuiaTelefonica {

	private ArrayList<String> numeros;

	public GuiaTelefonica() {
		this.numeros = new ArrayList<String>();
	}

	/**
	 * @return the numeros
	 */
	public ArrayList<String> getNumeros() {
		return numeros;
	}

	/**
	 * @param numeros the numeros to set
	 */
	public void add(String numero) {
		this.numeros.add(numero);
	}

}
