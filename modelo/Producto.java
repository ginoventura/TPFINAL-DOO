package ubp.doo.modelo;

import java.util.List;
import ubp.doo.dao.FabricaDao;
import ubp.doo.dao.ProductoDao;
import ubp.doo.dto.ProductoDto;

public class Producto extends Modelo {
    
    private final ProductoDao productoDao;
    
    public Producto() {
        productoDao = (ProductoDao) FabricaDao.getDao("ProductoDaoImp");
    }
    
    public List<ProductoDto> listar() {
        List<ProductoDto> listadoProductos = (List<ProductoDto>) productoDao.listarProductos();
        return listadoProductos;
    }
    
    public boolean guardar(String nombre, String descripcion, String unidadMedida, int cantidad, int precioUnit) {
        return productoDao.insertarProducto(new ProductoDto(nombre, descripcion, unidadMedida, cantidad, precioUnit));
    }
    
    public boolean modificar(int idProducto, String nombre, String descripcion, String unidadMedida, int cantidad, int precioUnit) {
        return productoDao.modificarProducto(new ProductoDto(nombre, descripcion, unidadMedida, cantidad, precioUnit, idProducto));
    }
    
    public boolean borrar (int idProducto) {
        return productoDao.borrarProducto(idProducto);
    }
    
    @Override
    protected void finalize() throws Throwable {
        productoDao.cerrarConexion();
    }
}
