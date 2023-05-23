/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Luish
 */
public class CineServicio {

    Cine cine = new Cine();
    String[][] sala = new String[8][6];
    EspectadorServicio espectador = new EspectadorServicio();
    ArrayList<Espectador> listaEspectadores = new ArrayList();
    ArrayList<String> listaAsientos = new ArrayList();
    PeliculaServicio peliculaSer = new PeliculaServicio();
    Pelicula pelicula = peliculaSer.crearPelicula();

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearSala() {
        String[] asiento = {" A ", " B ", " C ", " D ", " E ", " F "};
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                this.sala[i][j] = (i + 1) + asiento[j];
            }
        }
    }

    public void llenarSala() {

        crearSala();
        Random random = new Random();
        System.out.print("Cuantos espectadores habrá? ");
        int esp = leer.nextInt();
        for (int i = 0; i < esp; i++) {
            listaEspectadores.add(espectador.crearEspectador());
        }
        for (int i = 0; i < esp; i++) {
            do {
                int fila = random.nextInt(6);
                int columna = random.nextInt(8);
                listaAsientos.add(sala[columna][fila]);
            } while (listaAsientos.size() != i + 1);
        }
        int cont = 0;
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                if (cont < listaEspectadores.size()) {
                    if (pelicula.getPrecio() > listaEspectadores.get(cont).getDinero()) {
                        System.out.println("El espectador " + listaEspectadores.get(cont).getNombre() + " no posee dinero suficiente.");
                        cont += 1;
                    } else if (pelicula.getEdadMinima() > listaEspectadores.get(cont).getEdad()) {
                        System.out.println("El espectador " + listaEspectadores.get(cont).getNombre() + " no cumple con la edad mínima.");
                        cont += 1;
                    } else if (listaAsientos.contains(sala[i][j])) {
                        System.out.println("Al espectador " + listaEspectadores.get(cont).getNombre() + " se le asigno el asiento: " + sala[i][j]);
                        cont += 1;
                        sala[i][j] = sala[i][j] + "X";
                    }
                }
            }
        }
    }

    public void mostrarSala() {
        for (int i = 7; i >= 0; i--) {
            System.out.print("|");
            for (int j = 0; j < 6; j++) {
                System.out.print(sala[i][j] + "|");
            }
            System.out.println("");
        }
    }

    public void rellenarSala() {
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                if (sala[i][j].length() == 4) {
                    this.sala[i][j] = sala[i][j] + " ";
                }
            }
        }
    }

    public void metodos() throws InterruptedException {
        System.out.println("<------------------------------------------------>");
        System.out.println(pelicula);
        Thread.sleep(1000);
        System.out.println("<------------------------------------------------>");
        Thread.sleep(1000);
        crearSala();
        llenarSala();
        rellenarSala();
        System.out.println("La sala quedaría conformada de la siguiente manera: ");
        mostrarSala();
        Thread.sleep(1000);
        System.out.println("<------------------------------------------------>");
    }
}
