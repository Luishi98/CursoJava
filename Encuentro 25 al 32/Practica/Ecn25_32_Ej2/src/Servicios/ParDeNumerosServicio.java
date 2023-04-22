package Servicios;

import Entidades.ParDeNumeros;

public class ParDeNumerosServicio {
    public void mostrarValores(ParDeNumeros num){
        System.out.println("Los nuevos generados aleatoriamente fueron : \n" + num.getNum1() + "\n" + num.getNum2());
    }
    
    public void devolverMayor(ParDeNumeros num){
        System.out.println("El numero mayor es: [" + Math.max(num.getNum1(), num.getNum2()) + "]");
    }
    
    public void calcularPotencia(ParDeNumeros num){
        System.out.println("La potencia del primer número elevado al segundo es: [" + Math.pow(num.getNum1(), num.getNum2()) + "]");
    }
    
    public void calcularRaiz(ParDeNumeros num){
        if(num.getNum1() > num.getNum2()){
            System.out.println("La raiz cuadrada del número menor es: [" + Math.sqrt(Math.abs(num.getNum2())) + "]");
        } else {
            System.out.println("La raiz cuadrada del número menor es: [" + Math.sqrt(Math.abs(num.getNum1())) + "]");
        }
    }
}
