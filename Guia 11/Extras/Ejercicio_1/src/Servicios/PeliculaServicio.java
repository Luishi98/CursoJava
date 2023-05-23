/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pelicula;
import java.util.Scanner;

/**
 *
 * @author Luish
 */
public class PeliculaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pelicula crearPelicula() {
        System.out.println("Película:");
        System.out.print("Título: ");
        String titulo = leer.next();
        System.out.print("Director: ");
        String director = leer.next();
        System.out.print("Duración: ");
        double duracion = leer.nextDouble();
        System.out.print("Edad mínima: ");
        int edadMinima = leer.nextInt();
        System.out.print("Precio: ");
        double precio = leer.nextDouble();
        
        return new Pelicula(titulo, duracion, edadMinima, director, precio);
    }
}
