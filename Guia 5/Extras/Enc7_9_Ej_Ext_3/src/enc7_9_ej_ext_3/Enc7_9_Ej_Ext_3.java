/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc7_9_ej_ext_3;

import java.util.Arrays;

/**
 *
 * @author luish
 */
public class Enc7_9_Ej_Ext_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] vector = new int[5];
        
        int[] resultado;
        
        resultado = DevolverVector(vector);
        ImprimirVector(vector);
        
    }
    
    public static int[] DevolverVector(int[] vector){
        
        for(int i = 0; i < vector.length; i++){
            vector[i] = (int) (Math.random() * 10);
        }
        
        return vector;
    }
    
    public static void ImprimirVector(int [] vector){
            System.out.println(Arrays.toString(vector));
    }
    
}
