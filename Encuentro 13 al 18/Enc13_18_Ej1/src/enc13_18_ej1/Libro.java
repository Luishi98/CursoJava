/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc13_18_ej1;

import java.util.Scanner;

/**
Crear una clase llamada Libro que contenga los siguientes atributos: 
* ISBN, Título, Autor, Número de páginas, y un constructor con todos 
* los atributos pasados por parámetro y un constructor vacío. Crear un 
* método para cargar un libro pidiendo los datos al usuario y luego informar 
* mediante otro método el número de ISBN, el título, el autor del libro y el 
* número de páginas.
 */
public class Libro {
    public int ISBN;
    public String Titulo;
    public String Autor;
    public int NumeroDePaginas;
    
    public Libro(){
    }

    public Libro(int ISBN, String Titulo, String Autor, int NumeroDePaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroDePaginas = NumeroDePaginas;
    }
    
    public void cargarLibro(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese ISBN");
        this.ISBN = leer.nextInt();
        System.out.println("Ingrese Titulo");
        this.Titulo = leer.next();
        System.out.println("Ingrese Autor");
        this.Autor = leer.next();
        System.out.println("Ingrese N° de páginas");
        this.NumeroDePaginas = leer.nextInt();
    }
    
    public void mostrarLibro(){
        System.out.println("ISBN: " + ISBN);
        System.out.println("Tirulo: " + Titulo);
        System.out.println("Autor: " + Autor);
        System.out.println("N° de paginas: " + NumeroDePaginas);
    }
    
}
