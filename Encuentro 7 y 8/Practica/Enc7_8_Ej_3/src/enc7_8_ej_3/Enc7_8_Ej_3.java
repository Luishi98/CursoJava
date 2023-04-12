/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc7_8_ej_3;

import java.util.Scanner;

/**
 *
 * @author luish
 */
public class Enc7_8_Ej_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertir();
    }
    public static void Convertir(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de euros");
        int euros = leer.nextInt();
        System.out.println("Indique a que moneda desea hacer la conversión");
        System.out.println("Dolar");
        System.out.println("Libra");
        System.out.println("Yen");
        String op = leer.next();
        switch (op){
            case "Dolar":
                System.out.println("El total de Dolares es: " + (euros * 1.28611));
                break;
            case "Libra":
                System.out.println("El total de Libras es: " + (euros * 0.86));
                break;
            case "Yen":
                System.out.println("El total de Yenes es: " + (euros * 129.852));
                break;
        }
}
}
