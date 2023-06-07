package Entidades;

import java.util.Comparator;

public class Peliculas {
    private String titulo;
    private String director;
    private Double duracion;

    public Peliculas() {
    }

    public Peliculas(String titulo, String director, Double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public static Comparator<Peliculas> compararDuracion = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas p1, Peliculas p2) {
            return p1.getDuracion().compareTo(p2.getDuracion());
        }
    };

    public static Comparator<Peliculas> compararTitulo = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas p1, Peliculas p2) {
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };
    
    public static Comparator<Peliculas> compararDirector = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas p1, Peliculas p2) {
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };

    @Override
    public String toString() {
        return "Peliculas{" + "Título = " + titulo + ". Director = " + director + ". Duración = " + duracion + '}';
    }
}
