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
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String numCuenta() {
		return this.numCuenta;
	}
	
	public String Depositar(double cantidad) {
		double saldo = this.saldo + cantidad;
		this.setSaldo(saldo);
		
		return "Se han añadido " + cantidad + "€ a tu cuenta";
	}
	
	public String Transferencia(double cantidad, String cuenta) {
		double saldo = this.saldo - cantidad;
		this.setSaldo(saldo);
		
		return "Se han transferido " + cantidad + "€ a la cuenta " + cuenta + " Correctamente.";
	}
	
}
