package builder.ejercicio;





/**
 * Ejercicio
 * Regla
 * String metodoPago  <- permite asignar valor Si y solo si los tres attr tiene valor (email, tele, direc)
 * String token  < - si y solo si metodo de pago tiene valor
 */


public class Main {

	public static void main(String[] args) {
		Usuario codi = Usuario.Make("Codi", "Facilito").Build();
		Usuario codiEmail = Usuario.Make("Codi", "Facilito")
				.setEmail("info@correosdelaabuelita.cl")
				.setDireccion("calle 20 777")
				.setTelefono("888887777")
				.setMetodoPago("Debito")
				.setToken("ElTokenDeLaIslaMisteriosa")
				.Build();

		System.out.println(codi);
		System.out.println(codiEmail);
	}

}
