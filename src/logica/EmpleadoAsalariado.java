package logica;

public class EmpleadoAsalariado extends Empleado {

	public double deducciones;
	
	public EmpleadoAsalariado(String nombre, double salarioB, double deducciones) {
		super(nombre, salarioB);
		
	this.nombre = nombre;
	this.salarioB = salarioB;
	this.deducciones = deducciones;
	
	
	}

	public double getDeducciones() {
		return deducciones;
	}

	public void setDeducciones(double deducciones) {
		this.deducciones = deducciones;
	}
	public double calcularSalario() {
		salarioB-=deducciones;
		return salarioB;
	}
	}
	
