package enc_19_24_ej_ext2;

import Entidades.NIF;
import Servicios.NIFServicios;
import java.util.Scanner;

public class Enc_19_24_Ej_Ext2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        NIF nif = new NIF();
        NIFServicios nSer = new NIFServicios();
        
        System.out.println("Ingrese su DNI");
        nif.setDni(leer.nextLong());
        
        nSer.mostrar(nif.getDni());
        
    }
    
}
