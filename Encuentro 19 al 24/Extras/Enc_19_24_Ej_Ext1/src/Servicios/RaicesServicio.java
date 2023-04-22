package Servicios;

import Entidades.Raices;

public class RaicesServicio {
    
    public double getDiscriminante(Raices r){
        return (Math.pow(r.getB(), 2) - (4*r.getA()*r.getC()));
    }
    
    public boolean tieneRaices(Raices r){
        return getDiscriminante(r) >= 0;
    }
    
    public boolean tieneRaiz(Raices r){
        return getDiscriminante(r) == 0;
    }
    
    public void obtenerRaices(Raices r){
        if(tieneRaices(r)){
            System.out.println("Raiz 1 = " + (-(r.getB()) + (Math.sqrt((Math.pow(r.getB(), 2)) - (4*r.getA()*r.getC()))))/ (2*r.getA()) );
            System.out.println("Raiz 2 = " + (-(r.getB()) - (Math.sqrt((Math.pow(r.getB(), 2)) - (4*r.getA()*r.getC()))))/ (2*r.getA()) );
        }
    }
    
    public void obtenerRaiz(Raices r){
        if(tieneRaiz(r)){
            System.out.println("Raiz 1 = " + (-(r.getB()) + (Math.sqrt((Math.pow(r.getB(), 2)) - (4*r.getA()*r.getC()))))/ (2*r.getA()) );
        }
    }
    
    public void calcular(Raices r){
        obtenerRaices(r);
        obtenerRaiz(r);
        if(!tieneRaiz(r) && !tieneRaices(r)){
            System.out.println("La ecuación no tiene ninguna solución");
        }
    }
    
}
