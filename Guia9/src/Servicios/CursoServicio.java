package Servicios;

import Entidades.Curso;
import java.util.Scanner;

public class CursoServicio {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Curso c1 = new Curso();

    String[] alumnos = c1.getAlumnos();

    public void cargarAlumnos() {
        System.out.println("Ingrese el nombre de los alumnos: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(">");
            alumnos[i] = leer.nextLine();
        }
    }

    public Curso crearCurso() {
        cargarAlumnos();
        System.out.print("Ingrese el nombre de curso: ");
        c1.setNombreCurso(leer.nextLine());
        System.out.print("Ingrese la cantidad de horas cursadas por día: ");
        c1.setCantidadHorasPorDia(leer.nextInt());
        System.out.print("Ingrese la cantidad de días cursados por semana: ");
        c1.setCantidadDiasPorSemana(leer.nextInt());
        System.out.print("Ingrese el turno (mañana o tarde): ");
        c1.setTurno(leer.next());
        System.out.print("Ingrese el precio por hora: ");
        c1.setPrecioPorHora(leer.nextInt());
        return new Curso(alumnos, c1.getNombreCurso(), c1.getCantidadHorasPorDia(), c1.getCantidadDiasPorSemana(), c1.getTurno(), c1.getPrecioPorHora());
    }

    public int calcularGananciaSemanal() {
        return c1.getCantidadHorasPorDia() * c1.getPrecioPorHora() * 5 * c1.getCantidadDiasPorSemana();
    }
}
