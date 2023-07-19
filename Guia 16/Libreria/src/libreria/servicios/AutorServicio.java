package libreria.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

public class AutorServicio {

    private AutorDAO aDAO;

    public AutorServicio() {
        this.aDAO = new AutorDAO();
    }

    //creación
    public Autor crear() {
        Autor autor = new Autor();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        try {
            System.out.print("Nombre del autor: ");
            String nombre = leer.next();
            
            System.out.println("Autor crear inicio");
            System.out.println(nombre);
            System.out.println("Autor crear fin");
            
            autor.setNombre(nombre);
            aDAO.guardar(autor);
        } catch (Exception e) {
            System.out.println("Excepcion en crear Autor");
            System.out.println(e);
        }
        return autor;
    }

    //consulta
    public List<Autor> consultar() {
        Autor autor = new Autor();
        List<Autor> autores = new ArrayList();
        try {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            System.out.print("Desea buscar autor por: "
                    + "\n1- Id"
                    + "\n2- Nombre"
                    + "\nIngrese una opción: ");
            int op = leer.nextInt();
            if (op == 1) {
                System.out.print("Ingrese el id del Autor a consultar: ");
                int id = leer.nextInt();
                autor = aDAO.buscarPorId(id);
                autores.add(autor);
            } else if (op == 2) {
                System.out.print("Ingrese el nombre del Autor a consultar: ");
                String nombre = leer.next();
                autores = aDAO.buscarPorNombre(nombre);
            } else {
                System.out.println("Ingreso una opción inexistente.");
                consultar();
            }

        } catch (Exception e) {
            System.out.println("Excepcion en consultar Autor");
            System.out.println(e);
        }
        return autores;
    }

    //modificación
    public Autor modificar() {
        Autor autor = new Autor();
        try {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            System.out.print("Ingrese el id del Autor a modificar: ");
            int id = leer.nextInt();
            autor = aDAO.buscarPorId(id);
            System.out.println("Ingrese el nuevo nombre del Autor: ");
            autor.setNombre(leer.next());
            aDAO.guardar(autor);
        } catch (Exception e) {
            System.out.println("Excepcion en modificar Autor");
            System.out.println(e);
        }
        return autor;
    }

    //eliminación
    public Autor eliminar() {
        Autor autor = new Autor();
        try {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            System.out.print("Desde eliminar autor por: "
                    + "\n1- Id"
                    + "\n2- Nombre"
                    + "\nIngrese una opción: ");
            int op = leer.nextInt();
            if (op == 1) {
                System.out.print("Ingrese el id del Autor a eliminar: ");
                int id = leer.nextInt();
                aDAO.eliminarPorId(id);
            }
            if (op == 2) {
                System.out.print("Ingrese el nombre del Autor a eliminar: ");
                String nombre = leer.next();
                aDAO.eliminarPorNombre(nombre);
            } else {
                System.out.println("Ingreso una opción inexistente.");
                consultar();
            }
        } catch (Exception e) {
            System.out.println("Excepcion en eliminar Autor");
            System.out.println(e);
        }
        return autor;
    }
    
    public void mostrarAutor(int aux) {
        Autor autor = new Autor();
        List<Autor> autores = new ArrayList();
        switch (aux) {
            case 1:
                autor = crear();
                System.out.println("Se creo un nuevo Autor!");
                System.out.println(autor.toString());
                break;
            case 2:
                autores = consultar();
                System.out.println("Autor/es consultado/s!");
                for (Autor autore : autores) {
                    System.out.println(autore.toString());
                }
                break;
            case 3:
                autor = modificar();
                System.out.println("Autor modificado!");
                System.out.println(autor.toString());
                break;
            case 4:
                autor = eliminar();
                System.out.println("Autor eliminado!");
                System.out.println(autor.toString());
                break;
            case 5:
                break;
        }
    }
}
