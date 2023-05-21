/*
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package Ejercicio1;

import Entidades.Dni;
import Entidades.Persona;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Dni dni = new Dni();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Ingrese su nombre: ");
        String nombre = leer.next();
        System.out.print("Ingrese su apellido: ");
        String apellido = leer.next();
        System.out.print("Ingrese su tipo de serie: ");
        String serie = leer.next();
        System.out.print("Ingrese su numero de DNI: ");
        int numeroDni = leer.nextInt();

        Persona persona = new Persona(nombre, apellido, new Dni(serie, numeroDni));

        System.out.println("Hola " + persona.getNombre() + " " + persona.getApellido() + " su serie es "
                + persona.getDni().getSerie() + " y su número es " + persona.getDni().getNumero());
    }

}
