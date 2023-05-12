/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc7_9_ej_6;

import java.util.Scanner;

/**
 *
 * @author luish
 */
public class Enc7_9_Ej_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Defino y dimensiono la matriz
        
        int[][] matriz = new int[3][3];
        
        //Incializo la matriz
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matriz[i][j] = leer.nextInt();
            }
        }
        
        //Guardo la suma de la primera fila 
        
        int aux = 0;
        
        for(int i = 0; i < 3; i++){
            aux += matriz[0][i];
        }
        
        //Imprimo la matriz por pantalla
        
        System.out.println("Matriz");
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        //Empiezo a comparar filas
        
        int suma;
        int coin = 0;
        
        for(int i = 0; i < 3; i++){
            suma = 0;
            for(int j = 0; j < 3; j++){
                suma += matriz[i][j];
            }
            if(suma != aux){
                break;
            } else{
                coin += 1;
            }
        }
        
        //Empiezo a comparar columnas
        
        if(coin == 3){
            for(int i = 0; i < 3; i++){
            suma = 0;
            for(int j = 0; j < 3; j++){
                suma += matriz[j][i];
            }
            if(suma != aux){
                break;
            } else{
                coin += 1;
            }
        }
        }
        
        //Comparo la diagonal principal
        
        if(coin == 6){
            suma = 0;
            for(int j = 0; j < 3; j++){
                suma += matriz[j][j];
            }
            if(suma != aux){
                
            } else{
                coin += 1;
            }
        }
        
        //Comparo la diagonal secundaria
        
        int j = 2;
        
        if(coin == 7){
            suma = 0;
            for(int i = 0; i < 3; i++){
            suma += matriz[i][j];
            j -= 1;
        }   
            if(suma == aux){
            coin += 1;
        }
        }
        
        //Resultado final
        
        if(coin == 8){
            System.out.println("La matriz es mágica");
        } else{
            System.out.println("La matriz no es mágica");
        }
        
    }
    
}
