package guia9_ejercicio_2;

import Entidades.ParDeNumeros;
import Servicios.ParDeNumerosServicio;

public class Guia9_Ejercicio_2 {

    public static void main(String[] args) {
        ParDeNumeros op = new ParDeNumeros();
        ParDeNumerosServicio opSer = new ParDeNumerosServicio();
        
        opSer.mostrarValores();
        opSer.devolverMayor();
        opSer.calcularPotencia();
        opSer.calculaRaiz();
        
        opSer.valorAbs();
    }
    
}
