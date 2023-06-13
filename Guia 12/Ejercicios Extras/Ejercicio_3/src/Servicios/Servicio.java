/*
Una compañía de promociones turísticas desea mantener información sobre la infraestructura
de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección,
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
alojamientos: Hoteles y Alojamientos Extrahoteleros.

Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones.

Y estos pueden ser de cuatro o cinco estrellas. Las
características de las distintas categorías son las siguientes:
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.

Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
será.

El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.

En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. 

Por cada Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. 

Existen dos tipos de alojamientos extrahoteleros: los Camping y las Residencias. Para los Camping 
se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
 */
package Servicios;

import Entidades.Alojamiento;
import Entidades.Camping;
import Entidades.Hotel;
import Entidades.Hotel4;
import Entidades.Hotel5;
import Entidades.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alojamiento> alojamientos = new ArrayList();
    ArrayList<Hotel> hoteles = new ArrayList();
    ArrayList<Hotel4> hoteles4 = new ArrayList();
    ArrayList<Hotel5> hoteles5 = new ArrayList();
    ArrayList<Camping> campings = new ArrayList();
    ArrayList<Residencia> residencias = new ArrayList();

    public Hotel4 crearHotel4() {
        //Hotel4(String nombreRestaurante, int capacidadRestaurante, String gimnasio, 
        //int habitaciones, int camas, int pisos, String nombre, String direccion, String localidad, String gerente)
        System.out.print("Nombre del Hotel: ");
        String nombre = leer.next();
        System.out.print("Cantidad de habitaciones: ");
        int habitaciones = leer.nextInt();
        System.out.print("Cantidad de camas: ");
        int camas = leer.nextInt();
        System.out.print("Cantidad de pisos: ");
        int pisos = leer.nextInt();
        System.out.print("Nombre del Restaurante: ");
        String nombreRestaurante = leer.next();
        System.out.print("Capacidad del restaurante: ");
        int capacidadRestaurante = leer.nextInt();
        System.out.print("Que tipo de gimansio tiene (A o B): ");
        String gimnasio = leer.next().toUpperCase();
        System.out.print("Dirección: ");
        String direccion = leer.next();
        System.out.print("Localidad: ");
        String localidad = leer.next();
        System.out.print("Nombre del Gerente: ");
        String gerente = leer.next();

        return new Hotel4(nombreRestaurante, capacidadRestaurante, gimnasio, habitaciones, camas, pisos, nombre, direccion, localidad, gerente);
    }

    public Hotel5 crearHotel5() {
        /*Hotel5(int salonesConferencia, int suites, int limosinas, String nombreRestaurante, 
        int capacidadRestaurante, String gimnasio, int habitaciones, int camas, int pisos, 
        String nombre, String direccion, String localidad, String gerente)*/
        System.out.print("Nombre del Hotel: ");
        String nombre = leer.next();
        System.out.print("Cantidad de habitaciones: ");
        int habitaciones = leer.nextInt();
        System.out.print("Cantidad de camas: ");
        int camas = leer.nextInt();
        System.out.print("Cantidad de pisos: ");
        int pisos = leer.nextInt();
        System.out.print("Nombre del Restaurante: ");
        String nombreRestaurante = leer.next();
        System.out.print("Capacidad del restaurante: ");
        int capacidadRestaurante = leer.nextInt();
        System.out.print("Cantidad de salones de conferencia: ");
        int salonesConferencia = leer.nextInt();
        System.out.print("Cantidad de suites: ");
        int suites = leer.nextInt();
        System.out.print("Cantidad de limosinas: ");
        int limosinas = leer.nextInt();
        System.out.print("Que tipo de gimansio tiene (A o B): ");
        String gimnasio = leer.next().toUpperCase();
        System.out.print("Dirección: ");
        String direccion = leer.next();
        System.out.print("Localidad: ");
        String localidad = leer.next();
        System.out.print("Nombre del Gerente: ");
        String gerente = leer.next();

        return new Hotel5(salonesConferencia, suites, limosinas, nombreRestaurante, capacidadRestaurante, gimnasio, habitaciones, camas, pisos, nombre, direccion, localidad, gerente);
    }

    public Camping crearCamping() {
        //Camping(int maximoCarpas, int banosDisponibles, boolean restaurante, boolean privado, double metrosCuadrados)
        System.out.print("Nombre: ");
        String nombre = leer.next();
        System.out.print("Es privado: ");
        String op;
        boolean privado = false;
        do {
            op = leer.next();
        } while (!op.equalsIgnoreCase("si") && !op.equalsIgnoreCase("no"));
        if (op.equalsIgnoreCase("si")) {
            privado = true;
        }
        System.out.print("Capacidad máxima de carpas: ");
        int maximoCarpas = leer.nextInt();
        System.out.print("Cantidad de baños disponibles: ");
        int banosDisponibles = leer.nextInt();
        System.out.print("Tiene restaurante dentro de las instalaciones: ");
        boolean restaurante = false;
        do {
            op = leer.next();
        } while (!op.equalsIgnoreCase("si") && !op.equalsIgnoreCase("no"));
        if (op.equalsIgnoreCase("si")) {
            restaurante = true;
        }
        System.out.print("Cantidad de m2 que ocupa: ");
        double metrosCuadrados = leer.nextDouble();
        System.out.print("Dirección: ");
        String direccion = leer.next();
        System.out.print("Localidad: ");
        String localidad = leer.next();
        System.out.print("Nombre del Gerente: ");
        String gerente = leer.next();

        return new Camping(maximoCarpas, banosDisponibles, restaurante, privado, metrosCuadrados, nombre, direccion, localidad, gerente);
    }

    public Residencia crearResidencia() {
        //Residencia(String nombre, int habitaciones, boolean descuentoGremio, 
        //boolean campoDeportivo, boolean privado, double metrosCuadrados)
        System.out.print("Nombre: ");
        String nombre = leer.next();
        System.out.print("Es privado: ");
        String op;
        boolean privado = false;
        do {
            op = leer.next();
        } while (!op.equalsIgnoreCase("si") && !op.equalsIgnoreCase("no"));
        if (op.equalsIgnoreCase("si")) {
            privado = true;
        }
        System.out.print("Cantidad de habitaciones: ");
        int habitaciones = leer.nextInt();
        System.out.print("Tiene campo deportivo: ");
        boolean campoDeportivo = false;
        do {
            op = leer.next();
        } while (!op.equalsIgnoreCase("si") && !op.equalsIgnoreCase("no"));
        if (op.equalsIgnoreCase("si")) {
            campoDeportivo = true;
        }
        System.out.print("Tiene descuento a los gremios: ");
        boolean descuentoGremio = false;
        do {
            op = leer.next();
        } while (!op.equalsIgnoreCase("si") && !op.equalsIgnoreCase("no"));
        if (op.equalsIgnoreCase("si")) {
            descuentoGremio = true;
        }
        System.out.print("Cantidad de m2 que ocupa: ");
        double metrosCuadrados = leer.nextDouble();
        System.out.print("Dirección: ");
        String direccion = leer.next();
        System.out.print("Localidad: ");
        String localidad = leer.next();
        System.out.print("Nombre del Gerente: ");
        String gerente = leer.next();

        return new Residencia(habitaciones, descuentoGremio, campoDeportivo, privado, metrosCuadrados, nombre, direccion, localidad, gerente);
    }

    public void calcularPrecio() {
        /*El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
        PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
        agregado por gimnasio) + (valor agregado por limosinas).
        Donde:
        Valor agregado por el restaurante:
        • $10 si la capacidad del restaurante es de menos de 30 personas.
        • $30 si está entre 30 y 50 personas.
        • $50 si es mayor de 50.
        Valor agregado por el gimnasio:
        • $50 si el tipo del gimnasio es A.
        • $30 si el tipo del gimnasio es B.
        Valor agregado por las limosinas:
        • $15 por la cantidad de limosinas del hotel.*/

        double precio = 50;

        for (Hotel4 hotel : hoteles4) {
            if (hotel.getCapacidadRestaurante() < 30) {
                precio += 10;
            } else if (hotel.getCapacidadRestaurante() <= 50) {
                precio += 30;
            } else {
                precio += 50;
            }
            hotel.setPrecio(precio + hotel.getHabitaciones());
            hoteles.add(hotel);
        }
        for (Hotel5 hotel : hoteles5) {
            if (hotel.getCapacidadRestaurante() < 30) {
                precio += 10;
            } else if (hotel.getCapacidadRestaurante() <= 50) {
                precio += 30;
            } else {
                precio += 50;
            }
            if (hotel.getGimnasio().equals("A")) {
                precio += 50;
            } else {
                precio += 30;
            }
            hotel.setPrecio(precio + hotel.getHabitaciones());
            hoteles.add(hotel);
        }
    }

    public void crearAlojamientos() {
        hoteles4.add(new Hotel4("Restaurante", 40, "A", 30, 80, 10, "Hotel de 4 Estrellas", "Direccion 1", "CABA", "Pepe"));
        hoteles4.add(new Hotel4("Restaurante 1", 60, "B", 20, 40, 8, "Hotel de 4 Estrellas Version 2", "Direccion 2", "AMBA", "Chiquito"));
        hoteles5.add(new Hotel5(3, 5, 10, "Comidas", 80, "A", 45, 50, 10, "Hotelazo", "Direccion 3", "GCBA", "Gerente 1"));
        hoteles5.add(new Hotel5(5, 2, 6, "Comidas Mejores", 80, "A", 45, 50, 10, "Hotelito", "Direccion 4", "Argentina", "Gerente 2"));
        campings.add(new Camping(30, 10, true, true, 1250, "El dorado", "Bosque 1", "Patagonia", "Gerente 3"));
        campings.add(new Camping(50, 15, false, true, 2300, "El plateado", "Bosque 2", "Cuyo", "Gerente 4"));
        residencias.add(new Residencia(20, true, false, false, 750, "ParaGremios", "Nose", "33ABC", "Gerente 5"));
        for (Hotel4 hotel4 : hoteles4) {
            alojamientos.add(hotel4);
        }
        for (Hotel5 hotel5 : hoteles5) {
            alojamientos.add(hotel5);
        }
        for (Camping camping : campings) {
            alojamientos.add(camping);
        }
        for (Residencia residencia : residencias) {
            alojamientos.add(residencia);
        }
    }

    public void menu() {
        /*Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
        • todos los alojamientos.
        • todos los hoteles de más caro a más barato.
        • todos los campings con restaurante
        • todos las residencias que tienen descuento.*/
        int op;

        do {
            System.out.println("\nConsultar"
                    + "\n1- Alojaminetos"
                    + "\n2- Hoteles"
                    + "\n3- Campings con restaurante"
                    + "\n4- Residencias con decuento"
                    + "\n5- Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    for (Alojamiento alojamiento : alojamientos) {
                        System.out.println(alojamiento.toString());
                    }
                    break;
                case 2:
                    Comparator<Hotel> comp = Comparator.comparing(Hotel::getPrecio);
                    Collections.sort(hoteles, comp.reversed());
                    for (Hotel hotel : hoteles) {
                        System.out.println(hotel.toString());
                    }
                    break;
                case 3:
                    for (Camping camping : campings) {
                        if (camping.isRestaurante()) {
                            System.out.println(camping.toString());
                        }
                    }
                    break;
                case 4:
                    for (Residencia residencia : residencias) {
                        if (residencia.isDescuentoGremio()) {
                            System.out.println(residencia.toString());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Shao!");
                    break;
                default:
                    System.out.println("Ingresó una opción inválida.");
                    break;
            }
            if (op == 5) {
                break;
            }
        } while (true);

    }

}
