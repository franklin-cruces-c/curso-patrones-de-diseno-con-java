package adapter;

public class Main {

	public static void main(String[] args) {
		IConexionSQL conexion = new AdaptadorDB(new ConexionMongoDB());
		/**
		 * Si se necesitase cambiar esta conexion a Mongo DB el cliente (Main) falla ya
		 * que no está preparado, tiene metodos que son diferentes como excecuteSentence
		 * en lugar de runQuery
		 */
		// IConexionNoSQL conexion = new ConexionMongoDB();
		conexion.conexion();
		String resultado = conexion.runQuery();
		System.out.println(resultado);
	}

}
