package Ejercicio_1;

public class Main {
	private Coche[] coches;
	
	public Main(Coche[] coches) {
		
	}
	
	public static void mostrarArray(Coche[] coches) {
		for(Coche c : coches) {
			System.out.println(c.toString());
			System.out.println();
		}
	}
	
	public static boolean buscarCoche(Coche[] coches, String matricula) {
		for (Coche c : coches) {
			if (matricula.equalsIgnoreCase(c.getMatricula())) {
				System.out.println("La matrícula" + matricula + " correspone con:");
				System.out.println("\n\t" + c.toString());
				
				return true;
			}
		}
		return false;
	}
	
	

	public static void main(String[] args) {
		Coche[] coches = new Coche[5];
		
		coches[0] = new Coche("Seat", "124AAA", 1500, "Diesel SD");
		coches[1] = new Coche("Tesla", "1234BBB", 225, "EE RWD");
		coches[2] = new Coche("BMW", "1234CCC", 2200, "V6 M");
		coches[3] = new Coche("Jeep", "1234DDD", 3000, "V6 Diesel");
		coches[4] = new Coche("Audi", "1234FFF", 2000, "Sport TD");
		
	}

}
