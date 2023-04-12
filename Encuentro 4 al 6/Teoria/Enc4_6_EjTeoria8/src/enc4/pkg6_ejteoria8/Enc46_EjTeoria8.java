package enc4.pkg6_ejteoria8;

import java.util.Scanner;

public class Enc46_EjTeoria8 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int nota;
        
        System.out.println("Ingrese una nota");
        
        nota = leer.nextInt();
        
        while (nota < 0 || nota > 10){
            System.out.println("Ingrese una nota válida");
            nota = leer.nextInt();
        }
    }
    
}
