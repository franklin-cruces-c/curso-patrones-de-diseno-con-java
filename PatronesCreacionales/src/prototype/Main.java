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

	}

}
