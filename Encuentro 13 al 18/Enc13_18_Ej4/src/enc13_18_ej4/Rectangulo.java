/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc13_18_ej4;

import java.util.Scanner;

/**
 *
 * @author Luish
 */
public class Rectangulo {
    
    //Atributos
    
    private int base;
    private int altura;
    
    //Creación
    
    public Rectangulo(){   
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //Get y Set

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    //Superficie
    
    public int Superficie(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base");
        base = leer.nextInt();
        System.out.println("Ingrese la altura");
        altura = leer.nextInt();
        int sup = base * altura;
        return sup;
    }
    
    //Perimetro
    
    public int Perimetro(){
        int per = (base + altura) * 2;
        return per;
    }
    
    //Dibujando el rectangulo
    
    public void Dibujo(){
        for(int i = 0; i < altura; i++){
            for(int j = 0; j < base; j++){
                if(i == 0 || i == altura - 1 || j == 0 || j == base - 1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
    
}
