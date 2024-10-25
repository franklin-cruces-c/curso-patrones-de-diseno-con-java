package iterator;

import java.util.Iterator;

public class IteradorGuia implements Iterador {

	private GuiaTelefonica guia;
	private int indice;

	public IteradorGuia(GuiaTelefonica guia) {
		this.guia = guia;
	}

	@Override
	public String siguiente() {
		return this.guia.getNumeros().get(this.indice++);
	}

	@Override
	public boolean contieneSiguiente() {
		return (indice + 1) < this.guia.getNumeros().size() && this.guia.getNumeros().get(this.indice) != null;
	}

}
