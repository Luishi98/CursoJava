package tienda.servicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

public class ProductoServicio {

    public void listarProducto(int op) throws Exception {
        ProductoDAO pD = new ProductoDAO();
        Collection<Producto> prod = new ArrayList();
        prod = pD.listarProducto();
        if (op == (1)) {
            // Lista el nombre de todos los productos que hay en la tabla producto.
            for (Producto producto : prod) {
                System.out.println("Producto: " + producto.getNombre());
            }
        } else if (op == (2)) {
            // Lista los nombres y los precios de todos los productos de la tabla producto.
            for (Producto producto : prod) {
                System.out.println("Producto: " + producto.getNombre()
                               + "\nPrecio:     $" + producto.getPrecio());
                System.out.println("");
            }
        } else if (op == (3)) {
            // Listar aquellos productos que su precio esté entre 120 y 202.
            for (Producto producto : prod) {
                if (producto.getPrecio() > 120 && producto.getPrecio() < 202) {
                    System.out.println("Producto: " + producto.getNombre()
                            + "\nPrecio:     $" + producto.getPrecio());
                    System.out.println("");
                }
            }
        }
    }

    public void listarProductoCondicionNombre(String nombre) throws Exception {
        ProductoDAO pD = new ProductoDAO();
        Collection<Producto> prod = new ArrayList();
        prod = pD.listarProductoCondicionNombre(nombre);

        for (Producto producto : prod) {
            // Buscar y listar todos los Portátiles de la tabla producto.
            System.out.println("Codigo: " + producto.getCodigo()
                    + "\nNombre: " + producto.getNombre()
                    + "\nPrecio:    $" + producto.getPrecio()
                    + "\nCodigo del Fabricante: " + producto.getCodigoFabricante());
            System.out.println("");
        }
    }

    public void listarProductoCondicionPrecio(String orden, int limite) throws Exception {
        ProductoDAO pD = new ProductoDAO();
        Collection<Producto> prod = new ArrayList();
        prod = pD.listarProductoCondicionPrecio(orden, limite);

        for (Producto producto : prod) {
            // Listar el nombre y el precio del producto más barato.
            System.out.println("Nombre: " + producto.getNombre()
                    + "\nPrecio:     $" + producto.getPrecio());
        }
    }

    public void guardarProducto() throws Exception {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        try {
            System.out.print("Ingrese el nombre del nuevo producto: ");
            String nombre = leer.next();
            System.out.print("Ingrese el precio del nuevo producto: ");
            double precio = leer.nextDouble();
            System.out.print("Ingese el código del fabricante del nuevo producto: ");
            int codigo_fabricante = leer.nextInt();

            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codigo_fabricante);
            
            ProductoDAO pD = new ProductoDAO();
            pD.guardarProducto(producto);
        } catch (InputMismatchException e) {
            System.out.println("Ha ingresado un dato inválido para su campo, intente nuevamente.");
            guardarProducto();
        }
    }

    public void modificarProducto() throws Exception {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ProductoDAO pD = new ProductoDAO();
        try {
            System.out.print("Ingrese el código del producto que desea modificar: ");
            int codigo = leer.nextInt();
            
            Producto producto = pD.buscarProductoPorCodigo(codigo);

            String respuesta;

            do {

                System.out.println("Qué desea modificar? "
                        + "\n1- Nombre"
                        + "\n2- Precio"
                        + "\n3- Codigo del Fabricante");

                System.out.print("Ingrese una opción: ");
                
                int op;

                do {
                    op = leer.nextInt();
                    if (op < 1 || op > 3) {
                        System.out.println("Opción inválida. Intente nuevamente.");
                    }
                } while (op < 1 && op > 3);

                switch (op) {
                    case 1:
                        System.out.print("Ingrese el nuevo nombre del producto: ");
                        String nombre = leer.next();
                        producto.setNombre(nombre);
                        break;
                    case 2:
                        System.out.print("Ingrese el nuevo precio: ");
                        double precio = leer.nextDouble();
                        producto.setPrecio(precio);
                        break;
                    case 3:
                        System.out.print("Ingrese el código del nuevo fabricante del producto: ");
                        int cod = leer.nextInt();
                        producto.setCodigoFabricante(cod);
                        break;
                }

                System.out.print("Desea modificar algo más de este producto? si/no ");
                respuesta = leer.next();
                pD.modificarProducto(producto);
            } while (respuesta.equalsIgnoreCase("si"));
            
        } catch (InputMismatchException e) {
            System.out.println("Ha ingresado un dato inválido para su campo, intente nuevamente.");
            modificarProducto();
        }
    }

}
