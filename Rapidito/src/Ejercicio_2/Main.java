package Ejercicio_2;

public class Main {

	public static void main(String[] args) {
		
		Departamento D1 = new Departamento("RRHH", 5);
		Departamento D2 = new Departamento("Infromática", 7);
		Departamento D3 = new Departamento("Administración", 4);
		
		
		Empresa[] empresas = new Empresa[3];
		
		empresas[0] = new Empresa("EnvíaTodo", D1);
		empresas[1] = new Empresa("Recetas.com", D2);
		empresas[2] = new Empresa("ViajesFive", D3);
		
		for (Empresa emp : empresas) {
			System.out.println(emp.toString());
			System.out.println();
		}
	}

}
