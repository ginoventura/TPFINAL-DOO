package ubp.doo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import ubp.doo.dto.InformeDto;

public class InformeDaoImp implements InformeDao {

    @Override
    public List<InformeDto> listarDiarios(String fecha) {
        Connection con = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        List<InformeDto> listaDiarios = new ArrayList<>();

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT idPedido, zona, medioPago, monto, (SELECT substr(fechaEntrega,0,11)) AS fecha FROM entregas WHERE fecha = ? AND estado='ENTREGADO' ORDER BY idPedido";
            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, fecha);

            rs = sentencia.executeQuery();
            
            InformeDto informe;
          
            while (rs.next()) {
                String zona = rs.getString("zona");
                String medioPago = rs.getString("medioPago");
                String monto = rs.getString("monto");
                int idPedido = rs.getInt("idPedido");
                
                informe = new InformeDto(zona, medioPago, monto, idPedido);
                listaDiarios.add(informe);
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
        return listaDiarios;
    }

    @Override
    public List<InformeDto> listarDiariosPorZona(String fecha, String zona) {
        Connection con = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        List<InformeDto> listaDiarioPorZona = new ArrayList<>();

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT idPedido, zona, medioPago, monto, (SELECT substr(fechaEntrega,0,11)) AS fecha FROM entregas WHERE fecha = ? AND zona = ? AND estado='ENTREGADO' ORDER BY idPedido";
            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, fecha);
            sentencia.setString(2, zona);

            rs = sentencia.executeQuery();
            
            InformeDto informe;
          
            while (rs.next()) {
                zona = rs.getString("zona");
                String medioPago = rs.getString("medioPago");
                String monto = rs.getString("monto");
                int idPedido = rs.getInt("idPedido");
                
                informe = new InformeDto(zona, medioPago, monto, idPedido);
                listaDiarioPorZona.add(informe);
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
        return listaDiarioPorZona;
    }

    @Override
    public List<InformeDto> listarPeriodo(String periodo) {
        Connection con = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        List<InformeDto> listaDiarios = new ArrayList<>();

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT idPedido, zona, medioPago, monto FROM entregas WHERE fechaEntrega = ? ORDER BY idPedido";
            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, periodo);

            rs = sentencia.executeQuery();
            
            InformeDto informe;
          
            while (rs.next()) {
                String zona = rs.getString("zona");
                String medioPago = rs.getString("medioPago");
                String monto = rs.getString("monto");
                int idPedido = rs.getInt("idPedido");
                
                informe = new InformeDto(zona, medioPago, monto, idPedido);
                listaDiarios.add(informe);
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
        return listaDiarios;
    }

    @Override
    public List<InformeDto> listarPeriodoPorZona(String periodo, String zona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
