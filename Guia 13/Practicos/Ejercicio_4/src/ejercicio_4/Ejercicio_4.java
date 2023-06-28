/*
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
 */
package ejercicio_4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Luish
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int n1;
        String n2;
        int num;
        int num1;
        int num2;
        try {
            System.out.println("Ingrese un número entero");
            n1 = leer.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("No ha ingresado un número entero");
            leer.nextLine();
        }

        System.out.println("Cambio de excepcion");

        try {
            System.out.println("Ingrese un número");
            n2 = leer.next();
            num = Integer.parseInt(n2);
        } catch (NumberFormatException e) {
            System.out.println("El String no puede convertirse a número");
        }

        System.out.println("Cambio de excepcion");

        try {
            System.out.println("Ingrese 2 números para ser divididos");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0");
        }
    }

}
