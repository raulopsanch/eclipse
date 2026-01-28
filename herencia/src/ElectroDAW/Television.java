package ElectroDAW;

public class Television extends Electrodomestico {
	int resolucion;
	boolean STV;
	
	public Television() {
		super();
		this.resolucion = 27;
		this.STV = false;
	}
	
	public Television(int pBase, int peso) {
		super(pBase, peso);
		this.resolucion = 27;
		this.STV = false;
	}
	
	public Television(int pBase, int peso, char consumoEnergetico,
			String color, int resolucion, boolean STV) {
		super(pBase, peso, consumoEnergetico, color);
		this.resolucion = resolucion;
		this.STV = STV;
	}
	
	public Television(int pBase, int peso, char consumoEnergetico,
			String color, boolean STV) {
		super(pBase, peso, consumoEnergetico, color);
		this.resolucion = 27;
		this.STV = STV;
	}
	
	public Television(int pBase, char consumoEnergetico,
			String color, int resolucion, boolean STV) {
		super(pBase, consumoEnergetico, color);
		this.resolucion = resolucion;
		this.STV = STV;
	}
	
	public int getResolucion() {
		return this.resolucion;
	}
	
	public boolean getSTV() {
		return this.STV;
	}
	
	@Override
	public int precioFinal() {
		int precio = super.precioFinal();
		
		if (this.resolucion > 40) {
			precio *= 1.3;
		}
		
		if (this.STV == true) {
			precio += 50;
		}
		
		return precio;
	}

}
