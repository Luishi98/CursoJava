/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_6;

/**
 *
 * @author Luish
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Dado el método metodoA de la clase A, indique:
        a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
        
        Se ejecutan en el orden: sentencia_a1, sentencia_a2, sentencia_a3, sentencia_a4, sentencia_a6, sentencia_a5
        
        b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
        
        Se ejecutan en el orden: sentencia_a1, sentencia_a2, sentencia_a3, sentencia_a4, sentencia_a5
        
        class A {
            public void metodoA() {
                sentencia_a1
                sentencia_a2
                try {
                    sentencia_a3
                    sentencia_a4
                } catch (MioException e){
                    sentencia_a6
                }
                sentencia_a5
            }
        }
        */
    }

}
