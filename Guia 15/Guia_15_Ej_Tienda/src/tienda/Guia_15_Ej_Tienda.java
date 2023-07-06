package tienda;

import java.util.InputMismatchException;
import java.util.Scanner;
import tienda.servicios.FabricanteServicio;
import tienda.servicios.ProductoServicio;

public class Guia_15_Ej_Tienda {

    public static void main(String[] args) throws Exception {
        // Holis
        ProductoServicio pS = new ProductoServicio();
        FabricanteServicio fS = new FabricanteServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int op = 0;
        
        do {
            System.out.println("~Menú Facherito~\n"
                    + "1. Nombres de todos los productos\n"
                    + "2. Nombres y precios de todos los productos\n"
                    + "3. Productos con precio entre 120 y 202\n"
                    + "4. Consultar Portátiles\n"
                    + "5. Producto más barato\n"
                    + "6. Ingresar un producto\n"
                    + "7. Ingresar un fabricante\n"
                    + "8. Modificar datos de un producto\n"
                    + "9. Shao!\n");
            System.out.print("Ingrese una opción: ");
            
            try {
                op = leer.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ha ingresado un dato erroneo! Intente nuevamente.");
                continue;
            }
            
            Thread.sleep(1000);
            
            System.out.println("");
            System.out.println("------------------------------------------------");
            System.out.println("");
            
            switch (op) {
                case 1:
                    pS.listarProducto(1);
                    break;
                case 2:
                    pS.listarProducto(2);
                    break;
                case 3:
                    pS.listarProducto(3);
                    break;
                case 4:
                    pS.listarProductoCondicionNombre("portatil");
                    break;
                case 5:
                    pS.listarProductoCondicionPrecio("ASC", 1);
                    break;
                case 6:
                    pS.guardarProducto();
                    break;
                case 7:
                    fS.guardarFabricante();
                    break;
                case 8:
                    pS.modificarProducto();
                    break;
                case 9:
                    System.out.println("Hasta la próxima!");
                    break;
                default:
                    System.out.println("Ha ingresado una opción no contemplada en el menú. Vuelva a intentar");
                    break;
            }
            
            Thread.sleep(1000);
            
            System.out.println("");
            System.out.println("------------------------------------------------");
            System.out.println("");
            
        } while (op != 9);
    }

}
