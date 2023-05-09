/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujo_ahoracado;

import Entidades.Ahorcado;
import javax.swing.JFrame;

public class Dibujo_Ahoracado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ahorcado");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ahorcado panel = new Ahorcado();
        ventana.add(panel);
        ventana.setSize(200, 300);
        ventana.setVisible(true);
    }
    
    
}
