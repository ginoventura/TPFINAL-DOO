package ubp.doo.dto;

public class ProductoDto {
    
    private int idProducto;
    private String nombre;
    private String descripcion;
    private String unidadMedida;
    private int cantidad;
    private int precioUnit;

    public ProductoDto(String nombre, String descripcion, String unidadMedida, int cantidad, int precioUnit, int idProducto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.unidadMedida = unidadMedida;
        this.cantidad = cantidad;
        this.precioUnit = precioUnit;
        this.idProducto = idProducto;
    }

    public ProductoDto(String nombre, String descripcion, String unidadMedida, int cantidad, int precioUnit) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.unidadMedida = unidadMedida;
        this.cantidad = cantidad;
        this.precioUnit = precioUnit;
    }

    public ProductoDto(int idProducto, String nombre, String descripcion, String unidadMedida, int cantidad, int precioUnit) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.unidadMedida = unidadMedida;
        this.cantidad = cantidad;
        this.precioUnit = precioUnit;
    }

    public ProductoDto(int idProducto, String nombre) {
        this.idProducto = idProducto;
        this.nombre = nombre;
    }
    
    public ProductoDto(String nombre) {
        this.nombre = nombre;
    }
   
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(int precioUnit) {
        this.precioUnit = precioUnit;
    }
    
    @Override
    public String toString(){
        return nombre;
    }
}
