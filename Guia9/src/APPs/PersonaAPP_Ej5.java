package APPs;

import Entidades.Persona;
import Servicios.PersonaServicio;
import java.util.Date;
import java.util.Scanner;

public class PersonaAPP_Ej5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaServicio perSer = new PersonaServicio();
        Persona per = perSer.crearPersona();
        Date hoy = new Date();

        perSer.calcularEdad(per.getFechaNac(), hoy);

        System.out.println("Ingrese una fecha de nacimiento de otra persona");
        int anio = leer.nextInt() - 1900;
        int mes = leer.nextInt() - 1;
        int dia = leer.nextInt();
        Date nuevo = new Date(anio, mes, dia);
        System.out.println(per.getNombre() + " es usted menor que la persona ingresada? " + perSer.menorQue(per, nuevo));

        perSer.mostrarPersona(per);
    }
}
