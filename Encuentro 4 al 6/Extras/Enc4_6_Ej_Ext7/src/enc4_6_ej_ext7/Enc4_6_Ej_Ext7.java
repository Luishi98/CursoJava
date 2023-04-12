/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc4_6_ej_ext7;

import java.util.Scanner;

/**
 *
 * @author luish
 */
public class Enc4_6_Ej_Ext7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Desea hacer el ejercicio con...");
        System.out.println("1 - While");
        System.out.println("2 - Do-While");
        
        int op = leer.nextInt();
        if (op == 1){
            ConWhile();
        } else {
            ConDoWhile();
        }
    }
    
    /*
    ----------------------------------------------------------------------------
    */
    
    public static void ConDoWhile(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ejercicio con Do-While");
        
        System.out.println("Ingrese la cantidad de valores que introducirá");
        int cant = leer.nextInt();
        
        int num;
        
        int min = 0;
        
        int max = 0;
        
        float prom = 0;
        
        int cont = 0;
        
        do {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            
            if (num > max){
                max = num;
            }
            
            if (cont == 0){
                min = num;
            }
            
            if (num < min){
                min = num;
            }
            
            prom = prom + num;
            
            cont = cont + 1;
        } while (cont < cant);
        
        System.out.println("El valor mínimo ingresado es: " + min);
        System.out.println("El valor máximo ingresado es: " + max);
        System.out.println("El promedio de los valores ingresados es: " + (prom / cant));
    }
    
    /*
    ----------------------------------------------------------------------------
    */
    
    public static void ConWhile(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ejercicio con While");
        
        System.out.println("Ingrese la cantidad de valores que introducirá");
        int cant = leer.nextInt();
        
        int num;
        
        int min = 0;
        
        int max = 0;
        
        float prom = 0;
        
        int cont = 0;
        
        while (cont < cant) {
        
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            
            if (num > max){
                max = num;
            }
            
            if (cont == 0){
                min = num;
            }
            
            if (num < min){
                min = num;
            }
            
            prom = prom + num;
            
            cont = cont + 1;
        }
        
        System.out.println("El valor mínimo ingresado es: " + min);
        System.out.println("El valor máximo ingresado es: " + max);
        System.out.println("El promedio de los valores ingresados es: " + (prom / cant));
    }
}
/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n 
números (n>0). El valor de n se solicitará al principio del programa y los números serán 
introducidos por el usuario. Realice dos versiones del programa, una usando 
el bucle “while” y otra con el bucle “do - while”.
*/
