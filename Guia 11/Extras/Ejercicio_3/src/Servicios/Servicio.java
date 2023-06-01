/*
<--------------------------------------->
a. Gestión Integral de clientes. En este módulo vamos a registrar la información personal de
cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail,
domicilio, teléfono. OK
<--------------------------------------->
b. Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.). OK
<--------------------------------------->
c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
muchos a uno o de muchos a muchos. OK
<--------------------------------------->
d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.). OK
<--------------------------------------->
Debemos realizar el diagrama de clases completo, teniendo en cuenta todos los
requerimientos arriba descriptos. Modelando clases con atributos y sus correspondientes
relaciones.
 */
package Servicios;

import Entidades.Cliente;
import Entidades.Cuota;
import Entidades.Poliza;
import Entidades.Vehiculo;
import Enums.FormaDePago;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Cliente> carteraCliente = new ArrayList();
    ArrayList<Vehiculo> vehiculos = new ArrayList();
    ArrayList<Poliza> polizas = new ArrayList();
    ArrayList<Cuota> cuotas = new ArrayList();

    public Cliente crearCliente() {
        System.out.print("Nombre: ");
        String nombre = leer.next();
        System.out.print("Apellido: ");
        String apellido = leer.next();
        System.out.print("Documento: ");
        int documento = leer.nextInt();
        System.out.print("Mail: ");
        String mail = leer.next();
        System.out.print("Domicilio: ");
        String domicilio = leer.next();
        System.out.print("Telefono: ");
        int telefono = leer.nextInt();

        return new Cliente(nombre, apellido, documento, mail, domicilio, telefono);
    }

    public Vehiculo crearVehiculo() {
        System.out.print("Marca: ");
        String marca = leer.next();
        System.out.print("Modelo: ");
        String modelo = leer.next();
        System.out.print("Año: ");
        int anio = leer.nextInt();
        System.out.print("Número de motor: ");
        int motor = leer.nextInt();
        System.out.print("Número de chasis: ");
        int chasis = leer.nextInt();
        System.out.print("Color: ");
        String color = leer.next();
        System.out.print("Tipo: ");
        String tipo = leer.next();

        return new Vehiculo(marca, modelo, anio, motor, chasis, color, tipo);
    }

    public Poliza generarPoliza() {
        System.out.print("Número de póliza: ");
        int numeroPoliza = leer.nextInt();
        System.out.println("Fecha de inicio");
        System.out.print("Día: ");
        int dia = leer.nextInt();
        System.out.print("Mes: ");
        int mes = leer.nextInt();
        System.out.print("Año: ");
        int anio = leer.nextInt();
        LocalDate fechaInicio = LocalDate.of(anio, mes, dia);
        System.out.print("Cantidad de cuotas: ");
        int cuotasCantidad = leer.nextInt();
        System.out.print("Forma de pago (Efectivo, Transferencia, Terjeta, Débito Automático): ");
        String formaPago = leer.next().toUpperCase();
        for (FormaDePago aux : FormaDePago.values()) {
            if (String.valueOf(aux).equalsIgnoreCase(formaPago)) {
                formaPago = String.valueOf(aux);
            }
        }
        System.out.print("Monto total asegurado: ");
        int montoTotal = leer.nextInt();
        System.out.print("Cubre granizo? ");
        String op = leer.next();
        boolean granizo = op.equals("si");
        System.out.print("Cobertura máxima de granizo: ");
        int maxGranizo = leer.nextInt();
        System.out.print("Tipo de vehiculo: ");
        String tipo = leer.next();
        return new Poliza(numeroPoliza, fechaInicio, cuotasCantidad, formaPago, montoTotal, granizo, maxGranizo, tipo);
    }

    public Cuota crearCuota() {
        System.out.print("Número de cuota: ");
        int numero = leer.nextInt();
        System.out.print("Monto de la cuota: ");
        int montoCuota = leer.nextInt();
        System.out.print("Está pagada(si/no)? ");
        String op = leer.next().toLowerCase();
        boolean pagada = op.equals("si");
        System.out.println("Vencimiento");
        System.out.print("Día: ");
        int dia = leer.nextInt();
        System.out.print("Mes: ");
        int mes = leer.nextInt();
        System.out.print("Año: ");
        int anio = leer.nextInt();
        LocalDate vencimiento = LocalDate.of(anio, mes, dia);

        return new Cuota(numero, montoCuota, pagada, vencimiento);
    }

    public void carteraDeClientes() {
        carteraCliente.add(new Cliente("Luis", "Rodriguez", 40000000, "luis@google.com", "Av. Simpre Viva 740", 911));
        carteraCliente.add(new Cliente("Juan", "Perez", 50000000, "juan@google.com", "Casa de Juan", 107));
        carteraCliente.add(new Cliente("Mariano", "Gaona", 60000000, "mariano@google.com", "La villa", 5323));
        carteraCliente.add(new Cliente("Kira", "Gato", 123, "gato@michi.com", "Mi casa", 7256));
        carteraCliente.add(new Cliente("Eduardo", "Moreno", 35000000, "edu@google.com", "Re lejos", 183));
    }

    public void concesionario() {
        vehiculos.add(new Vehiculo("Toyota", "Corolla", 2021, 1800, 123456, "Rojo", "Sedán"));
        vehiculos.add(new Vehiculo("Ford", "Mustang", 2019, 5000, 789012, "Negro", "Coupé"));
        vehiculos.add(new Vehiculo("Honda", "Civic", 2020, 1500, 345678, "Gris", "Hatchback"));
        vehiculos.add(new Vehiculo("Chevrolet", "Camaro", 2022, 6200, 901234, "Azul", "Coupé"));
        vehiculos.add(new Vehiculo("Nissan", "Sentra", 2018, 1800, 567890, "Blanco", "Sedán"));
        vehiculos.add(new Vehiculo("BMW", "X5", 2021, 3000, 123456, "Plateado", "SUV"));
        vehiculos.add(new Vehiculo("Mercedes-Benz", "C-Class", 2019, 2000, 789012, "Negro", "Sedán"));
    }

    public void asignacion() {
        carteraDeClientes();
        concesionario();
        polizas();
        cuotas();
        Random random = new Random();
        int num;
        for (Cliente cliente : carteraCliente) {
            if (vehiculos.size() == 0) {
                break;
            }
            ArrayList<Vehiculo> autos = new ArrayList();
            do {
                num = random.nextInt(carteraCliente.size());
            } while (vehiculos.size() <= num);
            for (int i = 0; i < num; i++) {
                autos.add(vehiculos.get(i));
                vehiculos.get(i).setPoliza(polizas.get(i));
                polizas.get(i).setCuota(cuotas.get(i));
                polizas.get(i).setCliente(cliente);
                polizas.get(i).setVehiculo(vehiculos.get(i));

//                vehiculos.remove(vehiculos.get(i));
//                polizas.remove(polizas.get(i));
//                cuotas.remove(cuotas.get(i));
            }
            vehiculos.subList(0, num).clear();
            polizas.subList(0, num).clear();
            cuotas.subList(0, num).clear();

            cliente.setVehiculos(autos);
            System.out.println(cliente.toString());
        }
    }

    public void polizas() {
        polizas.add(new Poliza(1, LocalDate.of(2023, 1, 1), 12, String.valueOf(FormaDePago.EFECTIVO), 5000, true, 1000, "Seguro de auto"));
        polizas.add(new Poliza(2, LocalDate.of(2023, 2, 1), 6, String.valueOf(FormaDePago.TRANSFERENCIA), 3000, false, 0, "Seguro de hogar"));
        polizas.add(new Poliza(3, LocalDate.of(2023, 3, 1), 3, String.valueOf(FormaDePago.TARJETA), 1500, false, 0, "Seguro de vida"));
        polizas.add(new Poliza(4, LocalDate.of(2023, 4, 1), 1, String.valueOf(FormaDePago.DEBITO_AUTOMATICO), 2000, true, 500, "Seguro de salud"));
        polizas.add(new Poliza(5, LocalDate.of(2023, 5, 1), 12, String.valueOf(FormaDePago.EFECTIVO), 4000, true, 800, "Seguro de moto"));
        polizas.add(new Poliza(6, LocalDate.of(2023, 6, 1), 6, String.valueOf(FormaDePago.TRANSFERENCIA), 2500, false, 0, "Seguro de viaje"));
        polizas.add(new Poliza(7, LocalDate.of(2023, 7, 1), 12, String.valueOf(FormaDePago.TARJETA), 6000, true, 1500, "Seguro de casa"));

    }

    public void cuotas() {
        cuotas.add(new Cuota(1, 500, true, LocalDate.of(2023, 1, 10)));
        cuotas.add(new Cuota(2, 500, true, LocalDate.of(2023, 2, 10)));
        cuotas.add(new Cuota(3, 500, false, LocalDate.of(2023, 3, 10)));
        cuotas.add(new Cuota(4, 500, false, LocalDate.of(2023, 4, 10)));
        cuotas.add(new Cuota(5, 500, false, LocalDate.of(2023, 5, 10)));
        cuotas.add(new Cuota(6, 500, false, LocalDate.of(2023, 6, 10)));
        cuotas.add(new Cuota(7, 500, false, LocalDate.of(2023, 7, 10)));
    }

    public void metodos() {
        crearCliente();
        crearVehiculo();
        generarPoliza();
        crearCuota();
    }
}
