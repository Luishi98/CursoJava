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
package ejercicio_3;

import Entidades.Cartas;
import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) throws InterruptedException {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cartas cartas = new Cartas();
        cartas.crearBaraja();
        cartas.barajar();
        int op;
        System.out.println("Bienvenido!");
        System.out.println("<------------------------------------------------>");
        Thread.sleep(1000);
        do {
            System.out.println("Menú:\n"
                    + "1- Dar la siguiente carta\n"
                    + "2- Mostrar cuántas cartas quedan disponibles\n"
                    + "3- Dar un número determinado de cartas\n"
                    + "4- Mostrar que cartas ya han salido\n"
                    + "5- Mostrar las cartas que aún no han salido\n"
                    + "6- Salir.");
            op = leer.nextInt();
            System.out.println("<------------------------------------------------>");
            Thread.sleep(1000);
            while (op < 1 || op > 6) {
                System.out.println("Ingrese una opción válida!");
                op = leer.nextInt();
            }
            Thread.sleep(1000);
            switch (op) {
                case 1:
                    System.out.println(cartas.siguienteCarta());
                    Thread.sleep(1000);
                    break;
                case 2:
                    System.out.println(cartas.cartasDisponibles());
                    Thread.sleep(1000);
                    break;
                case 3:
                    System.out.print("Cuántas cartas desea dar? ");
                    int cantidad = leer.nextInt();
                    cartas.darCartas(cantidad);
                    Thread.sleep(1000);
                    break;
                case 4:
                    cartas.cartasMonton();
                    Thread.sleep(1000);
                    break;
                case 5:
                    cartas.mostrarBaraja();
                    Thread.sleep(1000);
                    break;
                case 6:
                    System.out.println("Shao!");
                    Thread.sleep(1000);
                    break;
            }
            System.out.println("<------------------------------------------------>");
        } while (op != 6);

    }

}
