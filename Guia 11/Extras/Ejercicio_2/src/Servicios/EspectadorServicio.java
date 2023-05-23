/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Espectador;
import java.util.Scanner;

/**
 *
 * @author Luish
 */
public class EspectadorServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Espectador crearEspectador() {
        System.out.println("Espectador:");
        System.out.print("Nombre: ");
        String nombre = leer.next();
        System.out.print("Edad: ");
        int edad = leer.nextInt();
        System.out.print("Dinero disponible: ");
        double dinero = leer.nextDouble();
        
        return new Espectador(nombre, edad, dinero);
    }
    
}
