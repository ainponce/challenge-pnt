package supermercado;

public class ProductoBebida extends Producto {
    private double litros;

    public ProductoBebida(String nombre, double litros, double precio) {
        super(nombre, precio);
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Litros: " + litros + " /// Precio: $" + precio;
    }
}
