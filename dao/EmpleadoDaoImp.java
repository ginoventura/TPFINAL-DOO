package ubp.doo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import ubp.doo.dto.EmpleadoDto;

public class EmpleadoDaoImp implements EmpleadoDao {
    
    public EmpleadoDaoImp() {
    }

    @Override
    public List<EmpleadoDto> listarEmpleados() {
        Connection con = null;
        Statement sentencia = null;
        ResultSet rs = null;
        List<EmpleadoDto> listaEmpleados = new ArrayList<>();

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT tipoDocumento, nroDocumento, nombre, apellido, telefono, nroZona, nombreZona FROM empleados ORDER BY nroZona";
            sentencia = con.createStatement();

            rs = sentencia.executeQuery(sql);
            
            String tipoDocumento;
            String nroDocumento;
            String nombre;
            String apellido;
            String telefono;
            int nroZona;
            String nombreZona;
            EmpleadoDto empleado;
            
            while (rs.next()) {
                tipoDocumento = rs.getString("tipoDocumento");
                nroDocumento = rs.getString("nroDocumento");
                nombre = rs.getString("nombre");
                apellido = rs.getString("apellido");
                telefono = rs.getString("telefono");
                nroZona = rs.getInt("nroZona");
                nombreZona = rs.getString("nombreZona");
                
                empleado = new EmpleadoDto(tipoDocumento, nroDocumento, apellido, nombre, telefono, nroZona, nombreZona);
                listaEmpleados.add(empleado);
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
        return listaEmpleados;
    }
}
