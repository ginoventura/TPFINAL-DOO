package ubp.doo.controlador;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import ubp.doo.dto.EmpleadoDto;
import ubp.doo.modelo.Empleado;
import ubp.doo.modelo.Modelo;
import ubp.doo.vista.InterfazVistaAbm;

public class EmpleadoControlador extends Controlador {
    
    public EmpleadoControlador(InterfazVistaAbm vista, Modelo modelo) {
        VISTA = vista;
        MODELO = modelo;
    }
    
    public void cargarTodos(DefaultTableModel modeloTabla) {
        modeloTabla.setRowCount(0);
        modeloTabla.fireTableDataChanged();
        List<EmpleadoDto> listadoEmpleados = ((Empleado) this.MODELO).listar();
        for (EmpleadoDto emp : listadoEmpleados) {
            modeloTabla.addRow(new Object[]{emp.getTipoDocumento(), emp.getNroDocumento(), emp.getNombre(), emp.getApellido(), emp.getTelefono(), emp.getNroZona(), emp.getNombreZona()});
        }
    }
}
