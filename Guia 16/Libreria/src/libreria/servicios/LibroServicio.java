package libreria.servicios;

import java.util.Scanner;
import libreria.entidades.Libro;
import libreria.persistencia.LibroDAO;

public class LibroServicio {

    private LibroDAO lDAO;

    public LibroServicio() {
        lDAO = new LibroDAO();
    }

    //Creacion
    public Libro crear() {
        try {
            Libro libro = new Libro();
            Scanner leer = new Scanner(System.in).useDelimiter("\n");

            System.out.print("Ingrese el ISBN del Libro: ");
            libro.setIsbn(leer.nextLong());
            System.out.print("Ingrese el Titulo: ");
            libro.setTitulo(leer.next());
            System.out.print("Ingrese el año de publicación: ");
            libro.setAnio(leer.nextInt());
            System.out.print("Ingrese la cantidad total de ejemplares en stock: ");
            libro.setEjemplares(leer.nextInt());

            lDAO.guardar(libro);

            return libro;

        } catch (Exception e) {
            System.out.println("Excepcion en crear Libro");
            System.out.println(e);
        }
        return new Libro();
    }

    //Consulta
    public Libro consultar() {
        Libro libro = new Libro();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        try {
            System.out.print("Desea buscar Libro por: "
                    + "\n1- ISBN"
                    + "\n2- Nombre"
                    + "\nIngrese una opción: ");
            int op = leer.nextInt();
            if (op == 1) {
                System.out.print("Ingrese el id del Libro a consultar: ");
                long isbn = leer.nextInt();
                libro = lDAO.buscarPorISBN(isbn);
            }
            if (op == 2) {
                System.out.print("Ingrese el nombre del Libro a consultar: ");
                String titulo = leer.next();
                libro = lDAO.buscarPorTitulo(titulo);
            } else {
                System.out.println("Ingreso una opción inexistente.");
                consultar();
            }
        } catch (Exception e) {
            System.out.println("Excepcion en consultar Libro");
            System.out.println(e);
        }
        return libro;
    }

    //Modificar
    public Libro modificar() {
        Libro libro = new Libro();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        try {
            System.out.print("Desea modificar Libro por: "
                    + "\n1- ISBN"
                    + "\n2- Nombre"
                    + "\nIngrese una opción: ");
            int op = leer.nextInt();
            if (op == 1) {
                System.out.print("Ingrese el id del Libro a modificar: ");
                long isbn = leer.nextInt();
                libro = lDAO.buscarPorISBN(isbn);
            }
            if (op == 2) {
                System.out.print("Ingrese el nombre del Libro a modificar: ");
                String titulo = leer.next();
                libro = lDAO.buscarPorTitulo(titulo);
            } else {
                System.out.println("Ingreso una opción inexistente.");
                modificar();
            }

            do {
                System.out.print("Indique que desea modificar del Libro: "
                        + "\n1- ISBN"
                        + "\n2- Titlo"
                        + "\n3- Año"
                        + "\n4- Autor"
                        + "\n5- Editorial"
                        + "\n6- Terminar modificación."
                        + "\nIngrese una opción: ");
                op = leer.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("Ingrese el nuevo ISBN: ");
                        break;
                    case 2:
                        System.out.println("Ingrese el nuevo Titulo: ");
                        break;
                    case 3:
                        System.out.println("Ingrese el nuevo Año: ");
                        break;
                    case 4:
                        System.out.println("Ingrese el nuevo Autor: ");
                        break;
                    case 5:
                        System.out.println("Ingrese la nueva Editorial: ");
                        break;
                    case 6:
                        System.out.println("Shao!");
                        break;
                    default:
                        System.out.println("Ingreso una opción incorrecta!");
                        break;
                }
                if (op == 6) {
                    break;
                }
            } while (true);
        } catch (Exception e) {
            System.out.println("Excepcion en modificar Libro");
            System.out.println(e);
        }
        return libro;
    }
    
    //Eliminar
    public Libro eliminar() {
        Libro libro = new Libro();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        try {
            System.out.print("Desea eliminar Libro por: "
                    + "\n1- ISBN"
                    + "\n2- Nombre"
                    + "\nIngrese una opción: ");
            int op = leer.nextInt();
            if (op == 1) {
                System.out.print("Ingrese el id del Libro a eliminar: ");
                long isbn = leer.nextInt();
                lDAO.eliminarPorISBN(isbn);
            }
            if (op == 2) {
                System.out.print("Ingrese el nombre del Libro a eliminar: ");
                String titulo = leer.next();
                lDAO.eliminarPorTitulo(titulo);
            } else {
                System.out.println("Ingreso una opción inexistente.");
                eliminar();
            }
        } catch (Exception e) {
            System.out.println("Excepcion en eliminar Libro");
            System.out.println(e);
        }
        return libro;
    }
}
