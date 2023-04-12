/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc7_9_ej_ext_6;

import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeString;

/**
 *
 * @author luish
 */
public class Enc7_9_Ej_Ext_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SopaDeLetras();
        
    }
    
    public static void SopaDeLetras(){
        String[][] matriz = new String[20][20];
        
        Scanner leer = new Scanner(System.in);
        
        String palabra;
        
        int num;
        
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                num = (int) (Math.random() * 10);
                matriz[i][j] = String.valueOf(num);
            }
        }
        
        System.out.println("Ingrese 5 palabras de 3 a 5 letras");
        
        for(int i = 0; i < 5;i ++){ 
            int fila = (int) (Math.random() * 20);
            System.out.println("Palabra " + (i+1));
            palabra = leer.nextLine();
            
            int largo = palabra.length();
            
            int col = (int) (Math.random() * 10);
            
            for(int j = col; j < col+largo; j++){
                matriz[fila][j] = palabra.substring(j, j+1);
            }
        }
        
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
    }
    
}
