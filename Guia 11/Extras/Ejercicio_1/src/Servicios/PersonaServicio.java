/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Persona> personasLista = new ArrayList();
    ArrayList<Perro> perrosLista = new ArrayList();
    ArrayList<Perro> adoptadosLista = new ArrayList();

    public Persona crearPersona() {
        System.out.print("Nombre: ");
        String nombre = leer.next();
        System.out.print("Apellido: ");
        String apellido = leer.next();
        System.out.print("Edad: ");
        int edad = leer.nextInt();
        System.out.print("DNI: ");
        int dni = leer.nextInt();

        return new Persona(nombre, apellido, edad, dni);
    }

    public Perro crearPerro() {
        System.out.print("Nombre: ");
        String nombre = leer.next();
        System.out.print("Edad: ");
        int edad = leer.nextInt();
        System.out.print("Tamaño: ");
        String tamano = leer.next();
        System.out.print("Raza: ");
        String raza = leer.next();

        return new Perro(nombre, edad, tamano, raza);
    }

    public void listaPersonas() {
        personasLista.add(new Persona("Luis", "Rodriguez", 25, 10000000));
        personasLista.add(new Persona("Eduardo", "Moreno", 37, 20000000));
        personasLista.add(new Persona("Beatriz", "Rios", 59, 30000000));
        String op = "si";

        while (op.equals("si")) {
            System.out.println("Hay 3 personas en la lista.");
            System.out.println("Desea agregar más personas? Si/No");
            op = leer.next().toLowerCase();
            while (!op.equals("si") && !op.equals("no")) {
                System.out.println("Ingresó una respuesta inválida. Intente nuevamente.");
                op = leer.next();
            }
            if (op.equals("no")) {
                break;
            }
            personasLista.add(crearPersona());
        }
    }

    public void listaPerros() {
        perrosLista.add(new Perro("Chiquito", 2, "chiquito", "beagle"));
        perrosLista.add(new Perro("Jokina", 7, "mediano", "galgo"));
        perrosLista.add(new Perro("Cantera", 5, "mediana", "criolla"));
        String op = "si";
        while (op.equals("si")) {
            System.out.println("Hay 3 perros en la lista.");
            System.out.println("Desea agregar más perros? Si/No");
            op = leer.next().toLowerCase();
            while (!op.equals("si") && !op.equals("no")) {
                System.out.println("Ingresó una respuesta inválida. Intente nuevamente.");
                op = leer.next();
            }
            if (op.equals("no")) {
                break;
            }
            perrosLista.add(crearPerro());
        }
    }

    public void adoptar() {
        System.out.println("Estos son los Perros rescatados que aún buscan un hogar y una familia a la cual pertenecer: ");
        System.out.println(perrosLista.toString());
        String respuesta;
        for (Persona persona : personasLista) {
            if (perrosLista.size() != adoptadosLista.size()) {
                System.out.println(persona.getNombre() + " desea adoptar un perrito?");
                respuesta = leer.next().toLowerCase();
                while (!respuesta.equals("no") && !respuesta.equals("si")) {
                    System.out.println("Opción inválida. Intente nuevamente");
                    respuesta = leer.next().toLowerCase();
                }
                if (respuesta.equals("no")) {
                    continue;
                }
                for (Perro perro : perrosLista) {
                    System.out.println("Deseas adoptar a " + perro.getNombre());
                    respuesta = leer.next().toLowerCase();
                    while (!respuesta.equals("no") && !respuesta.equals("si")) {
                        System.out.println("Opción inválida. Intente nuevamente");
                        respuesta = leer.next().toLowerCase();
                    }
                    if (respuesta.equals("no")) {
                        continue;
                    }
                    if (perro.isAdoptado()) {
                        System.out.println("Para tu mala fortuna el perrito " + perro.getNombre() + " ya posee una feliz familia");
                        System.out.println("Quisiera adoptar otro?");
                        respuesta = leer.next().toLowerCase();
                        if (respuesta.equals("si")) {
                            continue;
                        } else {
                            break;
                        }
                    } else {
                        System.out.println("Felicidades! Adoptaste a " + perro.getNombre());
                        perro.setAdoptado(true);
                        persona.setPerros(perro);
                        adoptadosLista.add(perro);
                        break;
                    }
                }
            } else {
                System.out.println("Lo sentimos " + persona.getNombre() + ". Todos los perros fueron adoptados.");
            }

        }
    }

    public void metodos() {
        listaPersonas();
        listaPerros();
        adoptar();
    }

}
