package Ejercicio_06;

public class CuentaBancaria {
	private Cliente cliente;
	private double saldo;
	private String numCuenta;
	
	public CuentaBancaria(String DNI, String nombre, int telefono,
			double saldo, String numCuenta) {
		Cliente cli = new Cliente(DNI, nombre, telefono);
		this.cliente = cli;
		this.saldo = saldo;
		this.numCuenta = numCuenta;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	
	
	
}
