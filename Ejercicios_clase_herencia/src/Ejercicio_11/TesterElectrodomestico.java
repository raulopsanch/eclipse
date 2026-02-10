package Ejercicio_11;

public class TesterElectrodomestico {

	public static void main(String[] args) {
		Electrodomestico e1 = new Lavadora("LG", 2.5 );
		
		System.out.println(e1.toString());
		
		System.out.println();
		
		System.out.print("Consumo de la lavadora: ");
		System.out.println(e1.getConsumo(10) + "kw/h");
		
		System.out.print("Coste del consumo total: ");
		System.out.println(e1.getCosteConsumo(10, 1.5) + "€/kw");

	}

}
