/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package ejercicio_4;

import Entidades.Circulo;
import Entidades.Rectangulo;
import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        System.out.println("Bienvenido!");
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        //Creo los 2 objetos
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        
        //Pido los datos para los calulos
        System.out.print("Ingrese el radio del circulo: ");
        circulo.setRadio(leer.nextInt());
        
        System.out.print("Ingrese la base del rectangulo: ");
        rectangulo.setBase(leer.nextInt());
        System.out.print("Ingre la altura del rectangulo: ");
        rectangulo.setAltura(leer.nextInt());
        
        System.out.println("Circulo ->");
        circulo.perimetro();
        circulo.area();
        
        System.out.println("Rectangulo ->");
        rectangulo.area();
        rectangulo.perimetro();
    }
    
}
