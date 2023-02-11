package ubp.doo.dto;

public class EntregaDto {
    private int idPedido;
    private String apellido;
    private String nombre;
    private String telefono;
    private String calle;
    private String zona;
    private String fechaEntrega;
    private String medioPago;
    private String monto;
    private String estado;
    private String empleado;
    
    public EntregaDto() {
    }

    public EntregaDto(String apellido, String nombre, String telefono, String calle, String zona, String fechaEntrega, String medioPago, String monto, String estado, String empleado, int idPedido) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
        this.calle = calle;
        this.zona = zona;
        this.fechaEntrega = fechaEntrega;
        this.medioPago = medioPago;
        this.monto = monto;
        this.estado = estado;
        this.empleado = empleado;
        this.idPedido = idPedido;
    }

    public EntregaDto(int idPedido, String apellido, String nombre, String telefono, String calle, String zona, String fechaEntrega, String medioPago, String monto, String empleado, String estado) {
        this.idPedido = idPedido;
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
        this.calle = calle;
        this.zona = zona;
        this.fechaEntrega = fechaEntrega;
        this.medioPago = medioPago;
        this.monto = monto;
        this.empleado = empleado;
        this.estado = estado;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return calle;
    }

    public void setDomicilio(String domicilio) {
        this.calle = domicilio;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }
    
    
}
