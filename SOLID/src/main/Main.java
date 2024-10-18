package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Rectangulo rectangulo = new Rectangulo(10, 20);
        Presentacion presentacion = new Presentacion();
        presentacion.imprimir(rectangulo);
        
        Triangulo triangulo = new Triangulo(10, 5);
        presentacion.area(rectangulo);
        presentacion.area(triangulo);
        
	}

}
