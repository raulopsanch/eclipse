package empresa;

public class Empresa {

	public static void main(String[] args) {
		Empleado[] empleados = new Empleado[5];
		
		empleados[0] = new Empleado("Juan", 20000, 002);
		empleados[1] = new Empleado("Ana", 15000, 004);
		empleados[2] = new Jefe("María", 25000, 005, 10000, "Administración");
		empleados[3] = new Jefe("Adrián", 20000, 001, 12000, "RRHH");
		empleados[4] = new Empleado("Elena", 30000, 003);
		
		mostrarEmpleados(empleados);
		System.out.println();
		incrementarSueldo(empleados);
		System.out.println();
		mostrarSueldos(empleados);

	}
	
	public static void mostrarEmpleados(Empleado[] empleados) {
		for (Empleado emp : empleados) {
			System.out.println(emp.toString());
		}
	}
	
	public static void incrementarSueldo(Empleado[] empleados) {
		for (int i = 0; i < empleados.length; i++) {
			double nuevoSueldo = empleados[i].getSueldo() * 1.05;
			empleados[i].setSueldo(nuevoSueldo);
		}
	}
	
	public static void mostrarSueldos(Empleado[] empleados) {
		for ( Empleado emp : empleados) {
			System.out.print(emp.getNombre() + ": ");
			System.out.println(emp.getSueldo() + "€");
		}
	}

}
