package estancias.servicios;

import estancias.entidades.Estancias;
import estancias.persistencia.EstanciasDAO;
import java.util.ArrayList;
import java.util.Collection;

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
}
