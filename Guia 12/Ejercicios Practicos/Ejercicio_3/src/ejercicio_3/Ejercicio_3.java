/*
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. 
Se deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. 
Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
package ejercicio_3;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

public class Ejercicio_3 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Bien-venido!");
        Thread.sleep(1000);
        ArrayList<Electrodomestico> electros = new ArrayList();

        //Contructor de lavadora
        //Lavadora(Integer carga, String color, Character consumo, Integer peso)
        electros.add(new Lavadora(8, "blanco", 'E', 50));
        electros.add(new Lavadora(10, "verde", 'B', 45));

        //Contructor de televisor
        //Televisor(int resolucion, String color, Character consumo, Integer peso)
        electros.add(new Televisor(42, "negro", 'C', 50));
        electros.add(new Televisor(32, "rojo", 'A', 40));

        //Mostramos el precio de cada electrodomestico
        for (Electrodomestico electro : electros) {
            if (electro instanceof Lavadora) {
                System.out.println("Lavadora");
            } else {
                System.out.println("Televisor");
            }
            electro.precioFinal();
            Thread.sleep(1000);
        }

        //Variables para diferentes precio acumulados
        int precioLavadoras = 0;
        int precioTelevisores = 0;
        int precioTotal = 0;

        //Separando precios segun clase hija
        for (Electrodomestico electro : electros) {
            if (electro instanceof Lavadora) {
                precioLavadoras += electro.getPrecio();
            } else {
                precioTelevisores += electro.getPrecio();
            }
            precioTotal += electro.getPrecio();
        }
        
        //Mostrando precios segun categoria
        System.out.println("El precio de todas las lavadoras es: $" + precioLavadoras);
        Thread.sleep(1000);
        System.out.println("El precio de todos los televisores es: $" + precioTelevisores);
        Thread.sleep(1000);
        System.out.println("El precio de todos los electrodomesticos es: $" + precioTotal);
        Thread.sleep(1000);
        System.out.println("Shao!");
    }

}
