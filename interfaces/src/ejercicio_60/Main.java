package ejercicio_60;

public class Main {

	public static void main(String[] args) {
		Polideportivo[] poli = new Polideportivo[3];
		
		poli[0] = new Polideportivo("Municipal", 75, 25, Tipos.TECHADO);
		poli[1] = new Polideportivo("Central", 60, 45, Tipos.TECHADO);
		poli[2] = new Polideportivo("PistaAtletismo", 200, 100, Tipos.ABIERTO);
		
		System.out.println("****Superficie de todos los edificios****");
		System.out.println("------------------------------------------");
		for (Polideportivo p : poli) {
			System.out.println("El Polideportio " + p.getNombre() + 
					" tiene una superficie de " + p.getSuperficieEdificio() + " m2.");
			System.out.println();
		}
		
		System.out.println("\n****Superficie mayor de 2000m2****");
		System.out.println("----------------------------------");
		for (Polideportivo p : poli) {
			if (p.getSuperficieEdificio() > 2000) {
				System.out.println(p.toString());
				System.out.println();
			}
		}
		
		System.out.println("\n****Los edificios techados son****");
		System.out.println("----------------------------------");
		for (Polideportivo p : poli) {
			if (p.getTipoDeInstalacion() == Tipos.TECHADO) {
				System.out.println(p.toString());
				System.out.println();
			}
		}
		
	}

}
