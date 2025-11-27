package objetos;

public class Vehiculo {
	
	private String matricula;
	private String marca;
	private String color;
	
	public Vehiculo(String matricula, String marca, String color) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;
	}

	
	public String get_color() {
		return this.color;
	}
	
	public void set_color(String color) {
		this.color = color;
	}
	
	
	public static void main(String[] args) {
		Vehiculo vehiculo1 = new Vehiculo("4578", "Seat", "blanco");
		Vehiculo vehiculo2 = new Vehiculo("8842", "Citroen", "rojo");
		
		// Mostramos el color del vehiculo2
		System.out.println("Color vehiculo2: " + vehiculo2.color);
		
		// Cambiamos el color del vehiculo1
		vehiculo1.color = "rojo";
		
		System.out.print("El vehiculo1 es de color " + vehiculo1.color + " ");
		System.out.print("y el vehiculo2 es de color " + vehiculo2.color);

	}

}
