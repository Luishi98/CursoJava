package estancias.servicios;

import estancias.entidades.Casas;
import estancias.entidades.Estancias;
import estancias.servicios.CasasServicios;
import estancias.persistencia.EstanciasDAO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EstanciasServicios {

    /*f) Listar todas las estancias que han sido reservadas por un cliente, mostrar el nombre, país y
    ciudad del cliente y además la información de la casa que reservó. La que reemplazaría a
    la anterior
     */
    public void listarEstancias() throws Exception {
        try {
            EstanciasDAO eDAO = new EstanciasDAO();
            Collection<Estancias> estancias = new ArrayList();
            estancias = eDAO.buscarEstanciasClientesCasas(1);
            for (Estancias estancia : estancias) {
                System.out.println("\n" + estancia.toString());
                System.out.println("Nombre del Cliente: " + estancia.getClientes().getNombre());
                System.out.println("País del Cliente: " + estancia.getClientes().getPais());
                System.out.println("Ciudad del Cliente: " + estancia.getClientes().getCiudad());
                System.out.println(estancia.getCasas().toString());
                System.out.println("--------------------------------------------");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void insertarEstancias() {
        try {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            EstanciasDAO eDAO = new EstanciasDAO();
            CasasServicios cSer = new CasasServicios();
            Collection<Casas> casas = new ArrayList();
            Collection<Integer> ids = new ArrayList();

            String regex = "\\d{4}-\\d{2}-\\d{2}";
            String fecha_desde;
            do {
                System.out.print("Ingrese su fecha de inicio de estancia en formato AAAA-MM-DD: ");
                fecha_desde = leer.nextLine();
                if (Pattern.matches(regex, fecha_desde)) {
                    break;
                } else {
                    System.out.println("La fecha ingresada no es válida o no sigue el formato AAAA-MM-DD.");
                }
            } while (true);
            String fecha_hasta;
            do {
                System.out.print("Ingrese su fecha de fin de estancia en formato AAAA-MM-DD: ");
                fecha_hasta = leer.nextLine();
                if (Pattern.matches(regex, fecha_hasta)) {
                    break;
                } else {
                    System.out.println("La fecha ingresada no es válida o no sigue el formato AAAA-MM-DD.");
                }
            } while (true);

            casas = cSer.obtenerCasasSegunFecha(fecha_desde, fecha_hasta);
            for (Casas casa : casas) {
                ids.add(casa.getIdCasa());
            }
            System.out.print("Ingrese el id de la casa donde desea realizar la estancia: ");
            int aux = leer.nextInt();
            if (ids.contains(aux)) {
                System.out.print("Ingrese su id de cliente: ");
                int id = leer.nextInt();
                System.out.print("Ingrese su nombre: ");
                String nombre = leer.next();
                String sql = "INSERT INTO estancias (id_cliente, id_casa, nombre_huesped, fecha_desde, fecha_hasta)\n"
                        + "VALUES (" + id + ", " + aux + ", '" + nombre + "', '" + fecha_desde + "', '" + fecha_hasta + "') ";
                eDAO.ingresarEstancias(sql);
            } else {
                System.out.println("La casa elegida no tiene disponibilidad en esas fechas.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
