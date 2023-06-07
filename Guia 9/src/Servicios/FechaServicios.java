package Servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaServicios {

    static Scanner leer = new Scanner(System.in);

    public Date fechaNacimiento() {
        System.out.println("Ingrese su fecha de nacimiento. (año, mes, día)");
        int anio = leer.nextInt() - 1900;
        int mes = leer.nextInt() - 1;
        int dia = leer.nextInt();
        return new Date(anio, mes, dia);
    }

    public Date fechaActual() {
        return new Date();
    }

    public void diferencia(Date fechaNac, Date fechaHoy) {
        System.out.println("Su edad es: ~" + (fechaHoy.getYear() - fechaNac.getYear()) + "~");
    }
}
