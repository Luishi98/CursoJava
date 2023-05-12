/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc4_6_ej_ext1;

import java.util.Scanner;

/**
 *
 * @author luish
 */
public class Enc4_6_Ej_Ext1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad de minutos");
        
        int min = leer.nextInt();
        
        int horas = min / 60;
        
        int dias = horas / 24;
        
        if (horas / 24 == 0){
        System.out.println(min + " minutos son equivalentes a " + dias + " dias.");
    } else{
            System.out.println(min + " minutos son equivalentes a " + dias + " día/s y " + (horas - (dias * 24)) + " hora/s.");
        }
    }
}
