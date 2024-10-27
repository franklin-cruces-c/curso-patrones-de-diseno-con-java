package strategy;

public class Main {

	public static void main(String[] args) {
//Deposito bancario
//Retiro bancario
		Transaccion transaccion1 = new Transaccion(new Deposito());
		System.out.println(transaccion1.ejecutarTransaccion(100, 200));

		Transaccion transaccion2 = new Transaccion(new Retiro());
		System.out.println(transaccion2.ejecutarTransaccion(100, 25));

	}

}
