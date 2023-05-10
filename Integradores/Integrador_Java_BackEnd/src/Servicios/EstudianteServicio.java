package Servicios;

import Entidades.Estudiante;
import java.util.Scanner;

public class EstudianteServicio {

    Scanner leer = new Scanner(System.in);

    //Creo cada estudiante y lo guardo en el objeto
    public Estudiante crearEstudiante(Estudiante estudiantes[]) {
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = new Estudiante();
            System.out.print("Ingrese el nombre del estudiante: ");
            estudiantes[i].setNombre(leer.next());
            System.out.print("Ingrese su nota final: ");
            estudiantes[i].setNota(leer.nextDouble());

        }
        return new Estudiante();
    }

    //Calculo el promedio de notas de todo el curso
    public double calcularPromedio(Estudiante estudiantes[]) {
        double suma = 0;
        for (Estudiante estudiante : estudiantes) {
            suma += estudiante.getNota();
        }
        return suma / estudiantes.length;
    }

    //Estudiantes que tiene notas mayor al promedio
    public String[] mayorPromedio(Estudiante estudiantes[]) {

        //Creo una varible para contar la cantidad de alumnos con nota mayor al promedio
        int cont = 0;

        //Creo un bucle para recorrer todo el arreglo en busca de las notas mayores al promedio
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > calcularPromedio(estudiantes)) {
                cont += 1;
            }
        }

        //Creo el arreglo que contendra todos los estudiantes con nota mayor al promedio que devolvera mi metodo
        String mayorProm[] = new String[cont];

        //Reutilizo el mismo contador para rellenar el nuevo arreglo
        cont = 0;

        //Lleno el nuevo arreglo con los nombre de quienes tiene nota mayor al promedio
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getNota() > calcularPromedio(estudiantes)) {
                mayorProm[cont] = estudiantes[i].getNombre();
                cont+=1;
            }

        }

        //Retorno el arreglo con los alumnos que tienen nota mayor al promedio
        return mayorProm;
    }

    //Muestro solo los estudiantes con nota mayor al promedio
    public void mostrarEstudiantes(Estudiante estudiantes[]) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > calcularPromedio(estudiantes)) {
                System.out.println("Nombre: " + estudiante.getNombre());
                System.out.println("Nota: " + estudiante.getNota());
            }
        }
    }
}
