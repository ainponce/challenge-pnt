package supermercado;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = cargarProductos();

        for (Producto producto : productos) {
            System.out.println(producto);
        }

        System.out.println("=============================");

        Producto productoMasCaro = Collections.max(productos);
        Producto productoMasBarato = Collections.min(productos);

        System.out.println("Producto más caro: " + productoMasCaro.getNombre());
        System.out.println("Producto más barato: " + productoMasBarato.getNombre());
    }

    private static ArrayList<Producto> cargarProductos() {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new ProductoBebida("Coca-Cola Zero", 1.5, 20));
        productos.add(new ProductoBebida("Coca-Cola", 1.5, 18));
        productos.add(new ProductoNoBebida("Shampoo Sedal", "500ml", 19));
        productos.add(new ProductoNoBebida("Frutillas", 64, "kilo"));
        return productos;
    }
}
