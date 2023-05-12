package APPs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio2_APP {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        ArrayList<String> razasPerros = new ArrayList<>();

        String op = "si";

        while (op.equalsIgnoreCase("si")) {
            System.out.println("Ingrese una raza de perro");
            razasPerros.add(leer.next());
            System.out.println("Desea ingresar otra raza?");
            op = leer.next();
        }

        for (String razasPerro : razasPerros) {
            System.out.println("[" + razasPerro + "]");
        }

        System.out.println("Ingrese una raza de perro a buscar en la lista");

        Iterator iterator = razasPerros.iterator();

        String raza = leer.next();

        boolean esta = true;

        while (iterator.hasNext()) {
            if (iterator.next().equals(raza)) {
                iterator.remove();
                System.out.println("La raza <" + raza + "> se encuentra en la lista");
                esta = false;
            }
        }

        if (esta) {
            System.out.println("La raza <" + raza + "> no se encuentra en la lista");
        }

        Collections.sort(razasPerros);

        for (String razasPerro : razasPerros) {
            System.out.println("[" + razasPerro + "]");
        }

    }
}
