package ejercicio3;

public class Builder {
    String cliente;
    String direccion;
    String telefono;
    String email;
    String observaciones;

    public Builder(String cliente, String direccion) {
        if (cliente == null || cliente.isBlank())
            throw new IllegalArgumentException("El cliente es obligatorio.");
        if (direccion == null || direccion.isBlank())
            throw new IllegalArgumentException("La dirección es obligatoria.");

        this.cliente = cliente;
        this.direccion = direccion;
    }

   
    public Builder setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public Builder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Builder setObservaciones(String observaciones) {
        this.observaciones = observaciones;
        return this;
    }

    public Pedido build() {
        return new Pedido(this);
    }
}
