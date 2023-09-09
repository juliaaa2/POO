package logica;

public class Cuadrado extends FormaGeometrica{
private double lado;
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}
	
	@Override
	
    public double calcularArea() {
        return lado * lado;
    }

	
}
