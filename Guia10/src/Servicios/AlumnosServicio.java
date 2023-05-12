/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alumnos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Luish
 */
public class AlumnosServicio {
    Alumnos alumno = new Alumnos();
    Scanner leer = new Scanner(System.in);
    ArrayList<Alumnos> alumnos = new ArrayList();

    public void crearAlumno() {

        String nombre;

        do {
            System.out.println("Ingrese el nombre del alumno");
            nombre = leer.next();
            System.out.println("Ingrese las notas de " + nombre);
            ArrayList<Integer> nota = new ArrayList();
            for (int i = 0; i < 3; i++) {
                nota.add(leer.nextInt());
            }
            alumnos.add(new Alumnos(nombre, nota));

            System.out.println("Desea ingresar un nuevo alumno?");

        } while (leer.next().equals("si"));
    }
    
    public void verificarAlumno(){
        System.out.println("Ingrese un alumno para calcular su nota final");
        String alumno = leer.next();
        
        for (Alumnos alumnos : alumnos) {
            if(alumnos.getNombre().equals(alumno)){
                System.out.println("La nota final de " + alumno + " es: " + notaFinal(alumnos));
            }
        }
    }

    public double notaFinal(Alumnos al) {
        
        int suma = 0;
        
        Iterator it = alumnos.iterator();
        
        while(it.hasNext()){
            if(it.next().equals(al)){
                Iterator it2 = al.getNotas().iterator();
                while(it2.hasNext()){
                    suma += (int) it2.next();
                }
            }
        }
        
        return suma / 3;
    }
}
