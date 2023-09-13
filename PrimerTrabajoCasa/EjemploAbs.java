package front;
import logica.Circulo;
import logica.Cuadrado;
import logica.Rectangulo;
import logica.Triangulo;
public class EjemploAbs {

	public static void main(String[] args) {
		
	    // Crear instancias de cada forma geométrica
        Circulo circulo = new Circulo(5.0);
        Cuadrado cuadrado = new Cuadrado(4.0);
        Rectangulo rectangulo = new Rectangulo(6.0, 3.0);
        Triangulo triangulo = new Triangulo(4.0, 5.0);

        // Calcular y mostrar el área de cada forma
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
   
	}

}
