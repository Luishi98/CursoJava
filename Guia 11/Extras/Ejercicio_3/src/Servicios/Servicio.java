/*
Ha llegado el momento de poner de prueba tus conocimientos. Para eso te vamos a contar que te
ha contratado “La Tercera Seguros”, una empresa aseguradora que brinda a sus clientes
coberturas integrales para vehículos.
Luego de un pequeño relevamiento, te vamos a pasar en limpio los requerimientos del sistema
que quiere realizar la empresa.
a. Gestión Integral de clientes. En este módulo vamos a registrar la información personal de
cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail,
domicilio, teléfono.
<--------------------------------------->
b. Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
<--------------------------------------->
c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
muchos a uno o de muchos a muchos.
<--------------------------------------->
d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.). 
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
import java.util.Scanner;

public class Servicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
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
}
