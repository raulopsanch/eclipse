package Ejercicio_07;

public class VehiculoAlquilado {
	private Vehiculo vehiculo;
	private Cliente cliente;
	private String fechaAlquiler;
	private int diasAlquiler;
	
	public VehiculoAlquilado(String matricula, String marca, String modelo, double tarifa, boolean disponible, 
			String dni, String nombre, String apellidos, String telefono, String fechaAlquiler, int diasAlquiler) {
		Vehiculo v = new Vehiculo(matricula, marca, modelo, tarifa, disponible);
		this.vehiculo = v;
		Cliente c = new Cliente(dni, nombre, apellidos, telefono);
		this.cliente = c;
		this.fechaAlquiler = fechaAlquiler;
		this.diasAlquiler = diasAlquiler;
	}
	
	public Vehiculo getVehiculo() {
		return this.vehiculo;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public String getFechaAlquiler() {
		return this.fechaAlquiler;
	}
	
	public int getDiasAlquiler() {
		return this.diasAlquiler;
	}
	
	public String getImporteTotal() {
		double total = this.diasAlquiler * this.vehiculo.getTarifa();
		
		return "El importe total de alquiler es: " + total + "€.";
	}
}
