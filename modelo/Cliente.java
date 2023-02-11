package ubp.doo.modelo;

import java.util.List;
import ubp.doo.dao.ClienteDao;
import ubp.doo.dao.FabricaDao;
import ubp.doo.dto.ClienteDto;

public class Cliente extends Modelo {
    
    private final ClienteDao clienteDao;
    
    public Cliente() {
        clienteDao = (ClienteDao) FabricaDao.getDao("ClienteDaoImp");
    }
       
    public List<ClienteDto> listar() {
        List<ClienteDto> listadoClientes = (List<ClienteDto>) clienteDao.listarClientes();
        return listadoClientes;
    }
    
    public boolean guardar(String tipoDocumento, String nroDocumento, String apellido, String nombre, String telefono, String calle, String barrio, String zona, String depto, String piso) {
        return clienteDao.insertarCliente(new ClienteDto(tipoDocumento, nroDocumento, apellido, nombre, telefono, calle, barrio, zona, depto, piso));
    }
    
    public boolean modificar(int idCliente, String tipoDocumento, String nroDocumento, String apellido, String nombre, String telefono, String calle, String barrio, String zona, String depto, String piso) {
        return clienteDao.modificarCliente(new ClienteDto(tipoDocumento, nroDocumento, apellido, nombre, telefono, calle, barrio, zona, depto, piso, idCliente));
    }
    
    public boolean borrar (int idCliente) {
        return clienteDao.borrarCliente(idCliente);
    }
    
    @Override
    protected void finalize() throws Throwable {
        clienteDao.cerrarConexion();
    }
}