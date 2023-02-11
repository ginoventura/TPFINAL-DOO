package ubp.doo.controlador;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import ubp.doo.dto.DetalleDto;
import ubp.doo.dto.EntregaDto;
import ubp.doo.modelo.Entrega;
import ubp.doo.modelo.Modelo;
import ubp.doo.vista.InterfazVistaAbm;

public class EntregaControlador extends Controlador {
    
    public EntregaControlador(InterfazVistaAbm vista, Modelo modelo) {
        VISTA = vista;
        MODELO = modelo;
    }
    
    public void cargarTodos(DefaultTableModel modeloTabla) {
        modeloTabla.setRowCount(0);
        modeloTabla.fireTableDataChanged();
        List<EntregaDto> listadoEntregas = ((Entrega) this.MODELO).listarTodas();
        for (EntregaDto ent : listadoEntregas) {
            modeloTabla.addRow(new Object[]{ent.getIdPedido(), ent.getApellido(), ent.getNombre(), ent.getTelefono(), ent.getDomicilio(), ent.getZona(), ent.getFechaEntrega(), ent.getMedioPago(), ent.getMonto(), ent.getEmpleado(), ent.getEstado()});
        }
    }
    
    public void cargarPendientes(DefaultTableModel modeloTabla) {
        modeloTabla.setRowCount(0);
        modeloTabla.fireTableDataChanged();
        List<EntregaDto> listadoEntregas = ((Entrega) this.MODELO).listarPendientes();
        for (EntregaDto ent : listadoEntregas) {
            modeloTabla.addRow(new Object[]{ent.getIdPedido(), ent.getApellido(), ent.getNombre(), ent.getTelefono(), ent.getDomicilio(), ent.getZona(), ent.getFechaEntrega(), ent.getMedioPago(), ent.getMonto(), ent.getEmpleado(), ent.getEstado()});
        }
    }
    
    public void cargarListos(DefaultTableModel modeloTabla) {
        modeloTabla.setRowCount(0);
        modeloTabla.fireTableDataChanged();
        List<EntregaDto> listadoEntregas = ((Entrega) this.MODELO).listarListos();
        for (EntregaDto ent : listadoEntregas) {
            modeloTabla.addRow(new Object[]{ent.getIdPedido(), ent.getApellido(), ent.getNombre(), ent.getTelefono(), ent.getDomicilio(), ent.getZona(), ent.getFechaEntrega(), ent.getMedioPago(), ent.getMonto(), ent.getEmpleado(), ent.getEstado()});
        }
    }
    
    public void cargarEntregados(DefaultTableModel modeloTabla) {
        modeloTabla.setRowCount(0);
        modeloTabla.fireTableDataChanged();
        List<EntregaDto> listadoEntregas = ((Entrega) this.MODELO).listarEntregados();
        for (EntregaDto ent : listadoEntregas) {
            modeloTabla.addRow(new Object[]{ent.getIdPedido(), ent.getApellido(), ent.getNombre(), ent.getTelefono(), ent.getDomicilio(), ent.getZona(), ent.getFechaEntrega(), ent.getMedioPago(), ent.getMonto(), ent.getEmpleado(), ent.getEstado()});
        }
    }
    
    public void cargarTodosPorZona(DefaultTableModel modeloTabla, String zona) {
        modeloTabla.setRowCount(0);
        modeloTabla.fireTableDataChanged();
        List<EntregaDto> listadoEntregas = ((Entrega) this.MODELO).listarTodasPorZona(zona);
        for (EntregaDto ent : listadoEntregas) {
            modeloTabla.addRow(new Object[]{ent.getIdPedido(), ent.getApellido(), ent.getNombre(), ent.getTelefono(), ent.getDomicilio(), ent.getZona(), ent.getFechaEntrega(), ent.getMedioPago(), ent.getMonto(), ent.getEmpleado(), ent.getEstado()});
        }
    }
    
    public void cargarEstadoPorZona(DefaultTableModel modeloTabla, String zona, String estado) {
        modeloTabla.setRowCount(0);
        modeloTabla.fireTableDataChanged();
        List<EntregaDto> listadoEntregas = ((Entrega) this.MODELO).listarEstadoPorZona(zona, estado);
        for (EntregaDto ent : listadoEntregas) {
            modeloTabla.addRow(new Object[]{ent.getIdPedido(), ent.getApellido(), ent.getNombre(), ent.getTelefono(), ent.getDomicilio(), ent.getZona(), ent.getFechaEntrega(), ent.getMedioPago(), ent.getMonto(), ent.getEmpleado(), ent.getEstado()});
        }
    }
    
    public void cargarDetalle(DefaultTableModel modeloTabla, int idPedido) {
        modeloTabla.setRowCount(0);
        modeloTabla.fireTableDataChanged();
        List<DetalleDto> listadoProductos = ((Entrega) this.MODELO).cargarDetalle(idPedido);
        for (DetalleDto det : listadoProductos) {
            modeloTabla.addRow(new Object[]{det.getNombreProducto(), det.getDescripcion(), det.getPrecioUnit(), det.getCantidad(), det.getPrecioTotal()});
        }
    }  
    
    public boolean confirmarEntrega(int idPedido) {
        return ((Entrega) this.MODELO).confirmarEntrega(idPedido);
    }
    
    public boolean cancelarEntrega(int idPedido) {
        return ((Entrega) this.MODELO).cancelarEnterga(idPedido);
    }
    
    public boolean actualizarListo(int idAnterior, String apellido, String nombre, String telefono, String calle, String zona, String fechaEntrega, String medioPago, String monto, String empleado, String estado) {
        return ((Entrega) this.MODELO).actualizarListo(idAnterior, apellido, nombre, telefono, calle, zona, fechaEntrega, medioPago, monto, empleado, estado);
    }
    
    public boolean actualizarPedidos(int idAnterior, String apellido, String nombre, String telefono, String calle, String zona, String fechaEntrega, String medioPago, String monto, String estado) {
        return ((Entrega) this.MODELO).actualizarPedido(idAnterior, apellido, nombre, telefono, calle, zona, fechaEntrega, medioPago, monto, estado);
    }
}
