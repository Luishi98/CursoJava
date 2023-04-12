/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc4_6_ej6;

import java.util.Scanner;

/**
 *
 * @author luish
 */
public class Enc4_6_Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int opcion;
        do {
            System.out.println("Menu");
            System.out.println("1: Sumar");
            System.out.println("2: Restar");
            System.out.println("3: Multiplicar");
            System.out.println("4: Dividir");
            System.out.println("5: Salir");
            System.out.println("Elija una opción");
            
            opcion = leer.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
                    break;
                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
                    break;
                case 3:
                    System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
                    break;
                case 4:
                    System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
                    break;
            }
            if (opcion == 5){
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                String seguro = leer.next();
                if (seguro.equals("S")){
                    break;
                }
            }
        } while(opcion <= 5);
    }
    
}
