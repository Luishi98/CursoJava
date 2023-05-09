/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package guia10_ej2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Guia10_Ej2 {

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
            if(iterator.next().equals(raza)){
                iterator.remove();
                System.out.println("La raza <" + raza + "> se encuentra en la lista");
                esta = false;
            }
        } 
        
        if(esta){
            System.out.println("La raza <" + raza + "> no se encuentra en la lista");
        }
        
        Collections.sort(razasPerros);
        
        for (String razasPerro : razasPerros) {
            System.out.println("[" + razasPerro + "]");
        }
        
    }
    
}
