/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package guia10_ej1;

import java.util.ArrayList;
import java.util.Scanner;

public class Guia10_Ej1 {

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
        
    }
    
}
