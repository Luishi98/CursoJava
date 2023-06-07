/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta.
 */
package ejercicio_1;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

public class Ejercicio_1 {

    public static void main(String[] args) {
        
        //Contructor para tener de referencia
        //Animal(String nombre, String alimento, Integer edad, String raza)
        
        //Creo un objeto Perro
        Animal perro = new Perro("Oliver", "Dog-Chow", 7, "Meztizo");
        perro.alimentarse();
        
        //Creo un objeto Gato
        Animal gato = new Gato("KIra", "Cat-Chow", 1, "Ni idea");
        gato.alimentarse();
        
        //Creo un objeto caballo
        Animal caballo = new Caballo("Corsel", "Comida de caballo", 5, "Raza de caballo");
        caballo.alimentarse();
        
    }
    
}
