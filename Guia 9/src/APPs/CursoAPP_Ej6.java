package APPs;

import Servicios.CursoServicio;

public class CursoAPP_Ej6 {
    public static void main(String[] args) {
        CursoServicio curso = new CursoServicio();
        
        curso.crearCurso();
        System.out.println("La ganancia semanal del curso es: [" + curso.calcularGananciaSemanal() + "]");
    }
}
