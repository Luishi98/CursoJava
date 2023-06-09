/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.

De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.

Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.

Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package Entidades;

public class EdificioDeOficinas extends Edificio {
    
    private int cantidadOficinas;
    private int cantidadPersonas;
    private int cantidadPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int cantidadOficinas, int cantidadPersonas, int cantidadPisos, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.cantidadOficinas = cantidadOficinas;
        this.cantidadPersonas = cantidadPersonas;
        this.cantidadPisos = cantidadPisos;
    }

    public int getCantidadOficinas() {
        return cantidadOficinas;
    }

    public void setCantidadOficinas(int cantidadOficinas) {
        this.cantidadOficinas = cantidadOficinas;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }
    
    public void cantPersonas() {
        System.out.println("En cada oficina entran: " + getCantidadPersonas() + " personas");
        System.out.println("En todo el edificio entran: " + getCantidadPersonas() * getCantidadPisos() + " personas");
    }

    @Override
    public int calcularSuperficie() {
        return ancho * largo;
    }

    @Override
    public int calcularVolumen() {
        return calcularSuperficie() * alto;
    }

    @Override
    public String toString() {
        return "Cantidad de Oficinas: " + cantidadOficinas + "\nCantidad de Personas por oficina: " + cantidadPersonas + "\nCantidad de Pisos: " + cantidadPisos + "\nAncho: " + ancho + "m\nAlto: " + alto + "m\nLargo: " + largo + "m";
    }
    
    
    
}
