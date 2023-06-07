/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
 */
package Entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {
    
    private Integer carga;

    //Contructores
    
    public Lavadora() {
    }
    
    public Lavadora(Integer carga, String color, Character consumo, Integer peso) {
        super(color, consumo, peso);
        this.carga = carga;
    }
    
    //Metodos Get y Set

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }
    
    //Metodos
    
    public void crearLavadora() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        crearElectrodomestico();
        System.out.print("Ingrese la carga que soporta la lavadora: (En Kg) ");
        int cargaLavadora = leer.nextInt();
        this.carga = cargaLavadora;
    }
    
    @Override
    public void precioFinal() {
        super.precioFinal();
        if (carga > 30){
            precio+=500;
        }
        
        System.out.println("El precio final es: $" + precio);
    }
    
    //toString

    @Override
    public String toString() {
        return "\nPrecio: $" + precio + "\nColor: " + color + "\nConsumo: " + consumo + "\nPeso: " + peso + "Kg" + "\nCarga: " + carga + "Kg";
    }
}
