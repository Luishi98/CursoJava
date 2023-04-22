package Entidades;

public class NIF {
    private long dni;
    private String letra;

    public NIF(long dni, String letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public NIF() {
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    
    
}
