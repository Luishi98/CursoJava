package Servicios;

import Entidades.Ahorcado;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoServicio {

    //Creo el objeto juego para poder usarlo en todos los metodos de esta calse
    static Ahorcado juego = new Ahorcado();
    static Scanner leer = new Scanner(System.in);

    public void crearJuego() {
        //Pedimos una palabra para guardarla en el vector
        System.out.print("Ingrese una palabra: ");
        String palabra = leer.next();
        //Creamos un array con la longitud de la palabra y lo llenamos con la misma palabra
        String[] arreglo = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            arreglo[i] = palabra.substring(i, i + 1);
        }
        //Creamos el objeto juego para mandarle el arreglo ya creado
        juego.setPalabraABuscar(arreglo);
        //Pedimos la cantidad de intentos
        System.out.print("Ingrese la cantidad de intentos: ");
        int intentos = leer.nextInt();
        juego.setIntentosMax(intentos);
    }

    public void longitud() {
        System.out.println("La cantidad de letras que tiene la palabra es: " + Array.getLength(juego.getPalabraABuscar()));
    }

    public void buscar(String letra) {
        String otraLetra[] = juego.getPalabraABuscar();
        int cont = 0;
        for (int i = 0; i < Array.getLength(juego.getPalabraABuscar()); i++) {
            if (letra.equalsIgnoreCase(otraLetra[i])) {
                cont += 1;
            }
        }
        if (cont >= 1) {
            if (cont == 1) {
                System.out.println("La letra se encuentra en la plabra " + cont + " vez");
            } else {
                System.out.println("La letra se encuentra en la plabra " + cont + " veces");
            }
        } else {
            System.out.println("La letra no se encuentra en la palabra");
        }
    }

    public boolean encontradas(String letra) {
        int cont = 0;
        String otraLetra[] = juego.getPalabraABuscar();
        for (int i = 0; i < Array.getLength(juego.getPalabraABuscar()); i++) {
            if (letra.equalsIgnoreCase(otraLetra[i])) {
                cont += 1;
            }
        }
        if (cont == 0) {
            juego.setIntentosMax(juego.getIntentosMax() - 1);
        } else {
            juego.setLetrasEncontradas(juego.getLetrasEncontradas() + cont);
        }
        System.out.println("Han sido encontradas " + juego.getLetrasEncontradas() + " letra/s");
        System.out.println("Le faltan encontrar " + (Array.getLength(juego.getPalabraABuscar()) - juego.getLetrasEncontradas()) + " letra/s");

        return cont != 0;
    }

    public int intentos() {
        return juego.getIntentosMax();
    }

    public void juego() {
        crearJuego();
        longitud();
        InicializarProgreso();
        do {
            System.out.println("------------------------------------------------");
            System.out.println("Ingrese una letra");
            String letra = leer.next();
            buscar(letra);
            encontradas(letra);
            System.out.println("Le quedan " + intentos() + " intentos");
            progreso(letra);
            mostrarProgreso();
            if (juego.getLetrasEncontradas() == Array.getLength(juego.getPalabraABuscar())) {
                System.out.println("Felicidades, ha encontrado la palabra: " + Arrays.toString(juego.getPalabraABuscar()));
                break;
            }
            if (juego.getIntentosMax() == 0) {
                System.out.println("Lo sentimos, se ha quedado sin intentos");
                System.out.println("La palabra era: " + Arrays.toString(juego.getPalabraABuscar()));
                break;
            }
        } while (juego.getIntentosMax() >= 0);
    }

    //--------------------------------------------------------------------------------
    public void InicializarProgreso() {
        String[] progres = new String[Array.getLength(juego.getPalabraABuscar())];
        Arrays.fill(progres, "_");
        juego.setProgreso(progres);
    }

    public void progreso(String letra) {
        String otraLetra[] = juego.getPalabraABuscar();
        String[] progres = juego.getProgreso();
        for (int i = 0; i < Array.getLength(juego.getPalabraABuscar()); i++) {
            if (letra.equalsIgnoreCase(otraLetra[i])) {
                progres[i] = otraLetra[i];
            }
        }
        juego.setProgreso(progres);
    }

    public void mostrarProgreso() {
        String[] progres = juego.getProgreso();
        System.out.println(Arrays.toString(progres));
    }

    //--------------------------------------------------------------------------------
}
