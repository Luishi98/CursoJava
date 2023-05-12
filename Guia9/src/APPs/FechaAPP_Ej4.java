package APPs;

import Servicios.FechaServicios;

public class FechaAPP_Ej4 {

    public static void main(String[] args) {
        FechaServicios fSer = new FechaServicios();
        fSer.diferencia(fSer.fechaNacimiento(), fSer.fechaActual());
    }
}
