/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enc13_18_ej3;

/**
 *
 * @author Luish
 */
public class Enc13_18_Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion o1 = new Operacion();
        
        o1.crearOperacion();
        System.out.println("Suma: " + o1.Sumar());
        System.out.println("Resta: " + o1.Restar());
        System.out.println("Multiplicación: " + o1.Multiplicar());
        System.out.println("División: " + o1.Dividir());
        
    }
    
}
