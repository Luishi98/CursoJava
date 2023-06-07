package ejercicio_animal;

import Entidades.Animal;
import Entidades.Gato;
import Entidades.Perro;
import java.util.ArrayList;

public class Ejercicio_animal {

    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        
        ArrayList<Animal> animales = new ArrayList();
        
        animales.add(a);
        animales.add(b);
        animales.add(c);
        
        for (Animal animal : animales) {
            animal.hacerRuido();
        }
    }
    
}
