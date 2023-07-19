package libreria.persistencia;

import libreria.entidades.Editorial;

public final class EditorialDAO extends DAO<Editorial> {

    //Creacion
    @Override
    public void guardar(Editorial editorial) {
        super.guardar(editorial);
    }

    //Consultas
    public Editorial buscarPorId(Integer id) {
        try {
            conectar();
            Editorial editorial;
            editorial = em.find(Editorial.class, id);
            desconectar();
            if (editorial.getAlta()) {
                return editorial;
            } else {
                return new Editorial();
            }
        } catch (Exception e) {
            System.out.println("Excepcion buscar Editorial por id");
            System.out.println(e);
        }
        return new Editorial();
    }

    public Editorial buscarPorNombre(String nombre) {
        try {
            conectar();
            Editorial editorial = (Editorial) em.createNamedQuery("SELECT e FROM Editorial e WHERE e.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
            desconectar();
            if (editorial.getAlta()) {
                return editorial;
            } else {
                return new Editorial();
            }
        } catch (Exception e) {
            System.out.println("Excepcion buscar Editorial por nombre");
            System.out.println(e);
        }
        return new Editorial();
    }

    //Modificacion
    public Editorial modificar(Editorial editorial) {
        try {
            editar(editorial);
        } catch (Exception e) {
            System.out.println("Excepcion modificar Editorial");
            System.out.println(e);
        }
        return editorial;
    }

    //Eliminacion
    public void eliminarPorId(Integer id) {
        try {
            conectar();
            Editorial editorial = (Editorial) em.createNamedQuery("SELECT e FROM Editorial e WHERE e.id LIKE :id").setParameter("id", id).getSingleResult();
            desconectar();
            if (editorial.getAlta()) {
                editorial.setAlta(false);
            }
        } catch (Exception e) {
            System.out.println("Excepcion eliminar Editorial por id");
            System.out.println(e);
        }
    }

    public void eliminarPorNombre(String nombre) {
        try {
            conectar();
            Editorial editorial = (Editorial) em.createNamedQuery("SELECT e FROM Editorial e WHERE e.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
            desconectar();
            if (editorial.getAlta()) {
                editorial.setAlta(false);
            }
        } catch (Exception e) {
            System.out.println("Excepcion eliminar Editorial por nombre");
            System.out.println(e);
        }
    }
}
