package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Logger {
	private static Logger instancia;
	private List<String> list;

	public Logger() {

		list = new ArrayList<>();
	}

	public void registrar(String mensaje) {
		list.add(mensaje);
	}

	public void mostrarLogs() {
		list.forEach(System.out::println);

	}

	public static Logger getInstance() {
		if (instancia == null) {
			instancia = new Logger();
		}
		return instancia;
	}
}
