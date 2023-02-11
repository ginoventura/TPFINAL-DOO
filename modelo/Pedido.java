package ubp.doo.modelo;

import java.util.List;
import ubp.doo.dao.FabricaDao;
import ubp.doo.dao.PedidoDao;
import ubp.doo.dto.PedidoDto;

public class Pedido extends Modelo {
    
    private final PedidoDao pedidoDao;
    
    public Pedido() {
        pedidoDao = (PedidoDao) FabricaDao.getDao("PedidoDaoImp");
    }
    
    public List<PedidoDto> listar() {
        List<PedidoDto> listadoPedidos = (List<PedidoDto>) pedidoDao.listarPedidos();
        return listadoPedidos;
    }
    
    public boolean guardar(String apellido, String nombre, String telefono, String calle, String zona, String fechaEntrega, String medioPago, String monto) {
        return pedidoDao.insertarPedido(new PedidoDto(apellido, nombre, telefono, calle, zona, fechaEntrega, medioPago, monto));
    }
    
    public boolean cancelar (int idPedido) {
        return pedidoDao.cancelarPedido(idPedido);
    }
    
    public boolean eliminarDetalle (int idPedido) {
        return pedidoDao.eliminarDetalle(idPedido);
    }
    
    public boolean eliminarEntrega (int idPedido) {
        return pedidoDao.eliminarEntrega(idPedido);
    }
       
    @Override
    protected void finalize() throws Throwable {
        pedidoDao.cerrarConexion();
    }
}
