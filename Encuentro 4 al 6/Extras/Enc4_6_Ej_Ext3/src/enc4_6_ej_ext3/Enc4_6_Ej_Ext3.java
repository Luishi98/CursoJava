/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc4_6_ej_ext3;

import java.util.Scanner;

/**
 *
 * @author luish
 */
public class Enc4_6_Ej_Ext3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una letra");
        
        String letra = leer.nextLine();
        
        String min = letra.toLowerCase();
        
        if (min.equals("a") || min.equals("e") || min.equals("i") || min.equals("o") || min.equals("u")){
            System.out.println("La letra: " + letra + ". Es vocal.");
        } else {
            System.out.println("La letra: " + letra + ". No es vocal.");
        }
        
        
    }
    
}
