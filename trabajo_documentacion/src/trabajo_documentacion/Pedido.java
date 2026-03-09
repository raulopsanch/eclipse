package trabajo_documentacion;

import java.util.Date;

public class Pedido {
	private int id;
	private String nombre;
	private double precio;
	private Estado estado;
	private Date fechaRealizacion;
	private Date fechaEntrega;
	private Pedido[] pedidos;
	
	public Pedido() {};
	
	
	public void crearPedido(String nombre) {
		
	}
	
	
	public String consultarPedido(int id) {
		if (id == this.id) {
			return this.nombre + ", " + this.precio + ", " + this.estado + ", " + this.fechaRealizacion + ", " +
		this.fechaEntrega;
		} else {
			return "Error, el id no existe";
		}
	}
	
	
	public void actualizarEstadoPedido(Estado estado) {
		System.out.println("Hola_mund0");
	}
	
}
