/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc7_9_ej_ext_1;

import java.util.Scanner;

/**
 *
 * @author luish
 */
public class Enc7_9_Ej_Ext_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Indique el tamaño del vector: ");
        
        int tam = leer.nextInt();
        
        int[] vector = new int[tam];
        
        int suma = 0;
        
        System.out.println("Ahora rellene el vector");
        
        for(int i = 0; i < vector.length; i++){
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        
        System.out.println("La suma de todos los elementos del vector es: " + suma);
        
    }
    
}
