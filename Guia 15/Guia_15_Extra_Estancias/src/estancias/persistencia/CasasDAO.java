package estancias.persistencia;

import estancias.entidades.Casas;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.regex.Pattern;

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
                //Desde aca verificacion de formato para la fecha
                String regex = "\\d{4}-\\d{2}-\\d{2}";
                String fecha;
                Scanner leer = new Scanner(System.in).useDelimiter("\n");
                
                do {
                    System.out.print("Ingrese la fecha deseada con el formato (AAAA/MM/DD): ");
                    fecha = leer.nextLine();
                    if (Pattern.matches(regex, fecha)) {
                        break;
                    } else {
                        System.out.println("La fecha ingresada no es válida o no sigue el formato AAAA-MM-DD.");
                    }
                } while (true);
                //Hasta aca verificacion de formato para la fecha
                System.out.print("Ingrese la cantidad de dias: ");
                int dias = leer.nextInt();
                //Opcion d
                sql = "SELECT * FROM casas WHERE fecha_desde >= '2020-08-01' "
                        + "AND fecha_hasta >= DATE_ADD('" + fecha + "', INTERVAL " + dias + " DAY) ";
            } else if (op == 3) {
                sql = "SELECT DISTINCT casas.* FROM casas \n"
                        + "JOIN comentarios ON comentarios.id_casa = casas.id_casa \n"
                        + "AND casas.pais = 'Reino Unido' \n"
                        + "AND comentarios.comentario LIKE '%limpia%' ";
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

    public Collection<Casas> aumentarPrecios(int op) throws Exception {
        /*g) Debido a la devaluación de la libra esterlina con respecto al euro se desea incrementar el
        precio por día en un 5% de todas las casas del Reino Unido. Mostar los precios actualizados.*/
        try {
            String sqlInsMosElm = "";
            String sqlConsulta = "";
            if (op == 1) {
                //Opcion g
                sqlInsMosElm = "UPDATE casas\n"
                        + "SET precio_habitacion = precio_habitacion * 1.05\n"
                        + "WHERE id_casa > 0 ";
                sqlConsulta = "SELECT * from casas ";
            }
            insertarModificarEliminar(sqlInsMosElm);
            consultarBase(sqlConsulta);
            Casas casa = null;
            Collection<Casas> casas = new ArrayList();
            while (resultado.next()) {
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
                casas.add(casa);
            }
            desconectarBase();
            return casas;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

    public Collection<Casas> listarCantidadCasasPorPais(int op) throws Exception {
        /*h) Obtener el número de casas que existen para cada uno de los países diferentes.*/
        try {
            String sql = "";
            if (op == 1) {
                //Opcion g
                sql = "SELECT COUNT(id_casa) AS 'Cantidad de casas', pais FROM casas GROUP BY pais ";
            }
            consultarBase(sql);
            Casas casa = null;
            Collection<Casas> casas = new ArrayList();
            while (resultado.next()) {
                casa = new Casas();
                casa.setIdCasa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casas.add(casa);
            }
            desconectarBase();
            return casas;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

    public Collection<Casas> obtenerDisponibilidad(String fecha1, String fecha2) throws Exception {
        try {
            String sql = "SELECT id_casa FROM casas WHERE fecha_desde < '" + fecha1 + "' AND fecha_hasta > '" + fecha2 + "' ";
            consultarBase(sql);
            Casas casa = null;
            Collection<Casas> casas = new ArrayList();
            while (resultado.next()) {
                casa = new Casas();
                casa.setIdCasa(resultado.getInt(1));
                casas.add(casa);
            }
            desconectarBase();
            return casas;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

}
