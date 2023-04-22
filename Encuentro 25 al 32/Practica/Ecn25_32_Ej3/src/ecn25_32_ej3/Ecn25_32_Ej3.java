package ecn25_32_ej3;

import Servicios.ArregloServicio;
import java.util.Arrays;

public class Ecn25_32_Ej3 {

    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
 
        ArregloServicio arSer = new ArregloServicio();

        arSer.inicializarA(arregloA);
        arSer.mostrar(arregloA);
        arSer.ordenar(arregloA);
        arSer.inicializarB(arregloA, arregloB);
        
        System.out.println("El arregloA es: \n" + Arrays.toString(arregloA));
        System.out.println("El arregloB es: \n" + Arrays.toString(arregloB));
    }

}
