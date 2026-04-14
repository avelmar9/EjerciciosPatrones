package ejercicio3;

public class Pedido {
	private String cliente;
	private String direccion;
	private String telefono;
	private String email;
	private String observaciones;

	 Pedido(Builder builder) {
	     this.cliente= builder.cliente;
	     this.direccion= builder.direccion;
	     this.telefono  = builder.telefono;
	     this.email=builder.email;
	     this.observaciones = builder.observaciones;
}
	@Override
	public String toString() {
	    return String.format("Pedido%nCliente: %s%nDirección: %s%nTeléfono: %s%nEmail: %s%nObservaciones: %s",
	        cliente, direccion, telefono , email ,observaciones);
	}
}
