package ubp.doo.dto;

public class ClienteDto {

    private int idCliente;
    private String tipoDocumento;
    private String nroDocumento;
    private String apellido;
    private String nombre;
    public String telefono;
    private String calle;
    private String barrio;
    private String zona;
    private String depto;
    private String piso; 

    public ClienteDto(String tipoDocumento, String nroDocumento, String apellido, String nombre, String telefono, String barrio, String zona, String calle, String depto, String piso, int idCliente) {
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
        this.barrio = barrio;
        this.zona = zona;
        this.calle = calle;
        this.depto = depto;
        this.piso = piso; 
        this.idCliente = idCliente;
    }

    public ClienteDto(String tipoDocumento, String nroDocumento, String apellido, String nombre, String telefono, String barrio, String zona, String calle, String depto, String piso) {
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
        this.barrio = barrio;
        this.zona = zona;
        this.calle = calle;
        this.depto = depto;
        this.piso = piso; 
    }

    public ClienteDto(String tipoDocumento, String nroDocumento, String apellido, String nombre, String telefono, String barrio, String zona, String calle, int idCliente) {
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
        this.barrio = barrio;
        this.zona = zona;
        this.calle = calle;
        this.idCliente = idCliente;
    }
    
    public ClienteDto(int idCliente, String apellido, String nombre, String telefono, String calle, String zona) {
        this.idCliente = idCliente;
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
        this.calle = calle;
        this.zona = zona;
    }
    
    public ClienteDto(int idCliente, String apellido, String nombre){
        this.idCliente = idCliente;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public ClienteDto(String telefono) {
        this.telefono = telefono;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
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

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }
    
    @Override
    public String toString(){
        return idCliente + " - " + apellido + " " + nombre;
    }
}