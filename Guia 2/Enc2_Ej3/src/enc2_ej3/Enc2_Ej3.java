/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc2_ej3;

import java.util.Scanner;

/**
 *
 * @author Luish
 */
public class Enc2_Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Ejercicio 3
         
         Scanner leer = new Scanner(System.in);
         
         String frase;
         
         System.out.println("Escriba una frase");
         
         frase = leer.next();
         
         System.out.println(frase.toUpperCase());
         
         System.out.println(frase.toLowerCase());
    }
    
}
