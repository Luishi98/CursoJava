/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc2_ej2;

import java.util.Scanner;

/**
 *
 * @author Luish
 */
public class Enc2_Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Ejercicio 2
         
         Scanner leer = new Scanner(System.in);
         
         String nombre;
         
         System.out.println("Ingrese su nombre");
        
         nombre = leer.next();
        
         System.out.println("Hola " + nombre);
    }
    
}
