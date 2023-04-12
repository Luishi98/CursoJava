package enc13_18_ej_ext2;

import enc13_18_ej_ext2.Entidad.Puntos;

public class Enc13_18_Ej_Ext2 {

    public static void main(String[] args) {
        Puntos p1 = new Puntos();
        
        p1.crearPuntos();
        
        System.out.println("La distancia entre los dos puntos es: " + p1.calcularDistancia());
        
    }
    
}
