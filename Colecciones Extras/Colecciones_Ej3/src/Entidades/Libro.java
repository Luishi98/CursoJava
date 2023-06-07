/*
• Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
método. El método se incrementa de a uno, como un carrito de compras, el
atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
que no queden ejemplares disponibles para prestar. Devuelve true si se ha
podido realizar la operación y false en caso contrario.
• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
El método decrementa de a uno, como un carrito de compras, el atributo
ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
vez que se produzca la devolución de un libro. No se podrán devolver libros
donde que no tengan ejemplares prestados. Devuelve true si se ha podido
realizar la operación y false en caso contrario.
• Método toString para mostrar los datos de los libros.
 */
package Entidades;

import java.util.Scanner;

public class Libro {

    private String titulo;
    private String autor;
    private Integer ejemplares;
    private Integer prestados;
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro() {
    }
    
    public Libro(String titulo, String autor, Integer ejemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
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
    
    public Integer getEjemplares() {
        return ejemplares;
    }
    
    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }
    
    public Integer getPrestados() {
        return prestados;
    }
    
    public void setPrestados(Integer prestados) {
        this.prestados = prestados;
    }
    
    public boolean prestamo() {
        System.out.print("Ingrese el titulo de un libro: ");
        String tit = leer.next();
        return true;
    }
}
