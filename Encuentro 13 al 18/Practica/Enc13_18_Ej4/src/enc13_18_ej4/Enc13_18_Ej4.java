/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc13_18_ej4;

/**
 *
 * @author Luish
 */
public class Enc13_18_Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        
        r1.getBase();
        r1.getAltura();
        System.out.println("Superficie: " + r1.Superficie());
        System.out.println("Perimetro: " + r1.Perimetro());
        r1.Dibujo();
        
    }
    
}
