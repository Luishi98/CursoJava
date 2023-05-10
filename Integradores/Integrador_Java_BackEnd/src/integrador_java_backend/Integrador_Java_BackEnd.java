/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador_java_backend;

import Entidades.Estudiante;
import Servicios.EstudianteServicio;
import java.util.Arrays;

/**
 *
 * @author Luish
 */
public class Integrador_Java_BackEnd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EstudianteServicio esSer = new EstudianteServicio();
        Estudiante estudiantes[] = new Estudiante[3];
        
        esSer.crearEstudiante(estudiantes);
        
        System.out.println("La nota promedio de los estudiantes es: " + esSer.calcularPromedio(estudiantes));
        
        System.out.println(Arrays.toString(esSer.mayorPromedio(estudiantes)));
        
        System.out.println("Los estudiantes con nota mayor al promedio son: ");
        
        esSer.mostrarEstudiantes(estudiantes);
    }
    
}
