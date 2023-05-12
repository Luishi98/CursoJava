package Entidades;

public class MesSecreto {
    private String[] meses = new String[12];
    private String mesSecreto;

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
    public MesSecreto() {
        meses[0] = "enero";
        meses[1] = "febrero";
        meses[2] = "marzo";
        meses[3] = "abril";
        meses[4] = "mayo";
        meses[5] = "junio";
        meses[6] = "julio";
        meses[7] = "agosto";
        meses[8] = "settiembre";
        meses[9] = "octubre";
        meses[10] = "noviembre";
        meses[11] = "diciembre";
        mesSecreto = meses[(int) (Math.random() * 12)];
    }

    public MesSecreto(String[] meses, String mesSecreto) {
        this.meses = meses;
        this.mesSecreto = mesSecreto;
    }
}
