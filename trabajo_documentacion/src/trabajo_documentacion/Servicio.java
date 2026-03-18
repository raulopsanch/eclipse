package trabajo_documentacion;

import java.util.ArrayList;

/**
 * <p>Clase que sirve para hacer algunas modificaciones o borrar
 * algún pedido del sistema</p>
 * 
 * @author Raúl López
 * @version 1.0
 */
public class Servicio {
private ArrayList<Pedido> pedido;
	
	
	/**
	 * <P>Constructor principal de la clase Servicio</p>
	 * @param pedido
	 */
	public Servicio (ArrayList<Pedido> pedido) {
		this.pedido = pedido;
	}
	
	/**
	 *<p>Obtiene todos los datos de un pedido</p>
	 * @return Datos de un pedido
	 */
	public ArrayList<Pedido> getPedido() {
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
	public void modificarPedido(ArrayList<Pedido> pedido, int id,
			String nombre, double precio, Estado estado, int diasEntrega) {
		for (Pedido p : pedido) {
			if (id == p.getId()) {
				Producto productoActual = p.getProducto();
					productoActual.setNombreProducto(nombre);
					productoActual.setPrecioProducto(precio);

			}
		}
	}
	
	
	/**
	 * <p>Borra un pedido del sistema</p>
	 * @param pedidos
	 * @param id
	 */
	public boolean cancelarPedido(ArrayList<Pedido> pedidos, int id) {
		for (int i = 0; i < pedidos.size() - 1; i++) {
			Pedido pedidoActual = pedidos.get(i);
			if (pedidoActual.getId() == id) {
				pedidos.remove(i);
				System.out.println("Pedido cancelado");
				pedidos.trimToSize();
				return true;
			}
		}

		System.out.println("Identificador no encontrado");
		return false;
	}
	
}
