/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package Servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisesServicio {

    HashSet<String> paises = new HashSet<>();
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public HashSet<String> cargarPaises() {
        String op;
        do {
            System.out.print("Ingrese un pais: ");
            paises.add(leer.next());
            System.out.print("Desea ingresar otro pais? ");
            op = leer.next().toLowerCase();
        } while (op.equals("si"));

        return paises;
    }

    public void ordenar() {
        ArrayList<String> paisesLista = new ArrayList<>(paises);
        Collections.sort(paisesLista);
        System.out.println("Lista de paises ordenada alfabeticamente");
        System.out.println(paisesLista);
    }

    public void eliminar() {
        Iterator it = paises.iterator();
        System.out.print("Ingrese un pais a buscar: ");
        String op = leer.next();
        if (paises.contains(op)) {
            while (it.hasNext()) {
                if (it.next().equals(op)) {
                    it.remove();
                }
            }
        } else {
            System.out.println("El pais no se encuentra en la lista");
        }
        System.out.println(paises);
    }
    
    public void llamarMetodos(){
        System.out.println(cargarPaises());
        ordenar();
        eliminar();
    }

}
