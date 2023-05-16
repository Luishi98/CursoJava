/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package Servicios;

import Entidades.Numeros;
import java.util.ArrayList;
import java.util.Scanner;

public class NumerosServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Numeros num = new Numeros();
    ArrayList<Integer> numeros = new ArrayList<>();

    public void guardarNumeros() {
        do {
            System.out.print("Ingrese un número a guardar en una lista: ");
            numeros.add(leer.nextInt());
        } while (!numeros.contains(-99));
        numeros.remove(Integer.valueOf(-99));
        num.setNumeros(numeros);
    }
    
    public int dimension(){
        return num.getNumeros().size();
    }
    
    public double suma(){
        double suma = 0;
        for (Integer numero : num.getNumeros()) {
            suma += numero;
        }
        return suma;
    }
    
    public double media(){
        return suma()/dimension();
    }
    
    public void metodos() throws InterruptedException{
        System.out.println("Cuando ingrese -99 no podra agregar más números a la lista!");
        guardarNumeros();
        Thread.sleep(1000);
        System.out.println("Uste ha ingresado un total de " + dimension() + " numeros!");
        Thread.sleep(1000);
        System.out.println("La suma de todos los valores ingresados es: " + suma());
        Thread.sleep(1000);
        System.out.println("La media de todos los números que ingreso es: " + media());
    }
}
