package enc19_24_ej1_v2.Servicios;

import enc19_24_ej1_v2.Entidades.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {
    
    Scanner leer = new Scanner(System.in);
    
    //Crear cuenta bancaria
    public CuentaBancaria crearCuenta(){
        
        System.out.println("Ingrese su número de cuenta: ");
        int numeroCuenta =  leer.nextInt();
        
        System.out.println("Ingrese su DNI: ");
        long dniCliente = leer.nextLong();
        
        System.out.println("Ingrese su saldo actual: ");
        double saldoActual = leer.nextDouble();
        
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }
    //Ingresar dinero a la cuenta 
    public double ingresar(double saldoActual){
        
        System.out.println("Ingrese el valor a ingresar a su cuenta: ");
        
        saldoActual += leer.nextDouble();
        
        CuentaBancaria cIng = new CuentaBancaria();
        
        cIng.setSaldoActual(saldoActual);
        
        return saldoActual;
    }
    //Retirar dinero de la cuenta
    public double retirar(double saldoActual){
        
        CuentaBancaria cRet = new CuentaBancaria();
        
        System.out.println("Ingrese el valor a retirar de su cuenta: ");
        
        double retirar = leer.nextDouble();
        
        if(retirar > saldoActual){
            System.out.println("El valor ingresado supera su saldo actual. Ha retirado: " + saldoActual);
            saldoActual = 0;
            cRet.setSaldoActual(saldoActual);
            return saldoActual;
        }else{
            saldoActual -= retirar;
            cRet.setSaldoActual(saldoActual);
            return saldoActual;
        }
        
        
    }
    //Extraccion rapida, maximo 20%
    public double extraccionRapida(double saldoActual){
        
        CuentaBancaria cRetRap = new CuentaBancaria();
        
        System.out.println("Ingrese el valor a retirar de su cuenta (tenga en cuenta que el limite para esta operacion es del 20% de su saldo total): ");
        
        double retirar = leer.nextDouble();
        
        if(retirar > (saldoActual*0.2)){
            System.out.println("Operación inválida");
            return saldoActual;
        }else{
            cRetRap.setSaldoActual(saldoActual - retirar);
            return saldoActual - retirar;
        }
        
    }
    //Consultar saldo
    public double consultarSaldo(double saldoActual){
        
        return saldoActual;
    }
    //Consultar datos
    public void consultarDatos(int numeroCuenta, long dniCliente, double saldoActual){
        
        CuentaBancaria c5 = new CuentaBancaria();
        
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("DNI del titular: " + dniCliente);
        System.out.println("Saldo: " + saldoActual);
        
    }
    
}

