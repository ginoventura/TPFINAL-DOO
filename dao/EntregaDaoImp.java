package ubp.doo.dao;

import ubp.doo.dto.EntregaDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import ubp.doo.dto.DetalleDto;
import ubp.doo.dto.PedidoDto;

public class EntregaDaoImp implements EntregaDao {

    public EntregaDaoImp() {
    }
        
    @Override
    public List<EntregaDto> listarEntregasPendientes() {
        Connection con = null;
        Statement sentencia = null;
        ResultSet rs = null;
        List<EntregaDto> listaEntregasPendientes = new ArrayList<>();

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT idPedido, apellido, nombre, telefono, calle, zona, fechaEntrega, medioPago, monto, estado, empleado FROM entregas WHERE estado='PENDIENTE' ORDER BY idPedido";
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
            String empleado;
            EntregaDto entrega;
            
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
                empleado = rs.getString("empleado");
                idPedido = rs.getInt("idPedido");
                               
                entrega = new EntregaDto(apellido, nombre, telefono, calle, zona, fechaEntrega, medioPago, monto, estado, empleado,idPedido);
                listaEntregasPendientes.add(entrega);
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
        return listaEntregasPendientes;
    }

    @Override
    public List<EntregaDto> listarPedidosEntregados() {
        Connection con = null;
        Statement sentencia = null;
        ResultSet rs = null;
        List<EntregaDto> listaPedidosEntregados = new ArrayList<>();

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT idPedido, apellido, nombre, telefono, calle, zona, fechaEntrega, medioPago, monto, estado, empleado FROM entregas WHERE estado='ENTREGADO' ORDER BY idPedido";
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
            String empleado;
            EntregaDto entrega;
            
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
                empleado = rs.getString("empleado");
                idPedido = rs.getInt("idPedido");
                               
                entrega = new EntregaDto(apellido, nombre, telefono, calle, zona, fechaEntrega, medioPago, monto, estado, empleado,idPedido);
                listaPedidosEntregados.add(entrega);
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
        return listaPedidosEntregados;
    }

    @Override
    public List<EntregaDto> listarEntregas() {
        Connection con = null;
        Statement sentencia = null;
        ResultSet rs = null;
        List<EntregaDto> listaEntregas = new ArrayList<>();

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT idPedido, apellido, nombre, telefono, calle, zona, fechaEntrega, medioPago, monto, estado, empleado FROM entregas ORDER BY idPedido";
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
            String empleado;
            EntregaDto entrega;
            
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
                empleado = rs.getString("empleado");
                idPedido = rs.getInt("idPedido");
                               
                entrega = new EntregaDto(apellido, nombre, telefono, calle, zona, fechaEntrega, medioPago, monto, estado, empleado,idPedido);
                listaEntregas.add(entrega);
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
        return listaEntregas;
    }

