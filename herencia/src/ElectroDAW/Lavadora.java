package ElectroDAW;

public class Lavadora extends Electrodomestico {
	private int carga;
	
	public Lavadora() {
		super();
		this.carga = 5;
	}
	
	public Lavadora(int pBase, int peso) {
		super(pBase, peso);
		this.carga = 5;
	}
	
	public Lavadora(int pBase, int peso, char consumoEnergetico, String color, int carga) {
		super(pBase, peso, consumoEnergetico, color);
		this.carga = carga;
	}
	
	public Lavadora(int pBase, int peso,  String color) {
		super(pBase, peso, color);
		this.carga = 5;
	}
	
	public Lavadora(int pBase, char consumoEnergetico, int carga) {
		super(pBase, consumoEnergetico);
		this.carga = carga;
	}
	
	public int getCarga() {
		return this.carga;
	}
	
	@Override
	public int precioFinal() {
		int precio = super.precioFinal();
		if (this.carga > 30) {
			precio += 50;
		}
		return precio;
	}

}
