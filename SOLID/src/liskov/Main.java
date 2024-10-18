package liskov;

public class Main {

	public static void main(String[] args) {

		Jaguar yagua = new Jaguar(5,70f);		
		yagua.dormir();
		yagua.comer();
		yagua.cazar();
		yagua.rugir();

		IFelino yagua2 = new Jaguar(5,70f);
		yagua2.cazar();

		IFelinoSalvaje yagua3 = new Jaguar(5,70f);
		yagua3.cazar();
		yagua3.rugir();
		
	}

}
