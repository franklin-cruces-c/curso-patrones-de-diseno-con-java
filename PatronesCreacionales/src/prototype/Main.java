package prototype;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Enemigo enemigoBase = new Enemigo("Imagen1.png", 0, 100, 2);
		
		Enemigo enemigo1 = new Enemigo(enemigoBase);
		Enemigo enemigo2 = new Enemigo(enemigoBase);
		Enemigo enemigo3 = new Enemigo(enemigoBase);
		
		enemigo1.setPosX(100);
		enemigo2.setPosX(150);
		enemigo3.setPosX(200);
		
		Enemigo enemigoBase2 = new Enemigo("Imagen1.png", 0, 200, 2);
		
		Enemigo enemigo4 = enemigoBase2.clone();
		Enemigo enemigo5 = enemigoBase2.clone();
		Enemigo enemigo7 = enemigoBase2.clone();
		 

	}

}
