package objetos;

import java.util.Scanner;

public class Circulo {
	private double radio;
	
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double calcularArea(double radio) {
		double area = Math.PI * (radio * radio);
		return area;
	}
	
	public double calcularPerimetro(double radio) {
		double perimetro = 2 * Math.PI * radio;
		return perimetro;
	}
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el radio de un círculo: ");
		double radio = entrada.nextDouble();
		
		Circulo circulo1 = new Circulo(radio);
		System.out.println("El área de un círculo de radio " + circulo1.radio + " es: " + circulo1.calcularArea(radio));
		System.out.println("El perímetro de un círculo de radio " + circulo1.radio + " es: " + circulo1.calcularPerimetro(radio));

		radio = 7;
		circulo1.radio = radio;
		System.out.println("El área de un círculo de radio " + circulo1.radio + " es: " + circulo1.calcularArea(radio));
		System.out.println();
		System.out.println("Fin de programa");
	}

}
