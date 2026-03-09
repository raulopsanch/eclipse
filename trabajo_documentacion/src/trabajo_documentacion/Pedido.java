package trabajo_documentacion;

import java.time.LocalDate;
import java.util.Date;

public class Pedido {
	private int id;
	private Producto producto;
	private Estado estado;
	private LocalDate fechaRealizacion;
	private LocalDate fechaEntrega;
	private Pedido[] pedidos;
	
	public Pedido(int id, String nombre, double precio, Estado estado, LocalDate fechaRealizacion, LocalDate fechaEntrega) {
		this.id = id;
		Producto product = new Producto (nombre, precio);
		this.producto = product;
		this.fechaRealizacion = fechaRealizacion;
		this.fechaEntrega = fechaEntrega;
	};
	
	public int getId() {
		return this.id;
	}
	
	
	public Producto getProducto() {
		return this.producto;
	}
	
	
	public Estado getEstado() {
		return this.estado;
	}
	
	
	public LocalDate getFechaRealizacion() {
		return this.fechaRealizacion;
	}
	
	
	public LocalDate getFechaEntrega() {
		return this.fechaEntrega;
	}
	
	
	public Pedido[] getPedidos() {
		return this.pedidos;
	}
	
	
	public void crearPedido(String nombre) {
		
	}
	
	
	public String consultarPedido(int id) {
		if (this.id == id) {
			return this.producto.toString() + "\nEstado: " + this.estado + 
					"\nRealizado: " + this.fechaRealizacion + "\nFecha estimada de entrega: " +
		this.fechaEntrega;
		} else {
			return "Error, el id no existe";
		}
	}
	
	
	public void actualizarEstadoPedido(Estado estado) {
		this.estado = estado;
	}
	
	
	public double precioTotal() {
		double suma = 0;
		
		for (int i = 0; i < pedidos.length; i++) {
			
		}
		return suma;
	}
	
	
	public void fechaDeRealizacion(String nombre) {
		for (Pedido p : pedidos) {
			if (this.producto.getNombreProducto().equalsIgnoreCase(nombre)) {
				System.out.println(p.fechaRealizacion);
			}
		}
	}
	
	
	public void pedidosRealizadosEnUnaFecha(LocalDate fecha) {
		for (Pedido p : pedidos) {
			if (this.getFechaRealizacion().equals(fecha)) {
				System.out.println(p);
			}
		}
	}
	
	@Override
	public String toString() {
		return "\nId pedido: " + this.id + this.producto.toString() + "\nRealizado: " + this.fechaRealizacion +
				"\nEstado del pedido: " + this.estado + "\nFecha estimada de entrega: " + this.fechaEntrega;
	}
	
}
