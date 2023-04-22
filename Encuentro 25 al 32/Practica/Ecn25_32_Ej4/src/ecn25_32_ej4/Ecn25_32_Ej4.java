/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecn25_32_ej4;

import Servicios.FechaServicios;

public class Ecn25_32_Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FechaServicios fSer = new FechaServicios();
        fSer.diferencia(fSer.fechaNacimiento(), fSer.fechaActual());
    }
    
}
