package Servicios;

import Entidades.Peliculas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class PeliculasServicio {

    Peliculas peli = new Peliculas();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Peliculas> peliculasLista = new ArrayList<>();

    public void crearPelicula() {
        do {
            System.out.print("Ingrese el nombre de la pelicula: ");
            String nombre = leer.next();
            System.out.print("Ingrese el director de la pelicula: ");
            String director = leer.next();
            System.out.print("Ingrese la duracion de la pelicula en horas: ");
            Double duracion = leer.nextDouble();
            peliculasLista.add(new Peliculas(nombre, director, duracion));
            System.out.print("Desea ingresar otra pelicula? ");
        } while (leer.next().equals("si"));
    }

    public void mostrarTodas() {
        System.out.println("");
        System.out.println("Mostrando todas las peliculas");

        Iterator it = peliculasLista.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void mostrarMayorUnaHora() {
        System.out.println("");
        System.out.println("Peliculas con duracion mayor a 1 hora");

        for (Peliculas peliculas : peliculasLista) {
            if (peliculas.getDuracion() > 1) {
                System.out.println(peliculas);
            }
        }
    }

    public void ordenarAscendente() {
        System.out.println("");
        System.out.println("Peliculas ordenadas de manera ascendente según su duración");

        peliculasLista.sort(Peliculas.compararDuracion);
        Iterator it = peliculasLista.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void ordenarDescendente() {
        System.out.println("");
        System.out.println("Peliculas ordenadas de manera descendente según su duración");

        Collections.reverse(peliculasLista);
        Iterator it = peliculasLista.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void ordenarTitulos() {
        System.out.println("");
        System.out.println("Peliculas ordenadas alfabeticamente segun su titulo");

        peliculasLista.sort(Peliculas.compararTitulo);
        Iterator it = peliculasLista.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void ordenarDirectores() {
        System.out.println("");
        System.out.println("Peliculas ordenadas alfabeticamente segun su director");

        peliculasLista.sort(Peliculas.compararDirector);
        Iterator it = peliculasLista.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void llamarMetodos() throws InterruptedException {
        crearPelicula();
        int op;
        do {
            System.out.println("");
            System.out.println("Ingrese que opción desea ejecutar" + "\n"
                    + "1 - Mostrar todas las peliculas" + "\n"
                    + "2 - Mostrar las peliculas con duración mayor a una hora" + "\n"
                    + "3 - Ordenar y mostrar las peliculas de manera ascendente según su duración" + "\n"
                    + "4 - Ordenar y mostrar las peliculas de manera descendente según su duración" + "\n"
                    + "5 - Ordenar y mostrar las peliculas alfabeticamente según sus títulos" + "\n"
                    + "6 - Ordenar y mostrar las peliculas alfabeticamente según sus directores" + "\n"
                    + "7 - Salir");
            op = leer.nextInt();
            Thread.sleep(500);
            switch (op) {
                case 1:
                    mostrarTodas();
                    break;
                case 2:
                    mostrarMayorUnaHora();
                    break;
                case 3:
                    ordenarAscendente();
                    break;
                case 4:
                    ordenarDescendente();
                    break;
                case 5:
                    ordenarTitulos();
                    break;
                case 6:
                    ordenarDirectores();
                    break;
                case 7:
                    System.out.println("Gracias por utilizar nuestros servicios");
            }
            Thread.sleep(1000);
        } while (op < 7);
    }
}
