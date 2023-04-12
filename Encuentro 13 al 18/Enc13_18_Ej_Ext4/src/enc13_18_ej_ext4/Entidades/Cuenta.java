package enc13_18_ej_ext4.Entidades;

import java.util.Scanner;

public class Cuenta {

    static Scanner leer = new Scanner(System.in);

    private double saldo;
    private String titular;

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void retirar_dinero(double saldo) {

        int op;
        double retirar;

        System.out.print("Hola, " + titular + ". Indique que cantidad de dinero desea retirar. ");
        retirar = leer.nextDouble();

        do {

            do{
                if (retirar > saldo) {
                System.out.println("No es posible retirar esa cantidad de dinero.");
                System.out.print("Intente con otro importe. ");
                retirar = leer.nextDouble();
            }
            }while(retirar > saldo);
            
            saldo -= retirar;
            
            if(saldo == 0){
                System.out.println("Su saldo es 0, no puede realizar más extracciones. Hasta la próxima.");
                break;
            }

            System.out.println("Su actual es: " + saldo);

            System.out.println("Desea realizar otra extracción?");
            System.out.println("1-Si");
            System.out.println("2-No");
            op = leer.nextInt();

            if (op == 1) {
                System.out.println("Indique que cantidad de dinero desea retirar.");
                retirar = leer.nextDouble();
            }

        } while (op != 2);

    }

}
