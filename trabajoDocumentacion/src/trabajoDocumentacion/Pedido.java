package trabajoDocumentacion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * <p>Clase principal que representa un pedido en el sistema.
 * Gestiona toda la información relacionada con un pedido incluyendo
 * su producto asociado, estados y fechas.</p>
 * 
 *  @author Raúl López
 *  @version 1.0
*/
public class Pedido {
	/** identificador único del pedido */
	private int id;
	/** Producto asociado al pedido */
	private Producto producto;
	/** Estado actual del pedido */
	private Estado estado;
	/** Fecha en que se realizó el pedido */
	private LocalDate fechaRealizacion;
	/** Fecha estimada de entrega del pedido */
	private LocalDate fechaEntrega;
	/** ArrayList que almacena todos los pedidos*/
	private ArrayList<Pedido> pedidos;
	/** Contador de pedidos */
	private int contadorPedidos;
	
	
	/**
	 * <p>Constructor por defecto de la clase Pedido.</p>
	 * <p>Inicializa el array de pedidos</p>
	*/
	public Pedido() {
		this.contadorPedidos = 0;
	}
	
	
	/**
	 * <p>Constructor parametrizado de la clase Pedido</p>
	 * 
	 * @param id
	 * @param nombre
	 * @param precio
	 * @param estado
	 * @param fechaRealizacion
	 * @param fechaEntrega
	 */
	public Pedido(int id, String nombre, double precio, Estado estado, LocalDate fechaRealizacion, LocalDate fechaEntrega) {
		this.id = id;
		Producto product = new Producto (nombre, precio);
		this.producto = product;
		this.fechaRealizacion = fechaRealizacion;
		this.fechaEntrega = fechaEntrega;
	};
	
	
	/**
	 * <p>Obtiene el id del Pedido</p>
	 * 
	 * @return id del pedido
	 */
	public int getId() {
		return this.id;
	}
	
	
	/**
	 * <P>Obtiene el prodcuto asociado al pedido</p>
	 * 
	 * @return producto el pedido
	 */
	public Producto getProducto() {
		return this.producto;
	}
	
	
	/**
	 * <p>Obtiene el estado del pedido</p>
	 * 
	 * @return estado del pedido
	 */
	public Estado getEstado() {
		return this.estado;
	}
	
	
	/**
	 * <p>Obtiene la fecha de realización del pedido</p>
	 * 
	 * @return fecha de realización del pedido
	 */
	public LocalDate getFechaRealizacion() {
		return this.fechaRealizacion;
	}
	
	
	/**
	 * <p>Obtiene la fecha de entrega del pedido</p>
	 * 
	 * @return fecha de entrega del pedido
	 */
	public LocalDate getFechaEntrega() {
		return this.fechaEntrega;
	}
	
	
	/**
	 * <p>Obtiene el array de pedidos</p>
	 * 
	 * @return array de pedidos
	 */
	public ArrayList<Pedido> getPedidos() {
		return this.pedidos;
	}
	
	
	/**
	 * <p></p>
	 * @return
	 */
	public int getContadorPedido() {
		return this.contadorPedidos;
	}
	
	
	/**
	 * <p>Crea un nuevo pedido y lo añade al sistema</p>
	 * 
	 * @param nombre Nombre del producto
	 * @param precio Precio del producto
	 * @param estado Estado del producto
	 * @param diasEntrega Días de entrega del pedido
	 * 
	 * @return Pedido
	 */
	public Pedido crearPedido(String nombre, double precio, Estado estado,
							  int diasEntrega) {
		if (this.contadorPedidos < this.pedidos.size()) {
			int nuevoId = 1000 + this.contadorPedidos + 1;
			
			this.fechaRealizacion = LocalDate.now();
			this.fechaEntrega = this.fechaRealizacion.plusDays(diasEntrega);
			
			Pedido nuevoPedido = new Pedido(nuevoId, nombre, precio, estado,
					fechaRealizacion, fechaEntrega);
					
			pedidos.add(nuevoPedido);
			this.contadorPedidos++;

			 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			    System.out.println("\n✅ Pedido creado exitosamente:");
			    System.out.println("   ID: " + nuevoId);
			    System.out.println("   Producto: " + nombre);
			    System.out.println("   Precio: " + precio + "€");
			    System.out.println("   Estado: " + estado);
			    System.out.println("   Fecha realización: " + fechaRealizacion.format(formatter));
			    System.out.println("   Fecha entrega: " + fechaEntrega.format(formatter));
			return nuevoPedido;
		} else {
			System.out.println("No hay espacio para más pedidos.");
			return null;
		}
	}
	
	
	/**
	 * <p>Constulta un pedido por su id</p>
	 * 
	 * @param id
	 * 
	 * @return Información detallada del pedido
	 */
	public String consultarPedidoPorId(int id) {
		for (int i = 0; i < this.contadorPedidos; i++) {
			if (id == this.id) {
				return pedidos.get(i).toString();
			}
		}
		return "Error, el id" + this.id + " no existe en el sistema";

	}
	
	
	/**
	 * <p>Actualiza el estado de un pedido</p>
	 * 
	 * @param estado
	 */
	public void actualizarEstadoPedido(Estado estado) {
		this.estado = estado;
		System.out.println("Pedido " + this.id + " actualizado a estado " + this.estado);
	}
	
	
	/**
	 * Calcula el precio total de todos los pedidos.
	 * 
	 * @return Suma de los precios de todos los pedidos
	 */
	public double precioTotal() {
		double suma = 0;
		
		for (int i = 0; i < pedidos.size() - 1; i++) {
			suma += pedidos.get(i).getProducto().getPrecioProducto();
		}
		return suma;
	}
	
	
	/**
	 * <p>muesta la fecha de realización de los pedidos de un producto específico.</p>
	 * 
	 * @param nombre
	 */
	public void verFechaDeRealizacion(String nombre) {
		for (Pedido p : pedidos) {
			if (this.producto.getNombreProducto().equalsIgnoreCase(nombre)) {
				System.out.println(p.fechaRealizacion);
			}
		}
	}
	
	
	/**
	 * <p>Método que sirve para buscar los pedidos hecho
	 * en una fecha determinada</p>
	 * @param fecha
	 */
	public void pedidosRealizadosEnUnaFecha(LocalDate fecha) {
		for (Pedido p : pedidos) {
			if (this.getFechaRealizacion().equals(fecha)) {
				System.out.println(p);
			}
		}
	}
	
	
	/**
	 * <p>Método sobreescrito para ver la información de
	 * los pedidods realizados</p>
	 */
	@Override
	public String toString() {
		return "\nId pedido: " + this.id + this.producto.toString() + "\nRealizado: " + this.fechaRealizacion +
				"\nEstado del pedido: " + this.estado + "\nFecha estimada de entrega: " + this.fechaEntrega;
	}
	
}
