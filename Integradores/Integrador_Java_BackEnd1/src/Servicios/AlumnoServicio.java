package Servicios;

import Entidades.Alumnos;
import java.util.Scanner;

public class AlumnoServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Alumnos crearAlumnos(Alumnos alumnos[]){
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = new Alumnos();
            alumnos[i].setNombre(leer.next());
            alumnos[i].setNota(leer.nextDouble());
        }
        return new Alumnos();
    }
    
    public void calcularPromedio(){
        
    }
}
