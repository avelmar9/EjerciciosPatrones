package ejercicio2;

public class PushNotificacion implements Notificacion{

	@Override
	public void enviar(String mensaje) {
		System.out.println("Push:"+mensaje);
		
	}

}
