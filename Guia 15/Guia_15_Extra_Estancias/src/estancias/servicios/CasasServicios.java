package estancias.servicios;

import estancias.entidades.Casas;
import estancias.persistencia.CasasDAO;
import java.util.ArrayList;
import java.util.Collection;

public class CasasServicios {

    /*b) Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de agosto de
    2020 y el 31 de agosto de 2020 en Reino Unido.
    d) Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada
    y un número de días específico.
    g) Debido a la devaluación de la libra esterlina con respecto al euro se desea incrementar el
    precio por día en un 5% de todas las casas del Reino Unido. Mostar los precios actualizados.
    i) Busca y listar aquellas casas del Reino Unido de las que se ha dicho de ellas (comentarios)
    que están ‘limpias’.
     */
    public void listarCasas(int op) throws Exception {
        try {
            CasasDAO cDAO = new CasasDAO();
            Collection<Casas> casas = new ArrayList();
            if (op == 2) {
                casas = cDAO.buscarCasas(1);
            } else if (op == 4) {
                casas = cDAO.buscarCasas(2);
            } else if (op == 7) {
                casas = cDAO.aumentarPrecios(1);
            } else if (op == 9) {
                casas = cDAO.buscarCasas(3);
            }
            for (Casas casa : casas) {
                System.out.println("\n" + casa.toString());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void listarCasasPorAgrupadas(int op) {
        try {
            CasasDAO cDAO = new CasasDAO();
            Collection<Casas> casas = new ArrayList();
            if (op == 8) {
                casas = cDAO.listarCantidadCasasPorPais(1);
            }
            for (Casas casa : casas) {
                System.out.println("\nCantidad de casas: " + casa.getIdCasa() + "\nPaís: " + casa.getCalle());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
