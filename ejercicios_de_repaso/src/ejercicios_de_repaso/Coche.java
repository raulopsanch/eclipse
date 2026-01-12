package ejercicios_de_repaso;

public class Coche {
	String marca;
	String modelo;
	int año;
	
	public Coche(String marca, String modelo, int año) {
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
	}
	
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getAño() {
		return this.año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	
	public String mostrarInfo() {
		return "Marca: " + this.marca
				+ "\nModelo: " + this.modelo
				+ "\nAño: " + this.año;
	}
	

	public static void main(String[] args) {
		Coche coche1 = new Coche("Reanult", "Megane", 2010);
		Coche coche2 = new Coche("Kia", "Cerato", 2002);
		
		System.out.println(coche1.mostrarInfo());
		System.out.println();
		System.out.println(coche2.mostrarInfo());

	}

}
