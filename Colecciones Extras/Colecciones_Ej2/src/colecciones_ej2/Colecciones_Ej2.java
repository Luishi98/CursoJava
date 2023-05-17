/*
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.
 */
package colecciones_ej2;

import Entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Colecciones_Ej2 {

    public static void main(String[] args) throws InterruptedException {

        //Declaracion e inicializacion de lista, objeto y escaner
        ArrayList<CantanteFamoso> cantante = new ArrayList<>();
        CantanteFamoso can = new CantanteFamoso();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        //Ingresamos 5 elementos dentro de la lista
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre de un cantante: ");
            can.setNombre(leer.next());
            System.out.print("Ingrese el disco más vendido de " + can.getNombre() + ": ");
            can.setDiscoConMasVentas(leer.next());
            cantante.add(new CantanteFamoso(can.getNombre(), can.getDiscoConMasVentas()));
        }

        //Esperamos 1 segundo
        Thread.sleep(1000);

        //Mostramos por pantalla la lista completa
        cantante.forEach((cantanteFamoso) -> {
            System.out.println("Cantante: " + cantanteFamoso.getNombre() + " - Disco más vendido: " + cantanteFamoso.getDiscoConMasVentas());
        });

        //Esperamos 1 segundo
        Thread.sleep(1000);

        //Creamos un bucle que perimitira que el usuaria decida que accion realizar
        int op;
        do {
            System.out.println("Menu:\n"
                    + "1- Agregar un cantante más\n"
                    + "2- Mostrar todos los cantantes\n"
                    + "3- Eliminar un cantante de la lista\n"
                    + "4- Salir del programa");
            op = leer.nextInt();

            //Esperamos 1 segundo
            Thread.sleep(1000);

            switch (op) {
                case 1:
                    System.out.print("Ingrese el nombre de un cantante: ");
                    can.setNombre(leer.next());
                    System.out.print("Ingrese el disco más vendido de " + can.getNombre() + ": ");
                    can.setDiscoConMasVentas(leer.next());
                    cantante.add(new CantanteFamoso(can.getNombre(), can.getDiscoConMasVentas()));

                    //Esperamos 1 segundo
                    Thread.sleep(1000);

                    break;
                case 2:
                    for (CantanteFamoso cantanteFamoso : cantante) {
                        System.out.println("Cantante: " + cantanteFamoso.getNombre() + " - Disco más vendido: " + cantanteFamoso.getDiscoConMasVentas());
                    }

                    //Esperamos 1 segundo
                    Thread.sleep(1000);

                    break;
                case 3:
                    System.out.print("Ingrese un cantante a eliminar: ");
                    String nombre = leer.next();
                    Iterator<CantanteFamoso> it = cantante.iterator();
                    while (it.hasNext()) {
                        CantanteFamoso canFam = it.next();
                        if (canFam.getNombre().equals(nombre)) {
                            it.remove();
                        }
                    }

                    //Esperamos 1 segundo
                    Thread.sleep(1000);

                    break;
                case 4:
                    System.out.println("Adios!");

                    //Esperamos 1 segundo
                    Thread.sleep(1000);

                    break;
                default:
                    op = 0;
            }
        } while (op != 4);

        //Mostramos la lista final
        cantante.forEach((cantanteFamoso) -> {
            System.out.println("Cantante: " + cantanteFamoso.getNombre() + " - Disco más vendido: " + cantanteFamoso.getDiscoConMasVentas());
        });
    }

}
