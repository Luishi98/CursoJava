/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc7_9_ej_ext_5;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author luish
 */
public class Enc7_9_Ej_Ext_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RellenarMatriz();
        
    }
    
    public static void RellenarMatriz(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Indique la cantidad de filas");
        int n = leer.nextInt();
        
        System.out.println("Indique la cantidad de columnas");
        int m = leer.nextInt();
        
        int[][] matriz = new int[n][m];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        
        System.out.println("La matriz es: ");
        
        for(int i = 0; i < n; i++){
        for(int j = 0; j< m; j++){
            System.out.print(matriz[i][j] + " ");
        }
            System.out.println("");
    }
        
        int suma = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                suma += matriz[i][j];
            }
        }
        
        System.out.println("La suma de todos los elementos de la matriz es: " + suma);
        
    }
    
}
