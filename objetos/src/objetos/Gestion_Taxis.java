package objetos;

import java.util.Scanner;

public class Gestion_Taxis {
	String matricula;
	String distrito; // sur, norte, etc
	String tipoMotor; // diésel, gasolina, eco
	
	// Creo el constructor normal con todos los atributos
	public Gestion_Taxis(String matricula, String distrito, String tipoMotor) {
		this.matricula = matricula;
		this.distrito = distrito;
		this.tipoMotor = tipoMotor;
	}
	
	// Creo el constructor con un tipoMotor por defecto
	public Gestion_Taxis(String matricula, String distrito) {
		this.matricula = matricula;
		this.distrito = distrito;
		this.tipoMotor = "eco";
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getDistrito() {
		return this.distrito;
	}
	
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	
	public String getTipoMotor() {
		return this.tipoMotor;
	}
	
	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}
	
	public String informacionTaxi() {
		return "\nMatrícula: " + this.matricula +
				"\nDistrito: " + this.distrito +
				"\nTipo de motor: " + this.tipoMotor;
	}
	
	public boolean mismoDistrito(Gestion_Taxis otroTaxi) {
		return this.distrito.equalsIgnoreCase(otroTaxi.getDistrito());
	}
	
	
	public static void llenarArray(Gestion_Taxis[] array) {
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("Introduce la matrícula del taxi: ");
			String matricula = entrada.nextLine();
			
			System.out.print("Introduce el distrito del taxi: ");
			String distrito = entrada.nextLine();
			
			System.out.print("Introduce el tipo de motor del taxi: ");
			String tipoMotor = entrada.nextLine();
			
			if (!tipoMotor.isEmpty()) {
				array[i] = new Gestion_Taxis(matricula, distrito, tipoMotor);
			} else {
				array[i] = new Gestion_Taxis(matricula, distrito);
			}
			
			
		}
	}
	
	public static void mostrarArray(Gestion_Taxis[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print("Taxi" + (i + 1) + "-");
			System.out.print(array[i].getMatricula() + "-");
			System.out.print(array[i].getDistrito() + "-");
			System.out.println(array[i].getTipoMotor());
		}
	}
	
	public static String buscarTaxi(Gestion_Taxis[] array, String distrito) {
		for (int i = 0; i < array.length; i++) {
			if (distrito.equalsIgnoreCase(array[i].getDistrito())) {
				return array[i].getMatricula();
			}
		}
		
		return "Error. No ha taxis en ese distrito";
	}
	

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Gestion_Taxis[] taxis = new Gestion_Taxis[5];

		llenarArray(taxis);
		
		System.out.println();
		mostrarArray(taxis);
		
		System.out.println();
		System.out.print("Introduce un distrito: ");
		String distrito = entrada.nextLine();

		System.out.print("Taxi en el distrito " + distrito + ": ");
		System.out.print(buscarTaxi(taxis, distrito));
	}

}