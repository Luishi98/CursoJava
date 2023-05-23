/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package Entidades;

public class Perro {

    private String nombre;
    private int edad;
    private String tamano;
    private String raza;
    private boolean adoptado;

    public Perro() {
    }

    public Perro(String nombre, int edad, String tamano, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.tamano = tamano;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }

    @Override
    public String toString() {
        String adop;
        if (adoptado) {
            adop = "Si";
        } else {
            adop = "No";
        }
        return "\nPerro\n" + "Nombre: " + nombre + "\nEdad: " + edad + "\nTamaño: " + tamano + "\nRaza: " + raza + "\nAdoptado: " + adop;
    }
}
