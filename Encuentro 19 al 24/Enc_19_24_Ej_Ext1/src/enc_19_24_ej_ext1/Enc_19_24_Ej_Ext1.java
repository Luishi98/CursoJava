package enc_19_24_ej_ext1;

import Entidades.Raices;
import Servicios.RaicesServicio;
import java.util.Scanner;

public class Enc_19_24_Ej_Ext1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Raices r1 = new Raices();
        RaicesServicio rSer = new RaicesServicio();
        
        System.out.println("Ingrese 3 números");
        
        r1.setA(leer.nextDouble());
        r1.setB(leer.nextDouble());
        r1.setC(leer.nextDouble());
        
        rSer.calcular(r1);
        
        
    }
    
}
