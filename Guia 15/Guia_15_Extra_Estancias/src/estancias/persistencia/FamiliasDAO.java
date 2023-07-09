package estancias.persistencia;

import estancias.entidades.Familias;
import java.util.ArrayList;
import java.util.Collection;

public final class FamiliasDAO extends DAO {

    //a) Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.
    //c) Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail.
    //
    public Collection<Familias> buscarFamilias(int op) throws Exception {
        //Uso un Try-Catch para capturar posibles excepciones
        try {
            //Creo el String sql para luego gaudarle el valor que representa la consulta en SQL
            String sql = "";

            //Guardo la sintaxis de una consulta en SQL que luego enviare a la clase DAO
            //Uso un if para determinar que quiero consultar
            if (op == 1) {
                //Punto a
                sql = "SELECT * FROM familias WHERE num_hijos >= 3 AND edad_maxima < 10 ";
            } else if (op == 2) {
                //Punto c
                sql = "SELECT * FROM familias WHERE email LIKE '%hotmail%' ";
            }
            //Uso el metodo consultarBase() para traer todos los resultados deseados
            consultarBase(sql);
            //Creo un objeto para poder guardar las datos devueltos y luego manipularlos
            Familias familia = null;
            //Creo una lista para guardar todos los objetos creados a partir de la tabla 
            Collection<Familias> familias = new ArrayList();
            //Creo un bucle para poder recorrer cada resultado devuelvo por la consutla
            while (resultado.next()) {
                //Instanción del objeto creado anteriormente para setear todos los valores de mi interes
                familia = new Familias();
                familia.setIdFamilia(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdadMinima(resultado.getInt(3));
                familia.setEdadMaxima(resultado.getInt(4));
                familia.setNumHijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
                familia.setIdCasaFamilia(resultado.getInt(7));
                //Agrego el objeto ya completo con los datos que decidi en la lista
                familias.add(familia);
            }
            //Me desconecto de la base una vez realizada la consulta y guardado los datos
            desconectarBase();
            return familias;
        } catch (Exception e) {
            //Imprimo la excepcion e igualmente me desconecto de la base
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

}
