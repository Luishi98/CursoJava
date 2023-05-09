/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package Servicios;

import Entidades.Alumnos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoServicio {

    static Alumnos alumno = new Alumnos();
    static Scanner leer = new Scanner(System.in);
    public static ArrayList<Alumnos> alumnos = new ArrayList();
    //static ArrayList<Integer> nota = new ArrayList();

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
