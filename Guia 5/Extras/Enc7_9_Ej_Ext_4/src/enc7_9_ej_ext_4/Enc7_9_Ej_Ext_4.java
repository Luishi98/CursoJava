/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc7_9_ej_ext_4;

import java.util.Scanner;

/**
 *
 * @author luish
 */
public class Enc7_9_Ej_Ext_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Notas();
        
    }
    
    public static void Notas(){
        
        Scanner leer = new Scanner(System.in);
        
        float[] vector = new float[10];
        float pract1;
        float pract2;
        float int1;
        float int2;
        
        System.out.println("Ingrese las notas de los 10 alumnos");
        
        for(int i = 0; i < vector.length; i++){
            
            System.out.println("Alumno [" + (i+1) + "]");
            
            System.out.println("Primer trabajo práctico");
            pract1 = leer.nextInt();
            pract1 = pract1 / 10;
        
            System.out.println("Segundo trabajo práctico");
            pract2 = leer.nextInt();
            pract2 = (pract2 / 100) * 15;
        
            System.out.println("Primer integrador");
            int1 = leer.nextInt();
            int1 = int1 / 4;
        
            System.out.println("Segundo integrador");
            int2 = leer.nextInt();
            int2 = int2 / 2;
            
            vector[i] = (pract1 + pract2 + int1 + int2);
            
        }
        
        int ap = 0;
        int desap = 0;
        
        for(int i = 0; i < vector.length; i++){
            if(vector[i] >= 7){
                ap += 1;
            } else{
                desap += 1;
            }
        }
        
        System.out.println("Hay " + ap + " alumnos aprobados y " + desap + " alumnos desaprobados.");
        
    }
    
}
