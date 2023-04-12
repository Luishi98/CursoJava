/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc4_6_ej_ext10;

import java.util.Scanner;

/**
 *
 * @author luish
 */
public class Enc4_6_Ej_Ext10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejercicio();
    }
    public static void Ejercicio(){
        Scanner leer = new Scanner(System.in);
        
        int num1 = (int) Math.random() * 10;
        int num2 = (int) Math.random() * 10;
        
        System.out.println("Adivine el resultado de la multiplicación de 2 números aleatorios");
        
        System.out.println("Ingrese un número");
        
        int op = leer.nextInt();
        
        while (op != (num1 * num2)){
            System.out.println("El número ingresado es incorrecto");
            System.out.println("Desea intentar nuevamente?Si/No");
            
            String seg = leer.next();
            
            if(seg.equals("Si")){
                System.out.println("Ingrese un número");
                op = leer.nextInt();
            } else {
                break;
            }
            
        }
        
    }
}
/*
Realice un programa para que el usuario adivine el resultado de una multiplicación 
entre dos números generados aleatoriamente entre 0 y 10. El programa debe indicar 
al usuario si su respuesta es o no correcta. En caso que la respuesta sea incorrecta 
se debe permitir al usuario ingresar su respuesta nuevamente. Para realizar este 
ejercicio investigue como utilizar la función Math.random() de Java.
*/