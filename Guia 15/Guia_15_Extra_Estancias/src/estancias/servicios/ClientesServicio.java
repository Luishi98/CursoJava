package estancias.servicios;

import estancias.entidades.Clientes;
import estancias.persistencia.ClientesDAO;
import java.util.ArrayList;
import java.util.Collection;

public class ClientesServicio {

    public void listarClientes() throws Exception {
        ClientesDAO cDAO = new ClientesDAO();
        Collection<Clientes> clientes = new ArrayList();
        try {
            /*e) Listar los datos de todos los clientes que en algún momento realizaron una estancia y la
        descripción de la casa donde la realizaron.*/
            //
            clientes = cDAO.buscarClientesCasas(1);
            for (Clientes cliente : clientes) {
                System.out.println("El cliente: ");
                System.out.println("\n" + cliente.toString());
                System.out.println("\nRealizo una estancia en la siguiente casa: ");
                System.out.println("\n" + cliente.getCasa().toString());
                System.out.println("--------------------------------------------");
            }
            //
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
