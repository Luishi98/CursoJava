/*
 Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package Entidades;

import java.util.ArrayList;

public class Numeros {
    private ArrayList<Integer> numeros;

    public Numeros() {
        this.numeros = new ArrayList<>();
    }

    public Numeros(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }

    public ArrayList<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }
    
    
}
