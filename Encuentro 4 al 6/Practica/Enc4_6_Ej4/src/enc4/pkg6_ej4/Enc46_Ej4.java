/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc4.pkg6_ej4;

import java.util.Scanner;

/**
 *
 * @author luish
 */
public class Enc46_Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        
        String frase = leer.nextLine();
        String inicial = frase.substring(0, 1);
        
        if (inicial.equals("a")){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
    
}
