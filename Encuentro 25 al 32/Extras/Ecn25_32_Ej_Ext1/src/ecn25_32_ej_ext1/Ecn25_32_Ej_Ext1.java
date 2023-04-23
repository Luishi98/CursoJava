package ecn25_32_ej_ext1;

import Entidades.MesSecreto;
import java.util.Scanner;

public class Ecn25_32_Ej_Ext1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido al juego de adivinar los meses. \n"
                + "El programa a seleccionado un mes secreto el cuál usted debe adivinar. \n"
                + "A continuación elija un mes (escrito en minúsculas) y le diremos si ha acertado o no.");
        MesSecreto mes = new MesSecreto();
        String op;
        do {    
            op = leer.next();
            if(mes.getMesSecreto().equalsIgnoreCase(op)){
                System.out.println("¡Ha acertado!");
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
            }
        } while (!mes.getMesSecreto().equals(op));
    }
    
}
