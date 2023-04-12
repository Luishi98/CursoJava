/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc4_6_ej_ext2;

/**
 *
 * @author luish
 */
public class Enc4_6_Ej_Ext2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int A = 5;
        int B = 7;
        int C = 2;
        int D = 4;
        int aux;
        
        System.out.println("Valores inciales");
        
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        
        System.out.println("Valores cambiados");
        
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        
    }
    
}
