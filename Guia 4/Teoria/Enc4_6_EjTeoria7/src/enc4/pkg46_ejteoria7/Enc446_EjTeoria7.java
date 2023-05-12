package enc4.pkg46_ejteoria7;

import java.util.Scanner;

public class Enc446_EjTeoria7 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int tipo_motor;
        
        System.out.println("Ingrese entre 1 y 4 el tipo de motor");
        
        tipo_motor = leer.nextInt();
        
        switch (tipo_motor){
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }
    }
    
}
