package Entidades;

public class Alumnos {
    private String nombre;
    private double nota;

    public Alumnos(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public Alumnos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
