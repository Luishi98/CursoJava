/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package ejercicio_1;

import Entidades.Perro;
import Entidades.Persona;
import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona persona = new Persona();

        //Perro 1
        System.out.print("Ingrese el nombre del perro: ");
        String nombrePerro = leer.next();
        System.out.print("Ingrese la raza de perro: ");
        String raza = leer.next();
        System.out.print("Ingrese el tamaño del perro: ");
        String tamano = leer.next();
        System.out.print("Ingrese la edad del perro: ");
        int edadPerro = leer.nextInt();

        //Persona 1
        System.out.print("Ingrese su nombre: ");
        String nombre = leer.next();
        System.out.print("Ingrese su apellido: ");
        String apellido = leer.next();
        System.out.print("Ingrese su edad: ");
        int edad = leer.nextInt();
        System.out.print("Ingrese su número de documento: ");
        int documento = leer.nextInt();
        Perro perro1 = new Perro(nombrePerro, raza, tamano, edadPerro);
        Persona persona1 = new Persona(nombre, apellido, edad, documento, perro1);

        //Perro 2
        System.out.print("Ingrese el nombre del perro: ");
        nombre = leer.next();
        System.out.print("Ingrese la raza de perro: ");
        raza = leer.next();
        System.out.print("Ingrese el tamaño del perro: ");
        tamano = leer.next();
        System.out.print("Ingrese la edad del perro: ");
        edad = leer.nextInt();
        //Persona 1
        System.out.print("Ingrese su nombre: ");
        nombre = leer.next();
        System.out.print("Ingrese su apellido: ");
        apellido = leer.next();
        System.out.print("Ingrese su edad: ");
        edad = leer.nextInt();
        System.out.print("Ingrese su número de documento: ");
        documento = leer.nextInt();
        Perro perro2 = new Perro(nombrePerro, raza, tamano, edadPerro);
        Persona persona2 = new Persona(nombre, apellido, edad, documento, perro2);
        System.out.println("<------------------------------------------------------------>");
        System.out.println(persona.mostrarInfo(persona1));
        System.out.println("<------------------------------------------------------------>");
        System.out.println(persona.mostrarInfo(persona2));
        System.out.println("<------------------------------------------------------------>");
    }

}
