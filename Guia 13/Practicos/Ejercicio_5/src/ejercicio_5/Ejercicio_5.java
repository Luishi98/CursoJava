/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package ejercicio_5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Luish
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Objetos
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();

        //Variables
        int num = random.nextInt(500);
        int cont = 0;
        int num1;
        
        System.out.println(num);

        //Ejercicio
        do {
            System.out.println("Intente adivinar el número secreto");
            try {
                num1 = leer.nextInt();
                cont++;
                if (num1 == num) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número");
                leer.nextLine();
                cont++;
            }
        } while (true);

        System.out.println("Felicidades! Ha adivinado el número correcto. Lo ha hecho en " + cont + " intentos.");
        
    }

}
