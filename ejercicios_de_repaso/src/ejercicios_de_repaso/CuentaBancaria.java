package ejercicios_de_repaso;

public class CuentaBancaria {
	double saldo;
	
	public CuentaBancaria(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double cantidad) {
		if(cantidad > 0) {
			saldo += cantidad;
			System.out.println("Depósito exitoso. Nuevo saldo: €" + saldo);
		}
	}
	
	public void retirar(double cantidad) {
		if(cantidad > 0 && cantidad <= saldo) {
			saldo -= cantidad;
			System.out.println("Retiro exitoso. Nuevo saldo: €" + saldo);
		} else {
			System.out.println("Fondos insuficientes o cantidad no válida");
		}
	}
	

	public static void main(String[] args) {
		CuentaBancaria miCuenta = new CuentaBancaria(1000.0);
		System.out.println("Saldo inicial: €" + miCuenta.getSaldo());
		
		miCuenta.depositar(500);
		miCuenta.retirar(200);
		miCuenta.retirar(1450);

	}

}
