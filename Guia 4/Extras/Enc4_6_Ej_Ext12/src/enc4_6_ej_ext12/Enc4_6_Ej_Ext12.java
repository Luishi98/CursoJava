/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc4_6_ej_ext12;

/**
 *
 * @author luish
 */
public class Enc4_6_Ej_Ext12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejercicio();
    }
    public static void Ejercicio(){
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        String E = "E";
        
        String ii;
        String jj;
        String kk;
        
        for(int i = 0; i <= 9; i++){
            for(int j = 0; j <= 9; j++){
                for(int k = 0; k <= 9; k++){
                    if (i == 3){
                        ii = E;
                    } else {
                        ii = String.valueOf(i);
                    }
                    if (j == 3){
                        jj = E;
                    } else {
                        jj = String.valueOf(j);
                    }
                    if (k == 3){
                        kk = E;
                    } else {
                        kk = String.valueOf(k);
                    }
                    System.out.println(ii + "-" + jj + "-" + kk);
                }
            }
        }
        
        
    }
}
