/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
 */
package Entidades;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    public void llenarJuego(ArrayList<Jugador> players, Revolver r) {
        this.jugadores = players;
        this.revolver = r;
    }

    public void ronda() {
        revolver.llenarRevolver();
        int numJugadores = jugadores.size();
        int jugadorActual = 0;

        while (true) {
            Jugador jugador = jugadores.get(jugadorActual);
            boolean tiroAgua = jugador.disparo(revolver);
            if (tiroAgua) {
                System.out.println(jugador.toString() + " se ha mojado. ¡Fin del juego!");
                break;
            }
            jugadorActual = (jugadorActual + 1) % numJugadores;
        }
    }
}
