package proxy;

public class Main {

	public static void main(String[] args) {
		IServicio servicio = new Servicio();

		servicio.escribir();
		servicio.leer();
		servicio.actualizar();
		servicio.eliminar();

		// Nueva regla:
		// solo los usuarios administradores podran
		// Escribir, Actualizar y Eliminar de la DB
		// Los demas usuarios solo podran Leer

	}

}
