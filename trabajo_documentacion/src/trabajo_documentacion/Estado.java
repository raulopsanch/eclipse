package trabajo_documentacion;

/**
 * <p>Enumeración que define los posibles estados
 * de un pedido en el sistema</p>
 * 
 * 
 * @author Raúl López Sánchez
 * @version 1.0
 */
public enum Estado {
	/** Pedido creadp pero aún no procesado */
	realizado, 
	
	/** Pedido preparado y enviado al cliente */
	enviado,
	
	/** Pedido entregado al cliente satisfactoriamente */
	entregado,
	
	/** Pedido en espera por algún motivo (falta de stock, etc) */
	pendiente;
}
