package ubp.doo.modelo;

import java.util.List;
import ubp.doo.dao.EmpleadoDao;
import ubp.doo.dao.FabricaDao;
import ubp.doo.dto.EmpleadoDto;

public class Empleado extends Modelo {
    
    private final EmpleadoDao empleadoDao;
    
    public Empleado () {
        empleadoDao = (EmpleadoDao) FabricaDao.getDao("EmpleadoDaoImp");
    }
    
    public List<EmpleadoDto> listar() {
        List<EmpleadoDto> listadoEmpleados = (List<EmpleadoDto>) empleadoDao.listarEmpleados();
        return listadoEmpleados;
    }
    
    @Override
    protected void finalize() throws Throwable {
        empleadoDao.cerrarConexion();
    }
}
