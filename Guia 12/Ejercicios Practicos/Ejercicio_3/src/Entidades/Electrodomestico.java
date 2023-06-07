/*
A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
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

import java.util.ArrayList;
import java.util.Scanner;

public class Electrodomestico {
    
    protected Double precio;
    protected String color;
    protected Character consumo;
    protected Integer peso;
    
    //Constructores

    public Electrodomestico() {
    }

    public Electrodomestico(String color, Character consumo, Integer peso) {
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
        this.precio = 1000d;
    }
    
    //Metodos Getters y Setters

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumo() {
        return consumo;
    }

    public void setConsumo(Character consumo) {
        this.consumo = consumo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
    
    //Metodos
    
    public void comprobarConsumoEnergetico(char letra) {
        ArrayList<Character> letras = new ArrayList();
        letras.add('A');
        letras.add('B');
        letras.add('C');
        letras.add('D');
        letras.add('E');
        letras.add('F');
        if(letras.contains(letra)) {
            this.consumo = letra;
        } else {
            this.consumo = 'F';
        }
    }
    
    public void comprobarColor(String color) {
        ArrayList<String> colores = new ArrayList();
        //blanco, negro, rojo, azul y gris
        colores.add("blanco");
        colores.add("negro");
        colores.add("rojo");
        colores.add("azul");
        colores.add("gris");
        
        if(colores.contains(color.toLowerCase())) {
            this.color = color;
        } else {
            this.color = "blanco";
        }
    }
    
    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el color: ");
        color = leer.next();
        comprobarColor(color);
        System.out.print("Ingrese el consumo: (A-F) ");
        consumo = leer.next().charAt(0);
        comprobarConsumoEnergetico(consumo);
        System.out.print("Ingrese el peso: (En Kg) ");
        peso = leer.nextInt();
        precio = 1000d;
    }
    
    public void precioFinal() {
        switch (consumo) {
            case 'A':
                precio+=1000;
                break;
            case 'B':
                precio+=800;
                break;
            case 'C':
                precio+=600;
                break;
            case 'D':
                precio+=500;
                break;
            case 'E':
                precio+=300;
                break;
            case 'F':
                precio+=100;
                break;
        }
        
        if(peso>=1 && peso<=19){
            precio+=100;
        } else if (peso>=20 && peso<=49) {
            precio+=500;
        } else if (peso>=50 && peso<=79) {
            precio+=800;
        } else if (peso>80) {
            precio+=1000;
        }
    }
}
