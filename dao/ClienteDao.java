package ubp.doo.dao;

import java.util.List;
import ubp.doo.dto.ClienteDto;

public interface ClienteDao extends Dao {
        
    List<ClienteDto> listarClientes();
    
    boolean insertarCliente(ClienteDto cliente);
    
    boolean modificarCliente(ClienteDto cliente);
    
    boolean borrarCliente(int idCliente);
    
}
