/*
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
se le pregunta al usuario si quiere crear otro Libro o no.
La clase Librería contendrá además los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters
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
package colecciones_ej3;

import Entidades.Libro;
import java.util.HashSet;
import java.util.Scanner;

public class Colecciones_Ej3 {

    public static void main(String[] args) {
        HashSet<Libro> libreria = new HashSet();
        Libro libro = new Libro();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String op = "";
        do {
            System.out.print("Ingrese el nombre del libro: ");
            libro.setTitulo(leer.next());;
            System.out.print("Ingrese el autor: ");
            libro.setAutor(leer.next());
            System.out.print("Ingrese la cantidad de ejemplares: ");
            libro.setEjemplares(leer.nextInt());
            libreria.add(new Libro(libro.getTitulo(), libro.getAutor(), libro.getEjemplares()));
            System.out.print("Desea ingresar otro libro? (si/no)");
            do {
                op = leer.next().toLowerCase();
                if (!op.equals("si") || !op.equals("no")) {
                    System.out.print("Opción incorrecta, intente nuevamente: ");
                }
            } while (!op.equals("si") || !op.equals("no"));
        } while (op.equals("si"));
    }

}
