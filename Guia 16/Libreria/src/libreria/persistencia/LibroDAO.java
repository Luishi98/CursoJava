package libreria.persistencia;

import libreria.entidades.Libro;

public final class LibroDAO extends DAO<Libro> {

    //Creacion
    @Override
    public void guardar(Libro libro) {
        super.guardar(libro);
    }

    //Consultas
    public Libro buscarPorISBN(Long isbn) {
        try {
            conectar();
            Libro libro;
            libro = em.find(Libro.class, isbn);
            desconectar();
            if (libro.getAlta()) {
                return libro;
            } else {
                return new Libro();
            }
        } catch (Exception e) {
            System.out.println("Excepcion buscar Libro por isbn");
            System.out.println(e);
        }
        return new Libro();
    }

    public Libro buscarPorTitulo(String titulo) {
        try {
            conectar();
            Libro libro = (Libro) em.createNamedQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :titulo").setParameter("titulo", titulo).getSingleResult();
            desconectar();
            if (libro.getAlta()) {
                return libro;
            } else {
                return new Libro();
            }
        } catch (Exception e) {
            System.out.println("Excepcion buscar Libro por titulo");
            System.out.println(e);
        }
        return new Libro();
    }

    //Modificacion
    public Libro modificar(Libro libro) {
        try {
            editar(libro);
        } catch (Exception e) {
            System.out.println("Excepcion modificar Libro");
            System.out.println(e);
        }
        return libro;
    }

    //Eliminacion
    public void eliminarPorISBN(long isbn) {
        try {
            conectar();
            Libro libro = (Libro) em.createNamedQuery("SELECT l FROM Libro l WHERE l.id LIKE :isbn").setParameter("isbn", isbn).getSingleResult();
            desconectar();
            if (libro.getAlta()) {
                libro.setAlta(false);
            }
        } catch (Exception e) {
            System.out.println("Excepcion eliminar Libro por isbn");
            System.out.println(e);
        }
    }

    public void eliminarPorTitulo(String titulo) {
        try {
            conectar();
            Libro libro = (Libro) em.createNamedQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :titulo").setParameter("titulo", titulo).getSingleResult();
            desconectar();
            if (libro.getAlta()) {
                libro.setAlta(false);
            }
        } catch (Exception e) {
            System.out.println("Excepcion eliminar Libro por titulo");
            System.out.println(e);
        }
    }
}
