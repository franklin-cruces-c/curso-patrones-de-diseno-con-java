package singleton;

public class Main {

	public static void main(String[] args) {
		ConexionDB conexion = ConexionDB.obtenerConexion();
		System.out.println(conexion.hashCode());

		ConexionDB conexion2 = ConexionDB.obtenerConexion();
		System.out.println(conexion2.hashCode());

		ConexionDB conexion3 = ConexionDB.obtenerConexion();
		System.out.println(conexion3.hashCode());
	}

}
