/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_4_ejteoria_12;

import java.util.Scanner;

/**
 *
 * @author luish
 */
public class Guia_4_EjTeoria_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 2 números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        EsMultiplo(num1, num2);
    }
    public static int EsMultiplo(int num1, int num2){
        if (num1 % num2 == 0){
            System.out.println("El primer número es múltiplo del segundo.");
        } else {
            System.out.println("El primero número no es múltiplo del segundo.");
        }
        return 0;
    }
}
