package ejercicios_de_repaso;

public class Rectangulo {
	double ancho;
	double alto;
	
	public Rectangulo(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public double getancho() {
		return this.ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	
	public double getAlto() {
		return this.alto;
	}
	public void setAlto(double alto) {
		this.alto = alto;
	}
	
	public double calcularArea() {
		double area = this.ancho * this.alto;
		return area;
	}
	

	public static void main(String[] args) {
		Rectangulo rectangulo1 = new Rectangulo(5.25, 10.50);
		
		System.out.println(rectangulo1.calcularArea());
	}

}
