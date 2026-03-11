package Ejercicio_01;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Empleado[] empleados = new Empleado[3];
		
		empleados[0] = new Empleado("Juan", "Lavado", 2400, LocalDate.of(2014, 5, 10));
		empleados[1] = new Empleado("Soledad", "García López",2000, LocalDate.of(2015, 4, 11));
		empleados[2] = new Empleado("Margarita", "Pérez", 2600, LocalDate.of(2019, 9, 1));
		
		for (Empleado e : empleados) {
			e.mostrarInformacion();
			System.out.println();
		}
		

		Empleado mayorSalario = empleados[0];
		
		for (Empleado emp : empleados) {
			if (emp.calcularSalario() > mayorSalario.calcularSalario()) {
				mayorSalario = emp;
			}
		}
		
		 System.out.println("\n=== EMPLEADO CON MAYOR SALARIO ===");
	     System.out.println("Empleado: " + mayorSalario.getNombre() + " " + mayorSalario.getApellidos());
	     System.out.printf("Salario actual: %.2f€\n", mayorSalario.calcularSalario());
	     
	     
	     System.out.println("\nCambiar el apellido de Juan");
	     empleados[0].setApellidos("García");
	     empleados[0].mostrarInformacion();
	     
	     
	     System.out.println("\nQuitar apellido López a Soledad");
	     empleados[1].setApellidos("García");
	     empleados[1].mostrarInformacion();
	     
	     
	     Empleado nombreMasLargo = empleados[0];
			
		for (Empleado emp : empleados) {
			if (emp.getNombre().length() > nombreMasLargo.getNombre().length()) {
				nombreMasLargo = emp;
			}
		}
			
		System.out.println("\n=== EMPLEADO CON EL NOMBRE MÁS LARGO ===");
	    System.out.println(nombreMasLargo.getNombre() + ": " + nombreMasLargo.getNombre().length() + " letras");
	     	     	
	}

}
