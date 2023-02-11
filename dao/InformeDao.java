package ubp.doo.dao;

import java.util.List;
import ubp.doo.dto.InformeDto;

public interface InformeDao extends Dao {
    
    List<InformeDto> listarDiarios(String fecha);
    
    List<InformeDto> listarDiariosPorZona(String fecha, String zona);

    List<InformeDto> listarPeriodo(String periodo);
    
    List<InformeDto> listarPeriodoPorZona(String periodo, String zona);
}
