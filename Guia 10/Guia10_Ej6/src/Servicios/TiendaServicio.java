/*
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaServicio {

    static HashMap<String, Double> tienda = new HashMap<>();
    static Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public void agregarProductos() {
        System.out.print("Ingrese el nombre del producto que desea agregar: ");
        String nombre = leer.next();
        if (!comprobar(nombre)) {
            System.out.print("Ingrese el precio de " + nombre + ": ");
            Double precio = leer.nextDouble();
            tienda.put(nombre, precio);
        } else {
            System.out.println("El producto ya se encuentra en la lista");
        }
    }

    public void cargarProductos() {
        String op;
        do {
            agregarProductos();
            System.out.print("Desea agregar un nuevo producto? (si/no)");
            op = leer.next().toLowerCase();
            while (!op.equals("si") && !op.equals("no")) {
                System.out.print("Eligio una opcion invalida. Intente nuevamente: ");
                op = leer.next();
            }
        } while (op.equals("si"));
    }

    public boolean comprobar(String producto) {
        return tienda.containsKey(producto);
    }

    public void modificarPrecio() {
        System.out.print("Ingrese el producto al que desea modificar su precio: ");
        String prod = leer.next();
        if (comprobar(prod)) {
            System.out.print("Ingrese el nuevo valor de " + prod + ": ");
            tienda.replace(prod, leer.nextDouble());
            System.out.println("El precio de " + prod + " ha sido modificado con exito!");
        } else {
            System.out.println("El producto no se encuentra en la lista. Puede agregarlo desde la opción en el menú.");
        }
    }

    public void eliminar() {
        System.out.print("Ingrese el producto al que desea eliminar de la lista: ");
        String prod = leer.next();
        if (comprobar(prod)) {
            tienda.remove(prod);
            System.out.println("El producto ha sido eliminado con exito!");
        } else {
            System.out.println("El producto no se encuentra en la lista. Aunque ese era su fin asi que no hay problema.");
        }
    }

    public void mostrarProductos() {
        System.out.println("-------------------");
        for (Map.Entry<String, Double> entry : tienda.entrySet()) {
            System.out.println("Producto: " + entry.getKey() + "\n"
                    + "Precio: " + entry.getValue());
            System.out.println("-------------------");
        }
    }

    public void menu() throws InterruptedException {
        System.out.println("Bienvenido!");
        System.out.println("Para comenzar, agregaremos un producto.");
        agregarProductos();
        Thread.sleep(1000);
        int op;
        do{
            System.out.println("Ingrese una opción \n"
                + "1- Agregar un producto a la tienda \n"
                + "2- Modificar el precio de un prodcuto \n"
                + "3- Eliminar un producto de la tienda \n"
                + "4- Ver la lista de productos \n"
                + "5- Salir");
        op = leer.nextInt();
        while (op < 1 || op > 5) {
            System.out.print("Ingreso una opcion invalida. Intente nuevamente: ");
            op = leer.nextInt();
        }
        switch (op) {
            case 1:
                cargarProductos();
                break;
            case 2:
                modificarPrecio();
                break;
            case 3:
                eliminar();
                break;
            case 4:
                mostrarProductos();
                break;
            case 5:
                System.out.println("Gracias por utilizar nuestros servicios.");
                break;
        }
        Thread.sleep(1000);
        } while (op >= 1 && op < 5);
    }
}
