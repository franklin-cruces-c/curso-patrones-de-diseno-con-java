package liskov;

public class Main {

	public static void main(String[] args) {

		Jaguar yagua = new Jaguar(5,70f);		
		yagua.dormir();
		yagua.comer();
		yagua.cazar();
		yagua.rugir();
		yagua.maullar();

		/*
		 *  No se cumple con el principio de Liskov ya que no se pueden ejecutar todos los
		 *  metodos de la clase padre
		 */
		IFelino yagua2 = new Jaguar(5,70f);
		yagua2.cazar();
		yagua2.rugir();
		yagua2.maullar();
//		yagua2.dormir();
//		yagua2.comer();		
		/*
		 *  No se cumple con el principio de Liskov ya que no se pueden ejecutar todos los
		 *  metodos de la clase padre
		 */		
		Animal yagua3 = new Jaguar(5,70f);
		yagua3.dormir();
		yagua3.comer();
//		yagua3.cazar();
//		yagua3.rugir();
//		yagua3.maullar();		
		
	}

}
