package estancias.entidades;

public class Clientes {
    
    private int idCliente;
    private String nombre;
    private String calle;
    private int numero;
    private String codigoPostal;
    private String ciudad;
    private String pais;
    private String email;
    //
    private Casas casa;

    public Clientes() {
    }

    public Clientes(int idCliente, String nombre, String calle, int numero, String codigoPostal, String ciudad, String pais, String email, Casas casa) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.email = email;
        this.casa = casa;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Casas getCasa() {
        return casa;
    }

    public void setCasa(Casas casa) {
        this.casa = casa;
    }

    @Override
    public String toString() {
        return "Id del Cliente: " + idCliente + "\nNombre: " + nombre + "\nCalle: " + calle + "\nNúmero: " + numero + "\nCódigo Postal: " + codigoPostal + "\nCiudad: " + ciudad + "\nPaís: " + pais + "\nEmail: " + email;
    }
            
}
