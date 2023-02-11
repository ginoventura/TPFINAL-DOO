package ubp.doo.controlador;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import ubp.doo.dto.ClienteDto;
import ubp.doo.modelo.Cliente;
import ubp.doo.modelo.Modelo;
import ubp.doo.vista.InterfazVistaAbm;

public class ClienteControlador extends Controlador {
        
    public ClienteControlador(InterfazVistaAbm vista, Modelo modelo) {
        VISTA = vista;
        MODELO = modelo;
    }
     
    public void cargarTodos(DefaultTableModel modeloTabla) {
        modeloTabla.setRowCount(0);
        modeloTabla.fireTableDataChanged();
        List<ClienteDto> listadoClientes = ((Cliente) this.MODELO).listar();
        for (ClienteDto cli : listadoClientes) {
            modeloTabla.addRow(new Object[]{cli.getIdCliente(), cli.getTipoDocumento(), cli.getNroDocumento(), cli.getApellido(), cli.getNombre(), cli.getTelefono(), cli.getBarrio(), cli.getZona(), cli.getCalle(), cli.getDepto(), cli.getPiso()});
        }
    }
    
    public boolean guardar(String tipoDocumento, String nroDocumento, String apellido, String nombre, String telefono, String barrio, String zona, String calle, String depto, String piso) {
        return ((Cliente) this.MODELO).guardar(tipoDocumento.toUpperCase(), nroDocumento, apellido.toUpperCase(), nombre.toUpperCase(), telefono, barrio.toUpperCase(), zona.toUpperCase(), calle.toUpperCase(), depto.toUpperCase(), piso);
    }
    
    public boolean modificar(int idAnterior, String tipoDocumento, String nroDocumento, String apellido, String nombre, String telefono, String barrio, String zona, String calle, String depto, String piso) {
        return ((Cliente) this.MODELO).modificar(idAnterior, tipoDocumento.toUpperCase(), nroDocumento, apellido.toUpperCase(), nombre.toUpperCase(), telefono, barrio.toUpperCase(), zona.toUpperCase(), calle.toUpperCase(), depto.toUpperCase(), piso);
    }
    
    public boolean borrar(int idCliente) {
        return ((Cliente) this.MODELO).borrar(idCliente);
    }   
}



