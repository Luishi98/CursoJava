package Entidades;

import java.util.Scanner;

public class Curso {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private int precioPorHora;
    private String[] alumnos = new String[5];

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    public Curso() {
    }

    public Curso(String[] alumnos, String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, int precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

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
        nombreCurso = leer.nextLine();
        System.out.print("Ingrese la cantidad de horas cursadas por día: ");
        cantidadHorasPorDia = leer.nextInt();
        System.out.print("Ingrese la cantidad de días cursadas por semana: ");
        cantidadDiasPorSemana = leer.nextInt();
        System.out.print("Ingrese el turno (mañana o tarde): ");
        turno = leer.next();
        System.out.print("Ingrese el precio por hora: ");
        precioPorHora = leer.nextInt();
        return new Curso(alumnos, nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno, precioPorHora);
    }
    
    public int calcularGananciaSemanal(){
        return cantidadHorasPorDia * precioPorHora * 5 * cantidadDiasPorSemana;
    }
}
