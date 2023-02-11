package ubp.doo.dto;

public class DetalleDto {
    private int idDetalle;
    private String nombreProducto;
    private String descripcion;
    private int precioUnit;
    private int cantidad;
    private int precioTotal;
    private int idPedido;

    public DetalleDto() {
    }

    public DetalleDto(int idDetalle, String nombreProducto, String descripcion, int precioUnit, int cantidad, int precioTotal, int idPedido) {
        this.idDetalle = idDetalle;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precioUnit = precioUnit;
        this.cantidad = cantidad;
        this.precioTotal = precioTotal;
        this.idPedido = idPedido;
    }

    public DetalleDto(String nombreProducto, String descripcion, int precioUnit, int cantidad, int precioTotal) {
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precioUnit = precioUnit;
        this.cantidad = cantidad;
        this.precioTotal = precioTotal;  
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(int precioUnit) {
        this.precioUnit = precioUnit;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
}
