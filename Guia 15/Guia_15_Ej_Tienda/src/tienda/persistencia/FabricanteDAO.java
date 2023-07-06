package tienda.persistencia;

import tienda.entidades.Fabricante;

public final class FabricanteDAO extends DAO {
    
    public void guardarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar el producto");
            }
            
            String sql = "INSERT INTO fabricante (nombre)"
                    + "VALUES ( '" + fabricante.getNombre() + "' );";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
}
