/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Luish
 */
public class Ahorcado extends JPanel{
    private int fallas = 0;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawLine(20, 20, 100, 20); // base
        g.drawLine(60, 20, 60, 40); // poste
        g.drawLine(60, 40, 100, 40); // travesaño
        g.drawLine(100, 40, 100, 80); // cuerda
        if (fallas >= 1) {
            g.drawOval(80, 80, 40, 40); // cabeza
        }
        if (fallas >= 2) {
            g.drawLine(100, 120, 100, 200); // cuerpo
        }
        if (fallas >= 3) {
            g.drawLine(100, 140, 60, 120); // brazo izquierdo
        }
        if (fallas >= 4) {
            g.drawLine(100, 140, 140, 120); // brazo derecho
        }
        if (fallas >= 5) {
            g.drawLine(100, 200, 60, 240); // pierna izquierda
        }
        if (fallas >= 6) {
            g.drawLine(100, 200, 140, 240); // pierna derecha
        }
    }
    public void incrementarFallas() {
        fallas = 6;
        repaint();
    }
}
