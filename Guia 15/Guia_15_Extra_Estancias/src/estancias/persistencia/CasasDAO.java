package estancias.persistencia;

import estancias.entidades.Casas;
import java.util.ArrayList;
import java.util.Collection;

public final class CasasDAO extends DAO {

    /*b) Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de agosto de
    2020 y el 31 de agosto de 2020 en Reino Unido.
    d) Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada
    y un número de días específico.
     */
    public Collection<Casas> buscarCasas(int op) throws Exception {
        //Uso un Try-Catch para capturar posibles excepciones
        try {
            //Creo el String sql para luego gaudarle el valor que representa la consulta en SQL
            String sql = "";

            //Guardo la sintaxis de una consulta en SQL que luego enviare a la clase DAO
            //Uso un if para determinar que quiero consultar
            if (op == 1) {
                //Opcion b
                sql = "SELECT * FROM casas WHERE fecha_desde <= '2020-08-01' "
                        + "AND fecha_hasta >= '2020-08-31' AND pais = 'Reino Unido' ";
            } else if (op == 2) {
                //Opcion d
                sql = "SELECT * FROM casas WHERE fecha_desde >= '2020-08-01' "
                        + "AND fecha_hasta >= DATE_ADD('2020-08-01', INTERVAL 5 DAY) ";
            }
            //Uso el metodo consultarBase() para traer todos los resultados deseados
            consultarBase(sql);
            //Creo un objeto para poder guardar las datos devueltos y luego manipularlos
            Casas casa = null;
            //Creo una lista para guardar todos los objetos creados a partir de la tabla 
            Collection<Casas> casas = new ArrayList();
            //Creo un bucle para poder recorrer cada resultado devuelvo por la consutla
            while (resultado.next()) {
                //Instancion del objeto creado anteriormente para setear todos los valores de mi interes
                casa = new Casas();
                casa.setIdCasa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigoPostal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFechaDesde(resultado.getDate(7));
                casa.setFechaHasta(resultado.getDate(8));
                casa.setTiempoMinimo(resultado.getInt(9));
                casa.setTiempoMaximo(resultado.getInt(10));
                casa.setPrecioHabitacion(resultado.getDouble(11));
                casa.setTipoVivienda(resultado.getString(12));
                //Agrego el objeto ya completo con los datos que decidi en la lista
                casas.add(casa);
            }
            //Me desconecto de la base una vez realizada la consulta y guardado los datos
            desconectarBase();
            return casas;
        } catch (Exception e) {
            //Imprimo la excepcion e igualmente me desconecto de la base
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

}
