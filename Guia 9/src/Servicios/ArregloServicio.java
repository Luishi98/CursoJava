package Servicios;

import java.util.Arrays;

public class ArregloServicio {

    public void inicializarA(double[] arreglo) {
        for (int i = 0; i < 50; i++) {
            arreglo[i] = Math.random() * 10;
        }
    }

    public void mostrar(double[] arreglo) {
        inicializarA(arreglo);
        System.out.println("El arreglo es: \n" + Arrays.toString(arreglo));
    }

    public void ordenar(double[] arreglo) {
        Arrays.sort(arreglo);
    }

    public void inicializarB(double[] arregloA, double[] arregloB) {
        System.arraycopy(arregloA, 0, arregloB, 1, 10);
        Arrays.fill(arregloB, 10, 20, 0.5);
    }
}
