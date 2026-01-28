package ElectroDAW;

public class Main {

	public static void main(String[] args) {
		Electrodomestico[] electrodomesticos = new Electrodomestico[10];
		
		electrodomesticos[0] = new Electrodomestico(325, 60, 'A', "blanco");
		electrodomesticos[1] = new Lavadora(200, 60, "Negro");
		electrodomesticos[2] = new Television(500, 20, 'E', "Negro", 42, false);
		electrodomesticos[3] = new Television(350, 12, 'A', "Negro", true);
		electrodomesticos[4] = new Lavadora(350, 45, 'A', "Gris", 20);
		electrodomesticos[5] = new Electrodomestico(560, 85, "Verde");
		electrodomesticos[6] = new Lavadora(335, 'E', 15);
		electrodomesticos[7] = new Television(660, 'B', "Negro", 60, true);
		electrodomesticos[8] = new Television(750, 35, 'A', "Gris", 55, true);
		electrodomesticos[9] = new Electrodomestico(950, 70, 'A');
		
		int preciototalElectrodomestico = 0;
		int preciototalLavadora = 0;
		int preciototalTelevision = 0;

		for(Electrodomestico elec : electrodomesticos) {
			preciototalElectrodomestico += elec.precioFinal();
			if (elec instanceof Lavadora) {
				Lavadora lav = (Lavadora)elec;
				preciototalLavadora += lav.precioFinal();
			} else if (elec instanceof Television) {
				Television tele = (Television) elec;
				preciototalTelevision += tele.precioFinal();
			}
		}
		
		System.out.println("Precio de electrodomesticos: " + preciototalElectrodomestico);
		System.out.println();
		System.out.println("Precio de lavadorass: " + preciototalLavadora);
		System.out.println();
		System.out.print("Precio de televisiones: " + preciototalTelevision);

	}

}
