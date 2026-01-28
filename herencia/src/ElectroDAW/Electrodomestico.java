package ElectroDAW;

public class Electrodomestico {
	private int pBase;
	private int peso;
	private char consumoEnergetico;
	private String color;
	
	
	
	public Electrodomestico() {
		this.pBase = 100;
		this.peso = 5;
		this.consumoEnergetico = 'F';
		this.color = "blanco";
		
	}
	
	public Electrodomestico(int pBase, int peso) {
		this.pBase = pBase;
		this.peso = peso;
		this.consumoEnergetico = 'F';
		this.color = "blanco";
		
	}
	
	public Electrodomestico(int pBase, int peso, char consumoEnergetico, String color) {
		this.pBase = pBase;
		this.peso = peso;
		this.consumoEnergetico = this.comprobarConsumoenergetico(consumoEnergetico);
		this.color = color;
	}
	
	public Electrodomestico(int pBase, int peso,  String color) {
		this.pBase = pBase;
		this.peso = peso;
		this.consumoEnergetico = 'F';
		this.color = color;
	}
	
	public Electrodomestico(int pBase, char consumoEnergetico) {
		this.pBase = pBase;
		this.consumoEnergetico = this.comprobarConsumoenergetico(consumoEnergetico);
	}
	
	public Electrodomestico(int pBase, int peso, char consumoEnergetico) {
		this.pBase = pBase;
		this.consumoEnergetico = this.comprobarConsumoenergetico(consumoEnergetico);
		this.peso = peso;
	}
	
	public int getPBase() {
		return this.pBase;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public char getConsumoEnergetico() {
		return this.consumoEnergetico;
	}
	
	public int getPeso() {
		return this.peso;
	}
	
	private char comprobarConsumoenergetico(char letra) {
		letra = Character.toUpperCase(letra);
		
		if(letra >= 'A' && letra <= 'F') {
			return letra;
		}
		
		return 'F';
	}
	
	public int precioFinal() {
		int precio = this.pBase;
		
		switch(this.consumoEnergetico) {
			case 'A':
				precio += 100;
				break;
			case 'B':
				precio += 80;
				break;
			case 'C':
				precio += 60;
				break;
			case 'D':
				precio += 50;
				break;
			case 'E':
				precio += 30;
				break;
			case 'F':
				precio += 10;
				break;
		}
		
		if((this.peso >= 0) && (this.peso <= 19)) {
			precio += 10;
		} else if ((this.peso >= 20) && (this.peso <= 49)) {
			precio += 50;
		} else if ((this.peso >= 50) && (this.peso <= 79)) {
			precio += 80;
		} else if (this.peso >= 80) {
			precio += 100;
		}
		
		return precio;
	}

}
