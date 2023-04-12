package enc13_18_ej_ext5.Entidades;

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public void calcular_aumento(String nombre, int edad, double salario){
        if(edad < 30){
            salario += (salario*5)/100;
        } else{
            salario += (salario*10)/100;
        }
        
        System.out.println("El salario de " + nombre + " aumentó. Su nuevo salario es de: " + salario);
        
    }
    
}
