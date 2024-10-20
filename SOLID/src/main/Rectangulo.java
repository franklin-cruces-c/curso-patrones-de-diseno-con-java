package main;

public class Rectangulo implements IFigura{
	private float base;
	private float altura;

	public Rectangulo(float base, float altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	/**
	 * @return the base
	 */
	public float getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(float base) {
		this.base = base;
	}

	/**
	 * @return the altura
	 */
	public float getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}

	public float area() {
		return this.getBase() * this.getAltura();
	}
	// Este metodo hace que no se cumpla el principio de responsabilidad simple de SOLID
	// por eso es comenta y se crea una nueva clase que se encargue de este requerimiento "Presentacion.class".
	/*
	 * public void imprimir() { System.out.println(this); }
	 */

}
