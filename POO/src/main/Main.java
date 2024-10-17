package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo desde Main!");
		//Instancia = a crear un objeto
		Jaguar yagua = new Jaguar();
		Jaguar yagua2 = new Jaguar(5,70f);
		Jaguar yagua3 = new Jaguar(5);
		yagua.setEdad(10);
		yagua.setPeso(120f);
		System.out.println(yagua);
		System.out.println(yagua2);
		
		yagua.dormir();
		yagua.comer();
		yagua.cazar();
		yagua.rugir();
		yagua.maullar();
	}

}
