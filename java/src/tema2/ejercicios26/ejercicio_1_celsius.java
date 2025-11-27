package tema2.ejercicios26;

public class ejercicio_1_celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = cambiarFahrenheit(50);
		
		System.out.print("50º Fahrenheit = " + result + "º Celsius.");
	}

	public static double cambiarFahrenheit(double fahrenheit) {
		double celsius = (fahrenheit - 32) * 5/9;
		return celsius;
	}
}
