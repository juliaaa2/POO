package front;
import logica.EmpleadoAsalariado;
import logica.Empleado;
import logica.EmpleadoHoras;
public class Main {

	public static void main(String[] args) {
		System.out.println("----------Arreglo Empleados por Horas------------");
		EmpleadoHoras[] empleadosh = new EmpleadoHoras[5];
		empleadosh[0]= new EmpleadoHoras("Lina", 0, 100);
		empleadosh[1]= new EmpleadoHoras("Lili", 0, 60);
		empleadosh[2]= new EmpleadoHoras("Juan", 0, 10);
		empleadosh[3]= new EmpleadoHoras("Jordan", 0, 200);
		empleadosh[4]= new EmpleadoHoras("Julia", 0, 100);
for(int i=0; i<empleadosh.length;i++) {
	System.out.println("Empleado por Horas "+(i+1)+":"+empleadosh[i].getNombre()+" salario: "+empleadosh[i].calcularSalario());
}
System.out.println("----------Arreglo Empleados Asalariados------------");
EmpleadoAsalariado[] empleadosA = new EmpleadoAsalariado[5];
empleadosA[0]= new EmpleadoAsalariado("Yenny", 1000000, 100000);
empleadosA[1]= new EmpleadoAsalariado("Lucas", 1000000, 600000);
empleadosA[2]= new EmpleadoAsalariado("David", 1000000, 100000);
empleadosA[3]= new EmpleadoAsalariado("Esteban", 1000000, 200000);
empleadosA[4]= new EmpleadoAsalariado("Santiago", 1000000, 100000);
for(int i=0; i<empleadosA.length;i++) {
	System.out.println("Empleado Asalariado "+(i+1)+":"+empleadosA[i].getNombre()+" salario: "+empleadosA[i].calcularSalario());
}
//se le cambio el nombre al empleado Asalariado
System.out.println("------Cambio de nombre del empleado Asalariado 1 y 4----");
	empleadosA[0].setNombre("Juan");
	empleadosA[3].setNombre("Juana");

	System.out.println("----------Arreglo Empleados Asalariados------------");
	for(int i=0; i<empleadosA.length;i++) {
		System.out.println("Empleado Asalariado "+(i+1)+":"+empleadosA[i].getNombre()+" salario: "+empleadosA[i].getSalarioB());
	}	
	}
}
