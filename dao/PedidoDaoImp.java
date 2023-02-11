package ubp.doo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import ubp.doo.dto.ClienteDto;
import ubp.doo.dto.DetalleDto;
import ubp.doo.dto.EntregaDto;
import ubp.doo.dto.PedidoDto;
import ubp.doo.dto.ProductoDto;

public class PedidoDaoImp implements PedidoDao {
    
    public PedidoDaoImp() {
    }

    @Override
    public List<PedidoDto> listarPedidos() {
        Connection con = null;
        Statement sentencia = null;
        ResultSet rs = null;
        List<PedidoDto> listaPedidos = new ArrayList<>();

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT idPedido, apellido, nombre, telefono, calle, zona, fechaEntrega, medioPago, monto, estado FROM pedidos ORDER BY idPedido";
            sentencia = con.createStatement();

            rs = sentencia.executeQuery(sql);
                     
            int idPedido;
            String apellido;
            String nombre;
            String telefono;
            String calle;
            String zona;
            String fechaEntrega;
            String medioPago;
            String monto;
            String estado;
            PedidoDto pedido;
            
            while (rs.next()) {
                apellido = rs.getString("apellido");
                nombre = rs.getString("nombre");
                telefono = rs.getString("telefono");
                calle = rs.getString("calle");
                zona = rs.getString("zona");
                fechaEntrega = rs.getString("fechaEntrega");
                medioPago = rs.getString("medioPago");
                monto = rs.getString("monto");
                estado = rs.getString("estado");
                idPedido = rs.getInt("idPedido");
                               
                pedido = new PedidoDto(apellido, nombre, telefono, calle, zona, fechaEntrega, medioPago, monto, estado,idPedido);
                listaPedidos.add(pedido);
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
        return listaPedidos;
    }

    @Override
    public boolean insertarPedido(PedidoDto pedido) {
        Connection con = null;
        PreparedStatement sentencia = null;
        
        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "INSERT INTO pedidos (apellido, nombre, telefono, calle, zona, fechaEntrega, medioPago, monto) values (?, ?, ?, ?, ?, ?, ?, ?)";
        
            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, pedido.getApellido());
            sentencia.setString(2, pedido.getNombre());
            sentencia.setString(3, pedido.getTelefono());
            sentencia.setString(4, pedido.getCalle());
            sentencia.setString(5, pedido.getZona());
            sentencia.setString(6, pedido.getFechaEntrega());
            sentencia.setString(7, pedido.getMedioPago());
            sentencia.setString(8, pedido.getMonto());
            
            int resultado = sentencia.executeUpdate();
            
            return (resultado > 0);
        } catch (SQLException e){
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
    public boolean registrarEntrega(EntregaDto entrega) {
        Connection con = null;
        PreparedStatement sentencia = null;
        
        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "INSERT INTO entregas (apellido, nombre, telefono, calle, zona, fechaEntrega, medioPago, monto, empleado, estado, idPedido) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, entrega.getApellido());
            sentencia.setString(2, entrega.getNombre());
            sentencia.setString(3, entrega.getTelefono());
            sentencia.setString(4, entrega.getDomicilio());
            sentencia.setString(5, entrega.getZona());
            sentencia.setString(6, entrega.getFechaEntrega());
            sentencia.setString(7, entrega.getMedioPago());
            sentencia.setString(8, entrega.getMonto());
            sentencia.setString(9, entrega.getEmpleado());
            sentencia.setString(10, entrega.getEstado());
            sentencia.setInt(11, entrega.getIdPedido());
            
            int resultado = sentencia.executeUpdate();
            
            return (resultado > 0);
        } catch (SQLException e){
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
    public boolean registrarDetalle(DetalleDto detalle) {
        Connection con = null;
        PreparedStatement sentencia = null;
        
        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "INSERT INTO detallePedido (nombre, descripcion, precioUnit, cantidad, precioTotal, idPedido) values (?, ?, ?, ?, ?, ?)";
        
            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, detalle.getNombreProducto());
            sentencia.setString(2, detalle.getDescripcion());
            sentencia.setInt(3, detalle.getPrecioUnit());
            sentencia.setInt(4, detalle.getCantidad());
            sentencia.setInt(5, detalle.getPrecioTotal());
            sentencia.setInt(6, detalle.getIdPedido());
            
            int resultado = sentencia.executeUpdate();
            
            return (resultado > 0);
        } catch (SQLException e){
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
    public boolean cancelarPedido(int idPedido) {
        Connection con = null;
        PreparedStatement sentencia = null;
        
        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "DELETE FROM pedidos WHERE idPedido=? AND estado='PENDIENTE'";
            sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, idPedido);
            
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
    public boolean eliminarDetalle(int idPedido) {
        Connection con = null;
        PreparedStatement sentencia = null;
        
        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "DELETE FROM detallePedido WHERE idPedido=? AND estado='PENDIENTE'";
            sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, idPedido);
            
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
    public boolean eliminarEntrega(int idPedido) {
        Connection con = null;
        PreparedStatement sentencia = null;
        
        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "DELETE FROM entregas WHERE idPedido=? AND estado='PENDIENTE'";
            sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, idPedido);
            
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
    public ArrayList<ClienteDto> getClientes() {
        Connection con = null;
        Statement sentencia = null;
        ResultSet rs = null;
        ArrayList<ClienteDto> listaClientes = new ArrayList<>();

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT idCliente, apellido, nombre, telefono, calle, zona FROM clientes ORDER BY idCliente";
            sentencia = con.createStatement();

            rs = sentencia.executeQuery(sql);
                     
            int idCliente;
            String apellido;
            String nombre;
            String telefono;
            String calle;
            String zona;
            ClienteDto cliente; 
            
            while (rs.next()) {
                apellido = rs.getString("apellido");
                nombre = rs.getString("nombre");
                telefono = rs.getString("telefono");
                calle = rs.getString("calle");
                zona = rs.getString("zona");
                idCliente = rs.getInt("idCliente");
                               
                cliente = new ClienteDto(idCliente, apellido, nombre, telefono, calle, zona);
                listaClientes.add(cliente);
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
        return listaClientes;
    }
    
    @Override
    public ArrayList<ProductoDto> getProductos() {
        Connection con = null;
        Statement sentencia = null;
        ResultSet rs = null;
        ArrayList<ProductoDto> listaProductos = new ArrayList<>();

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT idProducto, nombre FROM productos ORDER BY idProducto";
            sentencia = con.createStatement();

            rs = sentencia.executeQuery(sql);
                     
            int idProducto;
            String nombre;
            ProductoDto producto; 
            
            while (rs.next()) {
                nombre = rs.getString("nombre");
                idProducto = rs.getInt("idProducto");
                               
                producto = new ProductoDto(idProducto, nombre);
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
    public String buscarTelefono(String idClientePed) {
        Connection con = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        String telefono = null;

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT telefono FROM clientes WHERE idCliente = ?";
            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, idClientePed);

            rs = sentencia.executeQuery();
          
            while (rs.next()) {
                telefono = rs.getString("telefono");
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
        return telefono;
    }
    
    @Override
    public String buscarCalle(String idClientePed) {
        Connection con = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        String calle = null;

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT calle FROM clientes WHERE idCliente = ?";
            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, idClientePed);

            rs = sentencia.executeQuery();
          
            while (rs.next()) {
                calle = rs.getString("calle");
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
        return calle;
    }
    
    @Override
    public String buscarZona(String idClientePed) {
        Connection con = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        String zona = null;

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT zona FROM clientes WHERE idCliente = ?";
            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, idClientePed);

            rs = sentencia.executeQuery();
          
            while (rs.next()) {
                zona = rs.getString("zona");
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
        return zona;
    }
    
    @Override
    public String buscarDescripcionProd(String nomProducto) {
        Connection con = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        String descripcion = null;

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT descripcion FROM productos WHERE nombre = ?";
            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, nomProducto);

            rs = sentencia.executeQuery();
          
            while (rs.next()) {
                descripcion = rs.getString("descripcion");
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
        return descripcion;
    }
    
    @Override
    public String buscarPrecioUnit(String nomProducto) {
        Connection con = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        String precioUnit = null;

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT precioUnit FROM productos WHERE nombre = ?";
            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, nomProducto);

            rs = sentencia.executeQuery();
          
            while (rs.next()) {
                precioUnit = rs.getString("precioUnit");
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
        return precioUnit;
    }
    
    @Override
    public int getIdPedido() {
        Connection con = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        int idPedido = 0;

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT idPedido FROM pedidos ORDER BY idPedido DESC LIMIT 1;";
            sentencia = con.prepareStatement(sql);

            rs = sentencia.executeQuery();
          
            while (rs.next()) {
                idPedido = rs.getInt("idPedido");
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
        return idPedido;
    }
    
    @Override
    public String buscarEmpleadoEntrega(String zona) {
        Connection con = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        String empleado = null;
        String nombre = null;
        String apellido = null;

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT nombre, apellido FROM empleados WHERE nombreZona= ?";
            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, zona);

            rs = sentencia.executeQuery();
          
            while (rs.next()) {
                 nombre = rs.getString("nombre");
                 apellido = rs.getString("apellido");
            }
            empleado = nombre + " " + apellido;

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
        return empleado;
    }
}
