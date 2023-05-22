/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collections;

public class Cartas {

    private ArrayList<String> carta = new ArrayList();
    private int posicion = 0;
    private ArrayList<String> cartasDadas = new ArrayList();

    public Cartas() {
    }

    public void crearBaraja() {
        String[] palo = {" Copa", " Basto", " Espada", " Oro"};
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 12; j++) {
                if (j >= 8 && j <= 9) {
                    continue;
                }
                carta.add(j + palo[i]);
            }
        }
    }

    public void barajar() {
        Collections.shuffle(carta);
    }

    public int cartasDisponibles() {
        return carta.size() - cartasDadas.size();
    }

    public String siguienteCarta() {
        if (cartasDadas.size() < 40) {
            String naipe = carta.get(posicion);
            posicion += 1;
            cartasDadas.add(naipe);
            return naipe;
        } else {
            return "No hay más cartas para dar.";
        }
    }

    public void darCartas(int i) {
        if (cartasDisponibles() > i) {
            for (int j = 0; j < i; j++) {
                System.out.println(carta.get(posicion));
                cartasDadas.add(carta.get(posicion));
                posicion += 1;
            }
        } else {
            System.out.println("No hay cartas suficientes.");
        }
    }

    public void cartasMonton() {
        if (cartasDadas.size() > 0) {
            for (int i = 0; i < cartasDadas.size(); i++) {
                System.out.println(cartasDadas.get(i));
            }
        } else {
            System.out.println("No se ha dado ninguna carta aún.");
        }
    }

    public void mostrarBaraja() {
        if (cartasDadas.size() < carta.size()) {
            for (int i = cartasDadas.size(); i < carta.size(); i++) {
                System.out.println(carta.get(i));
            }
        } else {
            System.out.println("Ya se han dado todas las cartas.");
        }
    }

    @Override
    public String toString() {
        return "Cartas{" + "carta: " + carta + "}\n ";
    }
}
