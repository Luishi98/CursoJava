/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc4_6_ej_ext8;

import java.util.Scanner;

/**
 *
 * @author luish
 */
public class Enc4_6_Ej_Ext8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ejercicio();
        
    }
    
    public static void Ejercicio(){
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        
        int cont = 0;
        
        int pares = 0;
        
        int impares = 0;
        
        System.out.println("Ingrese números");
    do {
        num = leer.nextInt();
        
        if (num % 2 == 0){
            pares = pares + 1;
        } else {
            impares = impares + 1;
        }
        
        cont = cont + 1;
        
        if (num % 5 == 0){
            break;
        }
        
    } while (num % 5 != 0);
    
        System.out.println("La cantidad de número pares leídos fue: " + pares);
        System.out.println("La cantidad de número impares leídos fue: " + impares);
        System.out.println("La cantidad de número totales leídos fue: " + cont);
}
}
/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe 
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números 
pares y la cantidad de números impares. Al igual que en el ejercicio anterior los 
números negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
*/