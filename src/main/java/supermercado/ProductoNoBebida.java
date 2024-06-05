package supermercado;

public class ProductoNoBebida extends Producto {
    private String contenido;
    private String unidadDeVenta;

    public ProductoNoBebida(String nombre, String contenido, double precio) {
        super(nombre, precio);
        this.contenido = contenido;
        this.unidadDeVenta = "";
    }

    public ProductoNoBebida(String nombre, double precio, String unidadDeVenta) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
        this.contenido = "";
    }

    @Override
    public String toString() {
        if (!contenido.isEmpty()) {
            return "Nombre: " + nombre + " /// Contenido: " + contenido + " /// Precio: $" + precio;
        } else {
            return "Nombre: " + nombre + " /// Precio: $" + precio + " /// Unidad de venta: " + unidadDeVenta;
        }
    }
}
