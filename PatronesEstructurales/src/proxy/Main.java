package proxy;

public class Main {

	public static void main(String[] args) {

		Usuario usuario = new Usuario(5);

		IServicio servicio = new ProxyServicio(new Servicio(), usuario);

		servicio.escribir();
		servicio.leer();
		servicio.actualizar();
		servicio.eliminar();

		// Nueva regla:
		// solo los usuarios administradores podran
		// Escribir, Actualizar y Eliminar de la DB
		// Los demas usuarios solo podran Leer

		Usuario usuario2 = new Usuario(3);

		servicio = new ProxyServicio(new Servicio(), usuario2);
		System.out.println("Para el Usuario 2");
		servicio.leer();
		servicio.escribir();
		servicio.actualizar();
		servicio.eliminar();

	}

}
