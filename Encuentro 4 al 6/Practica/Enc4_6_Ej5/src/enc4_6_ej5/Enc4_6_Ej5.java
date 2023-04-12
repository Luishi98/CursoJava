/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc4_6_ej5;

import java.util.Scanner;

/**
 *
 * @author luish
 */
public class Enc4_6_Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor limite positivo");
        int limite = leer.nextInt();
        int suma = 0;
        System.out.println("Ingrese números");
        do {
            int num = leer.nextInt();
            suma = suma + num;
        } while (suma < limite);
        System.out.println("La suma de los número ingresados es: " + suma);
    }
}
