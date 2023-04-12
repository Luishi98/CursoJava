/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc7_8_ej_2;

import java.util.Scanner;

/**
 *
 * @author luish
 */
public class Enc7_8_Ej_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        int resultado;
        
        do {
            resultado = pipol(leer);
        } while (resultado == 1);
    }
    public static int pipol(Scanner leer){
        System.out.println("Ingrese un nombre");
        String nombre = leer.next();
        System.out.println("Ingrese la edad de " + nombre);
        int edad = leer.nextInt();
        
        if (edad > 18){
            System.out.println(nombre + " es mayor de edad.");
        } else {
            System.out.println(nombre + " no es mayor de edad.");
        }
        System.out.println("Desea continuar?");
        System.out.println("1 - Si");
        System.out.println("2 - No");
        int op = leer.nextInt();
        return op;
    }
}
