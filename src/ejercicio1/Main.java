package ejercicio1;


public class Main {

	public static void main(String[] args) {

ServicioUsuarios su= new ServicioUsuarios();
ServicioPedidos sp= new ServicioPedidos();

su.registrarUsuarios();
sp.registrarPedidos();
Logger.getInstance().mostrarLogs();
	}

}
