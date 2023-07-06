package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;

public final class ProductoDAO extends DAO {
    
    public Collection<Producto> listarProducto() throws Exception {
        try {
            String sql = "SELECT * FROM Producto ";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt("codigo"));
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getInt("precio"));
                producto.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
    public Collection<Producto> listarProductoCondicionNombre(String nombre) throws Exception {
        try {
            String sql = "SELECT * FROM Producto WHERE nombre LIKE '%" + nombre + "%' ";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt("codigo"));
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getInt("precio"));
                producto.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
    public Collection<Producto> listarProductoCondicionPrecio(String orden, int limite) throws Exception {
        try {
            String sql;
            if (limite == 0) {
                sql = "SELECT nombre, precio FROM producto ORDER BY precio " + orden ;
            } else {
                sql = "SELECT nombre, precio FROM producto ORDER BY precio " + orden + " LIMIT " + limite ;
            }
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
    public void guardarProducto(Producto prodcuto) throws Exception {
        try {
            if (prodcuto == null) {
                throw new Exception("Debe indicar el producto");
            }
            
            String sql = "INSERT INTO producto (nombre, precio, codigo_fabricante)"
                    + "VALUES ( '" + prodcuto.getNombre() + "' , '" + prodcuto.getPrecio() + "' , '" + prodcuto.getCodigoFabricante() + "' );";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    public Producto buscarProductoPorCodigo (Integer codigo) throws Exception {
        try {

            String sql = "SELECT * FROM Producto "
                    + " WHERE codigo = '" + codigo + "'";

            consultarBase(sql);

            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
    public void modificarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto que desea modificar");
            }

            String sql = "UPDATE producto SET "
                    + "nombre = '" + producto.getNombre() + "', precio = " + producto.getPrecio() + ", codigo_fabricante = " + producto.getCodigoFabricante()+ " WHERE codigo = '" + producto.getCodigo() + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
}
