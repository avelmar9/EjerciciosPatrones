package ejercicio2;

public class NotificacionFactory {
	Notificacion crearNotificacion(NotiType tipo) {
		
		if(tipo==NotiType.EMAIL) {
			return new EmailNotificacion();
		}
		if(tipo==NotiType.SMS) {
			return new SmsNotificacion();
		}
		if(tipo==NotiType.PUSH) {
			return new PushNotificacion();
		
	
		}
		 throw new IllegalArgumentException("Tipo de notificación no soportado");
	}
}
