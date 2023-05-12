/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APPs;

import Servicios.AlumnosServicio;
import java.util.Scanner;

/**
 *
 * @author Luish
 */
public class AlumnosAPP_Ej3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        AlumnosServicio alSer = new AlumnosServicio();
        
        alSer.crearAlumno();
        alSer.verificarAlumno();
    }
}
