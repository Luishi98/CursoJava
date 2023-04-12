/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc13_18_ej3;

import java.util.Scanner;

/**
 *
 * @author Luish
 */
public class Operacion {
    
    //Atributos
    
    private int numero1;
    private int numero2;
    
    //Contructor sin parametros
    
    public Operacion(){
    }
    
    //Constructor con parametros

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    //Get y Set

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    /*Método para crearOperacion(): que le pide al usuario los dos números 
    y los guarda en los atributos del objeto.
    */
    
    public void crearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 números");
        numero1 = leer.nextInt();
        numero2 = leer.nextInt();
    }
    
    //Método sumar
    
    public int Sumar(){
        int suma = numero1 + numero2;
        return suma;
    }
    
    //Método restar
    
    public int Restar(){
        int resta = numero1 - numero2;
        return resta;
    }
    
    //Método multiplicar
    
    public int Multiplicar(){
        int mult = 0;
        if(numero1 == 0 || numero2 == 0){
            System.out.println("Se intento multiplicar por 0 (cero)");
        } else{
            mult = numero1 * numero2;
        }
        
        return mult;
    }
    
    public double Dividir(){
        double div = 0;
        
        if(numero2 == 0){
            System.out.println("Se intento dividir por 0 (cero)");
        }else{
            div = (double) numero1 / numero2;
        }
        
        return div;
    }
    
}
