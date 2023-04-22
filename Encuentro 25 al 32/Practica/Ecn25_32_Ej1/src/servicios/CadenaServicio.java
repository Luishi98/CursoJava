package servicios;

import entidades.Cadena;

public class CadenaServicio {
    
    public void mostrarVocales(Cadena c){
        int cont = 0;
        
        for (int i = 0; i < c.getLongitud(); i++) {
            if(c.getFrase().substring(i, i+1).equalsIgnoreCase("a") || c.getFrase().substring(i, i+1).equalsIgnoreCase("e") || c.getFrase().substring(i, i+1).equalsIgnoreCase("i") || c.getFrase().substring(i, i+1).equalsIgnoreCase("o") || c.getFrase().substring(i, i+1).equalsIgnoreCase("u")){
                cont+=1;
            }
        }
        System.out.println("La cantidad de vocales es :" + cont);
    }
    
    public void invertirFrase(Cadena c){
        String frase = "";
        for (int i = c.getLongitud(); i > 0; i--) {
            frase = frase.concat(c.getFrase().substring(i-1, i));
        }
        System.out.println("La frase invertida es: [" + frase + "]");
    }
    
    public void vecesRepetida(Cadena c, String letra){
        int cont = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            if(c.getFrase().substring(i, i+1).equalsIgnoreCase(letra)){
                cont+=1;
            }
        }
        System.out.println("La letra '" + letra + "' aparece [" + cont + "] en la frase");
    }
    
    public void compararLongitud(Cadena c, String cadena){
        if(c.getLongitud()==cadena.length()){
            System.out.println("El largo de las cadenas es igual");
        }else{
            System.out.println("El largo de las candenas no es igual");
        }
    }
    
    public void unirFrases(Cadena c, String cadena) {
        System.out.println("Las frase unidas quedarian tal que: " + c.getFrase().concat(cadena));
    }

    public void reemplazar(Cadena c, String caracter) {
        String frase = c.getFrase().replaceAll("a", caracter);
//        for (int i = 0; i < c.getLongitud(); i++) {
//            if (c.getFrase().substring(i, i + 1).equalsIgnoreCase("a")) {
//                frase = frase.concat(caracter);
//            } else {
//                frase = frase.concat(c.getFrase().substring(i, i + 1));
//            }
//        }
        System.out.println("La frase recaracterizada quedaria tal que: [" + frase + "]");
    }
    
    public boolean contiene(Cadena c, String letra){
        for (int i = 0; i < c.getLongitud(); i++) {
            if(c.getFrase().substring(i, i+1).equalsIgnoreCase(letra)){
                return true;
            }
        }
        return false;
    }
}
