/*
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
 */
package Entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico{
    
    private int resolucion;
    private boolean sintonizador;

    //Constructores
    
    public Televisor() {
    }

    public Televisor(int resolucion, String color, Character consumo, Integer peso) {
        super(color, consumo, peso);
        this.resolucion = resolucion;
    }
    
    //Metodos Getters y Setters

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
    //Metodos
    
    public void crearTelevisor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        crearElectrodomestico();
        System.out.print("Ingrese la resolución: (En pulgadas) ");
        resolucion = leer.nextInt();
        System.out.print("Posee sintonizador TDT? (Si/No): ");
        String respuesta = leer.next();
        if (respuesta.equalsIgnoreCase("si")) {
            sintonizador=true;
        }
    }
    
    @Override
    public void precioFinal() {
        super.precioFinal();
        if (resolucion > 40) {
            precio += precio*.3;
        }
        if (sintonizador) {
            precio += 500;
        }
        
        System.out.println("El precio final es: $" + precio);
    }
    
    //toString

    @Override
    public String toString() {
        String op;
        if(sintonizador) {
            op = "Si";
        } else {
            op = "No";
        }
        return "\nPrecio: $" + precio + "\nColor: " + color + "\nConsumo: " + consumo + "\nPeso: " + peso + "Kg" + "\nResolucion: " + resolucion + "\"" + "\nSintonizador: " + op;
    }
}
