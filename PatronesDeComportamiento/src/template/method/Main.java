package template.method;

public class Main {

	public static void main(String[] args) {

		Usuario gerente = new Gerente();
		Usuario administrador = new Administrador();

		gerente.atutenticarse();
		gerente.formaTrabajar();

		administrador.atutenticarse();
		administrador.formaTrabajar();
	}

}
