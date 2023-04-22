package enc13_18_ej_ext1.Entidad;

import java.util.Scanner;

public class Cancion {
    
    static Scanner leer = new Scanner(System.in);
    
    private String titulo;
    private String autor;

    public Cancion() {
        titulo = "";
        autor = "";
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void pedirCancion(){
        System.out.print("Ingrese el titulo de la cancion: ");
        titulo = leer.nextLine();
        System.out.print("Ingrese el nombre del autor: ");
        autor = leer.nextLine();
    }
    
    public void mostrarCancion(){
        System.out.println("El título de la canción es: " + titulo);
        System.out.println("El autor de la canción es: " + autor);
    }
    
}
