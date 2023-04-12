package enc4.pkg6_ejteoria10;

import java.util.Scanner;

public class Enc46_EjTeoria10 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int cont;
        
        System.out.println("Ingrese cuatro números");
        
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int num3 = leer.nextInt();
        int num4 = leer.nextInt();
        
        System.out.print(num1 + " ");
        
        for (cont = 0; cont < num1; cont++){
            System.out.print("*");
        }
        
        System.out.println("");
        
        System.out.print(num2 + " ");
        
        for (cont = 0; cont < num2; cont++){
            System.out.print("*");
        }
        
        System.out.println("");
        
        System.out.print(num3 + " ");
        
        for (cont = 0; cont < num3; cont++){
            System.out.print("*");
        }
        
        System.out.println("");
        
        System.out.print(num4 + " ");
        
        for (cont = 0; cont < num4; cont++){
            System.out.print("*");
        }
        
        System.out.println("");
    }
    
}
