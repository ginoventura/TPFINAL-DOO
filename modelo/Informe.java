package ubp.doo.modelo;

import java.util.List;
import ubp.doo.dao.FabricaDao;
import ubp.doo.dao.InformeDao;
import ubp.doo.dto.InformeDto;

public class Informe extends Modelo {
    
    private final InformeDao informeDao;
    
    public Informe() {
        informeDao = (InformeDao) FabricaDao.getDao("InformeDaoImp");
    }
    
    public List<InformeDto> listarDiarios(String fecha) {
        List<InformeDto> listadoDiario = (List<InformeDto>) informeDao.listarDiarios(fecha);
        return listadoDiario;
    }
    
    public List<InformeDto> listarDiariosPorZona(String fecha, String zona) {
        List<InformeDto> listadoDiarioPorZona = (List<InformeDto>) informeDao.listarDiariosPorZona(fecha, zona);
        return listadoDiarioPorZona;
    }
    
    public List<InformeDto> listarPeriodo(String periodo) {
        List<InformeDto> listadoPeriodo = (List<InformeDto>) informeDao.listarPeriodo(periodo);
        return listadoPeriodo;
    }
    
    public List<InformeDto> listarPeriodoPorZona(String periodo, String zona) {
        List<InformeDto> listadoPeriodoPorZona = (List<InformeDto>) informeDao.listarPeriodoPorZona(periodo, zona);
        return listadoPeriodoPorZona;
    }
}
