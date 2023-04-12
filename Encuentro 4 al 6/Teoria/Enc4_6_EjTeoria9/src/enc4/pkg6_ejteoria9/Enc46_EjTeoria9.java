package enc4.pkg6_ejteoria9;

import java.util.Scanner;

public class Enc46_EjTeoria9 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        int cont = 0;
        int suma = 0;
        
        do {
            System.out.println("Ingrese un número");
            
            num =leer.nextInt();
            cont++;
            
            if (num == 0){
                System.out.println("Se capturo el número 0");
                break;
            } else if (num > 0){
                suma = suma + num;
            }
        } while (num != 0 && cont < 20);
        System.out.println("La suma de los número ingresados es: " + suma);
    }
    
}
