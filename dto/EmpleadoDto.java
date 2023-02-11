package ubp.doo.dto;

public class EmpleadoDto {
    
    private String tipoDocumento;
    private String nroDocumento;
    private String nombre;
    private String apellido;
    private String telefono;
    private int nroZona;
    private String nombreZona;

    public EmpleadoDto(String tipoDocumento, String nroDocumento, String apellido, String nombre, String telefono, int nroZona, String nombreZona) {
        this.tipoDocumento = tipoDocumento; 
        this.nroDocumento = nroDocumento;
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
        this.nroZona = nroZona;
        this.nombreZona = nombreZona;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNroZona() {
        return nroZona;
    }

    public void setNroZona(int nroZona) {
        this.nroZona = nroZona;
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }
}
