package singleton.concurrente;

public class ConexionDB {
	private static ConexionDB conexion;

	private ConexionDB() {

	}

	public synchronized static ConexionDB obtenerConexion() {
		if (conexion == null) {
			conexion = new ConexionDB();
		}
		return conexion;
	}
}
