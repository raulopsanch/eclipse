package JavaSA;

public class Main {

	public static void main(String[] args) {
		Empleado[] empleados = new Empleado[5];
		
		empleados[0] = new Empleado("Juan", 1500, 5);
		empleados[1] = new Programador("Macarena", 1800, 7, "Java");
		empleados[2] = new Gerente("Miguel", 1500, 3, "RRHH");
		empleados[3] = new Gerente("Raquel", 2000, 3, "Dirección");
		empleados[4] = new Programador("Antonio", 2100, 9, "PHP, C++, java");
		
		
		for(Empleado e : empleados) {

			System.out.print(e.infoEmpleado());
			
			if ( e instanceof Programador) {
				Programador p = (Programador)e;
				System.out.print(p.infoLenguaje());
			} else if ( e instanceof Gerente) {
				Gerente g = (Gerente)e;
				System.out.print(g.infoDepartamento());
			}
			System.out.println();
			System.out.println();
		}
		
	}

}
