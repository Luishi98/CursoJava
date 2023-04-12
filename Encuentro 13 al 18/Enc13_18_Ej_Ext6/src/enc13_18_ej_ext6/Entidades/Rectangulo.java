package enc13_18_ej_ext6.Entidades;

public class Rectangulo {
    private int lado1;
    private int lado2;

    public Rectangulo() {
    }

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    public void calcular_area(int lado1, int lado2){
        int area = lado1 * lado2;
        System.out.println("El área del rectágulo es: " + area);
    }
    
}
