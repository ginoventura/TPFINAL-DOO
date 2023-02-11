package ubp.doo.controlador;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import ubp.doo.dto.PedidoDto;
import ubp.doo.modelo.Modelo;
import ubp.doo.modelo.Pedido;
import ubp.doo.vista.InterfazVistaPed;

public class PedidoControlador extends Controlador {
    
    public PedidoControlador(InterfazVistaPed vista, Modelo modelo) {
        VISTA = vista;
        MODELO = modelo;
    }
    
    public void cargarTodos(DefaultTableModel modeloTabla) {
        modeloTabla.setRowCount(0);
        modeloTabla.fireTableDataChanged();
        List<PedidoDto> listadoPedidos = ((Pedido) this.MODELO).listar();
        for (PedidoDto ped : listadoPedidos) {
            modeloTabla.addRow(new Object[]{ped.getIdPedido(), ped.getApellido(), ped.getNombre(), ped.getTelefono(), ped.getCalle(), ped.getZona(), ped.getFechaEntrega(), ped.getMedioPago(), ped.getMonto(), ped.getEstado()});
        }
    }
    
    public boolean confirmar(String apellido, String nombre, String telefono, String calle, String zona, String fechaEntrega, String medioPago, String monto) {
        return ((Pedido) this.MODELO).guardar(apellido.toUpperCase(), nombre.toUpperCase(), telefono, calle.toUpperCase(), zona.toUpperCase(), fechaEntrega.toUpperCase(), medioPago.toUpperCase(), monto);
    }
   
    public boolean cancelar(int idPedido) {
        return ((Pedido) this.MODELO).cancelar(idPedido);
    }
    
    public boolean eliminarDetalle(int idPedido) {
        return ((Pedido) this.MODELO).eliminarDetalle(idPedido);
    }
    
    public boolean eliminarEntrega(int idPedido) {
        return ((Pedido) this.MODELO).eliminarEntrega(idPedido);
    }
}
