package builder2;

public class Main {

	public static void main(String[] args) {
		Usuario codi = Usuario.Make("Codi", "Facilito").Build();
		Usuario codiEmail = Usuario.Make("Codi", "Facilito")
				.setMedioContacto(true)
				.setEmail("info@correosdelaabuelita.cl")
				.Build();

		System.out.println(codi);
		System.out.println(codiEmail);
	}

}
