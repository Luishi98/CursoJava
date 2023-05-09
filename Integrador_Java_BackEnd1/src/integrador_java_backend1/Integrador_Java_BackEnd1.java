package integrador_java_backend1;

import Entidades.Alumnos;
import Servicios.AlumnoServicio;

public class Integrador_Java_BackEnd1 {

    public static void main(String[] args) {
        Alumnos alumnos[] = new Alumnos[2];
        
        AlumnoServicio alSer = new AlumnoServicio();
        alSer.crearAlumnos(alumnos);
    }
    
}
