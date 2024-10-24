package flyweight;

public class Main {

	public static void main(String[] args) {
		NubeFactory factory = new NubeFactory();

		for (int x = 0; x < 100; x++) {
			Nube nube = factory.getNube(TipoNube.Chica);
		}
		for (int x = 0; x < 200; x++) {
			Nube nube = factory.getNube(TipoNube.Mediana);
		}
		for (int x = 0; x < 500; x++) {
			Nube nube = factory.getNube(TipoNube.Grande);
		}

		System.out.println("Total nubes creadas=" + factory.countNubesMap());

	}

}
