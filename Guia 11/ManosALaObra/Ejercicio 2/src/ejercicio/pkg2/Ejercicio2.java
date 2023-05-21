/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package ejercicio.pkg2;

import Entidades.Equipo;
import Entidades.Jugador;
import Servicios.JugadorServicio;

public class Ejercicio2 {

    public static void main(String[] args) {
        JugadorServicio jSer = new JugadorServicio();
        Equipo equipo = jSer.crearEquipo();

        System.out.println("El equipo quedó conformado de la siguiente manera {");
        for (Jugador player : equipo.getJugadores()) {
            System.out.println("Jugador {");
            System.out.println("Nombre: " + player.getNombre());
            System.out.println("Apellido: " + player.getApellido());
            System.out.println("Posición: " + player.getPosicion());
            System.out.println("Número: " + player.getNumero());
            System.out.println("}");
        }
    }

}
