/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc7_9_ej_guia_13;

import java.util.Scanner;

/**
 *
 * @author luish
 */
public class Enc7_9_Ej_Guia_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String[] vector = new String[6];
        
        for(int i = 0; i < vector.length; i++){
            vector[i] = leer.nextLine();
        }
        
        for(int i = 0; i < vector.length; i++){
            System.out.print(vector[i] + " ");
        }
        
        System.out.println("");
        
    }
    
}
