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
techados y cuantos abiertos. 
Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package Entidades;

public class Polideportivo extends Edificio {
    
    private String nombre;
    private boolean techado;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean techado, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
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
        String op;
        if (techado) {
            op = "Si";
        } else {
            op = "No";
        }
        return "Nombre: " + nombre + "\nTechado: " + op + "\nAncho: " + ancho + "m\nAlto: " + alto + "m\nLargo: " + largo + "m";
    }
    
    
    
}
