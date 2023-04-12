/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc4_6_ej_ext4;

import java.util.Scanner;

/**
 *
 * @author luish
 */
public class Enc4_6_Ej_Ext4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número entre 1 y 10");
        
        int num = leer.nextInt();
        
        if (num == 1){
            System.out.println("I");
        }
        if (num == 2){
            System.out.println("II");
        }
        if (num == 3){
            System.out.println("III");
        }
        if (num == 4){
            System.out.println("IV");
        }
        if (num == 5){
            System.out.println("V");
        }
        if (num == 6){
            System.out.println("VI");
        }
        if (num == 7){
            System.out.println("VII");
        }
        if (num == 8){
            System.out.println("VIII");
        }
        if (num == 9){
            System.out.println("IX");
        }
        if (num == 10){
            System.out.println("X");
        }
    }
    
}
