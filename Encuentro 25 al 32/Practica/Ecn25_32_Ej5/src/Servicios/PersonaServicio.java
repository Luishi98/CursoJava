package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {
    static Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println("Ingrese su fecha de nacimiento. (año, mes, día)");
        int anio = leer.nextInt() - 1900;
        int mes = leer.nextInt() - 1;
        int dia = leer.nextInt();
        Date fechaNac = new Date (anio, mes ,dia);
        
        return new Persona(nombre, fechaNac);
    }
    
    public Date fechaActual(){
        return new Date();
    }
    
    public int calcularEdad(Date fechaNac, Date fechaActual){
        return fechaActual.getYear() - fechaNac.getYear();
    }
    
    public boolean menorQue(Persona per, Date edad){
        return per.getFechaNac().compareTo(edad) >= 0;
    }
    
    public void mostrarPersona(Persona per){
        System.out.println("Nombre " + per.getNombre() + "\n"
                + "Fecha de nacimiento: " + per.getFechaNac());
    }
}
