package ubp.doo.dao;

import java.util.ArrayList;
import java.util.List;
import ubp.doo.dto.ClienteDto;
import ubp.doo.dto.DetalleDto;
import ubp.doo.dto.EntregaDto;
import ubp.doo.dto.PedidoDto;
import ubp.doo.dto.ProductoDto;

public interface PedidoDao extends Dao {
    
    List<PedidoDto> listarPedidos();
    
    boolean insertarPedido(PedidoDto pedido);
    
    boolean registrarDetalle(DetalleDto detalle);
    
    boolean registrarEntrega(EntregaDto entrega);
    
    boolean cancelarPedido(int idPedido);
    
    boolean eliminarDetalle(int idPedido);
    
    boolean eliminarEntrega(int idPedido);
    
    ArrayList<ClienteDto> getClientes();
    
    ArrayList<ProductoDto> getProductos();
    
    int getIdPedido();
    
    String buscarTelefono(String idClientePed);
    
    String buscarCalle(String idClientePed);
    
    String buscarZona(String idClientePed);
    
    String buscarDescripcionProd(String nomProducto);
    
    String buscarPrecioUnit(String nomProducto);
    
    String buscarEmpleadoEntrega(String zona);
}