    @Override
    public boolean confirmarEntrega(int idPedido) {
        Connection con = null;
        PreparedStatement sentencia = null;
        
        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "UPDATE entregas SET estado='ENTREGADO' WHERE idPedido=?";
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
    public boolean actualizarPedidoEntregado(int idPedido) {
        Connection con = null;
        PreparedStatement sentencia = null;
        
        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "UPDATE pedidos SET estado='ENTREGADO' WHERE idPedido=?";
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
    public boolean cancelarEntrega(int idPedido) {
        Connection con = null;
        PreparedStatement sentencia = null;
        
        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "UPDATE entregas SET estado='PENDIENTE' WHERE idPedido=?";
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
    public boolean actualizarPedidoPospuesto(int idPedido) {
        Connection con = null;
        PreparedStatement sentencia = null;
        
        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "UPDATE pedidos SET estado='PENDIENTE' WHERE idPedido=?";
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
    public List<EntregaDto> listarListosParaEntregar() {
        Connection con = null;
        Statement sentencia = null;
        ResultSet rs = null;
        List<EntregaDto> listaEntregasPendientes = new ArrayList<>();

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT idPedido, apellido, nombre, telefono, calle, zona, fechaEntrega, medioPago, monto, estado, empleado FROM entregas WHERE estado='LISTO PARA ENTREGAR' ORDER BY idPedido";
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
            String empleado;
            EntregaDto entrega;
            
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
                empleado = rs.getString("empleado");
                idPedido = rs.getInt("idPedido");
                               
                entrega = new EntregaDto(apellido, nombre, telefono, calle, zona, fechaEntrega, medioPago, monto, estado, empleado,idPedido);
                listaEntregasPendientes.add(entrega);
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
        return listaEntregasPendientes;
    }

    @Override
    public List<EntregaDto> listarEntregasPorZona(String zona) {
        Connection con = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        List<EntregaDto> listaEntregasPorZona = new ArrayList<>();

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT idPedido, apellido, nombre, telefono, calle, zona, fechaEntrega, medioPago, monto, estado, empleado FROM entregas WHERE zona = ? ORDER BY idPedido";
            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, zona);

            rs = sentencia.executeQuery();
            
            EntregaDto entrega;
          
            while (rs.next()) {
                String apellido = rs.getString("apellido");
                String nombre = rs.getString("nombre");
                String telefono = rs.getString("telefono");
                String calle = rs.getString("calle");
                zona = rs.getString("zona");
                String fechaEntrega = rs.getString("fechaEntrega");
                String medioPago = rs.getString("medioPago");
                String monto = rs.getString("monto");
                String estado = rs.getString("estado");
                String empleado = rs.getString("empleado");
                int idPedido = rs.getInt("idPedido");
                
                entrega = new EntregaDto(apellido, nombre, telefono, calle, zona, fechaEntrega, medioPago, monto, estado, empleado, idPedido);
                listaEntregasPorZona.add(entrega);
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
        return listaEntregasPorZona;
    }

    @Override
    public List<EntregaDto> listarEstadoPorZona(String zona, String estado) {
        Connection con = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        List<EntregaDto> listaEstadoPorZona = new ArrayList<>();

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT idPedido, apellido, nombre, telefono, calle, zona, fechaEntrega, medioPago, monto, estado, empleado FROM entregas WHERE zona = ? AND estado = ? ORDER BY idPedido";
            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, zona);
            sentencia.setString(2, estado);

            rs = sentencia.executeQuery();
            
            EntregaDto entrega;
          
            while (rs.next()) {
                String apellido = rs.getString("apellido");
                String nombre = rs.getString("nombre");
                String telefono = rs.getString("telefono");
                String calle = rs.getString("calle");
                zona = rs.getString("zona");
                String fechaEntrega = rs.getString("fechaEntrega");
                String medioPago = rs.getString("medioPago");
                String monto = rs.getString("monto");
                estado = rs.getString("estado");
                String empleado = rs.getString("empleado");
                int idPedido = rs.getInt("idPedido");
                
                entrega = new EntregaDto(apellido, nombre, telefono, calle, zona, fechaEntrega, medioPago, monto, estado, empleado, idPedido);
                listaEstadoPorZona.add(entrega);
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
        return listaEstadoPorZona;
    }
    
    @Override
    public List<DetalleDto> cargarDetalle(int idPedido) {
        Connection con = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        List<DetalleDto> listaDetalle = new ArrayList<>();

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT nombre, descripcion, precioUnit, cantidad, precioTotal FROM detallePedido WHERE idPedido = ?";
            sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, idPedido);

            rs = sentencia.executeQuery();
            
            DetalleDto detalle;
          
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                int precioUnit = rs.getInt("precioUnit");
                int cantidad = rs.getInt("cantidad");
                int precioTotal = rs.getInt("precioTotal");
                
                detalle = new DetalleDto(nombre, descripcion, precioUnit, cantidad, precioTotal);
                listaDetalle.add(detalle);
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
        return listaDetalle;
    }
    
    @Override
    public boolean actualizarListo(EntregaDto entrega) {
        Connection con = null;
        PreparedStatement sentencia = null;

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "UPDATE entregas SET estado='LISTO PARA ENTREGAR' WHERE idPedido=? AND estado='PENDIENTE'";
            sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, entrega.getIdPedido());

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
    public boolean actualizarDetallePedido(){
        Connection con = null;
        PreparedStatement sentencia = null;

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "UPDATE detallePedido SET estado='LISTO PARA ENTREGAR' WHERE estado='PENDIENTE'";
            sentencia = con.prepareStatement(sql);

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
    public boolean actualizarPedido(PedidoDto pedido){
        Connection con = null;
        PreparedStatement sentencia = null;

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "UPDATE pedidos SET estado='LISTO PARA ENTREGAR' WHERE estado='PENDIENTE'";
            sentencia = con.prepareStatement(sql);

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
