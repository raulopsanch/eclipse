package Ejercicio_06;

public class Tester {

	public static void main(String[] args) {
		CuentaBancaria cuenta1 = new CuentaBancaria("80061025C", "Antonio Pizarro López", 659648754 ,48000, "ES642512580002158");
		
		System.out.println(cuenta1.Depositar(250));
		System.out.println("Nuevo Saldo: " + cuenta1.getSaldo() + "€");
		System.out.println();
		System.out.println(cuenta1.Transferencia(250, "ES35546846886"));
		System.out.println("Nuevo saldo: "+ cuenta1.getSaldo() + "€");

	}

}
