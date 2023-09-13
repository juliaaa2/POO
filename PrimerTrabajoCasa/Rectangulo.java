package logica;

	public class Rectangulo extends FormaGeometrica {
	    private double base;
	    private double altura;

	    public Rectangulo(double base, double altura) {
	        this.base = base;
	        this.altura = altura;
	    }

	    @Override
	    public double calcularArea() {
	        return base * altura;
	    }
	}
	

