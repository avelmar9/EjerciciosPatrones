package ejercicio1;



public class ServicioPedidos {
	private Logger log;

	public ServicioPedidos() {

		log = Logger.getInstance();
	}

	public void registrarPedidos() {
		log.registrar("[Teclado] Pedido creado");
		log.registrar("[Monitor] Pedido enviado");
		
	}

}
