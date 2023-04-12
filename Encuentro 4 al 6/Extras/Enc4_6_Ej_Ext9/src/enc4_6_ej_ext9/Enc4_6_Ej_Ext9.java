/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc4_6_ej_ext9;

import java.util.Scanner;

/**
 *
 * @author luish
 */
public class Enc4_6_Ej_Ext9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejercicio();
    }
    public static void Ejercicio(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        int resto = num1;
        
        while(resto > num2){
            
            System.out.println(resto + " - " + num2 + " = " + (resto - num2));
            
            resto = resto - num2;
            
        }
        
        System.out.println("Dado que " + resto + " es menor que " + num2 + ", entonces: el residuo es " + resto + " y el cociente es " + (num1/num2) + ".");
        
    }
}
/*
Simular la división usando solamente restas. Dados dos números enteros mayores que uno, 
realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, 
este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.

*/