/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc7_8_ej_1;

import java.util.Scanner;

/**
 *
 * @author luish
 */
public class Enc7_8_Ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        Operacion(leer);
    }
    public static int Operacion(Scanner leer){
        System.out.println("Ingrese 2 números");
        
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("Elija una operación");
        
        int op = leer.nextInt();
        
        float resultado;
        
        switch(op){
            case 1:
                resultado = Suma(num1, num2);
                System.out.println("La suma es igual a " + resultado);
                break;
            case 2:
                resultado = Resta(num1, num2);
                System.out.println("La resta es igual a " + resultado);
                break;
            case 3:
                resultado = Multiplicacion(num1, num2);
                System.out.println("La multiplicación es igual a " + resultado);
                break;
            case 4:
                resultado = Division(num1, num2);
                System.out.println("La división es igual a " + resultado);
                break;
        }
        
        return 0;
    }
    public static int Suma(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }
    public static int Resta(int num1, int num2) {
        int resta = num1 - num2;
        return resta;
    }
    public static int Multiplicacion(int num1, int num2) {
        int mult = num1 * num2;
        return mult;
    }
    public static float Division(int num1, int num2) {
        float div = num1 / num2;
        return div;
    }
    
}
