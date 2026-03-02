package ejercicio_01;

public class Main {

	public static void main(String[] args) {
		Figura[] figuras = new Figura[5];

		figuras[0] = new Rectangulo(25, 14);
		figuras[1] = new Circulo(5);
		figuras[2] = new Rectangulo(35, 28);
		figuras[3] = new Circulo(17);
		figuras[4] = new Rectangulo(12, 32);
		
		System.out.println("Área y perímetro de las figuras");
		System.out.println("-------------------------------");
		
		System.out.println("El área es " + figuras[0].calcularArea());
		System.out.println("El perímetro es " + figuras[0].calcularPerimetro());
		System.out.println();
		
		System.out.println("El área es " + figuras[1].calcularArea());
		System.out.println("El perímetro es " + figuras[1].calcularPerimetro());
		System.out.println();
		
		System.out.println("El área es " + figuras[2].calcularArea());
		System.out.println("El perímetro es " + figuras[2].calcularPerimetro());
		System.out.println();
		
		System.out.println("El área es " + figuras[3].calcularArea());
		System.out.println("El perímetro es " + figuras[3].calcularPerimetro());
		System.out.println();
		
		System.out.println("El área es " + figuras[4].calcularArea());
		System.out.println("El perímetro es " + figuras[4].calcularPerimetro());
		System.out.println();
		
		System.out.println("---------------------------");
		System.out.println("Área de los círculos");
		System.out.println("----------------------------");
		for (Figura f : figuras) {
			if (f instanceof Circulo) {
				Circulo c = (Circulo)f;
				System.out.println("El círculo con radio " + c.getRadio() +
						" tiene un área " + c.calcularArea());
			}
			System.out.println();
		}
		
	}

}
