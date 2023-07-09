package estancias.persistencia;

import estancias.entidades.Casas;
import estancias.entidades.Clientes;
import java.util.ArrayList;
import java.util.Collection;

public final class ClientesDAO extends DAO {

    public Collection<Clientes> buscarClientesCasas(int op) throws Exception {

        /*e) Listar los datos de todos los clientes que en algún momento realizaron una estancia y la
        descripción de la casa donde la realizaron.*/
        
        //Uso un Try-Catch para capturar posibles excepciones
        try {
            //Creo el String sql para luego gaudarle el valor que representa la consulta en SQL
            String sql = "";

            //Guardo la sintaxis de una consulta en SQL que luego enviare a la clase DAO
            //Uso un if para determinar que quiero consultar
            if (op == 1) {
                sql = "SELECT cl.*, c.* FROM clientes cl "
                        + "JOIN estancias e ON cl.id_cliente = e.id_cliente "
                        + "JOIN casas c ON c.id_casa = e.id_casa ";
            }
            //Uso el metodo consultarBase() para traer todos los resultados deseados
            consultarBase(sql);
            //Creo un objeto para poder guardar las datos devueltos y luego manipularlos
            Clientes cliente = null;
            Casas casa = null;
            //Creo una lista para guardar todos los objetos creados a partir de la tabla 
            Collection<Clientes> clientes = new ArrayList();
            Collection<Casas> casas = new ArrayList();
            //Creo un bucle para poder recorrer cada resultado devuelvo por la consutla
            while (resultado.next()) {
                //Instancion del objeto creado anteriormente para setear todos los valores de mi interes
                cliente = new Clientes();
                cliente.setIdCliente(resultado.getInt(1));
                cliente.setNombre(resultado.getString(2));
                cliente.setCalle(resultado.getString(3));
                cliente.setNumero(resultado.getInt(4));
                cliente.setCodigoPostal(resultado.getString(5));
                cliente.setCiudad(resultado.getString(6));
                cliente.setPais(resultado.getString(7));
                cliente.setEmail(resultado.getString(8));
                //Instancio el objeto casas y guardo valores
                casa = new Casas();
                casa.setIdCasa(resultado.getInt(9));
                casa.setCalle(resultado.getString(10));
                casa.setNumero(resultado.getInt(11));
                casa.setCodigoPostal(resultado.getString(12));
                casa.setCiudad(resultado.getString(13));
                casa.setPais(resultado.getString(14));
                casa.setFechaDesde(resultado.getDate(15));
                casa.setFechaHasta(resultado.getDate(16));
                casa.setTiempoMinimo(resultado.getInt(17));
                casa.setTiempoMaximo(resultado.getInt(18));
                casa.setPrecioHabitacion(resultado.getDouble(19));
                casa.setTipoVivienda(resultado.getString(20));
                //Seteo el objeto casas al objeto clientes
                cliente.setCasa(casa);
                //Agrego el objeto ya completo con los datos que decidi en la lista
                clientes.add(cliente);
            }
            //Me desconecto de la base una vez realizada la consulta y guardado los datos
            desconectarBase();
            return clientes;
        } catch (Exception e) {
            //Imprimo la excepcion e igualmente me desconecto de la base
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

}
