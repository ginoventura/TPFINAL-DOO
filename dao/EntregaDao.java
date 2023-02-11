package ubp.doo.dao;

import java.util.List;
import ubp.doo.dto.DetalleDto;
import ubp.doo.dto.EntregaDto;
import ubp.doo.dto.PedidoDto;

public interface EntregaDao extends Dao {
    
    List<EntregaDto> listarEntregas();
    
    List<EntregaDto> listarEntregasPorZona(String zona);
        
    List<EntregaDto> listarEntregasPendientes();
    
    List<EntregaDto> listarListosParaEntregar();
    
    List<EntregaDto> listarPedidosEntregados();
       
    List<EntregaDto> listarEstadoPorZona(String zona, String estado);
    
    List<DetalleDto> cargarDetalle(int idPedido);
     
    public boolean confirmarEntrega(int idPedido);

    public boolean cancelarEntrega(int idPedido);
    
    public boolean actualizarListo(EntregaDto entrega);

    public boolean actualizarDetallePedido();

    public boolean actualizarPedido(PedidoDto pedido);
    
    public boolean actualizarPedidoEntregado(int idPedido);
    
    public boolean actualizarPedidoPospuesto(int idPedido);
    
}
