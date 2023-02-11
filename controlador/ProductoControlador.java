package ubp.doo.controlador;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import ubp.doo.dto.ProductoDto;
import ubp.doo.modelo.Modelo;
import ubp.doo.modelo.Producto;
import ubp.doo.vista.InterfazVistaAbm;

public class ProductoControlador extends Controlador {
    
    public ProductoControlador(InterfazVistaAbm vista, Modelo modelo) {
        VISTA = vista;
        MODELO = modelo;
    }
     
    public void cargarTodos(DefaultTableModel modeloTabla) {
        modeloTabla.setRowCount(0);
        modeloTabla.fireTableDataChanged();
        List<ProductoDto> listadoProductos = ((Producto) this.MODELO).listar();
        for (ProductoDto prod : listadoProductos) {
            modeloTabla.addRow(new Object[]{prod.getIdProducto(), prod.getNombre(), prod.getDescripcion(), prod.getUnidadMedida(), prod.getCantidad(), prod.getPrecioUnit()});
        }
    }
    
    public boolean guardar(String nombre, String descripcion, String unidadMedida, int cantidad, int precioUnit) {
        return ((Producto) this.MODELO).guardar(nombre.toUpperCase(), descripcion.toUpperCase(), unidadMedida.toUpperCase(), cantidad, precioUnit);
    }
    
    public boolean modificar(int idAnterior, String nombre, String descripcion, String unidadMedida, int cantidad, int precioUnit) {
        return ((Producto) this.MODELO).modificar(idAnterior, nombre.toUpperCase(), descripcion.toUpperCase(), unidadMedida.toUpperCase(), cantidad, precioUnit);
    }
    
    public boolean borrar(int idProducto) {
        return ((Producto) this.MODELO).borrar(idProducto);
    }
}
