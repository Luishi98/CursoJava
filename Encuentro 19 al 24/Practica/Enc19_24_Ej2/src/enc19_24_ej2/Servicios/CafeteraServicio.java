package enc19_24_ej2.Servicios;

import enc19_24_ej2.Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {
    //Llenamos la cafetera al máxima desde el principio
    public Cafetera llenarCafetera(){
        
        Cafetera llenar = new Cafetera();
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la capacidad máxima de la cafetera (en cm3)");
        int capacidadMaxima = leer.nextInt();
        int cantidadActual = capacidadMaxima;
        
        llenar.setCantidadActual(cantidadActual);
        llenar.setCapacidadMáxima(capacidadMaxima);
        
        return new Cafetera(capacidadMaxima, cantidadActual);
        
    }
    //Llenamos una taza de café
    public int servirTaza(int cantActual, int tamanioTaza){
        
        Cafetera cafe = new Cafetera();
        
        if (tamanioTaza > cantActual) {
            System.out.println("La cantidad de café actual no alcanzo para llenar la taza");
            System.out.println("Se han servido " + cantActual + " cm3");
            cantActual = 0;
        }else{
            System.out.println("Se ha llenado la taza de café");
            cantActual -= tamanioTaza;
        }
        
        return cantActual;
    }
    //Vaciamos la cafetera
    public int vaciarCafetera(){
        Cafetera vaciar = new Cafetera();
        System.out.println("Se ha vaciado la cafetera");
        return 0;
    }
    //Llenamos la cafetera con la cantidad que dice el usuario
    public int agregarCafetera(int capMax, int cantActual, int cantidadLlenar) {

        Cafetera rellenar = new Cafetera();

        if (cantidadLlenar + cantActual > capMax) {
            System.out.println("La cantidad a agregar supera la capacidad máxima. Se relleno la cafetera al máximo");
            return capMax;
        } else {
            return cantActual + cantidadLlenar;
        }
    }
    
}
