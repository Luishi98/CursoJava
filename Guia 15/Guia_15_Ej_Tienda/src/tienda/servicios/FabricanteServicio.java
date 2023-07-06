package tienda.servicios;

import java.util.InputMismatchException;
import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

public class FabricanteServicio {
    
    public void guardarFabricante() throws Exception {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        FabricanteDAO fD = new FabricanteDAO();
        try {
            System.out.print("Ingrese el nombre del nuevo fabricante: ");
            String nombre = leer.next();
            
            Fabricante fabricante = new Fabricante();
            fabricante.setNombre(nombre);
            fD.guardarFabricante(fabricante);
        } catch (InputMismatchException e) {
            System.out.println("Ha ingresado un dato inválido para su campo, intente nuevamente.");
            guardarFabricante();
        }
    }
    
}
