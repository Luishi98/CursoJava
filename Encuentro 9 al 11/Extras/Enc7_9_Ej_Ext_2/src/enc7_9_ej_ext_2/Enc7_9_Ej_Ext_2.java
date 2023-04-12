/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc7_9_ej_ext_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author luish
 */
public class Enc7_9_Ej_Ext_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Indique el tamaño de los vectores");
        
        int tam = leer.nextInt();
        
        int[] vector1 = new int[tam];
        int[] vector2 = new int[tam];
        int suma = 0;
        
        for(int i = 0; i < vector1.length; i++){
            vector1[i] = (int) (Math.random() * 10);
            vector2[i] = (int) (Math.random() * 10);
        }
        
        System.out.println("Vector 1");
        
        System.out.println(Arrays.toString(vector1));
        
        System.out.println("Vector 2");
        
        System.out.println(Arrays.toString(vector2));
        
        for(int i = 0; i < vector1.length; i++){
            if(vector1[i] != vector2[i]){
                break;
            } else{
                suma += 1;
            }
        }
        
        if(suma == vector1.length){
            System.out.println("Los vectores son iguales");
        } else{
            System.out.println("Los vectores no son iguales");
        }
        
    }
    
}
