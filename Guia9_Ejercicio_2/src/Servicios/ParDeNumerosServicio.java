package Servicios;

import Entidades.ParDeNumeros;

public class ParDeNumerosServicio {
    
    ParDeNumeros op = new ParDeNumeros();
    
    public void mostrarValores(){
        System.out.println("Los números generados son:  número 1: [" + op.getNum1() + "] y número 2: [" + op.getNum2() + "]");
    }
    
    public void devolverMayor(){
        if(op.getNum1() > op.getNum2()){
            System.out.println("El número 1 es mayor que el número 2");
        } else  if ((op.getNum1() < op.getNum2())){
            System.out.println("El número 2 es mayor que el número 1");
        } else {
            System.out.println("Ambos números son iguales");
        }
    }
    
    public void calcularPotencia(){
        if (op.getNum1() > op.getNum2()){
            //Los numeros redondeados los elevamos uno al otro
            System.out.println(Math.pow((int) op.getNum1(), (int) op.getNum2()));
        } else  if ((op.getNum1() < op.getNum2())){
            System.out.println(Math.pow((int) op.getNum2(), (int) op.getNum1()));
        } else {
            System.out.println(Math.pow((int) op.getNum1(), (int) op.getNum2()));
        }
    }
    
    public void calculaRaiz(){
        if(op.getNum1() > op.getNum2()){
            System.out.println(Math.sqrt(Math.abs(op.getNum2())));
        } else  if ((op.getNum1() < op.getNum2())){
            System.out.println(Math.sqrt(Math.abs(op.getNum1())));
        } else {
            System.out.println(Math.sqrt(Math.abs(op.getNum1())));
        }
    }
    
    public void valorAbs(){
        System.out.println("1- " + Math.abs(op.getNum1()));
        System.out.println("2- " + Math.abs(op.getNum2()));
    }
}
