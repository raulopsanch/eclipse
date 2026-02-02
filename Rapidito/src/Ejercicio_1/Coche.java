package Ejercicio_1;

public class Coche {
	private String marca;
	private String matricula;
	private Motor motor;
	
	public Coche(String marca, String matricula, int cilindrada, String tipo) {
		this.marca = marca;
		this.matricula = matricula;
		Motor motorCoche = new Motor(cilindrada, tipo);
		this.motor = motorCoche;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public Motor getMotor() {
		return this.motor;
	}
	
	@Override
	public String toString() {
		return this.marca + " con matrícula " + 
				"\n//////----" +this.matricula + " " + this.motor.toString() + "----//////";
	}
}
