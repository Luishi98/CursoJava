package libreria.servicios;

import java.util.Scanner;
import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;

public class EditorialServicio {

    private EditorialDAO eDAO;

    public EditorialServicio() {
        eDAO = new EditorialDAO();
    }

    //creación
    public Editorial crear() {
        Editorial editorial = new Editorial();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        try {
            System.out.print("Nombre de la editorial: ");
            String nombre = leer.next();
            eDAO.guardar(editorial);
        } catch (Exception e) {
            System.out.println("Excepcion en crear Editorial");
            System.out.println(e);
        }
        return editorial;
    }

    //consulta
    public Editorial consultar() {
        Editorial editorial = new Editorial();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        try {
            System.out.print("Desea buscar editorial por: "
                    + "\n1- Id"
                    + "\n2- Nombre"
                    + "\nIngrese una opción: ");
            int op = leer.nextInt();
            if (op == 1) {
                System.out.print("Ingrese el id de la Editorial a consultar: ");
                int id = leer.nextInt();
                editorial = eDAO.buscarPorId(id);
            }
            if (op == 2) {
                System.out.print("Ingrese el nombre de la Editorial a consultar: ");
                String nombre = leer.next();
                editorial = eDAO.buscarPorNombre(nombre);
            } else {
                System.out.println("Ingreso una opción inexistente.");
                consultar();
            }

        } catch (Exception e) {
            System.out.println("Excepcion en consultar Editorial");
            System.out.println(e);
        }
        return editorial;
    }

    //modificación
    public Editorial modificar() {
        Editorial editorial = new Editorial();
        try {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            System.out.print("Ingrese el id de la Editorial a modificar: ");
            int id = leer.nextInt();
            editorial = eDAO.buscarPorId(id);
            System.out.println("Ingrese el nuevo nombre de la Editorial: ");
            editorial.setNombre(leer.next());
        } catch (Exception e) {
            System.out.println("Excepcion en modificar Editorial");
            System.out.println(e);
        }
        return editorial;
    }

    //eliminación
    public Editorial eliminar() {
        Editorial editorial = new Editorial();
        try {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            System.out.print("Desde eliminar editorial por: "
                    + "\n1- Id"
                    + "\n2- Nombre"
                    + "\nIngrese una opción: ");
            int op = leer.nextInt();
            if (op == 1) {
                System.out.print("Ingrese el id de la Editorial a eliminar: ");
                int id = leer.nextInt();
                eDAO.eliminarPorId(id);
            }
            if (op == 2) {
                System.out.print("Ingrese el nombre de la Editorial a eliminar: ");
                String nombre = leer.next();
                eDAO.eliminarPorNombre(nombre);
            } else {
                System.out.println("Ingreso una opción inexistente.");
                consultar();
            }
        } catch (Exception e) {
            System.out.println("Excepcion en eliminar Editorial");
            System.out.println(e);
        }
        return editorial;
    }

}
