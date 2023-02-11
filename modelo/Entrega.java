package ubp.doo.modelo;

import java.util.List;
import ubp.doo.dao.EntregaDao;
import ubp.doo.dao.FabricaDao;
import ubp.doo.dto.DetalleDto;
import ubp.doo.dto.EntregaDto;
import ubp.doo.dto.PedidoDto;

public class Entrega extends Modelo {
    
    private final EntregaDao entregaDao;
    
    public Entrega() {
        entregaDao = (EntregaDao) FabricaDao.getDao("EntregaDaoImp");
    }
    
    public List<EntregaDto> listarTodas() {
        List<EntregaDto> listadoEntregas = (List<EntregaDto>) entregaDao.listarEntregas();
        return listadoEntregas;
    }
    
    public List<EntregaDto> listarTodasPorZona(String zona) {
        List<EntregaDto> listadoEntregasPorZona = (List<EntregaDto>) entregaDao.listarEntregasPorZona(zona);
        return listadoEntregasPorZona;
    }
    
    public List<EntregaDto> listarPendientes() {
        List<EntregaDto> listadoEntregasPendientes = (List<EntregaDto>) entregaDao.listarEntregasPendientes();
        return listadoEntregasPendientes;
    }
    
    public List<EntregaDto> listarListos() {
        List<EntregaDto> listadoEntregasListas = (List<EntregaDto>) entregaDao.listarListosParaEntregar();
        return listadoEntregasListas;
    }
    
    public List<EntregaDto> listarEntregados() {
        List<EntregaDto> listadoPedidosEntregados = (List<EntregaDto>) entregaDao.listarPedidosEntregados();
        return listadoPedidosEntregados;
    }
       
    public List<EntregaDto> listarEstadoPorZona(String zona, String estado) {
        List<EntregaDto> listadoEstadoPorZona = (List<EntregaDto>) entregaDao.listarEstadoPorZona(zona, estado);
        return listadoEstadoPorZona;
    }
    
    public List<DetalleDto> cargarDetalle(int idPedido) {
        List<DetalleDto> cargaDetalle = (List<DetalleDto>) entregaDao.cargarDetalle(idPedido);
        return cargaDetalle;
    }
       
    public boolean confirmarEntrega(int idPedido) {
        return entregaDao.confirmarEntrega(idPedido);
    }
    
    public boolean cancelarEnterga(int idPedido) {
        return entregaDao.cancelarEntrega(idPedido);
    }
    
    public boolean actualizarListo(int idPedido, String apellido, String nombre, String telefono, String calle, String zona, String fechaEntrega, String medioPago, String monto, String empleado, String estado) {
        return entregaDao.actualizarListo(new EntregaDto(apellido, nombre, telefono, calle, zona, fechaEntrega, medioPago, monto, empleado, estado, idPedido));
    }
    
    public boolean actualizarDetalle() {
        return entregaDao.actualizarDetallePedido();
    }
    
    public boolean actualizarPedido(int idPedido, String apellido, String nombre, String telefono, String calle, String zona, String fechaEntrega, String medioPago, String monto, String estado) {
        return entregaDao.actualizarPedido(new PedidoDto(apellido, nombre, telefono, calle, zona, fechaEntrega, medioPago, monto, estado, idPedido));
    }
    
    @Override
    protected void finalize() throws Throwable {
        entregaDao.cerrarConexion();
    }


}
