package Ejercicio_01;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Empleado implements Bonificar, Calcular, Mostrar{
	private String nombre;
	private String apellidos;
	private double salarioBase;
	private LocalDate fechaIngreso;
	
	public Empleado(String nombre, String apellidos, double salarioBase, LocalDate fechaIngreso) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salarioBase = salarioBase;
		this.fechaIngreso = fechaIngreso;
		
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public double salarioBase() {
		return this.salarioBase;
	}
	
	public LocalDate getFechaIngreso() {
		return this.fechaIngreso;
	}
	
	@Override
	public double calcularSalario() {
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(this.fechaIngreso, fechaActual);
		int anho = periodo.getYears();
				
		double incremento = this.salarioBase * PORCENTAJE_SALARIO * anho;
		
		return salarioBase + incremento;
	}
	
	@Override
	public double calcularBono() {
		return calcularSalario() * BONIFICACION;
	}
	
	@Override
	public void mostrarInformacion() {
		System.out.println("====Información de empleado====");
		System.out.print("Nombre: " + this.nombre.toUpperCase());
		System.out.println(" Tiene " + this.nombre.length() + " letras.");
		System.out.print("Apellidos: ");
		String[] dosApellidos = apellidos.split(" ");
		if (dosApellidos.length == 2) { 
			if (dosApellidos[0].contains("a") & dosApellidos[1].contains("a")) {
				System.out.println(this.apellidos.toUpperCase());
			} else if (dosApellidos[0].contains("a") & !dosApellidos[1].contains("a")) {
				System.out.println(dosApellidos[0].toUpperCase() + " ----");
			} else if (!dosApellidos[0].contains("a") & dosApellidos[1].contains("a")) {
				System.out.println(" ----" + dosApellidos[1].toUpperCase());
			}
		} else if (dosApellidos.length == 1) {
			if (dosApellidos[0].contains("a")) {
				System.out.println(dosApellidos[0].toUpperCase());
			} else {
				System.out.println("----");

			}
		}
		
		
		System.out.println("Salario base: " + this.salarioBase + "€");
		System.out.println("Salario actual: " + calcularSalario() + "€");
		System.out.println("Bonificación obtenida: " + calcularBono() + "€");
	}
	
}
