/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc4_6_ej_ext5;

import java.util.Scanner;

/**
 *
 * @author luish
 */
public class Enc4_6_Ej_Ext5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un tipo de socio");
        
        String socio = leer.nextLine();
        
        socio = socio.toUpperCase();
        
        System.out.println("Ingrese el valor del tratamiento");
        
        float trat = leer.nextFloat();
        
        if (socio.equals("A")){
            System.out.println("El valor final del tratmiento es " + (trat / 2));
        } else if (socio.equals("B")) {
            System.out.println("El valor final del tratmiento es " + (trat * 0.35));
        } else {
            System.out.println("El valor final del tratmiento es " + trat);
        }
    }
}
