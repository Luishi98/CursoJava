package enc19_24_ej2;

import enc19_24_ej2.Entidades.Cafetera;
import enc19_24_ej2.Servicios.CafeteraServicio;
import java.util.Scanner;

public class Enc19_24_Ej2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        CafeteraServicio nescafeServ = new CafeteraServicio();
        
        //Llenamos la cafetera
        Cafetera nescafe = nescafeServ.llenarCafetera();
        
        int op = 0;
        
        do {            
            System.out.println("Menú");
            System.out.println("1-Servir una taza de café");
            System.out.println("2-Vaciar la cafetera");
            System.out.println("3-Agregar café a la cafetera");
            System.out.println("4-Salir");
            
            do {                
                op = leer.nextInt();
                if(op <1 && op > 4){
                    System.out.println("Ingreso una opción inválida");
                }
            } while (op <=1 && op >= 4);
            
            switch (op) {
                case 1:
                    //Servimos una taza de café
                    System.out.println("Ingrese el tamaño de la taza");
                    nescafe.setCantidadActual(nescafeServ.servirTaza(nescafe.getCantidadActual(), leer.nextInt()));
                    System.out.println("Quedan " + nescafe.getCantidadActual() + " cm3 de café.");
                    break;
                case 2:
                    //Vaciamos la cafetera
                    nescafe.setCantidadActual(nescafeServ.vaciarCafetera());
                    break;
                case 3:
                    //Rellenamos la cafetera
                    System.out.println("Ingrese que cantidad desea rellenar de café");
                    nescafe.setCantidadActual(nescafeServ.agregarCafetera(nescafe.getCapacidadMáxima(), nescafe.getCantidadActual(),leer.nextInt()));
                    break;
            }

        } while (op != 4);
        
        
        
        
        
    }
    
}
