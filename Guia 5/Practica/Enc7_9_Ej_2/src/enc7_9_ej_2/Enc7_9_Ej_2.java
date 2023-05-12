/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc7_9_ej_2;

import java.util.Scanner;

/**
 *
 * @author luish
 */
public class Enc7_9_Ej_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Indique el tamaño del vector");
        
        int tam = leer.nextInt();
        
        int[] vector = new int[tam];
        
        for(int i = 0; i < vector.length; i++){
            vector[i] = (int) (Math.random() * 100);
        }
        
        System.out.println("Ingrese un número a buscar en el vector");
        
        int num = leer.nextInt();
        
        int suma = 0;
        
        for(int i = 0; i < vector.length; i++){
            if(num == vector[i]){
                suma += 1;
            }
        }
        
        if(suma>1){
            System.out.println("El número [" + num + "] se encuentra repetido en las siguientes posiciones:");
        }
        
        for(int i = 0; i < vector.length; i++){
            if(suma > 1 && num == vector[i]){
                System.out.println("[" + (i+1) + "]");
            } else if(suma == 1 && num == vector[i]){
                System.out.println("El número [" + vector[i] + "] se encuentra en la posición: [" + (i+1) + "]");
                System.out.println("El número no se repite");
                break;
            } else if(suma == 0){
                System.out.println("El número no se encuentra en el vector");
                break;
            }
        }
        
    }
    
}
