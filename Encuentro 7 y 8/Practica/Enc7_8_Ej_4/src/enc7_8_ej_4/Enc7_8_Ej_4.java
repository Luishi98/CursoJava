/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc7_8_ej_4;

import java.util.Scanner;

/**
 *
 * @author luish
 */
public class Enc7_8_Ej_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        
        int num = leer.nextInt();
        
        System.out.println("El número " + num + " es primo? " + Primos(num));
        
    }
    public static boolean Primos(int num){
        
        int suma = 0;
        
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                suma = suma + 1;
            }
            
        }
        
        boolean primo;
        
        if (suma == 0){
            primo = true;
        } else {
            primo = false;
        }
        
        return primo;
    }
}
