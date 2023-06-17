/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */
package ejercicio_2;

/**
 *
 * @author Luish
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] listaNumeros = {1};
        
        try {
            System.out.println(listaNumeros[1]);
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("El indice buscado excede el tamaño del arreglo");
        }
    }

}
