package enc13_18_ej_ext5;

import enc13_18_ej_ext5.Entidades.Empleado;
import java.util.Scanner;

public class Enc13_18_Ej_Ext5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del empleado: ");
        String empleado = leer.nextLine();
        
        System.out.print("Ingrese la edad de " + empleado + ": ");
        int edad = leer.nextInt();
        
        System.out.print("Ingrese el salario de " + empleado + ": ");
        double salario = leer.nextDouble();
        
        Empleado e1 = new Empleado();
        
        e1.calcular_aumento(empleado, edad, salario);
        
    }
    
}
