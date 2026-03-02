package ejercicio_01;



public class Circulo implements Figura{
	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	@Override
	public double calcularArea() {
		double area = Math.PI * (radio * radio);
		return area;
	}
	
	@Override
	public double calcularPerimetro() {
		double perimetro = 2 * Math.PI * radio;
		return perimetro;
	}
}
