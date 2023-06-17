/*
Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
 */
package ejercicio_1;

import Entidades.Persona;
import Servicios.PersonaServicio;

/**
 *
 * @author Luish
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PersonaServicio perSer = new PersonaServicio();
        Persona persona = null;

        try {
            perSer.esMayorDeEdad(persona.getEdad());
        } catch (NullPointerException e) {
            System.out.println("La edad no fue definida");
        }

        /*
        
        //Creamos 4 Objetos de tipo persona
        System.out.println("Persona 1");
        Persona per1 = perSer.crearPersona();
        System.out.println("Persona 2");
        Persona per2 = perSer.crearPersona();
        System.out.println("Persona 3");
        Persona per3 = perSer.crearPersona();
        System.out.println("Persona 4");
        Persona per4 = perSer.crearPersona();
        
        int IMC;
        
        //Llamamos a todos los metodos
        //Persona 1
        if(perSer.esMayorDeEdad(per1.getEdad())){
            System.out.println(per1.getNombre() + " es mayor de edad");
        }else{
            System.out.println(per1.getNombre() + " no es mayor de edad");
        }
        IMC = perSer.calcularIMC(per1.getPeso(), per1.getAltura());
        
        switch (IMC) {
            case 0:
                System.out.println(per1.getNombre() + " está en su peso ideal");
                break;
            case -1:
                System.out.println(per1.getNombre() + " está por debajo de su peso ideal");
                break;
            case 1:
                System.out.println(per1.getNombre() + " está por encima de su peso ideal");
                break;
        }
        //Persona 2
        if(perSer.esMayorDeEdad(per2.getEdad())){
            System.out.println(per2.getNombre() + " es mayor de edad");
        }else{
            System.out.println(per2.getNombre() + " no es mayor de edad");
        }
        IMC = perSer.calcularIMC(per2.getPeso(), per2.getAltura());
        
        switch (IMC) {
            case 0:
                System.out.println(per2.getNombre() + " está en su peso ideal");
                break;
            case -1:
                System.out.println(per2.getNombre() + " está por debajo de su peso ideal");
                break;
            case 1:
                System.out.println(per2.getNombre() + " está por encima de su peso ideal");
                break;
        }
        //Persona 3
        if(perSer.esMayorDeEdad(per3.getEdad())){
            System.out.println(per3.getNombre() + " es mayor de edad");
        }else{
            System.out.println(per3.getNombre() + " no es mayor de edad");
        }
        IMC = perSer.calcularIMC(per3.getPeso(), per3.getAltura());
        
        switch (IMC) {
            case 0:
                System.out.println(per3.getNombre() + " está en su peso ideal");
                break;
            case -1:
                System.out.println(per3.getNombre() + " está por debajo de su peso ideal");
                break;
            case 1:
                System.out.println(per3.getNombre() + " está por encima de su peso ideal");
                break;
        }
        //Persona 4
        if(perSer.esMayorDeEdad(per4.getEdad())){
            System.out.println(per4.getNombre() + " es mayor de edad");
        }else{
            System.out.println(per4.getNombre() + " no es mayor de edad");
        }
        IMC = perSer.calcularIMC(per4.getPeso(), per4.getAltura());
        
        switch (IMC) {
            case 0:
                System.out.println(per4.getNombre() + " está en su peso ideal");
                break;
            case -1:
                System.out.println(per4.getNombre() + " está por debajo de su peso ideal");
                break;
            case 1:
                System.out.println(per4.getNombre() + " está por encima de su peso ideal");
                break;
        }
         */
    }
}
