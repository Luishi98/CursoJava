package enc13_18_ej_ext3;

import enc13_18_ej_ext3.Entidades.Juego;
import java.util.Scanner;

public class Enc13_18_Ej_Ext3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Indiquen la cantidad de intentos que tendrá el jugador 2");
        
        int intentos = leer.nextInt();
        
        System.out.println("Jugador 1, ingrese el número a adivinar por el jugador 2");
        
        int numeroElegido = leer.nextInt();
        
        System.out.println("Jugador 2, intente adivinar el número del Jugador 2");
        
        int numeroIntento = leer.nextInt();
        
        Juego j1 = new Juego(numeroElegido, numeroIntento, intentos);
        
        j1.iniciar_juego();
        
    }
    
}
