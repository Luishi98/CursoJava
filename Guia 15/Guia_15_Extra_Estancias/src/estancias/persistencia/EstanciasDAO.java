package estancias.persistencia;

import estancias.entidades.Casas;
import estancias.entidades.Clientes;
import estancias.entidades.Estancias;
import java.util.ArrayList;
import java.util.Collection;

public final class EstanciasDAO extends DAO {

    /*f) Listar todas las estancias que han sido reservadas por un cliente, mostrar el nombre, país y
    ciudad del cliente y además la información de la casa que reservó. La que reemplazaría a
    la anterior
     */
    public Collection<Estancias> buscarEstanciasClientesCasas(int op) throws Exception {
        //Uso un Try-Catch para capturar posibles excepciones
        try {
            //Creo el String sql para luego gaudarle el valor que representa la consulta en SQL
            String sql = "";

            //Guardo la sintaxis de una consulta en SQL que luego enviare a la clase DAO
            //Uso un if para determinar que quiero consultar
            if (op == 1) {
                //Opcion d
                sql = "SELECT e.*, cl.nombre AS Nombre, cl.pais AS Pais, cl.ciudad AS Ciudad, c.*\n"
                        + "FROM estancias e \n"
                        + "JOIN clientes cl ON e.id_cliente = cl.id_cliente\n"
                        + "JOIN casas c ON e.id_casa = c.id_casa;";
            }
            //Uso el metodo consultarBase() para traer todos los resultados deseados
            consultarBase(sql);
            //Creo un objeto para poder guardar las datos devueltos y luego manipularlos
            Estancias estancia = null;
            Clientes cliente = null;
            Casas casa = null;
            //Creo una lista para guardar todos los objetos creados a partir de la tabla 
            Collection<Estancias> estancias = new ArrayList();
            //Creo un bucle para poder recorrer cada resultado devuelvo por la consutla
            while (resultado.next()) {
                //Instancion del objeto creado anteriormente para setear todos los valores de mi interes
                estancia = new Estancias();
                estancia.setIdEstancia(resultado.getInt(1));
                estancia.setIdCliente(resultado.getInt(2));
                estancia.setIdCasa(resultado.getInt(3));
                estancia.setNombreHuesped(resultado.getString(4));
                estancia.setFechaDesde(resultado.getString(5));
                estancia.setFechaHasta(resultado.getString(6));
                //Nombre, pais y ciudad de los clientes segun el ejercicio
                cliente = new Clientes();
                cliente.setNombre(resultado.getString(7));
                cliente.setPais(resultado.getString(8));
                cliente.setCiudad(resultado.getString(9));
                //Datos de la casa segun el ejercicio
                casa = new Casas();
                casa.setIdCasa(resultado.getInt(10));
                casa.setCalle(resultado.getString(11));
                casa.setNumero(resultado.getInt(12));
                casa.setCodigoPostal(resultado.getString(13));
                casa.setCiudad(resultado.getString(14));
                casa.setPais(resultado.getString(15));
                casa.setFechaDesde(resultado.getDate(16));
                casa.setFechaHasta(resultado.getDate(17));
                casa.setTiempoMinimo(resultado.getInt(18));
                casa.setTiempoMaximo(resultado.getInt(19));
                casa.setPrecioHabitacion(resultado.getDouble(20));
                casa.setTipoVivienda(resultado.getString(21));
                //Agrego el cliente y la casa al objeto estancia
                estancia.setClientes(cliente);
                estancia.setCasas(casa);
                //Agrego el objeto ya completo con los datos que decidi en la lista
                estancias.add(estancia);
            }
            //Me desconecto de la base una vez realizada la consulta y guardado los datos
            desconectarBase();
            return estancias;
        } catch (Exception e) {
            //Imprimo la excepcion e igualmente me desconecto de la base
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

}
