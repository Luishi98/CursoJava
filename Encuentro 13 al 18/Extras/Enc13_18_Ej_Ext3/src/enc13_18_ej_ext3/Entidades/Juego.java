package enc13_18_ej_ext3.Entidades;

import java.util.Scanner;

public class Juego {
    
    static Scanner leer = new Scanner(System.in);
    
    private int num1;
    private int num2;
    private int intentos;

    public Juego(int num1, int num2, int intentos) {
        this.num1 = num1;
        this.num2 = num2;
        this.intentos = intentos;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public void iniciar_juego(){
        
        int cont = 1;
        
        do{
            if(num2 == num1){
                System.out.println("Felicitaciones, has adivinado el número");
                break;
            } else if(num2 < num1){
                System.out.println("El número ingresado es menor al número a adivinar");
            } else if(num2 > num1){
                System.out.println("El número ingresado es mayor al número a adivinar");
            }
            
            if(cont == intentos){
                System.out.println("Te has quedado sin intentos, el número era: " + num1);
                break;
            }
            System.out.println("Intente nuevamente");
            num2 = leer.nextInt();
            cont += 1;
            
            System.out.println("cont: "+cont+ ". Intentos: "+ intentos);
            
        }while(num2!=num1);
        
    }
}
