/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc2_ej4;

import java.util.Scanner;

/**
 *
 * @author Luish
 */
public class Enc2_Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 4
        
        Scanner leer = new Scanner (System.in);
         
        float C;
    
        System.out.println("Buenas tardes, ingrese los grandos C: ");
    
        C = leer.nextByte();
    
        float F = 32 + (9 * C / 5);
    
        System.out.println("Los " + C + "°C son en total: " + F + "°F");
    }
    
}
