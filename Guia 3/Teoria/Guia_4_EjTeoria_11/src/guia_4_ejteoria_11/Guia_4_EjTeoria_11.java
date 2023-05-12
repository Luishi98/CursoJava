/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_4_ejteoria_11;

import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeString;

/**
 *
 * @author luish
 */
public class Guia_4_EjTeoria_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase finalizada con un punto (.)");
        
        String frase = leer.nextLine();
        
        frase = frase.toLowerCase();
        
        System.out.println("La nueva frase es: " + frase_codificada(frase));
    }
    
    public static String frase_codificada(String frase){
        
        String nuevaFrase = "";
        
        for (int i = 0; i < frase.length();i++){
            String letra = frase.substring(i, i+1);
            switch (letra){
                case "a":
                    letra = "@";
                    break;
                case "e":
                    letra = "#";
                    break;
                case "i":
                    letra = "$";
                    break;
                case "o":
                    letra = "%";
                    break;
                case "u":
                    letra = "*";
                    break;
                default:
                    letra = letra;
            }
            nuevaFrase = nuevaFrase + letra;
        }
        
        return nuevaFrase;
    }
    
}
