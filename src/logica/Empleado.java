package logica;

public class Empleado {

	public String nombre;
	public double salarioB;
	
	public Empleado(String nombre, double salarioB) {

		this.nombre = nombre;
		this.salarioB = salarioB;
	}
	
	public double calcularSalario() {
		return salarioB;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalarioB() {
		return salarioB;
	}

	public void setSalarioB(double salarioB) {
		this.salarioB = salarioB;
	}

}
