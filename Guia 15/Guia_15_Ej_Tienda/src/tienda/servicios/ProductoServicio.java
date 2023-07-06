package tienda.servicios;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

public class ProductoServicio {
    
    public void listarNombre(String op) throws Exception {
        ProductoDAO pD = new ProductoDAO();
        Collection<Producto> prod = new ArrayList();
        prod = pD.listarProducto();
        if (op.equalsIgnoreCase("a")) {
            for (Producto producto : prod) {
                System.out.println("Producto: " + producto.getNombre());
            }
        } else if (op.equalsIgnoreCase("b")) {
            for (Producto producto : prod) {
                System.out.println("Producto: " + producto.getNombre() + 
                        "\nPrecio: " + producto.getPrecio());
            }
        }
    }
}
