package logica;

public class EmpleadoHoras extends Empleado {

	public int horasTrabajadas;
	public double tarifaHora = 20000;
	public EmpleadoHoras(String nombre, double salarioB, int horasTrabajadas) {
		super(nombre, salarioB);
		
	this.nombre = nombre;
	this.salarioB = salarioB;
	this.horasTrabajadas =horasTrabajadas;
	this.tarifaHora = tarifaHora;
	}
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	public double getTarifaHora() {
		return tarifaHora;
	}
	public void setTarifaHora(double tarifaHora) {
		this.tarifaHora = tarifaHora;
	}

	public double calcularSalario() {
		if(horasTrabajadas>=100){
			salarioB = (tarifaHora*100)+30000;
		}if (horasTrabajadas>=80){
			salarioB = (tarifaHora*80)+20000;
		}if (horasTrabajadas>=60){
			salarioB = (tarifaHora*40)+10000;
		} else
			salarioB = tarifaHora*horasTrabajadas;
		return salarioB;
	}
}
