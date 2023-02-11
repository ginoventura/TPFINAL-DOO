package ubp.doo.controlador;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import ubp.doo.dto.InformeDto;
import ubp.doo.modelo.Informe;
import ubp.doo.modelo.Modelo;
import ubp.doo.vista.InterfazVistaAbm;

public class InformeControlador extends Controlador {
    
    public InformeControlador(InterfazVistaAbm vista, Modelo modelo) {
        VISTA = vista;
        MODELO = modelo;
    }
    
    public void cargarDiario(DefaultTableModel modeloTabla, String fecha) {
        modeloTabla.setRowCount(0);
        modeloTabla.fireTableDataChanged();
        List<InformeDto> listadoDiario = ((Informe) this.MODELO).listarDiarios(fecha);
        for (InformeDto inf : listadoDiario) {
            modeloTabla.addRow(new Object[]{inf.getIdPedido(), inf.getZona(), inf.getMedioPago(), inf.getMonto()});
        }
    }
    
    public void cargarDiarioPorZona(DefaultTableModel modeloTabla, String fecha, String zona) {
        modeloTabla.setRowCount(0);
        modeloTabla.fireTableDataChanged();
        List<InformeDto> listadoDiarioPorZona = ((Informe) this.MODELO).listarDiariosPorZona(fecha, zona);
        for (InformeDto inf : listadoDiarioPorZona) {
            modeloTabla.addRow(new Object[]{inf.getIdPedido(), inf.getZona(), inf.getMedioPago(), inf.getMonto()});
        }
    }
    
    public void cargarPeriodo(DefaultTableModel modeloTabla, String fecha) {
        modeloTabla.setRowCount(0);
        modeloTabla.fireTableDataChanged();
        List<InformeDto> listadoPeriodo = ((Informe) this.MODELO).listarPeriodo(fecha);
        for (InformeDto inf : listadoPeriodo) {
            modeloTabla.addRow(new Object[]{inf.getIdPedido(), inf.getZona(), inf.getMedioPago(), inf.getMonto()});
        }
    }
    
    public void cargarPeriodoPorZona(DefaultTableModel modeloTabla, String fecha, String zona) {
        modeloTabla.setRowCount(0);
        modeloTabla.fireTableDataChanged();
        List<InformeDto> listadoPeriodoPorZona = ((Informe) this.MODELO).listarPeriodoPorZona(fecha, zona);
        for (InformeDto inf : listadoPeriodoPorZona) {
            modeloTabla.addRow(new Object[]{inf.getIdPedido(), inf.getZona(), inf.getMedioPago(), inf.getMonto()});
        }
    }    
    
}
