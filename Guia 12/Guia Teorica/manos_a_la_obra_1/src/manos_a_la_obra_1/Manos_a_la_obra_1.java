/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manos_a_la_obra_1;

/**
 *
 * @author Luish
 */
public class Manos_a_la_obra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        interfaz inter = new interfaz() {
            @Override
            public void metodoAbstracto() {
                System.out.println("No se que hice ni si esta bien");
            }
        };
        inter.metodoAbstracto();
    }
    
}
