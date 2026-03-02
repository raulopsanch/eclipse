package ejercicio_01;

public class Rectangulo implements Figura{
	private double lado1;
	private double lado2;
	
	public Rectangulo(double lado1, double lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	public double getLado1() {
		return this.lado1;
	}
	
	public double getLado2() {
		return lado2;
	}
	
	@Override
	public double calcularArea() {
		double area = this.lado1 * this.lado2;
		return area;
	}
	
	@Override
	public double calcularPerimetro() {
		double perimetro = 2 * (this.lado1 + this.lado2);
		return perimetro;
	}
}
