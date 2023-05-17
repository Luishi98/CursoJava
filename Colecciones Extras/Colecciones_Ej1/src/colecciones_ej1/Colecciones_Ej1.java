/*
 Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package colecciones_ej1;

import Servicios.NumerosServicio;

public class Colecciones_Ej1 {

    public static void main(String[] args) throws InterruptedException {
        NumerosServicio nSer = new NumerosServicio();
        nSer.metodos();
    }
    
}
