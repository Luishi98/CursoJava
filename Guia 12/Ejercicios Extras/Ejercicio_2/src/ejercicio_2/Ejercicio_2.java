/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package ejercicio_2;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;

public class Ejercicio_2 {

    public static void main(String[] args) {
        System.out.println("Welcome!");
        ArrayList<Edificio> edificio = new ArrayList();
        //Polideportivo(String nombre, boolean techado, int ancho, int alto, int largo)
        Polideportivo polideportivo = new Polideportivo("Polideportivo Luis", true, 20, 10, 20);
        Polideportivo polideportivo1 = new Polideportivo("Polideportivo Oliver", false, 40, 30, 60);
        //EdificioDeOficinas(int cantidadOficinas, int cantidadPersonas, int cantidadPisos, int ancho, int alto, int largo)
        EdificioDeOficinas edificioOficinas = new EdificioDeOficinas(5, 3, 8, 10, 30, 10);
        EdificioDeOficinas edificioOficinas1 = new EdificioDeOficinas(1, 5, 2, 8, 10, 8);
        
        edificio.add(polideportivo);
        edificio.add(polideportivo1);
        edificio.add(edificioOficinas);
        edificio.add(edificioOficinas1);
        
        for (Edificio aux : edificio) {
            //System.out.println(aux.toString());
            System.out.println("Superficie: " + aux.calcularSuperficie() + "m2");
            System.out.println("Volumen: " + aux.calcularVolumen() + "m3");
            if (aux instanceof Polideportivo) {
                if (((Polideportivo) aux).isTechado()){
                    System.out.println("El polideportivo es techado");
                } else {
                    System.out.println("El polideportivo no es techado");
                }
            } else {
                EdificioDeOficinas edifOficinas = (EdificioDeOficinas) aux;
                edifOficinas.cantPersonas();
            }
            System.out.println("---------------------------");
        }
    }

}
