package ubp.doo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import ubp.doo.dto.ProductoDto;

public class ProductoDaoImp implements ProductoDao {

    public ProductoDaoImp() {
    }
    
    @Override
    public List<ProductoDto> listarProductos() {
    Connection con = null;
        Statement sentencia = null;
        ResultSet rs = null;
        List<ProductoDto> listaProductos = new ArrayList<>();

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT idProducto, nombre, descripcion, unidadMedida, cantidad, precioUnit FROM productos ORDER BY idProducto";
            sentencia = con.createStatement();

            rs = sentencia.executeQuery(sql);
                     
            int idProducto;
            String nombre;
            String descripcion;
            String unidadMedida;
            int cantidad;
            int precioUnit;
            ProductoDto producto;
            
            while (rs.next()) {
                nombre = rs.getString("nombre");
                descripcion = rs.getString("descripcion");
                unidadMedida = rs.getString("unidadMedida");
                cantidad = rs.getInt("cantidad");
                precioUnit = rs.getInt("precioUnit");
                idProducto = rs.getInt("idProducto");
                
                producto = new ProductoDto(nombre, descripcion, unidadMedida, cantidad, precioUnit, idProducto);
                listaProductos.add(producto);
            }
            
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            try {
                rs.close();
                sentencia.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
        return listaProductos;
    }
    

    @Override
    public boolean insertarProducto(ProductoDto producto) {
        Connection con = null;
        PreparedStatement sentencia = null;
        
        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "INSERT INTO productos (nombre, descripcion, unidadMedida, cantidad, precioUnit) values (?, ?, ?, ?, ?)";
        
            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, producto.getNombre());
            sentencia.setString(2, producto.getDescripcion());
            sentencia.setString(3, producto.getUnidadMedida());
            sentencia.setInt(4, producto.getCantidad());
            sentencia.setInt(5, producto.getPrecioUnit());
            
            int resultado = sentencia.executeUpdate();
            
            return (resultado > 0);
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                sentencia.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }

    @Override
    public boolean modificarProducto(ProductoDto producto) {
        Connection con = null;
        PreparedStatement sentencia = null;
        
        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "UPDATE productos SET nombre=?, descripcion=?, unidadMedida=?, cantidad=?, precioUnit=? WHERE idProducto=?";
            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, producto.getNombre());
            sentencia.setString(2, producto.getDescripcion());
            sentencia.setString(3, producto.getUnidadMedida());
            sentencia.setInt(4, producto.getCantidad());
            sentencia.setInt(5, producto.getPrecioUnit());
            sentencia.setInt(6, producto.getIdProducto());
            
            int resultado = sentencia.executeUpdate();
            
            return (resultado > 0);
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                sentencia.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }

    @Override
    public boolean borrarProducto(int idProducto) {
        Connection con = null;
        PreparedStatement sentencia = null;
        
        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "DELETE FROM productos WHERE idProducto=?";
            sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, idProducto);
            
            int resultado = sentencia.executeUpdate();
            
            return (resultado > 0);
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                sentencia.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }
}
