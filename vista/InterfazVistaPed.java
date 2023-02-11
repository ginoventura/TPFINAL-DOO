package ubp.doo.vista;

public interface InterfazVistaPed extends InterfazVista {
    
    void actualizaTabla();
    
    void calcularFechaEntrega();
    
    void llenarCmbProductos();
    
    void llenarCmbClientes();
    
    void obtenerDatosCliente();
    
    void obtenerDetallesProducto();
    
    void eliminarProducto();
    
    void actualizarMontoTotal();
    
    void registrarDetalle(int idPedido);
    
    int obtenerIdPedido();
    
    void verificarProducto();
    
    void desactivarSpins();
    
    void agregarColumnas();
    
    void limpiarTablaDetalle();
    
    void registrarEntrega(int idPedido, String apellido, String nombre, String telefono, String domicilio, String zona, String fecha, String medioPago, String montoTotal);
    
}
