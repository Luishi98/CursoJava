/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc4_6_ej_ext14;

import java.util.Scanner;

/**
 *
 * @author luish
 */
public class Enc4_6_Ej_Ext14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejercicio();
    }
    public static void Ejercicio(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de familias");
        int familia = leer.nextInt();
        
        int prom = 0;
        
        int cont = 0;
        
        for (int i = 1; i <= familia; i++){
            System.out.println("Indique la cantidad de hijos de la familia " + i);
            int hijos = leer.nextInt();
            System.out.println("Ingrese la edad de cada hijo");
            for(int j = 1; j <= hijos; j++){
                int edad = leer.nextInt();
                prom = prom + edad;
                cont = cont + 1;
            }
        }
        
        float promedio = (float) prom/cont;
        
        System.out.println("La media de edad de todos los hijos de todas las familias es: " + promedio);
    }
}
