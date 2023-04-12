/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc4_6_ej_ext13;

import java.util.Scanner;

/**
 *
 * @author luish
 */
public class Enc4_6_Ej_Ext13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejercicio();
    }
    public static void Ejercicio(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        
        int escalon = leer.nextInt();
        
        String e = "1";
        
        int i;
        
        String ii = "";
        
        System.out.println(e);
        
        for(i = 2; i <= escalon; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
        
    }
}
