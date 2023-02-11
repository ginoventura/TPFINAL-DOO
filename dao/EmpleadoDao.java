package ubp.doo.dao;

import java.util.List;
import ubp.doo.dto.EmpleadoDto;

public interface EmpleadoDao extends Dao {
    
    List<EmpleadoDto> listarEmpleados();
}
