package estancias.entidades;

import java.util.Date;

public class Estancias {
    
    private int idEstancia;
    private int idCliente;
    private int idCasa;
    private String nombreHuesped;
    private String fechaDesde;
    private String fechaHasta;
    private Casas casas;
    private Clientes clientes;

    public Estancias() {
    }

    public Estancias(int idEstancia, int idCliente, int idCasa, String nombreHuesped, String fechaDesde, String fechaHasta, Casas casas, Clientes clientes) {
        this.idEstancia = idEstancia;
        this.idCliente = idCliente;
        this.idCasa = idCasa;
        this.nombreHuesped = nombreHuesped;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.casas = casas;
        this.clientes = clientes;
    }

    public int getIdEstancia() {
        return idEstancia;
    }

    public void setIdEstancia(int idEstancia) {
        this.idEstancia = idEstancia;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(int idCasa) {
        this.idCasa = idCasa;
    }

    public String getNombreHuesped() {
        return nombreHuesped;
    }

    public void setNombreHuesped(String nombreHuesped) {
        this.nombreHuesped = nombreHuesped;
    }

    public String getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(String fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public String getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(String fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public Casas getCasas() {
        return casas;
    }

    public void setCasas(Casas casas) {
        this.casas = casas;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Id de la Estancia: " + idEstancia + "\nId del Cliente: " + idCliente + "\nId de Casa: " + idCasa + "\nNombre del Huesped: " + nombreHuesped + "\nDisponible desde: " + fechaDesde + "\nDisponible hasta: " + fechaHasta;// + "\nCasas: " + casas + "\nClientes=" + clientes;
    }
    
}
