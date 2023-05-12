/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc2_ej5;

import java.util.Scanner;

/**
 *
 * @author Luish
 */
public class Enc2_Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 5
        
        Scanner leer = new Scanner(System.in);
         
         System.out.println("Ingrese un número entero");
         
         int num = leer.nextByte();
         
         System.out.println("El doble de " + num + " es: " + num * 2);
         System.out.println("El triple de " + num + " es: " + num * 3);
         System.out.println("La raiz cuadrada de " + num + " es: " + Math.sqrt(num));
    }
    
}
