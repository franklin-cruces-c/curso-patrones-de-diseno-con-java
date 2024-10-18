package liskov;

public class Jaguar extends Animal implements IFelinoSalvaje {
	private int edad;
	private float peso;

	
	
	public Jaguar() {
		super();
	}

	public Jaguar(int edad, float peso) {
		super();
		this.edad = edad;
		this.peso = peso;
	}

	public Jaguar(int edad) {
		super();
		this.edad = edad;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the peso
	 */
	public float getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(float peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Jaguar [edad=" + edad + ", peso=" + peso + "]";
	}

	@Override
	public void rugir() {
		// TODO Auto-generated method stub
		System.out.println("El jaguar ruge");
	}

	//Ya no es necesario implementar este metodo porque ahora Jaguar implementa IFelinoSalvaje y no IFelino
	/*
	 * @Override public void maullar() { // TODO Auto-generated method stub throw
	 * new UnsupportedOperationException("El jaguar no maulla"); }
	 */

	@Override
	public void cazar() {
		// TODO Auto-generated method stub
		System.out.println("El jaguar caza");
	}
	public void dormir() {
		System.out.println("El jaguar duerme");
	}
	
}
