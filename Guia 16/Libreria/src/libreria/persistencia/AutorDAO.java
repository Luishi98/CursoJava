package libreria.persistencia;

import java.util.List;
import javax.persistence.TypedQuery;
import libreria.entidades.Autor;

public final class AutorDAO extends DAO<Autor> {

    //Creacion
    @Override
    public void guardar(Autor autor) {
        System.out.println("Guardar AutorDAO inicio");
        System.out.println(autor.toString());
        System.out.println("Guardar AutorDAO fin");

        super.guardar(autor);
    }

    //Consultas
    public Autor buscarPorId(int id) {
        try {
            conectar();
            Autor autor;
            autor = em.find(Autor.class, id);
            desconectar();
            return autor;

        } catch (Exception e) {
            System.out.println("Excepcion buscar Autor por id");
            System.out.println(e);
        }
        return new Autor();
    }

    public List<Autor> buscarPorNombre(String nombre) {
        conectar();

        String jpql = "SELECT a FROM Autor a WHERE a.nombre = :nombre";

        TypedQuery<Autor> query = em.createQuery(jpql, Autor.class);
        query.setParameter("nombre", nombre);

        List<Autor> autores = query.getResultList();

        //List<Autor> autores = em.createNamedQuery("SELECT a FROM Autor a WHERE a.nombre = :nombre").setParameter("nombre", nombre).getResultList();
        desconectar();
        return autores;
    }

    //Modificacion
    public Autor modificar(Autor autor) {
        try {
            editar(autor);
        } catch (Exception e) {
            System.out.println("Excepcion modificar Autor");
            System.out.println(e);
        }
        return autor;
    }

    //Eliminacion
    public void eliminarPorId(Integer id) {
        try {
            conectar();
            Autor autor = (Autor) em.createNamedQuery("SELECT a FROM Autor a WHERE a.id LIKE :id").setParameter("id", id).getSingleResult();
            desconectar();
            if (autor.getAlta()) {
                autor.setAlta(false);
            }
        } catch (Exception e) {
            System.out.println("Excepcion eliminar Autor por id");
            System.out.println(e);
        }
    }

    public void eliminarPorNombre(String nombre) {
        try {
            conectar();
            Autor autor = (Autor) em.createNamedQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
            desconectar();
            if (autor.getAlta()) {
                autor.setAlta(false);
            }
        } catch (Exception e) {
            System.out.println("Excepcion eliminar Autor por nombre");
            System.out.println(e);
        }
    }

}
