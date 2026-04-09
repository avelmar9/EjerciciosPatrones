package ejercicio1;



public class ServicioUsuarios {
	private Logger log;

	public ServicioUsuarios() {

		log = Logger.getInstance();
	}

	public void registrarUsuarios() {
		log.registrar("[Ángel] Usuario creado");
		log.registrar("[Antonio] Usuario eliminado");
		
	}

}
