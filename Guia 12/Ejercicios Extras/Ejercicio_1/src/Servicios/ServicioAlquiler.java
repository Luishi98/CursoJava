/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.

Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.

Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).

En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. 

·En los veleros se suma el número de mástiles

·En los barcos a motor se le suma la potencia en CV

·En los yates se suma la potencia en CV y el número de camarotes.

Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
package Servicios;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.BarcoAMotor;
import Entidades.Velero;
import Entidades.Yate;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.Period;

public class ServicioAlquiler {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Alquiler alquiler = new Alquiler();

    public void crearCliente() throws InterruptedException {
        //Alquiler(String nombre, long documentoCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, Barco barco)
        System.out.print("Nombre: ");
        alquiler.setNombre(leer.next());
        System.out.print("Documento: ");
        alquiler.setDocumentoCliente(leer.nextLong());
        System.out.println("Fecha de alquiler: ");
        System.out.print("Año: ");
        int anio = leer.nextInt();
        System.out.print("Mes: ");
        int mes = leer.nextInt();
        System.out.print("Día: ");
        int dia = leer.nextInt();
        alquiler.setFechaAlquiler(LocalDate.of(anio, mes, dia));
        System.out.println("Fecha de devolción: (AAAA/MM/DD) ");
        System.out.print("Año: ");
        anio = leer.nextInt();
        System.out.print("Mes: ");
        mes = leer.nextInt();
        System.out.print("Día: ");
        dia = leer.nextInt();
        alquiler.setFechaDevolucion(LocalDate.of(anio, mes, dia));
        System.out.print("Posición de amarre: ");
        alquiler.setPosicionAmarre(leer.nextInt());
        alquiler.setBarco(tipoBarco());
    }

    public int tiempoAlquiler() {
        Period diferencia = alquiler.getFechaAlquiler().until(alquiler.getFechaDevolucion());
        int dias = diferencia.getDays();

        if (diferencia.getMonths() > 0) {
            dias += diferencia.getMonths() * 30;
        }

        if (diferencia.getYears() > 0) {
            dias += diferencia.getYears() * 365;
        }

        return dias;
    }

    public int calcularAlquiler() {
        Barco barco = new Barco();
        return tiempoAlquiler() * barco.calcularModulo();
    }

    public Barco tipoBarco() throws InterruptedException {
        
        System.out.println("-------------------------------------------------");
        
        Thread.sleep(1000);

        int op;
        System.out.println("Elija que Barco desea alquilar ->\n"
                + "1- Velero\n"
                + "2- Barco a Motor\n"
                + "3- Yate");

        op = leer.nextInt();
        Thread.sleep(1000);

        switch (op) {
            case 1:
                //Velero(int mastiles, String matricula, int eslora, int anioFabricacion)
                return new Velero(2, "v7256", 20, 2015);
            case 2:
                //BarcoAMotor(int potencia, String matricula, int eslora, int anioFabricacion)
                return new BarcoAMotor(700, "bm6274", 30, 2017);
            case 3:
                //Yate(int cantidadCamarotes, int potencia, String matricula, int eslora, int anioFabricacion)
                return new Yate(6, 800, "y4123", 40, 2021);
            default:
                return new Barco();
        }
    }

    public void mostrar() throws InterruptedException {
        crearCliente();
        Thread.sleep(1000);
        System.out.println("-------------------------------------------------");
        System.out.println(alquiler.toString());
        Thread.sleep(1000);
        System.out.println("-------------------------------------------------");
        System.out.println("El precio de alquiler es: $" + alquiler.getBarco().calcularModulo() + "ºº");
        Thread.sleep(1000);
        System.out.println("-------------------------------------------------");
    }

}
