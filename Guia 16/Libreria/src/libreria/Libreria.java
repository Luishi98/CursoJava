package libreria;

import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.AutorDAO;
import libreria.persistencia.EditorialDAO;
import libreria.persistencia.LibroDAO;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;

public class Libreria {

    public static void main(String[] args) {
        // Holis
        /*
        //----------------------------------------------------------------------
        Autor a1 = new Autor();
        a1.setNombre("Luis");
        Autor a2 = new Autor();
        a2.setNombre("Mica");
        Autor a3 = new Autor();
        a3.setNombre("Kira");
        Autor a4 = new Autor();
        a4.setNombre("Oliver");
        AutorDAO aDAO = new AutorDAO();
        aDAO.guardar(a1);
        aDAO.guardar(a2);
        aDAO.guardar(a3);
        aDAO.guardar(a4);
        Editorial e1 = new Editorial();
        e1.setNombre("Edi1");
        Editorial e2 = new Editorial();
        e1.setNombre("Edi2");
        Editorial e3 = new Editorial();
        e1.setNombre("Edi3");
        Editorial e4 = new Editorial();
        e1.setNombre("Edi4");
        EditorialDAO eDAO = new EditorialDAO();
        eDAO.guardar(e1);
        eDAO.guardar(e2);
        eDAO.guardar(e3);
        eDAO.guardar(e4);
        Libro l1 = new Libro(123l, "Libro1", 2020, 5, 0, 5, a1, e1);
        l1.setTitulo("");
        l1.setAnio(0);
        l1.setEjemplares(5);
        l1.setAutor(a1);
        l1.setEditorial(e1);
        Libro l2 = new Libro(124l, "Libro2", 2020, 6, 0, 6, a2, e2);
        l2.setTitulo("");
        l2.setAnio(0);
        l2.setEjemplares(5);
        l2.setAutor(a2);
        l2.setEditorial(e2);
        Libro l3 = new Libro(125l, "Libro3", 2020, 4, 0, 4, a3, e3);
        l3.setTitulo("");
        l3.setAnio(0);
        l3.setEjemplares(5);
        l3.setAutor(a3);
        l3.setEditorial(e3);
        Libro l4 = new Libro(126l, "Libro4", 2020, 6, 0, 6, a4, e4);
        l4.setTitulo("");
        l4.setAnio(0);
        l4.setEjemplares(5);
        l4.setAutor(a4);
        l4.setEditorial(e4);
        LibroDAO lDAO = new LibroDAO();
        lDAO.guardar(l1);
        lDAO.guardar(l2);
        lDAO.guardar(l3);
        lDAO.guardar(l4);
        //---------------------------------------------------------------------
        */
        LibroServicio lSer = new LibroServicio();
        AutorServicio aSer = new AutorServicio();
        EditorialServicio eSer = new EditorialServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        try {
            int opc;
            do {
                mostrarMenu();
                opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        aSer.crear();
                        break;
                    case 2:
                        eSer.crear();
                        break;
                    case 3:
                        lSer.crear();
                        break;
                    case 4:
                        aSer.modificar().toString();
                        break;
                    case 5:
                        eSer.modificar().toString();
                        break;
                    case 6:
                        lSer.modificar().toString();
                        break;
                    case 7:
                        System.out.println(aSer.consultar().toString());
                        break;
                    case 8:

                        String var;
                        do {
                            mostrarMenuBuscar();
                            var = leer.next();
                            switch (var) {
                                case "a":

                                    break;
                                case "b":

                                    break;
                                case "c":

                                    break;
                                case "d":

                                    break;
                                case "f":
                                    System.out.println(" Saliendo de Buscar Autor \n");
                                    break;
                                default:
                                    System.out.println("Ingreso mal la opcion");
                                    break;
                            }
                        } while (!"f".equals(var));

                    case 0:
                        System.out.println("Shao!");
                        break;
                    default:
                        break;
                }
            } while (opc != 0);

        } catch (Exception e) {
            System.out.println("ERROR 404");
            System.out.println(e);
        }
    }

    public static void mostrarMenuBuscar() {
        System.out.print("\n Ingrese la OPCION de Busqueda : "
                + "\n a) Por ID "
                + "\n b) Por Nombre "
                + "\n c) Por Nombre de Autor "
                + "\n d) Por Nombre de Editorial"
                + "\n f) Salir ");
    }

    public static void mostrarMenu() {

        System.out.println("\n ---- MENU ----");
        System.out.print("\n 1 - Crear Autor "
                + "\n 2 - Crear Editorial "
                + "\n 3 - Crear Libro "
                + "\n 4 - Editar Autor "
                + "\n 5 - Editar Editorial "
                + "\n 6 - Editar Libro "
                + "\n 7 - Buscar Autor "
                + "\n 8 - Buscar Libro "
                + "\n 0 - Salir "
                + "\n Ingrese la OPCION : ");
    }

}
