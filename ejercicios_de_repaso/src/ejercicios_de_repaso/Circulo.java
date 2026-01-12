package ejercicios_de_repaso;

public class Circulo {
	double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double getRadio() {
		return this.radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double calcularArea() {
		return Math.PI * (this.radio * this.radio);
	}
	
	public double calcularPerimetro() {
		return 2 * Math.PI * this.radio;
	}
	

	public static void main(String[] args) {
		Circulo circulo1 = new Circulo(5);
		
		System.out.println("Área del círculo: " + circulo1.calcularArea());
		
		System.out.println("Perímetro del círculo: " + circulo1.calcularPerimetro());
	}

}
