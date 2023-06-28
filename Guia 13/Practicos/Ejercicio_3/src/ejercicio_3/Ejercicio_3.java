/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
package ejercicio_3;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author Luish
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        try {
            System.out.println("Ingrese un número");
            String num1 = leer.next();
            int n1 = parseInt(num1);
            System.out.println("Ingrese un número");
            String num2 = leer.next();
            int n2 = parseInt(num2);
            System.out.println("La división de los números es: " + (((double) n1) / ((double) n2)));
        } catch (NumberFormatException e) {
            System.out.println("No ha ingresado números");
        }

    }

}
