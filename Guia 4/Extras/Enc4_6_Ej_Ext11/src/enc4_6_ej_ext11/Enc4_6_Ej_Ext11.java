/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc4_6_ej_ext11;

import java.util.Scanner;

/**
 *
 * @author luish
 */
public class Enc4_6_Ej_Ext11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejercicio();
    }
    public static void Ejercicio(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        
        int num2 = num;
        
        int cont = 0;
        
        do{
            num = num / 10;
            cont = cont + 1;
        } while(num != 0);
        
        System.out.println("El número " + num2 + " tiene " + cont + " dígitos.");
    }
}
