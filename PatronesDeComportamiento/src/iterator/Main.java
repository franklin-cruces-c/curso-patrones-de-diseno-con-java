package iterator;

public class Main {

	public static void main(String[] args) {
		GuiaTelefonica guia = new GuiaTelefonica();
		guia.add("123");
		guia.add("124");
		guia.add("125");
		guia.add("127");
		guia.add("128");
		guia.add("129");
		guia.add("130");

		Iterador iterador = new IteradorGuia(guia);

		while (iterador.contieneSiguiente()) {
			System.out.println(iterador.siguiente());
		}
	}

}
