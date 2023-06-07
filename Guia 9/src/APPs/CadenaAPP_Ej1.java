package APPs;

import Entidades.Cadena;
import Servicios.CadenaServicio;
import java.util.Scanner;

public class CadenaAPP_Ej1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase");

        Cadena cad = new Cadena(leer.nextLine());
        CadenaServicio cadSer = new CadenaServicio();

        cadSer.mostrarVocales(cad);
        cadSer.invertirFrase(cad);

        System.out.println("Ingrese una letra a buscar en la frase");
        cadSer.vecesRepetida(cad, leer.nextLine());

        System.out.println("Ingrese una frase para comparar su longitud");
        cadSer.compararLongitud(cad, leer.nextLine());

        System.out.println("Ingrese una frase para unirla con su frase principal");
        cadSer.unirFrases(cad, leer.nextLine());

        System.out.println("Ingrese un caracter");
        cadSer.reemplazar(cad, leer.next());

        System.out.println("Ingrese una letra a buscar dentro de su frase principal");
        System.out.print("La letra ingresada se encuentra dentro de la frase? ");
        if (cadSer.contiene(cad, leer.next())) {
            System.out.println("Si");
        } else {
            System.out.println("No");
        }
    }

}
