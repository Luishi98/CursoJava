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
package Entidades;

import java.time.LocalDate;

public class Poliza {

    private Cliente cliente;
    private Vehiculo vehiculo;
    private int numeroPoliza;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int cuotasCantidad;
    private String formaPago;
    private int montoTotal;
    private boolean granizo;
    private int maxGranizo;
    private String tipo;
    private Cuota cuota;

    public Poliza() {
    }

    public Poliza(int numeroPoliza, LocalDate fehcaInicio, int cuotasCantidad, String formaPago, int montoTotal, boolean granizo, int maxGranizo, String tipo) {
        this.numeroPoliza = numeroPoliza;
        this.fechaInicio = fehcaInicio;
        this.fechaFin = fechaInicio.plusMonths(cuotasCantidad);
        this.cuotasCantidad = cuotasCantidad;
        this.formaPago = formaPago;
        this.montoTotal = montoTotal;
        this.granizo = granizo;
        this.maxGranizo = maxGranizo;
        this.tipo = tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCuotasCantidad() {
        return cuotasCantidad;
    }

    public void setCuotasCantidad(int cuotasCantidad) {
        this.cuotasCantidad = cuotasCantidad;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public int getMaxGranizo() {
        return maxGranizo;
    }

    public void setMaxGranizo(int maxGranizo) {
        this.maxGranizo = maxGranizo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cuota getCuota() {
        return cuota;
    }

    public void setCuota(Cuota cuota) {
        this.cuota = cuota;
    }

    @Override
    public String toString() {
        String siNo;
        if (granizo) {
            siNo = "Si";
        } else {
            siNo = "No";
        }
        return "\n----Poliza----" + "\nCliente: " + cliente.getNombre() + "\nVehiculo: " + vehiculo.getMarca() + "\nNumero de Poliza: " + numeroPoliza + "\nDesde: " + fechaInicio + " - Hasta: " + fechaFin + "\nCuotas de Cantidad: " + cuotasCantidad + "\nForma de Pago=" + formaPago + "\nMonto Total: " + montoTotal + "\nGranizo: " + siNo + "\nMáximo por Granizo: " + maxGranizo + "\nTipo: " + tipo + "\nCuota: " + cuota + "\n";
    }
}
