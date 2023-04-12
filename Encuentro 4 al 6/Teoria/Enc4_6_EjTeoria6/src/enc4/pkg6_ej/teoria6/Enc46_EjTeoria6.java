package enc4.pkg6_ej.teoria6;

import java.util.Scanner;

public class Enc46_EjTeoria6 {

    public static void main(String[] args) {
        int num1;
        int num2;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos números");
        
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        if (num1 > 25 && num2 > 25){
            System.out.println("Ambos números ingresados son mayores a 25");
        }else if (num1 > 25 || num2 > 25){
            System.out.println("Uno de los dos números ingresados es mayor a 25");
        }
    }
    
}
