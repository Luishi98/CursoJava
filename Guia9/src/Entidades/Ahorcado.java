package Entidades;

public class Ahorcado {

    private String[] palabraABuscar;
    private int letrasEncontradas;
    private int intentosMax;

    //-------------------------------------------
    private String[] progreso;

    public String[] getProgreso() {
        return progreso;
    }

    public void setProgreso(String[] progreso) {
        this.progreso = progreso;
    }

    //--------------------------------------------
    public Ahorcado() {
    }

    public Ahorcado(String[] palabraABuscar, int letrasEncontradas, int intentosMax) {
        this.palabraABuscar = palabraABuscar;
        this.letrasEncontradas = letrasEncontradas;
        this.intentosMax = intentosMax;
    }

    public String[] getPalabraABuscar() {
        return palabraABuscar;
    }

    public void setPalabraABuscar(String[] palabraABuscar) {
        this.palabraABuscar = palabraABuscar;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getIntentosMax() {
        return intentosMax;
    }

    public void setIntentosMax(int intentosMax) {
        this.intentosMax = intentosMax;
    }
}
