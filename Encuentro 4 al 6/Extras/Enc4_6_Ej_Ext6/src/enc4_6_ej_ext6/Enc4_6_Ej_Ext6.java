/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc4_6_ej_ext6;

import java.util.Scanner;

/**
 *
 * @author luish
 */
public class Enc4_6_Ej_Ext6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese que cantidad de alturas ingresará");
        
        int cant = leer.nextInt();
        
        int suma = 0;
        
        int sumaGral = 0;
        
        int alt;
        
        int prom = 0;
        
        System.out.println("Ingrese las alturas en centímetros");
        
        for(int i = 0; i < cant; i++){
            
            alt = leer.nextInt();
            
            sumaGral = sumaGral + alt;
            
            if (alt < 160){
                prom = prom + 1;
                suma = suma + alt;
            }
        }
        
        if (prom > 0){
            System.out.println("El promedio de alturas menor a 160 cm es: " + (suma / prom) + "cm");
        } else {
            System.out.println("No hay alturas menores a 160 cm");
        }
        
        System.out.println("El promedio de alturas general es: " + (sumaGral / cant) + "cm");
        
    }
    
}
