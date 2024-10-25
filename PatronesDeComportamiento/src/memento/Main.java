package memento;

public class Main {

	public static void main(String[] args) {
		Usuario usuario = new Usuario("Codi", 7);
		Usuario memento = usuario.getMemento();// Nuestra copia!

		System.out.println(usuario.getNombre());
		System.out.println(usuario.getEdad());

		usuario.setNombre("Cambio de nombre");
		usuario.setEdad(20);

		System.out.println(usuario.getNombre());
		System.out.println(usuario.getEdad());

		usuario.restartMememento(memento);

		System.out.println(usuario.getNombre());
		System.out.println(usuario.getEdad());
	}

}
