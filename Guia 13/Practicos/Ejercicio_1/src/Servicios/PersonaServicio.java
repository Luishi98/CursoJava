package Servicios;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {
    
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
            
    public boolean esMayorDeEdad(int edad){
        return edad >= 18;
    }
    
    public Persona crearPersona(){
        
        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        System.out.println("Hola " + nombre +", ingrese su edad");
        int edad = leer.nextInt();
        System.out.println("Ahora ingrese su sexo. (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro)");
        String sexo = leer.next();
        while (!"H".equals(sexo) && !"M".equals(sexo) && !"O".equals(sexo)) {
            System.out.println("Ingreso una opción incorrectra, intente nuevamente.");
            sexo = leer.next();
        } 
        System.out.println("Ingrese su peso. (En Kg)");
        double peso = leer.nextInt();
        System.out.println("Ingrese su altura. (En m)");
        double altura = leer.nextDouble();

        return new Persona(nombre, edad, sexo, peso, altura);
    }
    
    public int calcularIMC(double peso, double altura){
        
        double IMC = peso/Math.pow(altura, 2);
        
        if(IMC < 20){
            return -1;
        }else if(IMC > 25){
            return 1;
        }else{
            return 0;
        }
        
    }
    
}
