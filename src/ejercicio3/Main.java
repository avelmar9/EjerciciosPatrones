package ejercicio3;

public class Main {

	public static void main(String[] args) {
		
		Pedido ped= new Builder("Jose Antonio", "Manuel de Falla")
				.setEmail("heeeyy@gmail.com")
				.setTelefono("+34678901234")
				.setObservaciones("No tires el paquete pls")
				.build();
	
		System.out.println(ped);
	}

}
