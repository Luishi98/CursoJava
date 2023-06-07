package APPs;

import Entidades.ParDeNumeros;
import Servicios.ParDeNumerosServicio;
import java.util.Scanner;

public class ParDeNuemerosAPP_Ej2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ParDeNumeros num = new ParDeNumeros();
        ParDeNumerosServicio numSer = new ParDeNumerosServicio();

        int op;
        do {
            System.out.println("Menu \n"
                    + "1- Mostrar números \n"
                    + "2- Mostrar el número mayor \n"
                    + "3- Calcular la potencia del primer número elevado al segundo \n"
                    + "4- Calcular la raíz cuadrada del valor menor \n"
                    + "5- Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    numSer.mostrarValores(num);
                    break;
                case 2:
                    numSer.devolverMayor(num);
                    break;
                case 3:
                    numSer.calcularPotencia(num);
                    break;
                case 4:
                    numSer.calcularRaiz(num);
                    break;
            }
        } while (op != 5);
    }
}
