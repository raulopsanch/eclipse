package examen2;

import java.util.Scanner;

public class Coche {
	String matricula;
	String cliente;
	
	public Coche(String matricula, String cliente) {
		this.matricula = matricula;
		this.cliente = cliente;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getCliente() {
		return this.cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public String mostrarInfo() {
		return "La matrícula " + this.matricula + " corresponde a " + this.cliente;
	}
	
	public static void mostrarGrupo(Coche[] array) {
		for(int j = 0; j < array.length; j++) {
			System.out.println(array[j].mostrarInfo());
		}
	}
	

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Coche[] clientes = new Coche[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Introduce la matrícula: ");
			String matricula = entrada.nextLine();
			
			System.out.print("Introduce nombre de cliente: ");
			String cliente = entrada.nextLine();
			
			clientes[i] = new Coche(matricula, cliente);
		}
		
		System.out.println();
		
		mostrarGrupo(clientes);
	}

}