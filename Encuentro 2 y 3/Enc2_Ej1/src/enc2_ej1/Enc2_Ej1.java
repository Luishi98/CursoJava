/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc2_ej1;

import java.util.Scanner;

/**
 *
 * @author Luish
 */
public class Enc2_Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 1
        
        Scanner leer = new Scanner(System.in);
        
         int num1;
         int num2;
        
        
         System.out.println("Ingrese 2 numeros");
        
         num1 = leer.nextByte();
         num2 = leer.nextByte();
        
         System.out.println("La suma de los dos numeros es: " + (num1 + num2));
    }
    
}
