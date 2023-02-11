package ubp.doo.dao;

import java.util.List;
import ubp.doo.dto.ProductoDto;

public interface ProductoDao extends Dao{
    
    List<ProductoDto> listarProductos();
    
    boolean insertarProducto(ProductoDto producto);
    
    boolean modificarProducto(ProductoDto producto);
    
    boolean borrarProducto(int idProducto);
}
