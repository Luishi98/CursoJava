package enc19_24_ej1_v2;

import enc19_24_ej1_v2.Entidades.CuentaBancaria;
import enc19_24_ej1_v2.Servicios.CuentaBancariaServicio;
import java.util.Scanner;

public class Enc19_24_Ej1_v2 {

    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        
        CuentaBancariaServicio cbs1 = new CuentaBancariaServicio();
        //Creamos la cuenta
        CuentaBancaria cb1 = cbs1.crearCuenta();
        
        int op;
        
        do{
            System.out.println("Menu: ");
            System.out.println("1-Ingresar dinero.");
            System.out.println("2-Retirar dinero.");
            System.out.println("3-Extracción rápida.");
            System.out.println("4-Consultar saldo");
            System.out.println("5-Consultar datos");
            System.out.println("6-Salir");
            op = leer.nextInt();
            
            switch (op) {
                case 1:
                    //Ingresamos dinero a la cuenta
                    cb1.setSaldoActual(cbs1.ingresar(cb1.getSaldoActual()));
                    System.out.println("Su saldo actual es: " + cb1.getSaldoActual());
                    break;
                case 2:
                    //Retiramos dinero de la cuenta
                    cb1.setSaldoActual(cbs1.retirar(cb1.getSaldoActual()));
                    System.out.println("Su saldo actual es: " + cb1.getSaldoActual());
                    break;
                case 3:
                    //Hacemos una extraccion rapida
                    cb1.setSaldoActual(cbs1.extraccionRapida(cb1.getSaldoActual()));
                    System.out.println("Su saldo actual es: " + cb1.getSaldoActual());
                    break;
                case 4:
                    //Consultamos el saldo de la cuenta
                    cb1.setSaldoActual(cbs1.consultarSaldo(cb1.getSaldoActual()));
                    System.out.println("Su saldo actual es: " + cb1.getSaldoActual());
                    break;
                case 5:
                    //Consultamos los datos de la cuenta
                    cbs1.consultarDatos(cb1.getNumeroCuenta(), cb1.getDniCliente(), cb1.getSaldoActual());
                    break;
                default:
                    System.out.println("Gracias por utilizar nuestros servicios!");
            } 
        } while (op != 6);

    }
}
