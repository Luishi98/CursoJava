package enc13_18_ej_ext4;

import enc13_18_ej_ext4.Entidades.Cuenta;
import java.util.Scanner;

public class Enc13_18_Ej_Ext4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del titular de la cuenta");
        
        String _titular = leer.nextLine();
        
        System.out.println("Ingrese cuanto saldo tiene en su cuenta");
        
        double saldoDisponible = leer.nextDouble();
        
        Cuenta banco1 = new Cuenta(saldoDisponible, _titular);
        
        banco1.retirar_dinero(saldoDisponible);
    }
    
}
