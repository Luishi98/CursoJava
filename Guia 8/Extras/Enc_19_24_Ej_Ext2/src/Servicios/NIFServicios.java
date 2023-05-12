package Servicios;

public class NIFServicios {
    
    public String crearNif(long dni) {
        String cadena = "TRWAGMYFPDXBNJZSQVHLCKE";
        
        String[] tabla = new String[23];
        
        for (int i = 0; i < 22; i++) {
            tabla[i] = cadena.substring(i, i + 1);
        }
        
        return tabla[(int) dni % 23];
    }
    
    public void mostrar(long dni) {
        System.out.println(dni + "-" + crearNif(dni));
    }
    
}
