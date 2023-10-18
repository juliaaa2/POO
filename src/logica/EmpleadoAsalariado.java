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
public EmpleadoAsalariado buscarEmpleadoAsalariadoPorNombre(EmpleadoAsalariado[] empleados, String nombre) {
    for (EmpleadoAsalariado empleado : empleados) {
        if (empleado.getNombre().equals(nombre)) {
            return empleado;
        }
    }
    return null; // Devuelve null si el empleado no se encuentra
}




	}
	
