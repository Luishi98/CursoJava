package estancias.servicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuServicios {

    public void mostrarMenu() throws Exception {
        try {
            ClientesServicio cSer = new ClientesServicio();
            FamiliasServicios fSer = new FamiliasServicios();
            CasasServicios casaSer = new CasasServicios();
            EstanciasServicios eSer = new EstanciasServicios();
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            int op = 0;

            do {
                System.out.println("\n 1) Familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años."
                        + "        \n 2) Casas disponibles para el periodo comprendido entre el 1 de agosto de"
                        + " 2020 y el 31 de agosto de 2020 en Reino Unido."
                        + "        \n 3) Familias cuya dirección de mail sea de Hotmail."
                        + "        \n 4) Casas disponibles a partir de una fecha dada y un número de días específico."
                        + "        \n 5) Datos de todos los clientes que en algún momento realizaron una estancia y la descripción de la casa donde la realizaron"
                        + "        \n 6) Mostrar las estancias que han sido reservadas por un cliente, información de la casa que reservó."
                        + "        \n 7) Incrementar el precio por día en un 5% de todas las casas del Reino Unido."
                        + "        \n 8) Obtener el número de casas que existen para cada uno de los países diferentes."
                        + "        \n 9) Casas del Reino Unido de las que se ha dicho de ellas (comentarios) que están ‘limpias’."
                        + "        \n 10) Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas."
                        + "\n 11) Salir"
                        + " \n Ingrese la Opcicion Deseada : ");
                try {
                    op = leer.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Error de dato ingresado. Intente nuevamente.");
                    mostrarMenu();
                }
                Thread.sleep(1000);
                switch (op) {
                    case 1:
                        fSer.listarFamilias(op);
                        break;
                    case 2:
                        casaSer.listarCasas(op);
                        break;
                    case 3:
                        fSer.listarFamilias(op);
                        break;
                    case 4:
                        casaSer.listarCasas(op);
                        break;
                    case 5:
                        cSer.listarClientes();
                        break;
                    case 6:
                        eSer.listarEstancias();
                        break;
                    case 7:
                        casaSer.listarCasas(op);
                        break;
                    case 8:
                        casaSer.listarCasasPorAgrupadas(op);
                        break;
                    case 9:
                        casaSer.listarCasas(op);
                        break;
                    case 10:
                        System.out.println("Opción aún no disponible.");
                        break;
                    case 11:
                        System.out.println("Shao!");
                        break;
                    default:
                        System.out.println("Opción incorrecta. Vuelva a intentar!");
                }
                Thread.sleep(1000);
                if (op == 11) {
                    break;
                }
            } while (true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
