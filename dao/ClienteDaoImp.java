package ubp.doo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import ubp.doo.dto.ClienteDto;

public class ClienteDaoImp implements ClienteDao {
    
    public ClienteDaoImp() {
    }
    
    @Override
    public List<ClienteDto> listarClientes() {
        Connection con = null;
        Statement sentencia = null;
        ResultSet rs = null;
        List<ClienteDto> listaClientes = new ArrayList<>();

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT idCliente, tipoDocumento, nroDocumento, apellido, nombre, telefono, barrio, zona, calle, depto, piso FROM clientes ORDER BY idCliente";
            sentencia = con.createStatement();

            rs = sentencia.executeQuery(sql);
                     
            int idCliente;
            String tipoDocumento;
            String nroDocumento;
            String apellido;
            String nombre;
            String telefono;
            String barrio;
            String zona;
            String calle;
            String depto;
            String piso;
            ClienteDto cliente;
            
            while (rs.next()) {
                tipoDocumento = rs.getString("tipoDocumento");
                nroDocumento = rs.getString("nroDocumento");
                apellido = rs.getString("apellido");
                nombre = rs.getString("nombre");
                telefono = rs.getString("telefono");
                barrio = rs.getString("barrio");
                zona = rs.getString("zona");
                calle = rs.getString("calle");
                depto = rs.getString("depto");
                piso = rs.getString("piso");
                idCliente = rs.getInt("idCliente");
                
                cliente = new ClienteDto(tipoDocumento, nroDocumento, apellido, nombre, telefono, barrio, zona, calle, depto, piso, idCliente);
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
    public boolean insertarCliente(ClienteDto cliente) {
        Connection con = null;
        PreparedStatement sentencia = null;
        
        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "INSERT INTO clientes (tipoDocumento, nroDocumento, apellido, nombre, telefono, barrio, zona, calle, depto, piso) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, cliente.getTipoDocumento());
            sentencia.setString(2, cliente.getNroDocumento());
            sentencia.setString(3, cliente.getApellido());
            sentencia.setString(4, cliente.getNombre());
            sentencia.setString(5, cliente.getTelefono());
            sentencia.setString(6, cliente.getBarrio());
            sentencia.setString(7, cliente.getZona());
            sentencia.setString(8, cliente.getCalle());
            sentencia.setString(9, cliente.getDepto());
            sentencia.setString(10, cliente.getPiso());
            
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
    public boolean modificarCliente(ClienteDto cliente) {
        Connection con = null;
        PreparedStatement sentencia = null;
        
        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "UPDATE clientes SET tipoDocumento=?, nroDocumento=?, apellido=?, nombre=?, telefono=?, barrio=?, zona=?, calle=?, depto=?, piso=? WHERE idCliente=?";
            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, cliente.getTipoDocumento());
            sentencia.setString(2, cliente.getNroDocumento());
            sentencia.setString(3, cliente.getApellido());
            sentencia.setString(4, cliente.getNombre());
            sentencia.setString(5, cliente.getTelefono());
            sentencia.setString(6, cliente.getBarrio());
            sentencia.setString(7, cliente.getZona());
            sentencia.setString(8, cliente.getCalle());
            sentencia.setString(9, cliente.getDepto());
            sentencia.setString(10, cliente.getPiso());
            sentencia.setInt(11, cliente.getIdCliente());
            
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
    public boolean borrarCliente(int idCliente) {
        Connection con = null;
        PreparedStatement sentencia = null;
        
        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "DELETE FROM clientes WHERE idCliente=?";
            sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, idCliente);
            
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