package ecn25_32_ej6;

import Entidades.Curso;

public class Ecn25_32_Ej6 {

    public static void main(String[] args) {
        Curso curso = new Curso();
        
        curso.crearCurso();
        System.out.println("La ganancia semanal del curso es: [" + curso.calcularGananciaSemanal() + "]");
    }
    
}
