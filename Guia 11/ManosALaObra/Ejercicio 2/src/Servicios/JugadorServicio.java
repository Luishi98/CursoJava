/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package Servicios;

import Entidades.Equipo;
import Entidades.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

public class JugadorServicio {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Jugador crearJugador() {
        System.out.print("Nombre: ");
        String nombre = leer.next();
        System.out.print("Apellido: ");
        String apellido = leer.next();
        System.out.print("Posicion: ");
        String posicion = leer.next();
        System.out.print("Número: ");
        int numero = leer.nextInt();
        return new Jugador(nombre, apellido, posicion, numero);
    }

    public Equipo crearEquipo() {
        ArrayList<Jugador> jugadores = new ArrayList();
        System.out.print("Ingrese la cantidad de jugadores: ");
        int cantidad = leer.nextInt();
        for (int i = 0; i < cantidad; i++) {
            jugadores.add(crearJugador());
        }
        return new Equipo(jugadores);
    }
}
