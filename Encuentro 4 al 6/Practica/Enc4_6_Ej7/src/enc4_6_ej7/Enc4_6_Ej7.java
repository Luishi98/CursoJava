/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc4_6_ej7;

import java.util.Scanner;

/**
 *
 * @author luish
 */
public class Enc4_6_Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int correcto = 0;
        int incorrecto = 0;
        String codigo = "";
        
        do {
            System.out.println("Ingrese una frase");
        
        codigo = leer.nextLine();
        
        if (codigo.length() == 5){
            if ((codigo.substring(0, 1).equals("X")) && (codigo.substring(4, 5).equals("O"))){
                correcto++;
            } else if (!codigo.equals("&&&&&")){
                incorrecto++;
            }
        }
        } while (!codigo.equals("&&&&&"));
        
        System.out.println("Ingreso un total de " + correcto + " códigos correctos");
        System.out.println("Ingreso un total de " + incorrecto + " códigos incorrectos");
    }
}
