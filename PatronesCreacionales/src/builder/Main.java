package builder;

public class Main {

	public static void main(String[] args) {
		Usuario codi = Usuario.Make("Codi", "Facilito").Build();
		Usuario codiEmail = Usuario.Make("Codi", "Facilito")
				.setEmail("info@correosdelaabuelita.cl")
				.Build();

		System.out.println(codi);
		System.out.println(codiEmail);
	}

}
