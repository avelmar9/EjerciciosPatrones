package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int option;
		NotificacionFactory factory = new NotificacionFactory();
		NotiType tipo;
		Notificacion n;

		System.out.println("-Elige el tipo de notificación");
		System.out.println("1.email");
		System.out.println("2.sms");
		System.out.println("3.push");

		option = sc.nextInt();
		switch (option) {
		case 1 -> tipo = NotiType.EMAIL;
		case 2 -> tipo = NotiType.SMS;
		case 3 -> tipo = NotiType.PUSH;
		default -> throw new IllegalArgumentException("Opción no válida");
		}
		n = factory.crearNotificacion(tipo);
		n.enviar("Hola");

	}

}
