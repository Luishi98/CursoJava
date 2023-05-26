package guia11_ejercicio4;

import Entidades.Alumnos;
import Servicios.Simulador;
import java.util.ArrayList;

/**
 *
 * @author Luish y Edu Moreno
 */
public class Guia11_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Simulador servicioSimulador = new Simulador();

        System.out.println("Bienvenidos! EGG Rotos");

        ArrayList<String> alumnos = servicioSimulador.generarListaAlumnos();

        ArrayList<Integer> dnis = servicioSimulador.generarListaDNI(alumnos);

        ArrayList<Alumnos> ListaAlumnosCompleta = servicioSimulador.crearAlumno(dnis, alumnos);

        servicioSimulador.mostrarAlumnos(ListaAlumnosCompleta);

        servicioSimulador.mostrarVotos(servicioSimulador.votacion(ListaAlumnosCompleta));

        servicioSimulador.recuentoVotos(ListaAlumnosCompleta);

        servicioSimulador.facilitadores(ListaAlumnosCompleta);

    }

}
