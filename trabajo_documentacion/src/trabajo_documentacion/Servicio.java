package trabajo_documentacion;

/**
 * <p>Clase que sirve para hacer algunas modificaciones o borrar
 * algún pedido del sistema</p>
 * 
 * @author Raúl López
 * @version 1.0
 */
public class Servicio {
	private Pedido pedido;
	
	
	/**
	 * <P>Constructor principal de la clase Servicio</p>
	 * @param pedido
	 */
	public Servicio (Pedido pedido) {
		this.pedido = pedido;
	}
	
	/**
	 *<p>Obtiene todos los datos de un pedido</p>
	 * @return Datos de un pedido
	 */
	public Pedido getPedido() {
		return this.pedido;
	}
	
	
	/**
	 * <p>Modifica el pedido de un sistema</p>
	 * @param pedido
	 * @param id
	 * @param nombre
	 * @param precio
	 * @param estado
	 * @param diasEntrega
	 */
	public void modificarPedido(Pedido[] pedido, int id, 
			String nombre, double precio, Estado estado, int diasEntrega) {
		for (int i = 0; i < pedido.length; i++) {
			if (id == pedido[i].getId()) {
				pedido[i] = pedido[i].crearPedido(nombre, precio, estado, diasEntrega);
			}
		}
	}
	
	
	/**
	 * <p>Borra un pedido del sistema</p>
	 * @param pedido
	 * @param id
	 */
	public boolean cancelarPedido(Pedido[] pedidos, int id) {
		for (int i = 0; i < pedidos.length; i++) {
			if (pedidos[i].getId() == id) {
				pedidos[i] = null;
				System.out.println("Pedido cancelado");
				return true;
			}
		}

		System.out.println("Identificador no encontrado");
		return false;

	}
	
}
