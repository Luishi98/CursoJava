package estancias.servicios;

import estancias.entidades.Familias;
import estancias.persistencia.FamiliasDAO;
import java.util.ArrayList;
import java.util.Collection;

public class FamiliasServicios {
    //a) Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.
    //c) Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail.

    public void listarFamilias(int op) throws Exception {
        Collection<Familias> familias = new ArrayList();
        FamiliasDAO fDAO = new FamiliasDAO();
        if (op == 1) {
            familias = fDAO.buscarFamilias(1);
        } else if (op == 3) {
            familias = fDAO.buscarFamilias(2);
        }
        for (Familias familia : familias) {
            System.out.println("\n" + familia.toString());
        }
    }

}
